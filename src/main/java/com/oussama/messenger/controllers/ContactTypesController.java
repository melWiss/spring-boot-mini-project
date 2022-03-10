package com.oussama.messenger.controllers;

import com.oussama.messenger.services.ContactTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/contact-types")
public class ContactTypesController {
    @Autowired
    ContactTypeService contactTypeService;
    @GetMapping(value = "/all")
    String hi(){
        return contactTypeService.getAllContactTypes().toString();
    }
}
