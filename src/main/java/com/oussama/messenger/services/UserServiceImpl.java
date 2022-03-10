package com.oussama.messenger.services;

import com.oussama.messenger.entities.User;
import com.oussama.messenger.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepo userRepo;

    @Override
    public User persistUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User deleteUser(Long id) {
        User user = userRepo.getById(id);
        userRepo.deleteById(id);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User findUserById(Long id) {
        return userRepo.getById(id);
    }

    @Override
    public List<User> getUsersByFullName(String name) {
        return userRepo.findAll();
    }
}
