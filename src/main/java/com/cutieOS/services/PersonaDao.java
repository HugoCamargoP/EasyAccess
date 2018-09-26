package com.cutieOS.services;

import com.cutieOS.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonaDao {

    /*@Autowired
    IPersona iPersona;


    //retrieves all the videogames from the db
    public List<Persona> getAllPersona(){
        return iPersona.findAll();
    }

    //insert a videogame to the db
    public boolean insertPersona(Persona persona){
        if(iPersona.save(persona)!= null)
            return true;

        return false;
    }

    public Persona modificarPersona(Persona persona) {
        return iPersona.save(persona);
    }*/
}
