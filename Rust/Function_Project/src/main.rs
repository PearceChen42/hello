#![allow(unused)]

use std::io;
use rand::Rng;
use std::cmp::Ordering;

fn main() {
    //Functions - mini programs, organized blocks of code
    who_am_i();
    println!();
    add_one_hundred(100);
    let (add,mutiplied) = add_multiply(5, 6);
    println!("{}",add);
    println!("{}", mutiplied);
}

fn who_am_i() {
    let name: &str = "Heath";
    let age = 33;
    println!("My name is {} and I am {} years old.", name, age);
}

fn add_one_hundred(num: i32) {
    println!("{}", num + 100);
}

fn add_multiply(x: i32, y: i32) -> (i32,i32) {
    (x+y,x*y)
}