package com.example.userservice.controller;

import com.example.userservice.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return new User(
                userId,
                "user" + userId,
                "Иван Иванов",
                "Москва, ул. Ленина, 10",
                "+79991234567",
                "ivan@example.com"
        );
    }
}
