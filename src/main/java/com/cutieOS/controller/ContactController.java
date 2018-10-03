package com.cutieOS.controller;


import com.cutieOS.entity.Contact;
import com.cutieOS.services.ContactDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    ContactDao contactDao;

    @GetMapping("/contacts")
    public List<Contact> getAllContact() {return contactDao.getAllContact();}

    @PostMapping("/contacts")
    public boolean insertContact(@RequestBody Contact contact){ return contactDao.insertContact(contact);}

    @PutMapping("/contacts/{id_contact}")
    public Contact putContact(@RequestBody Contact contact,@PathVariable int id_contact){
        contact.setId_contact(id_contact);
        return contactDao.putContact(contact);
    }


}
