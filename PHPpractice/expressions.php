<?php

echo "Welcome to php\n";

$name = "Alice";

echo  "Hello," . $name . "!\n";

$pizzas = 3;
$slicesPerPizza = 8;
$totalSices = $pizzas * $slicesPerPizza;

echo "Total pizza slices: " . $totalSices . "\n";

$isHungry = true;

echo "Hungry?";
echo $isHungry ? "Yes" : "No";