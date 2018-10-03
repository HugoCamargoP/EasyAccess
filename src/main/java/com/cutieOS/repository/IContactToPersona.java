package com.cutieOS.repository;

import com.cutieOS.entity.Contact;
import com.cutieOS.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IContactToPersona extends JpaRepository<Contact, Integer> {

     List<Contact> findByPersona_Id_persona(Integer id_contact);
}
