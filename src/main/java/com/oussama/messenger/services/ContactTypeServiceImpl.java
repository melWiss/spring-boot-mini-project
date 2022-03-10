package com.oussama.messenger.services;

import com.oussama.messenger.entities.ContactType;
import com.oussama.messenger.repositories.ContactTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public List<ContactType> getAllContactTypes() {
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

    @Override
    public ContactType updateContactType(ContactType type) {
        return contactTypeRepo.saveAndFlush(type);
    }
}
