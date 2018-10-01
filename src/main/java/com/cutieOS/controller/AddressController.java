package com.cutieOS.controller;

import com.cutieOS.entity.Address;
import com.cutieOS.entity.User;
import com.cutieOS.services.AddressDao;
import com.cutieOS.services.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {


    @Autowired
    AddressDao addressDao;

    @GetMapping("/address")
    public List<Address> getAllAddress(){return addressDao.getAllAddress();}

    @PostMapping ("/address")
    public boolean insertAddress(@RequestBody Address address){
        return addressDao.insertAdress(address);
    }

    @PutMapping("/address/{id_address}")
        public Address modificarAddress(@RequestBody Address address, @PathVariable int id_address){
        address.setId_address(id_address);
        return addressDao.modificaAddress(address);
    }
}


