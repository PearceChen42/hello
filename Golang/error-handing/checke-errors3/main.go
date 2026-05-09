package main

import (
	"fmt"
	"io"
	"os"
	"strings"
	"time"
)

func main() {
	f, err := os.Create("names.txt")
	if err != nil {
		fmt.Println(err)
		return
	}

	r := strings.NewReader("James Bond")

	io.Copy(f, r)

	defer f.Close()
	time.Sleep(1 * time.Second)
	bs, err2 := io.ReadAll(f)
	if err2 != nil {
		fmt.Println(err2)
		return
	}
	fmt.Println(string(bs))
}
