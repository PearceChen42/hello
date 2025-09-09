fn main() {
    //Scalar types: int, float, boolean, char
    //Unsigend - never negative - u8, u16, u32, u64, u128, usize
    //Signed - can be negative and positive - i8, i16, i32, i64, i128, isize
    println!("Max size of u32: {}", u32::MAX);
    println!("Max size of u64: {}", u64::MAX);
    println!("Min size of u64: {}", u64::MIN);
    println!("Max size of i32: {}", i32::MAX);
    println!("Max size of i64: {}", i64::MAX);
    println!("Min size of i64: {}", i64::MIN);

    //floats - f32, f64 - 3.14   0.14
    println!("");
    println!("Max size of f32: {}", f32::MAX);
    println!("Max size of f64: {}", f64::MAX);
    println!("Min size of f64: {}", f64::MIN);

    //boolean - true or false - bool
    // true of false - true vs true and false - false
    println!("");
    //character - char - 4 bytes
    println!("{}", 'A')
}