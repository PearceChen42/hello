<?php

declare(strict_types=1);

function sum(int ...$numbers) {
    $sum = 0;
    foreach ( $numbers as $number) {
        $sum += $number;
    }
    var_dump($numbers);
    return $sum;
}

$numbers = [1, 2, 3];


var_dump(sum(...$numbers));

function introduceTeam($teamName,string ...$members): void {
    echo "Team: $teamName\n";
    echo "Members: " . implode(", ",$members);
    echo "\n";
    var_dump(($members));
}

introduceTeam("A team", "John", "Mr T");

$members = ["Harry", "Johny", "Joe"];

introduceTeam("B Team", "John", "Mr T",...$members);