<?php
function countDown(int $start): array
{
    $result = [];
    for ($i = $start; $i > 0; $i--) {
        $result[] = random_int(1,100);

    }
    return $result;
}

function countDown2(int $start): Generator{
    for ($i = $start; $i >0; $i--) {
        yield random_int(1,100);
    }
}

echo "cunt1: return array\n";
foreach (countDown(5) as $number ) {
    echo "$number\n";
}

echo "cunt2: return Generator\n";

foreach (countDown2(5) as $number) {
    echo "$number\n";
}