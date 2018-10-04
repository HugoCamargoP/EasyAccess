package com.cutieOS.controller;

import com.cutieOS.entity.User;
import com.cutieOS.services.LoginDao;
import com.cutieOS.services.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginDao loginDao;

    @PostMapping ("/login")
    public boolean validation(@RequestBody User user){
        return loginDao.validation(user);
    }
}
