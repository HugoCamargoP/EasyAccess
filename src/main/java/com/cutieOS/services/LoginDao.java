package com.cutieOS.services;

import com.cutieOS.entity.User;
import com.cutieOS.repository.ILogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigInteger;
import java.security.MessageDigest;


@Service
public class LoginDao {

    @Autowired
    ILogin iLogin;

    public boolean validation(@RequestBody User user){
    	try {
    		MessageDigest md = MessageDigest.getInstance("MD5");
            user.setPassword(new BigInteger(1, md.digest(user.getPassword().getBytes())).toString(32));
            System.out.println(user.getPassword());
            if(iLogin.findByUserAndPassword( user.getUser(), user.getPassword()) == null ) return false;
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
}
