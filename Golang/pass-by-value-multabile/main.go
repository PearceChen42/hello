package main

import "fmt"

func inDelta(n *int) {
	*n = 43
}

func sliceDelta(ii []int) {
	ii[0] = 99
}

func mapDelta(md map[string]int, s string) {
	md[s] = 43
}

func main() {
	a := 42
	fmt.Println(a)
	inDelta(&a)
	fmt.Println(a)

	xi := []int{1, 2, 3, 4}
	fmt.Println(xi)
	sliceDelta(xi)
	fmt.Println(xi)

	m := make(map[string]int)
	m["James"] = 42

	fmt.Println(m["James"])
	mapDelta(m, "James")
	fmt.Println(m["James"])
}
