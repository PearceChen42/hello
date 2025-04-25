<?php
declare(strict_types=1);

echo file_exists("./../bootstrap.php");

require_once __DIR__.  '/../bootstrap.php';

loadSchema(
    connectDb(),
    DB_DIR . '/schema.sql'
);