<?php
$entries = $data['messages'];
//var_dump($entries);
function obfuscateEmail(string $email): string {
    $parts = explode('@', $email);
    $username = $parts[0];
    $domain = $parts[1] ?? '';
    $username = substr($username, 0, 2) . str_repeat('*',strlen($username) - 2);
    return "$username@$domain";
}
?>
<section>
    <h2>
        <h2>Guest Messages</h2>
        <?php if (empty($entries)): ?>
        <p> No messages yet.</p>
        <?php else: ?>
        <?php foreach ($entries as $message) : ?>
        <h3> <?=htmlspecialchars($message['name'])?>  </h3>
        <p> <?=htmlspecialchars(obfuscateEmail($message['email']))?>  </p>
        <p> <?=nl2br(htmlspecialchars($message['message']))?>  </p>
        <small> <?=htmlspecialchars($message['created_ad']) ?>   </small>
        <?php endforeach ?>
        <?php endif; ?>
    </h2>
</section>