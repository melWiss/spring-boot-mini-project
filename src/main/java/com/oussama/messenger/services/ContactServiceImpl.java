package com.oussama.messenger.services;
import com.oussama.messenger.entities.Contact;
import com.oussama.messenger.repositories.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    ContactRepo contactRepo;

    @Override
    public Contact persistContact(Contact contact) {
        return contactRepo.save(contact);
    }

    @Override
    public Contact deleteContact(Long id) {
        Contact c = findContactById(id);
        contactRepo.deleteById(id);
        return c;
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepo.findAll();
    }

    @Override
    public Contact findContactById(Long id) {
        return contactRepo.getById(id);
    }

    @Override
    public List<Contact> getContactsByFullName(String name) {
        return contactRepo.findAll();
    }

    @Override
    public Contact updateContact(Contact contact) {
        return contactRepo.saveAndFlush(contact);
    }
}
