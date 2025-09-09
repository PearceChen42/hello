#![allow(unsed)]

use std::io;

fn main() {
    let mut arr: [i32; 5] = [1,2,3,4,5];
    let slice:&mut [i32] = &mut arr[1..3];
    println!("{:?}",slice);

    slice[0] = 6;
    slice[1] = 7;
    println!("{:?}", arr)
}