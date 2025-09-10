#[allow(unused)]

use std::io;
use rand::Rng;
fn main() {
    println!("Who goes there?");
    let mut  name = String::new();
    let _= io::stdin().read_line(&mut name);

    let enter = "You may now enter.";
    println!("Hello there {}. {}", name.trim_end(), enter);
    println!();

    let x = rand::thread_rng().gen_range(1..101);
    let y = 3;
    let x_float = x as f64;
    let y_float = y as f64;
    println!("{} + {} = {}",x,y, x+y);
    println!("{} - {} = {}",x,y, x-y);
    println!("{} * {} = {}",x,y, x*y);
    println!("{} / {} = {}",x,y, x_float / y_float);
    println!("{} % {} = {}",x,y, x%y);
    println!("{}^{} = {}",x,y, i32::pow(x, y as u32));

}
