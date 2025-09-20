package main

import "fmt"

func main() {

	var ni [7]int

	ni[0] = 42
	fmt.Printf("%#v \t\t\t %T\n", ni, ni)

	ni2 := [4]int{55, 56, 57, 58}
	fmt.Printf("%#v \t\t\t\t %T\n", ni2, ni2)

	ns := [...]string{"Chocolate", "Vanilla", "Strawberry"}
	fmt.Printf("%#v \t %T\n", ns, ns)

	fmt.Println(len(ni))
	fmt.Println(len(ni2))
	fmt.Println(len(ns))
}
