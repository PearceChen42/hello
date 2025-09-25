package main

import (
	"fmt"
	"sync"
)

func main() {
	var wg sync.WaitGroup

	incrementer := 0
	gs := 100
	wg.Add(gs)

	for i := 0; i < gs; i++ {
		go func() {
			var m sync.Mutex
			m.Lock()
			v := incrementer
			//runtime.Gosched()
			v++
			incrementer = v
			m.Unlock()
			fmt.Println(incrementer)
			wg.Done()
		}()

	}
	wg.Wait()
	fmt.Println("end value:", incrementer)
}
