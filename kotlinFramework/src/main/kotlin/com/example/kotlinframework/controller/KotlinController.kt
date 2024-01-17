package com.example.kotlinframework.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/kotlinController")
class KotlinController {

    @Deprecated("秦小东废弃", ReplaceWith("\"aa\""))
    @PostMapping("/processForm")
    fun processForm(): String {
        return "aa"
    }

}