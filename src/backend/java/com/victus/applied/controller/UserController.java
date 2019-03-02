package com.victus.applied.controller;

import com.victus.applied.entity.User;
import com.victus.applied.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping(value = "/register")
    public String register(User user) {
        //TODO: add User DTO
        return "registration";
    }

    @GetMapping(value = "/login")
    public String welcome(Model model) {
        return "welcome";
    }
}
