package main

import (
	"fmt"
	"io"
	"os"
)

func main() {
	fmt.Println("Hello, playground")
	fmt.Fprintln(os.Stdout, "Hello,Playground")
	io.WriteString(os.Stdout, "Hello, playground")
}
