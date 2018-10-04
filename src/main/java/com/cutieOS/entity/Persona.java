package com.cutieOS.entity;


import javax.persistence.*;

@Entity
@Table(name="persona")
public class Persona {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_persona;

    private String name_persona;

/*
   @ManyToMany
    private Servicio service;


   @ManyToOne
   private Contact contact;


*/
        public Persona() {}


    /*@ManyToMany
    private Servicio service;*/



    public Persona(String name_persona) {
        this.name_persona = name_persona;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getName_persona() {
        return name_persona;
    }

    public void setName_persona(String name_persona) {
        this.name_persona = name_persona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id_persona=" + id_persona +
                ", name_persona='" + name_persona + '\'' +
                '}';
    }


    /*
    public Servicio getService() {
        return service;
    }

    public void setService(Servicio service) {
        this.service = service;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;


    }
    */
}



