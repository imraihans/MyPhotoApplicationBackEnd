package com.example.MyPhotoApplication.repository;

import com.example.MyPhotoApplication.model.Users;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public Users getUsers(){
        Users users= new Users("Mohammad","Raihan",30);
     return users;
    }

}
