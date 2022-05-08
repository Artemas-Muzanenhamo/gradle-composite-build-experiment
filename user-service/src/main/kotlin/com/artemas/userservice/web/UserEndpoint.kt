package com.artemas.userservice.web

import com.artemas.userservice.domain.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class UserEndpoint {
    @GetMapping("/users")
    fun getAllUsers(): List<User> {
        return listOf(
            User(id = UUID.randomUUID(), name = "Sarah", surname = "Thompson"),
            User(id = UUID.randomUUID(), name = "Thomas", surname = "Jenkins"),
            User(id = UUID.randomUUID(), name = "Kobe", surname = "Bryant"),
            User(id = UUID.randomUUID(), name = "Kate", surname = "Muza")
        )
    }
}