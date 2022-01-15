package main

import (
	"runtime"
)

func main() {
	// 绑定当前 g 到唯一的 m
	runtime.LockOSThread()

	var i int64
	for {
		i++
	}
}
