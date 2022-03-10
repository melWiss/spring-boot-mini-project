package com.oussama.messenger.services;


import com.oussama.messenger.entities.ContactType;

import java.util.List;

public interface ContactTypeService {
    public ContactType persistContactType(ContactType contact);
    public ContactType deleteContactType(Long id);
    public List<ContactType> getAllContactTypess();
    public ContactType findContactTypeById(Long id);
    public List<ContactType> getContactTypesBytype(String type);
}
