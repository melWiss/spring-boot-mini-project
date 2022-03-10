package com.oussama.messenger.services;

import com.oussama.messenger.entities.User;

import java.util.List;

public interface UserService {
    public User persistUser(User user);
    public User deleteUser(Long id);
    public List<User> getAllUsers();
    public User findUserById(Long id);
    public List<User> getUsersByFullName(String name);
}
