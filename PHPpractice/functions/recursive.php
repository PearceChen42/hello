<?php

function factorial(int $n): int {
    if ($n == 0 || $n == 1) {
        return 1;
    }
    else return $n * factorial($n-1);
}

echo factorial(5);