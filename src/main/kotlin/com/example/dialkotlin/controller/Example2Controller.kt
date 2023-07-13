package com.example.dialkotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/message2")
class Example2Controller {

    @GetMapping("/test")
    fun message2(@RequestParam("name") name: String) = String.format("Hello, %s from Kotlin class example2",name)
}