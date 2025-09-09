#![allow(unused)]

fn main() {
    let student_a: (&str, char, f64) = ("Heath", 'A', 3.58);
    let name_student_a: &str = student_a.0;
    let grade_student_a: char = student_a.1;
    let gpa_student_a: f64 = student_a.2;


    println!("My name is {}, my class grade is {}, my overall GPA is {}",name_student_a,grade_student_a,gpa_student_a);

    //Arrays - [] - store up to 32 - similar data types
    let students: [&str;3] = ["Heath", "Bob", "Linda"];
    println!("The first student in our arrray is {}", students[0]);
}