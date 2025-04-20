<?php

interface Logger {
    public function log(string $message ): void;
}
trait Loggable {
    public function log(string $message): void {
        echo "Logging $message\n";
    }
}

class User implements Logger
{
    use Loggable;
    public function __construct(public string $name)
    {}

    public function save():void {
        $this ->log("User {$this->name} saved");
    }
}
$User = new User("Alice");
$User->save();
