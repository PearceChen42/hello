package main

import (
	"fmt"
	"math/rand"
)

func init() {
	fmt.Println("Begin Code!")
}

func main() {
	fmt.Println("This is the first statement to run")
	fmt.Println("This is the second statement to run")
	x := 40
	y := 5
	fmt.Printf(" x= %v \n y = %v \n", x, y)

	//CONDITIONAL
	//IF STATEMENTS
	// Swich statements

	if x < 42 {
		fmt.Println("Less than the meaning of life")
	}

	if x < 42 {
		fmt.Println("Less than the meaning of life")
	} else {
		fmt.Println("Equal to , or greater than, the meaning of life")
	}

	if x < 42 {
		fmt.Println("Less than the meaning of life")
	} else if x == 42 {
		fmt.Println("eual to the meaning of life")
	} else {
		fmt.Println("Greater than the meaning of life")
	}
	fmt.Println("")

	if x < 42 && y < 42 {
		fmt.Println("Both are less than the meaning of life")
	}

	if x > 30 || x < 42 {
		fmt.Println("x is getting close to the meaning of life")
	}

	if x != 42 && y != 10 {
		fmt.Println("X is not 42 & y is nor 10")
	}
	fmt.Println("")

	if z := 2 * rand.Intn(x); z >= x {
		fmt.Printf("z is %v and that is Greater or Equal x which is %v", z, x)

	} else {
		fmt.Printf("z is %v and that is is Less Than x which is %v\n", z, x)
	}
}
