<?php

$isStudent = 1;
var_dump($isStudent,  true ,$isStudent === true);

$scores = [85, (int)"95.5", 95.5];

var_dump($scores,$scores[0] + $scores[1] + $scores[2]);

$total = $scores[0] + $scores[1];

echo "Total score is: $total";
