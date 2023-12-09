package com.example.springbootwithcrac

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootWithCracApplication

fun main(args: Array<String>) {
    println("Starting app...")
    Thread.sleep(3000)
    runApplication<SpringBootWithCracApplication>(*args)
}
