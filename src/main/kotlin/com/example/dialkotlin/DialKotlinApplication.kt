package com.example.dialkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.example")
class DialKotlinApplication

fun main(args: Array<String>) {
	runApplication<DialKotlinApplication>(*args)
}
