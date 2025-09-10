#![allow(unused)]

use std::io;

fn main() {
    let name = String::from("Heath"); //Free memory
    let new_name = name.clone();
    println!("Hello , my name is {}", new_name);
    println!();

    let a = String::from("Heath");
    let b = &a;
    println!("My name is {}", *b);

    let s1 = String::from("Hello");
    let len = calculate_length(&s1);
    println!("The length of {} is {}", s1,len);

    println!();
    let mut x = 18;
    let y = &mut x;
    println!("{}",*y);
    *y += 1;
    println!("{}",x);
}
fn calculate_length(s: &String) -> usize {
    s.len()
}
