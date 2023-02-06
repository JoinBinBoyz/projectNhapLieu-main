package com.nhaplieu.service;

import com.nhaplieu.domain.User;
import com.nhaplieu.repository.UserDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService  {
    @Autowired
    private UserDAO userRepository;
    
    public User login(String username, String password) {
        User user=userRepository.findByUsernameAndPassword(username, password);
        return user;
    }
}
