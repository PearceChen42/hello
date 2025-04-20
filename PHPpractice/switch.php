<?php

echo "Which size you want?(S/M/L/XL): ";
$size = trim(fgets(STDIN));

switch ($size) {
    case "S":
    case "M":
        echo "Small or Medium size\n";
        break;
    case "L":
    case "XL":
        echo "Large or Extra Large size\n";
        break;
    default:
        echo "Unkonw size\n";
        break;
}

$badAttempts = 3;

switch ($badAttempts) {
    case 3:
        echo "You are blocked!\n";
    case 2:
    case 1:
        echo "Bad attempts add";
        $badAttempts += 1;
}
