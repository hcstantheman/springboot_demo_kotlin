package com.example.demo_kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.example.demo_kotlin.controller")
@ComponentScan("com.example.demo_kotlin.service")
class DemoKotlinApplication

fun main(args: Array<String>) {
    runApplication<DemoKotlinApplication>(*args)
}
