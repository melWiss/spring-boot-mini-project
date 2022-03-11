package com.oussama.messenger.controllers;

import com.oussama.messenger.entities.ContactType;
import com.oussama.messenger.entities.User;
import com.oussama.messenger.services.ContactService;
import com.oussama.messenger.services.ContactTypeService;
import com.oussama.messenger.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/users")
public class UsersController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/all")
    List<User> fetchAll(){
        return userService.getAllUsers();
    }

    @PostMapping(value = "/add")
    User addUser(@RequestBody User user){
        User t = userService.persistUser(user);
        return t;
    }

    @DeleteMapping(value = "/delete/{id}")
    User deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }

    @PutMapping(value = "/update")
    User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
}
