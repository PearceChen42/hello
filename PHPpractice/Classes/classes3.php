<?php

class BankAccount {
    private float $balance = 0;

    public function getBalance(): float {
        return $this -> balance;
    }

    public function deposit(float $amount):void {
        if ($amount > 0){
            $this->balance += $amount;
        }
    }

    public function withdraw(float $amount): bool {
        if ($amount > 0 && $this->balance > $amount){
            $this->balance -= $amount;
            return true;
        } else {
            return false;
        }
    }
}

$account = new BankAccount();
var_dump($account->getBalance());
$account->deposit(500);
var_dump($account->getBalance());
$account->withdraw(400);
var_dump($account->getBalance());

