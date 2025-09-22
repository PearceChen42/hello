package main

import "fmt"

func main() {
	func() {
		fmt.Println("Anonymous func ran")
	}()

	func(s string) {
		fmt.Println("This is my name", s)
	}("Wodd")

	x := func() {
		fmt.Println("Anonymous func ran")
	}

	x()
}
