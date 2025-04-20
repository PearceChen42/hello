<?php

$superhero  = "Superman";

function revealIdentity() {
    global $superhero;
    $message = "real name is Clark Kent\n";
    echo "$superhero $message";

};

revealIdentity();


function countVistors() {
    static $visitorCount = 0;
    $visitorCount++;
    echo "Visitor #$visitorCount has arrived!\n";
}




countVistors();
countVistors();
countVistors();
