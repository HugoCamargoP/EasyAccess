package com.cutieOS.repository;

import com.cutieOS.entity.Persona;
import com.cutieOS.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPersona extends JpaRepository<Persona, Integer>
{

    List<Persona> findByServiceId_service(Integer id_service);



}

