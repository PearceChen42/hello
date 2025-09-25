package main

import (
	"fmt"

	"golang.org/x/crypto/bcrypt"
)

func main() {
	s := "pasword123"

	bs, err := bcrypt.GenerateFromPassword([]byte(s), bcrypt.MinCost)
	if err != nil {
		fmt.Println(err)
	}
	fmt.Println(s)
	fmt.Println(bs)

	loginPword := `password123`
	err1 := bcrypt.CompareHashAndPassword(bs, []byte(loginPword))
	if err != nil {
		fmt.Println("You Can't Login", err1)
		return
	} else {
		fmt.Println("Login in")
	}
}
