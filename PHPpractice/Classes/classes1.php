<?php
// Class -> Tesla Y
// Object -> My Tesla Y or your Tesla Y

class Person {
    // public string $name;
    // public int $age;

    public function __construct(public string $name,public int $age) {
       // $this->name =$name;
       // $this->age =$age;
    }

    public function introduce(): string {
        return "Hi,I'm {$this->name} and {$this->age} old.\n";
    }
}

$person = new Person("Alice",30);
echo $person->introduce();