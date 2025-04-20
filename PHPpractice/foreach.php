<?php

$basket = [
    "Apple" => 3,
    "Banana" => 4,

];

$total = 0;

foreach( $basket as $item => $quantity) {
    $total = $total + $quantity;
}
echo "Total is " . $total . "\n";