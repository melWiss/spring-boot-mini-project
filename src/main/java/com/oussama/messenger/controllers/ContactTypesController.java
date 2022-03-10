package com.oussama.messenger.controllers;

import com.oussama.messenger.entities.ContactType;
import com.oussama.messenger.services.ContactTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/contact-types")
public class ContactTypesController {
    @Autowired
    ContactTypeService contactTypeService;

    @GetMapping(value = "/all")
    String fetchAll(){
        return contactTypeService.getAllContactTypes().toString();
    }

    @PostMapping(value = "/add")
    String addContactType(@RequestBody ContactType type){
        ContactType t = contactTypeService.persistContactType(type);
        return t.toString();
    }

    @DeleteMapping(value = "/delete/{id}")
    String deleteContactType(@PathVariable Long id){
        return contactTypeService.deleteContactType(id).toString();
    }

    @PutMapping(value = "/update")
    String updateContactType(@RequestBody ContactType type){
        return contactTypeService.updateContactType(type).toString();
    }
}
