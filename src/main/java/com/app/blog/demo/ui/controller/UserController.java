package com.app.blog.demo.ui.controller;

import org.springframework.web.bind.annotation.*;
//this controllers responsible for things that deal with user

@RestController //handling http request
@RequestMapping("users") //http://locahost:8000/users
public class UserController {

    @GetMapping
    public String getUser() {
        return "get user was called";
    };

    @PostMapping
    public String createUser() {
        return "Create user was called";
    };

    @PutMapping
    public String updateUser() {
        return "update user was called";
    };

    @DeleteMapping
    public String deleteUser() {
        return "Delete user was called";
    };

}
