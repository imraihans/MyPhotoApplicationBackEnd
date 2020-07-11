package com.example.MyPhotoApplication.service;

import com.example.MyPhotoApplication.model.Users;
import com.example.MyPhotoApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public Users getUser(){

    return userRepository.getUsers();
    }

}
