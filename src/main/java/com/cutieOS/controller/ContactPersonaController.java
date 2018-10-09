package com.cutieOS.controller;


import com.cutieOS.entity.Contact;
import com.cutieOS.entity.Persona;
import com.cutieOS.entity.Servicio;
import com.cutieOS.services.ContactPersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class ContactPersonaController {


    @Autowired
    ContactPersonaDao contactPersonaDao;

    /*
    @GetMapping("/{id_persona}/contact")
    public List<Contact> getAllContactByPersona(@PathVariable int id_persona){
        return contactPersonaDao.findAll(id_persona);
    }
     */

    //se pone id_persona
    /*
    @PostMapping("/{id_persona}/contact")
    public void saveContactByPersona (@RequestBody Contact contact, @PathVariable int id_persona){
        contact.setPersona(new Persona("",id_persona));
        contactPersonaDao.saveContactByPersona(contact);
    }

    //se Agrega id_persona
    @PutMapping("/{id_persona}/contact")
    public Contact putContactByPersona (@RequestBody Contact contact,@PathVariable int id_persona){
        contact.setPersona(new Persona("",id_persona)); contactPersonaDao.putContactByPersona(contact);

        return contact;
    }
    */
}
