package com.example.blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogApplication

fun test() {
	println("test")
}

fun main(args: Array<String>) {
	runApplication<BlogApplication>(*args)
}
