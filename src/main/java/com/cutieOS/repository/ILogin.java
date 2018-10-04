package com.cutieOS.repository;

import com.cutieOS.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILogin extends JpaRepository <User , Integer> {
}
