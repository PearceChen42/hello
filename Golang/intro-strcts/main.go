package main

import "fmt"

type person struct {
	first string
	last  string
	age   int
}

type secretAgent struct {
	person
	ltk bool
}

type foo int

func main() {

	var a foo = 42
	sa1 := secretAgent{
		person: person{
			first: "James",
			last:  "Bond",
			age:   int(a),
		},
		ltk: true,
	}

	p2 := person{
		first: "Jenny",
		last:  "Moneypenny",
		age:   27,
	}

	fmt.Println(sa1)
	fmt.Println(p2)

	fmt.Printf("%T \t %#v", sa1, sa1.first)
}
