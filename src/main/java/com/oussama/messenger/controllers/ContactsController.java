package com.oussama.messenger.controllers;

import com.oussama.messenger.entities.Contact;
import com.oussama.messenger.repositories.ContactRepo;
import com.oussama.messenger.services.ContactService;
import com.oussama.messenger.services.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/contacts")
public class ContactsController {
    @Autowired
    ContactService contactService;
    @GetMapping(value = "/all")
    String hi(){
        return contactService.getAllContacts().toString();
    }
}
