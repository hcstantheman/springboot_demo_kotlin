package com.example.demo_kotlin.service

import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc
import org.springframework.stereotype.Service

@Service
class LoginService {
    fun authenticate(username: String, password: String): Boolean {
        return username == "stanley" && password == "hello"
    }
}
