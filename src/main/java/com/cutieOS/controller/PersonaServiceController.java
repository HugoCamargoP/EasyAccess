package com.cutieOS.controller;


import com.cutieOS.entity.Persona;
import com.cutieOS.entity.Servicio;
import com.cutieOS.services.PersonaServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class PersonaServiceController {

    @Autowired
    PersonaServiceDao personaServiceDao;
    /*
    @GetMapping("/{id_service}/persona")
    public List<Persona> getAllPersonaServices(@PathVariable int id_service){
        return personaServiceDao.findAll(id_service);
    }


    @PostMapping("/{id_service}/persona")
    public void saveServiceByPersona(@RequestBody Persona persona, @PathVariable int id_service){
        Collection<Servicio> colle = new ArrayList<>();
        colle.add( new Servicio("",id_service));
        //persona.setService(colle);
        personaServiceDao.saveServiceByPersona(persona);

    }
    
    @PutMapping("/{id_service}/persona")
    public Persona putServiceByPersona (@RequestBody Persona persona,@PathVariable int id_service){
        Collection<Servicio> collec = new ArrayList<>();
        collec.add(new Servicio("",id_service));
        //persona.setService(collec);
        personaServiceDao.putServiceByPersona(persona);

        return persona;
    }
    */
}
