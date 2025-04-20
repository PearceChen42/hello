<?php

$str ="Hello, World!";

echo "$str[0]\n";
echo "$str[1]\n";
echo "$str[-1]\n";
echo "$str[-2]\n";

echo substr($str,0,3);

echo strtoupper($str);
echo strtolower($str);
echo ucfirst(strtolower($str));

$gretting= "\nHello, " . "World!";
$gretting .= " How are you?\n";
echo $gretting;
