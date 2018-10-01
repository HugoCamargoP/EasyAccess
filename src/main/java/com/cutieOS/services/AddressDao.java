package com.cutieOS.services;

import com.cutieOS.entity.Address;
import com.cutieOS.repository.IAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressDao {

    @Autowired
    IAddress iAddress;

    public List <Address> getAllAddress(){return iAddress.findAll();}

    public boolean insertAdress(Address address){
        if(iAddress.save(address) != null)
            return true;

            return false;
    }

    public Address modificaAddress(Address address){return iAddress.save(address);}
}
