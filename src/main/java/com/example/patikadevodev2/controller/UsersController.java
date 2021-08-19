package com.example.patikadevodev2.controller;

import com.example.patikadevodev2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }
}
