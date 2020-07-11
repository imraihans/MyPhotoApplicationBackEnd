package com.example.MyPhotoApplication.resource;

import com.example.MyPhotoApplication.model.Users;
import com.example.MyPhotoApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public Users getUser(){


        return userService.getUser();
    }
}
