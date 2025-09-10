#![allow(unused)]

use std::io;
use std::fs::{File, OpenOptions};
use std::io::prelude::*;
use std::fs;

fn main() {
    let result = divide(10,0);
    match result {
        Ok(value) => println!("Result: {}", value),
        Err(msg) => println!("Error: {}", msg)
    }

    println!();

    let result = read_file("src/test.txt");
    match result {
        Ok(contents) => println!("File contents: {}", contents),
        Err(err) => println!("Error reading file: {}",err),
    }
}

fn divide(x: i32, y:i32) -> Result<i32, String> {
    if y == 0 {
        return Err(String::from("Cannot divide by zero"))
    }
    Ok(x/y)
}

fn read_file(path: &str) -> Result<String, std::io::Error> {
    let mut file: File = match File::open(path) {
        Ok(file) => file,
        Err(e) => return Err(e),
    };

    let mut contents = String::new();
    match file.read_to_string(&mut contents) {
        Ok(_) =>return Ok(contents),
        Err(e) =>return  Err(e),
    };
}