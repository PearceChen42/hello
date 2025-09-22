package main

import "fmt"

type person struct {
	first string
}

func (p person) speack() {
	fmt.Println("I am", p.first)
}

type secretAgent struct {
	person
	ltk bool
}

func (p secretAgent) speack() {
	fmt.Println("I am", p.first)
}

type human interface {
	speack()
}

func saySomething(h human) {
	h.speack()
}

func main() {
	p1 := secretAgent{
		person: person{
			first: "James",
		},
		ltk: true,
	}

	p2 := person{
		first: "Jenny",
	}

	p1.speack()
	p2.speack()

	saySomething(p1)
	saySomething(p2)
}
