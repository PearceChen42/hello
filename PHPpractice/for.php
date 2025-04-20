<?php

echo "Rocket launch countdown:\n";

for ($i = 10; $i > 0; $i--) {
    echo $i . "...\n";
    sleep(1);
    if ( 1 == $i) {
        echo "Liftoff! 🚀\n";
    }
}