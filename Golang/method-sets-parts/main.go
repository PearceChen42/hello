package main

import "fmt"

type dog struct {
	first string
}

func (d dog) walk() {
	fmt.Println("My name is ", d.first, "and i'm walking")

}

func (d *dog) run() {
	d.first = "Rouver"
	fmt.Println("My name is ", d.first, "and I'm running")

}

type youngin interface {
	walk()
	run()
}

func youngRun(y youngin) {
	y.run()
}

func main() {
	d1 := dog{"Henry"}
	d1.walk()
	d1.run()
	fmt.Println(d1.first)
	youngRun(&d1)

	d2 := &dog{"Padget"}
	d2.walk()
	d2.run()
	fmt.Println(d2.first)
	youngRun(d2)
}
