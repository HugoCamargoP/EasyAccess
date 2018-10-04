package com.cutieOS.services;

import com.cutieOS.entity.Persona;
import com.cutieOS.repository.IPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonaServiceDao {

    @Autowired
    IPersona iPersonas;

    public List<Persona> findAll(int id_services) {
        return iPersonas.findByServiceId_service(id_services);}

    public void saveServiceByPersona(Persona persona) {
        iPersonas.save(persona);
    }



    public void putServiceByPersona(Persona persona) {
    if (iPersonas.findById(persona.getService().hashCode()).isPresent()){
        iPersonas.save(persona);
        }



    }

}
