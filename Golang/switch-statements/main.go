package main

import (
	"fmt"
)

func main() {
	fmt.Println("This is the first statment to run")
	fmt.Println("This is the second statement to run")
	x := 40
	y := 5
	fmt.Printf("x =%v \n y=%v\n", x, y)

	switch {
	case x < 42:
		fmt.Println("x is LESS THAN 42")
	case x == 42:
		fmt.Println(" x is EUAL to 42")
	case x > 42:
		fmt.Println("x is Greater than 42")
	default:
		fmt.Println("This is the default case")

	}

	switch x {
	case 40:
		fmt.Println("X IS 40")
		fallthrough
	case 41:
		fmt.Println("fallthrough X is 41")
	case 42:
		fmt.Println("X is 42")
	}

}
