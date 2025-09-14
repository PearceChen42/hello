package main

import (
	"fmt"
)

func main() {
	adams := 42
	fmt.Printf("42 as binary. %b \n", adams)
	fmt.Printf("42 as hexadecimal %x \n", adams)
	var a int = 0
	fmt.Printf("%v \t %b \t %x \t %#x\n", a, a, a, a)
	b := 5
	fmt.Printf("%v \t %b \t %x \t %#x\n", b, b, b, b)
}
