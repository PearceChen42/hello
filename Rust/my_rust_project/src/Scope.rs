#![allow(unused)]
fn main() {
    let x: i32 = 1;
    {
        let y: i32 =2;
        println!("Math: x + y = {}",x+y);
    }
    let x: &str = "Hello";
    println!("{}", x);

    //Suffixes - specify the type of numberic literal

    let x: u32 =  42_u32;
    let y: i32 = 1_000_000;
    println!("{}",x);
    println!("{}",y)
}