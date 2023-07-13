package com.example.dialkotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/message-kotlin")
class MessageKotlinController {

    @GetMapping("/test")
    fun test(@RequestParam("name") name: String) = "Hello, $name from Kotlin class example"
}