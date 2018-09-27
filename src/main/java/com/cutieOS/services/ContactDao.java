package com.cutieOS.services;

import com.cutieOS.entity.Contact;
import com.cutieOS.repository.IContactToPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactDao {

    @Autowired
    IContactToPersona iContactToPersonas;

    public List<Contact> getAllContact() { return iContactToPersonas.findAll();
    }

    public boolean insertContact(Contact contact) {
        if (iContactToPersonas.save(contact) != null)
    return true;

        return false;

    }

    public void putContact(Contact contact) {
        iContactToPersonas.save(contact);
    }
}
