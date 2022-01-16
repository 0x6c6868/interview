package main

import "fmt"

func main() {
	fmt.Println(process(0b10100010))
}

func process(num int) int {
	var rst int
	for ;num != 0; {
		num &= num - 1
		rst++
	}
	return rst
}