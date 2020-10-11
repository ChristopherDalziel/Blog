package com.example.blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogApplication

//test

fun main(args: Array<String>) {
	runApplication<BlogApplication>(*args)
	setBannerMode(Banner.Mode.OFF)
}
