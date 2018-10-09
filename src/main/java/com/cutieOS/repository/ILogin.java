package com.cutieOS.repository;

import com.cutieOS.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ILogin extends JpaRepository <User , Integer> {

    User findByUserAndPassword(String user,String password);
}
