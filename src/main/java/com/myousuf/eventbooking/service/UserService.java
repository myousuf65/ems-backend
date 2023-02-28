package com.myousuf.eventbooking.service;


import com.myousuf.eventbooking.entity.User;
import com.myousuf.eventbooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User adduser(User user) {
        return repository.save(user);
    }

    public List<User> getUsers() {
        return repository.findAll();
    }

    public User getUserById(Long userId) {
        return repository.findById(userId).get();
    }

    public void deleteUser(Long userId) {
        repository.deleteById(userId);
    }

    public User updateUser(Long userId, User user) {
        User userdb = repository.findById(userId).get();

        userdb.setfName(user.getfName());
        userdb.setlName(user.getlName());
        userdb.setEmail(user.getEmail());

        return repository.save(userdb);
    }
}
