#![allow(unused)]

fn main() {
    //STRINGS - There are serveral types
    //Likely only use two: String and&str
    //str - String slice, &str - borrowed string slice - cannot be modified
    //&str - Essentially a subset of a String
    let name = "Heath".to_string();
    let name: String =String::from("Heath");
    println!("{}",name);
    let mut name: String = String::new();

    name.push_str(" test");
    println!("{}",name);

}