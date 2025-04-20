<?php

$name = "Alice";
$age = 30;

printf("%s is %d years old.", $name, $age);


$csv = "apple,banana,cherry";
$fruits = explode(",", $csv);
var_dump($fruits, implode(",",$fruits));

$padded = str_pad("Hello",10,'-',STR_PAD_LEFT);
echo $padded;
var_dump(trim("     Hello, World!   "));
