package com.example.services;

import com.example.entities.Course;
import com.example.entities.User;
import java.util.List;

public interface UserService {

public List<User> getUsers();

    public User getUser(long userId);

    public User addUser(User user);
    
}
