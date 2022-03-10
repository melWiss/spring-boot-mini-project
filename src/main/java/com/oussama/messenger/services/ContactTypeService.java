package com.oussama.messenger.services;


import com.oussama.messenger.entities.ContactType;

import java.util.List;

public interface ContactTypeService {
    ContactType persistContactType(ContactType contact);
    ContactType deleteContactType(Long id);
    List<ContactType> getAllContactTypes();
    ContactType findContactTypeById(Long id);
    List<ContactType> getContactTypesBytype(String type);
    ContactType updateContactType(ContactType type);
}
