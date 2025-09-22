package main

import "fmt"

func main() {
	am := map[string]int{
		"Todd":   42,
		"Henry":  16,
		"Padget": 14,
	}

	fmt.Println("The age of Henry was ", am["Henry"])

	fmt.Println(am)
	fmt.Printf("%#v\n", am)
	fmt.Println()
	an := make(map[string]int)
	an["Lucas"] = 28
	an["Steph"] = 27
	an["George"] = 78
	fmt.Println(an)
	fmt.Printf("%#v\n", an)

	fmt.Println()

	for k, v := range an {
		fmt.Println(k, v)
	}

	for _, v := range an {
		fmt.Println(v)
	}

	xi := []int{42, 43, 44}

	for i := range xi {
		fmt.Println(i, xi[i])
	}

	delete(an, "George")
	fmt.Println(an)
	fmt.Println(an["George"])

	v, ok := an["Geoge"]
	if ok {
		fmt.Println(v)
	} else {
		fmt.Println("Key didn't exist")
	}
}
