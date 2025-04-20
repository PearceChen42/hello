<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    var_dump($_POST);
    $email = filter_var($_POST['email'],FILTER_SANITIZE_EMAIL);
    echo "tHE EMAIL $email was submitted!\n";
    die;
}

?>
<html>
    <body>
        <h1>Please submit the form</h1>
        <form method = "POST">
            <label>Email:</label>
            <input type="email" name="email"/>
            <button type="submit">Click Here</button>
        </form>
    </body>
</html>