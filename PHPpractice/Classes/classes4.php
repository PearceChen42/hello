<?php

class MathUtils {
    public static float $pi = 3.1415926;


    public static function square(float $num): float {
        return $num * $num;
    }
}

var_dump(
    MathUtils::$pi,
    MathUtils::square(4)
);

class Connection {
    private static $instance = null;
    private function __construct()
    {
        
    }
    public static function singleton() {
        if (null == static::$instance) {
        static::$instance = new Connection();
        }
        return static::$instance;
       
    }
    
}

$connection = Connection::singleton();
var_dump($connection);