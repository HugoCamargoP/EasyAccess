package com.cutieOS.services;

import com.cutieOS.entity.User;
import com.cutieOS.repository.ILogin;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import javax.management.Query;

@Service
public class LoginDao {

    @Autowired
    ILogin iLogin;

    public boolean validation(@RequestBody User user){
        if(iLogin.findByUserAndPassword((String) user.getUser(),(String) user.getPassword()) == null )
        return false;

        return true;
    }

}
