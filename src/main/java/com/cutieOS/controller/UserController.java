package com.cutieOS.controller;

import com.cutieOS.entity.User;
import com.cutieOS.services.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @GetMapping("/user")
    public List<User> getAllUser(){
        return userDao.getAllUser();
    }

    @PostMapping("/user")
    public boolean insertUser(@RequestBody User user){
        return userDao.insertUser(user);
    }

    @PutMapping("/user/{id_user}")
    public User modificarUser(@RequestBody User user , @PathVariable int id_user){

        user.setId_user(id_user);
        return userDao.modificarUser(user);
    }

}

