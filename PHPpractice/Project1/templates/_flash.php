<?php $messages = getFlashMessages(); ?>

<? if (!empty($messages)): ?>
<div class = "flash-messages">
    <?php foreach ($messages as $type =>$message): ?>
    <div class="flash-message flash-<?htmlsepcialchars($type)?>">
        <?=$message?>
    </div>
    <?php endforeach; ?>
</div>