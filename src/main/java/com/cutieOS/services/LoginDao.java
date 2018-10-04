package com.cutieOS.services;

import com.cutieOS.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LoginDao {

    @Autowired
    LoginDao loginDao;

    public boolean validation(@RequestBody User user){

          return true;
    }
}
