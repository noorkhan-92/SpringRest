/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services;

import com.example.entities.Course;
import com.example.entities.Student;
import com.example.entities.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    List<User> list;

    public UserServiceImpl() {
        list = new ArrayList<>();
        
        list.add(new User(0001, "Noor Khan", "03023519551", "noorkhan_92@hotmail.com", "Village Biro", "non-paid"));
        list.add(new User(0002, "Mehran Khan", "03023519551", "mehrankhan_92@hotmail.com", "Village Kokarai", "paid"));
        
    }
    
    @Override
    public List<User> getUsers() {
        return list;
    }

    @Override
    public User getUser(long userId) {
        
        User user = null;
        for(User u : list) {
        if(u.getId() == userId){
            user = u;
        }
        }
        
        return user;
    }

    @Override
    public User addUser(User user) {
        list.add(user);
        return user;
    }
    
}
