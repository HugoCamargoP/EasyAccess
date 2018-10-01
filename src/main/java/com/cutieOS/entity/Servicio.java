package com.cutieOS.entity;

import javax.persistence.*;


@Entity
@Table(name="services")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_service;

    private String nombre_service;



    public Servicio(){}



    public Servicio(String nombre_service) {
        this.nombre_service = nombre_service;
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
}
