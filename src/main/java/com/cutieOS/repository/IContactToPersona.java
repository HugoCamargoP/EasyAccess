package com.cutieOS.repository;

import com.cutieOS.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContactToPersona extends JpaRepository<Contact, Integer> {
}
