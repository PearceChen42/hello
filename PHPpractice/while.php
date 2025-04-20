<?php

$secret = "magic";
$attempts = 0;
$maxAttemps = 5;


while (true) {
    echo "Guess the password:";
    $guess = trim((fgets(STDIN)));
   

    if ($guess == $secret) {
        echo "Correct!\n🥇";
        break;
    } elseif ($attempts == $maxAttemps ){
        echo "You Lose!!\n";
        break;
    } else {
        echo "try again\n";
        
    }
    $attempts++;
}