package com.example.springbootwithcrac

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
class HelloController

@GetMapping("/")
fun index(): String = "Hello from Spring Boot"
