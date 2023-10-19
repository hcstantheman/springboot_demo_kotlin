package com.example.demo_kotlin.controller

import com.example.demo_kotlin.service.LoginService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class LoginController(private final val loginService: LoginService) {

    @GetMapping("/")
    fun loginPage(): String {
        return "login.html"
    }

    @PostMapping("/login")
    fun processLogin(
        @RequestParam("username") username: String,
        @RequestParam("password") password: String
    ): String {

        val isAuthenticated = loginService.authenticate(username, password)

        return if (isAuthenticated) {
            "redirect:/home"
        } else {
            "redirect:/login?error"
        }
    }

    @GetMapping("/registerPage")
    fun registerPage(): String {
        return "register.html"
    }

}