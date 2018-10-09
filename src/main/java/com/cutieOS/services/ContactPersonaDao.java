package com.cutieOS.services;


import com.cutieOS.entity.Contact;
import com.cutieOS.entity.Persona;
import com.cutieOS.repository.IContactToPersona;
import com.cutieOS.repository.IPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactPersonaDao {

    @Autowired
    IContactToPersona iContactToPersonas;

    @Autowired
    IPersona iPersonas;

    //public List<Contact> findAll(int id_persona) {return iContactToPersonas.findByPersona_Id_persona(id_persona);}

    /*
    public void saveContactByPersona(Contact contact) {iContactToPersonas.save(contact);
    }


    public void putContactByPersona(Contact contact) {
        if (iContactToPersonas.findById(contact.getPersona().getId_persona()).isPresent()) {
            iContactToPersonas.save(contact);
        }


    }
    */
}

