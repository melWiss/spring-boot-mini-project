package com.oussama.messenger.repositories;

import com.oussama.messenger.entities.ContactType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactTypeRepo extends JpaRepository<ContactType,Long> {
}
