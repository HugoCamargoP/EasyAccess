package com.cutieOS.repository;

import com.cutieOS.entity.Persona;
import com.cutieOS.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IServiceToPersona extends JpaRepository<Servicio, Integer> {

    //List<Servicio> findByPersona_Id_persona(Integer id_persona);
}
