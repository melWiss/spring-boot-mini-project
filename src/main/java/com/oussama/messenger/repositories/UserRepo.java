package com.oussama.messenger.repositories;

import com.oussama.messenger.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
