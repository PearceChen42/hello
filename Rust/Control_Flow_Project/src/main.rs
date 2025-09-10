#[allow(unused)]

use std::io;
use rand::Rng;
use std::cmp::Ordering;

fn main() {
    //if, else if, else
    println!("How much money do you have?");
    let mut input_money = String::new();
    let _ =io::stdin().read_line( &mut input_money);

    let money: i32 = input_money.trim().parse().expect("ENTRY was not integer");

    println!("How old are you?");
    let mut input_age = String::new();
    let _ =io::stdin().read_line( &mut input_age);

    let age: i32 = input_age.trim().parse().expect("ENTRY was not integer");

    if (age >= 21) && (money >=5) {
        println!("We're getting a drink!")
    }   else if (age >= 21) && (money <5) {
        println!("Come back with more money!")
    } else {
        println!("You're too young and too poor")
    };
    //Match - matching arm & all possible values must be covere
    println!();
    let candidacy_age = age;

    match candidacy_age {
        1..=24 => println!("Cannot hold office."),
        25..=29 => println!("Can run for the House"),
        30..=34 => println!("Can run for the Senate."),
        35..=i32::MAX => println!("Can run for Pressident"),
        _ => println!("Are you an infant?")
    };

    let my_age = age;
    let drinking_age = 21;
    match my_age.cmp(&drinking_age) {
        Ordering::Less => println!("Cannot drink!"),
        Ordering::Equal => println!("WOO, you dan drink!"),
        Ordering::Greater => println!("Can drink!")
    };

    //LOOPS - While, For, Infinite Loop
    //for loops - start to finish of an iterate
    println!();
    let mut vegetables = ["Cucumber", "Spinach", "Cabbage"];
    for x in vegetables.iter() {
        println!("{}",x);
    }
    //while loops - execute as long as true
    println!();
    let mut i = 1;
    while i <= 5 {
        println!("{}",i);
        i += 1;

    }
    //loop - infinite loops
    println!();
    let mut y = 0;

    println!("Counting!");
    loop {
        y += 1;
        println!("{}",y);
        if y == 5 {
            
            println!("We've reached 5");
            continue;
        }

        if y == 10 {
            println!("Reached 10, exit program!");
            break;
        }
    }
}
