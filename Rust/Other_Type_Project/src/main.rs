#![allow(unused)]

use std::io;
fn main() {
   //Vector - Similar to an array
   //Slower than arrays, but more flexble

   let mut vec1 = Vec::new();
   let mut  vec2 = vec![1,2,3];

   vec1.push(1);
   vec2.push(4);

   let second_element = vec2[1];
   println!("Element2: {}", second_element);
   println!();

    for element in vec2.iter() {
        println!("Element: {}", element);
        
    }

    println!("The length of the vector is {}", vec2.len());

// Structures   
    struct  Car {
        make:String,
        model: String,
        year: u32,
        price: f64,

    }

    let mut huracan = Car{
        make: String::from("Lamborghini"),
        model: String::from("Huracan"),
        year: 2020,
        price: 320000.00
    };

    println!("The cost of a {} {} is {}",huracan.year, huracan.make, huracan.price);
    println!();
    struct Rectangle {
        width: u32,
        height: u32,

    }

    impl Rectangle {
        fn area(&self) -> u32 {
            self.width * self.height
        }
    }

    let rect = Rectangle {width: 30, height: 50};
    println!("The area of rectangle is {}", rect.area());

    //Enumeration or enum
    //Define a set of named values
    println!();
    #[derive(Debug)]
    enum Shape {
        Circle(f32),
        Rectangle(f32,f32),
    }

    let circle = Shape::Circle(10.0);
    let rectangle = Shape::Rectangle(30.0,40.0);

    println!("{:?}",circle);

    //Generics
    fn sum<T: std::ops::Add<Output=T>> (a: T, b: T) -> T {
        a + b
    }

    let x = sum(1,2);
    let y = sum(2.3, 3.5);
    println!("The value of X is {}", x);
    println!("The value of Y is {}", y);
    println!("The sum of 3 + 2 = {}", sum(3,2));

    struct  Items<T> {
        x: T,
        y: T,

    }

    let i = Items {x: 1.0,y: 2.0};
    println!("{}, {}", i.x, i.y);
}
