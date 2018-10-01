package com.cutieOS.services;

import com.cutieOS.entity.User;
import com.cutieOS.repository.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDao {

    @Autowired
    IUser iUser;

    public List <User> getAllUser(){return iUser.findAll();}

    public boolean insertUser(User user){
        if(iUser.save(user) != null)
            return true;

        return false;
    }

    public User modificarUser(User user){
        return iUser.save(user);
    }




}
