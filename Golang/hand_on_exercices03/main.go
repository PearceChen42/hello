package main

import "fmt"

const (
	c0 = iota //c0==0
	c1 = iota // c1 ==1
	c2 = iota // c2 == 2
)

const (
	c3 = iota // c3 == 0
	c4 = iota
	c5 = iota
	c6 = iota
)

func main() {
	fmt.Println(c0, c1, c2)
	fmt.Println(c3, c4, c5, c6)
	fmt.Printf("%d \t %b\n", 1<<1, 1<<1)
	fmt.Printf("%d \t %b\n", 1<<2, 1<<2)
	fmt.Printf("%d \t %b\n", 1<<3, 1<<3)
	fmt.Printf("%d \t %b\n", 1<<4, 1<<4)
	fmt.Printf("%d \t %b\n", 1<<5, 1<<5)
	fmt.Printf("%d \t %b\n", 1<<6, 1<<6)
	fmt.Printf("%d \t %b\n", 1<<7, 1<<7)
	fmt.Printf("%d \t %b\n", 1<<8, 1<<8)
	fmt.Printf("%d \t %b\n", 1<<9, 1<<9)
	fmt.Printf("%d \t %b\n", 1<<10, 1<<10)
}
