<?php


function doubleVale(int &$number): int {
    $number *= 2;
    return $number;
}


$original = 5;
doubleVale($original);
var_dump($original);