package com.oussama.messenger.repositories;

import com.oussama.messenger.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact,Long> {
}
