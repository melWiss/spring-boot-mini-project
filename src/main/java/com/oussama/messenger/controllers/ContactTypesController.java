package com.oussama.messenger.controllers;

import com.oussama.messenger.entities.ContactType;
import com.oussama.messenger.services.ContactTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/contact-types")
public class ContactTypesController {
    @Autowired
    ContactTypeService contactTypeService;

    @GetMapping(value = "/all")
    List<ContactType> fetchAll(){
        return contactTypeService.getAllContactTypes();
    }

    @PostMapping(value = "/add")
    ContactType addContactType(@RequestBody ContactType type){
        ContactType t = contactTypeService.persistContactType(type);
        return t;
    }

    @DeleteMapping(value = "/delete/{id}")
    ContactType deleteContactType(@PathVariable Long id){
        return contactTypeService.deleteContactType(id);
    }

    @PutMapping(value = "/update")
    ContactType updateContactType(@RequestBody ContactType type){
        return contactTypeService.updateContactType(type);
    }
}
