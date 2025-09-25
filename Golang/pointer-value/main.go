package main

import "fmt"

func addOne(v int) int {
	return v + 1
}

func addOneP(v *int) {
	*v += 1
}

func main() {
	a := 1
	fmt.Println(a)
	fmt.Println(addOne(a))
	fmt.Println(a)

	b := 1
	fmt.Println("Value semantics")
	fmt.Println(b)
	addOneP(&b)
	fmt.Println(b)
}
