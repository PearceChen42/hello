package main

import (
	"fmt"
)

func main() {
	x := 40
	y := 5
	fmt.Printf("x=%v \ny=%v", x, y)

	for i := 0; i < 5; i++ {
		fmt.Printf("COUNTING TO FIVE: %v \t first for loop\n", i)
	}

	for y < 10 {
		fmt.Printf("y is %v \t\t second for loop\n", y)
		y++
	}

	for {
		fmt.Printf("y is %v \t\t third for loop\n", y)
		if y > 20 {
			break
		}
		y++
	}

	for i := 0; i <= 20; i++ {
		if i%2 != 0 {
			continue
		}
		fmt.Println("Counting even numbers: ", i)
	}

	for i := 0; i < 5; i++ {
		fmt.Println("--")
		for j := 0; j < 5; j++ {
			fmt.Printf("Outer loop %v \t inner loop %v\n", i, j)
		}
	}
	xi := []int{42, 43, 44, 45, 46, 47}
	for i, v := range xi {
		fmt.Println("ranging over slice", i, v)

	}

	m := map[string]int{
		"James":      42,
		"Moneypenny": 32,
	}
	for k, v := range m {
		fmt.Println("ranging over a map", k, v)
	}
}
