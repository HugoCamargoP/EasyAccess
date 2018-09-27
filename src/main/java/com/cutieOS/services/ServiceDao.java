package com.cutieOS.services;

import com.cutieOS.entity.Servicio;
import com.cutieOS.repository.IServiceToPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServiceDao {



    @Autowired
    IServiceToPersona iServiceToPersonas;


    public List<Servicio> getAllServices() {
        return iServiceToPersonas.findAll();
    }


    public boolean insertService(Servicio servicio) {
        if(iServiceToPersonas.save(servicio) !=null)
    return true;

    return false;
    }


    public Servicio putService(Servicio servicio) {
        return iServiceToPersonas.save(servicio);
    }
}
