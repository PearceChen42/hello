package main

import "fmt"

func main() {
	xi := []int{42, 43, 44}
	fmt.Println(xi)
	fmt.Println("--------")

	xi = append(xi, 45, 46, 47, 99, 777)
	fmt.Println(xi)
	fmt.Println("--------")
	fmt.Println(xi[0:4])
	fmt.Println("--------")
	fmt.Println(xi[:])
	fmt.Println("--------")
	xi = append(xi[:4], xi[5:]...)
	fmt.Println(xi[:])
	fmt.Println("--------")
}
