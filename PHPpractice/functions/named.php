<?php

function greet(string $name, string $gretting = 
"Hello", bool $shout = false): string {
    $message = "$gretting, $name!\n";
    return $shout ? strtoupper(($message)) : $message;
}

echo greet("Nelo", "Welcome", true );
echo greet("Alice");

echo greet(name : "David", shout: true, gretting: "Ni hao,");