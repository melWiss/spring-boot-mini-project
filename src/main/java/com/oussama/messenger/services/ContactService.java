package com.oussama.messenger.services;

import com.oussama.messenger.entities.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ContactService {
    public Contact persistContact(Contact contact);
    public Contact deleteContact(Long id);
    public List<Contact> getAllContacts();
    public Contact findContactById(Long id);
    public List<Contact> getContactsByFullName(String name);
}