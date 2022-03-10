package com.oussama.messenger.services;

import com.oussama.messenger.entities.ContactType;
import com.oussama.messenger.repositories.ContactTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContactTypeServiceImpl implements ContactTypeService{
    @Autowired
    ContactTypeRepo contactTypeRepo;
    @Override
    public ContactType persistContactType(ContactType contact) {
        return contactTypeRepo.save(contact);
    }

    @Override
    public ContactType deleteContactType(Long id) {
        ContactType contactType = contactTypeRepo.getById(id);
        contactTypeRepo.deleteById(id);
        return contactType;
    }

    @Override
    public List<ContactType> getAllContactTypess() {
        return contactTypeRepo.findAll();
    }

    @Override
    public ContactType findContactTypeById(Long id) {
        return contactTypeRepo.getById(id);
    }

    @Override
    public List<ContactType> getContactTypesBytype(String type) {
        return contactTypeRepo.findAll();
    }
}
