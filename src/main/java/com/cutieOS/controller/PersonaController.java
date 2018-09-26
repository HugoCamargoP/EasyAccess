package com.cutieOS.controller;


import com.cutieOS.entity.Persona;
import com.cutieOS.services.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    PersonaDao personaDao;

    @GetMapping("/persona")
    public List<Persona> getAllPersona(){
        return personaDao.getAllPersona();
    }


    @PostMapping("/persona")
    public boolean insertPersona(@RequestBody Persona persona){
        return  personaDao.insertPersona(persona);
    }

    @PutMapping("/persona/{id_persona}")
    public Persona modificarPersona(@RequestBody Persona persona, @PathVariable int id_persona){

        persona.setId_persona(id_persona);
        return  personaDao.modificarPersona(persona);

    }



}
