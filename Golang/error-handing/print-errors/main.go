package main

import (
	"fmt"
	"log"
	"os"
)

func main() {
	_, err := os.Open("no-file.txt")
	if err != nil {
		fmt.Println("err happend", err)
		log.Println("err happend", err)
		log.Fatal(err)
		panic(err)
	}
}
