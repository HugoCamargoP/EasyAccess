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

    @GetMapping("/contact")
    public List<Contact> getAllContact() {return contactDao.getAllContact();}

    @PostMapping("/contact")
    public boolean insertContact(@RequestBody Contact contact){ return contactDao.insertContact(contact);}

    @PutMapping("/contact/{id_contact}")
    public Contact putContact(@RequestBody Contact contact,@PathVariable int id_contact){
        contact.setId_contact(id_contact);
        return contactDao.putContact(contact);
    }


}
