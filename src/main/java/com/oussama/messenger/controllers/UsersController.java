package com.oussama.messenger.controllers;

import com.oussama.messenger.services.ContactService;
import com.oussama.messenger.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/users")
public class UsersController {
    @Autowired
    UserService userService;
    @GetMapping(value = "/all")
    String hi(){
        return userService.getAllUsers().toString();
    }
}
