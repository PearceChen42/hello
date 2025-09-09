fn main() {
    // Variables are immutable
    let mut hello: &str = "Hello, world!";
    println!("{}",hello);

    hello = "Hello, again!";
    println!("{}",hello);

    let x: i32 = 5;
    let y: i32 = 6;
    println!("Math in Rust: {} + {} = {}",x,y,x+y);

    //Constants
    const NUMBER: i64 = 17;

    println!("{}",NUMBER);
}