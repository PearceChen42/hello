package main

import "fmt"

func main() {
	xs := []string{"Almond", "Biscotti", "Cafe"}
	fmt.Println(xs)
	fmt.Printf("%T\n", xs)

	for i, v := range xs {
		fmt.Printf("index %v value %v\n", i, v)

	}
}
