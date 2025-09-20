package main

import "fmt"

func main() {
	xs := []string{"Almond", "Biscotti", "Cafe"}
	fmt.Println(xs)
	fmt.Printf("%T\n", xs)

	for _, v := range xs {
		fmt.Printf("%v\n", v)

	}

	fmt.Println("-------------")
	fmt.Println(xs[0])
	fmt.Println(xs[1])
	fmt.Println(xs[2])
	fmt.Println("-------------")
	fmt.Println(len(xs))
	fmt.Println("-------------")

	for i := 0; i < len(xs); i++ {
		fmt.Println(xs[i])
	}
}
