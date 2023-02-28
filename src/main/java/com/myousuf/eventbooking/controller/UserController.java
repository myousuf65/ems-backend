package com.myousuf.eventbooking.controller;

import com.myousuf.eventbooking.entity.User;
import com.myousuf.eventbooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return service.adduser(user);
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return service.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserByID(@PathVariable("id") Long UserId){
        return service.getUserById(UserId);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable("id") Long UserId){
        service.deleteUser(UserId);
        return "deletion successful";
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable("id") Long UserId, @RequestBody User user){
        return service.updateUser(UserId, user);
    }
}
