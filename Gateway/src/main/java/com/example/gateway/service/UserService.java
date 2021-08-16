package com.example.gateway.service;

import com.example.gateway.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    private List<User> users=new ArrayList<>();

    public UserService() {
        users.add(new User("sachin","password1"));
        users.add(new User("swayam","password2"));
    }

    public List<User> getUsers() {
        return users;
    }


}
