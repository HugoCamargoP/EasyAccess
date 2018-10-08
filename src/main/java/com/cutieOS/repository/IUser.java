package com.cutieOS.repository;

import com.cutieOS.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUser extends JpaRepository <User , Integer > {
}
