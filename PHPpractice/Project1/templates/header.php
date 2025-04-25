<!DOCTYPE html>
<html lang="en">
<head> 
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scake=1.0">
    <title>Contant <Form></Form></title>   
    <style>

        html {
            -moz-text-size-adjust:none;
            -webkit-text-size-adjust: none;
            text-size-adjust:noe;
        }

        :target {
            scroll-margin-block: 5ex;
        }
        .flash-messages {
            margin : 10px 0px;
        }
        .flash-messages {
            padding: 10px;
            margin-bottom: 10px;
            border-radius: 4px
        }
    </style>
</head>
<body>
    <header>
        <h1>Welcome</h1>
    </header>
    <nav>
        <a href="/">Home</a>
        <a href="/contact">Contact Form</a>
        <a href="/guestbook">Guestbook</a>
    </nav>
    <main>
        <?php require_once('_flash.php'); ?>
