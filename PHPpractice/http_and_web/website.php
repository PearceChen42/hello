<?php
$pageTitle = "Dynamic PHP Page";
$currentTime = date("H:i:s");
$_SERVER
?>

<html><head>
    <title><?=$pageTitle?></title>
</head>
<body>
    <h1>Welcome</h1>
    <p>
        The current server time is : <?=$currentTime?>
    </p>
    <table>
        <tr>
            <td><strong>Key</strong></td>
            <td><strong>Value</strong></td>
        </tr>
        <tbody>
            <?php foreach ($_SERVER as $key =>$value): ?>
            
                <tr>
                    <td><?=$key?></td>
                    <td><?=$value?></td>
                </tr>
            <?php endforeach;?>

        </tbody>
    </table>
</body></html>