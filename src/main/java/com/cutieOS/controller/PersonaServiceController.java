package com.cutieOS.controller;


import com.cutieOS.entity.Persona;
import com.cutieOS.entity.Servicio;
import com.cutieOS.services.PersonaServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaServiceController {

    @Autowired
    PersonaServiceDao personaServiceDao;

    @GetMapping("/{id_service}/persona")
    public List<Persona> getAllPersonaServices(@PathVariable int id_service){
        return personaServiceDao.findAll(id_service);
    }


    @PostMapping("/{id_service}/persona")
    public void saveServiceByPersona(@RequestBody Persona persona, @PathVariable int id_service){
        persona.setService(new Servicio("",id_service)); personaServiceDao.saveServiceByPersona(persona);
    }




    @PutMapping("/{id_service}/persona")
    public Persona putServiceByPersona (@RequestBody Persona persona,@PathVariable int id_service){
        persona.setService(new Servicio("",id_service)); personaServiceDao.putServiceByPersona(persona);

        return persona;
    }




}
