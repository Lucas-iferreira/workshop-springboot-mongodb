package com.lucasiago.workshopmongo.services;

import com.lucasiago.workshopmongo.entities.User;
import com.lucasiago.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public List<User> findAll(){
        return userRepository.findAll();
    }
}
