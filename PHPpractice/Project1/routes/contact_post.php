<?php
// CSRF
if (!validateCsrfToken($_POST['csrf_token'] ?? null )) {
    addFlashMessage('error','Sorry,CsrfToken not validate please send the form again!');
    //redirect('/contact');
    header('Location: /contact');
    exit;
}
$name = $_POST['name'] ?? '';
$email = $_POST['email'] ?? '';
$message = $_POST['message'] ?? '';


if (empty($name) || empty($email) || empty($message))
{
    badRequest("All filds are required");
}

if (!filter_var($email, FILTER_VALIDATE_EMAIL))
{
    badRequest("Email filed is invalid");
}




$insert = insertMessage(connectDb(),name:$name,email:$email,message:$message);

if ($insert) {
    $safeName = htmlspecialchars($name,ENT_QUOTES,'UTF-8');
    addFlashMessage('sucess',"Thank you, $safeName, for yout message");
}   else {
    serverError("Could not store the message!");
}

//function redirect(string $uri): void {};

header("Location: /guestbook");
exit();
