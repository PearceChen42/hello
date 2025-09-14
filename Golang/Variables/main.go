package main

import "fmt"

func main() {
	a := 42
	fmt.Println(a)

	b, c, d, _, f := 0, 1, 2, 3, "happiness"
	fmt.Println(b, c, d, f)

	var g int
	fmt.Println(g)
	g = 43
	fmt.Println(g)

	var h int = 44
	fmt.Println(h)
}
