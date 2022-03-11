package com.oussama.messenger.controllers;

import com.oussama.messenger.entities.Contact;
import com.oussama.messenger.entities.ContactType;
import com.oussama.messenger.repositories.ContactRepo;
import com.oussama.messenger.services.ContactService;
import com.oussama.messenger.services.ContactServiceImpl;
import com.oussama.messenger.services.ContactTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/contacts")
public class ContactsController {
    @Autowired
    ContactService contactService;

    @GetMapping(value = "/all")
    String fetchAll(){
        return contactService.getAllContacts().toString();
    }

    @PostMapping(value = "/add")
    String addContact(@RequestBody Contact type){
        Contact t = contactService.persistContact(type);
        return t.toString();
    }

    @DeleteMapping(value = "/delete/{id}")
    String deleteContact(@PathVariable Long id){
        return contactService.deleteContact(id).toString();
    }

    @PutMapping(value = "/update")
    String updateContact(@RequestBody Contact contact){
        return contactService.updateContact(contact).toString();
    }
}
