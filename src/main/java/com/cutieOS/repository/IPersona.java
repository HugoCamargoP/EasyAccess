package com.cutieOS.repository;

import com.cutieOS.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPersona extends JpaRepository<Persona, Integer>
{

}

