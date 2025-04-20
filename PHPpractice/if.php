<?php
$x = 10;
if ($x > 5) {

    echo "x is greater than5\n";
}

$score = 85;

if ($score >= 90) {
    echo "A";

} elseif ($score >= 70) {
    echo "C";
} elseif ($scoe >= 60) {
    echo "D";
} else {
    echo "F";
}
echo "\n";

$num = 14;

if ($num > 0) {
    if ($num % 2 == 0) {
        echo "Positive even number";
    } else {
        echo "Positive odd number";
    }
    
} else {
    echo "Non-positive number";
}

$username = "admin";
$password = "password123";

if ($username == "admin" && $password ==
"password123"){
    echo "Success";
} else {
    echo "Failure";
}