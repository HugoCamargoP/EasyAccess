package com.cutieOS.entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Table(name="services", catalog = "conPersona")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SERVICIO_ID",unique = true,nullable = false)
    private int id_service;

    private String nombre_service;


    private Collection<Persona> persona;

    public Servicio(){}




    public Servicio(String nombre_service, int id_servicio) {
        this.nombre_service = nombre_service;
        this.id_service=id_servicio;
    }

    public int getId_service() {
        return id_service;
    }

    public void setId_service(int id_service) {
        this.id_service = id_service;
    }

    public String getNombre_service() {
        return nombre_service;
    }

    public void setNombre_service(String nombre_service) {
        this.nombre_service = nombre_service;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "id_service=" + id_service +
                ", nombre_service='" + nombre_service + '\'' +
                '}';
    }



    // el de security no uso  el fectch = fetch.lazy
    // solo el mappenBy
    @ManyToMany(mappedBy = "servicess")
    public Collection<Persona> getPersona() {
        return persona;
    }

    public void setPersona(Collection<Persona> persona) {
        this.persona = persona;
    }
}
