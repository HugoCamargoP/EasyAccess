package com.cutieOS.repository;

import com.cutieOS.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddress extends JpaRepository<Address, Integer> {
}
