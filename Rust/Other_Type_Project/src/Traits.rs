#![allow(unused)]

use std::io;
   trait Damage {
        fn damage(self: &mut Self);
    }

    #[derive(Debug)]
    struct HP {
        hp_remaining: i32,

    }

    impl Damage for HP {
        fn damage(self: &mut Self) {
            self.hp_remaining -= 1;
            
        }
    }

     trait Drawable {
    fn draw(&self);
 }

 struct Circle {
    radius: f32,
 }

 impl Drawable for Circle {
    fn draw(&self) {
        println!("Drawing a circle with radius {}", self.radius);
    }
 }

 fn draw_shape<T:Drawable>(shape: &T) {
    shape.draw();
 }
fn main() {

 let mut hp = HP {hp_remaining:100};
 hp.damage();
 println!("You took a hit HP Remaining: {:?}",hp);

 println!();

    let circle = Circle { radius: 10.0};
    circle.draw();

    draw_shape(&circle);

}