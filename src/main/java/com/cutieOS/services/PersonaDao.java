package com.cutieOS.services;

import com.cutieOS.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cutieOS.repository.IPersona;

import java.util.List;


@Service
public class PersonaDao {

    @Autowired
    IPersona iPersonas;


    //retrieves all the Persona from the db
    public List<Persona> getAllPersona(){
        return iPersonas.findAll();
    }

    //insert a persona to the db
    public boolean insertPersona(Persona persona){
        if(iPersonas.save(persona)!= null)
            return true;

        return false;
    }

    public Persona modificarPersona(Persona persona)     {
        return iPersonas.save(persona);
    }
}
