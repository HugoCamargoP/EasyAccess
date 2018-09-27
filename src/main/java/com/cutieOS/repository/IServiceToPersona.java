package com.cutieOS.repository;

import com.cutieOS.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServiceToPersona extends JpaRepository<Servicio, Integer> {
}
