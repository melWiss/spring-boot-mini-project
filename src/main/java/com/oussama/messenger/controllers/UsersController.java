package com.oussama.messenger.controllers;

import com.oussama.messenger.entities.ContactType;
import com.oussama.messenger.entities.User;
import com.oussama.messenger.services.ContactService;
import com.oussama.messenger.services.ContactTypeService;
import com.oussama.messenger.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/users")
public class UsersController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/all")
    String fetchAll(){
        return userService.getAllUsers().toString();
    }

    @PostMapping(value = "/add")
    String addContactType(@RequestBody User user){
        User t = userService.persistUser(user);
        return t.toString();
    }

    @DeleteMapping(value = "/delete/{id}")
    String deleteContactType(@PathVariable Long id){
        return userService.deleteUser(id).toString();
    }

    /*@PutMapping(value = "/update")
    String updateContactType(@RequestBody ContactType type){
        return contactTypeService.updateContactType(type).toString();
    }*/
}
