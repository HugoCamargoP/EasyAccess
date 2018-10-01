package com.cutieOS.controller;


import com.cutieOS.entity.Contact;
import com.cutieOS.entity.Persona;
import com.cutieOS.services.ContactPersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
@RestController
@RequestMapping("/contact")*/
public class ContactPersonaController {

/*
    @Autowired
    ContactPersonaDao contactPersonaDao;

    @GetMapping("/{id_contact}/persona")
    public List<Persona> getAllContactByPersona(@PathVariable int id_contact){
        return contactPersonaDao.findAll(id_contact);
    }


    @PostMapping("/{id_contact}/persona")
    public void saveContactByPersona (@RequestBody Persona persona, @PathVariable int id_contact){
        persona.setContact(new Contact());
        contactPersonaDao.saveContactByPersona(persona);
    }
*/
}
