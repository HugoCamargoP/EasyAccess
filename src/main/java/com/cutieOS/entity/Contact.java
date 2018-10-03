package com.cutieOS.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONTACTO_ID",unique = true,nullable = false)
    private int id_contact;

    private String name_contact;
    private String value_contact;

    public Contact() {
    }


    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "PERSONA_ID",nullable = false,updatable = false)
    private Persona persona;

   // contructor sin agregar el autowired de persona


    public Contact(int id_contact,String name_contact, String value_contact) {
        this.id_contact=id_contact;
        this.name_contact = name_contact;
        this.value_contact = value_contact;
    }

    public int getId_contact() {
        return id_contact;
    }

    public void setId_contact(int id_contact) {
        this.id_contact = id_contact;
    }

    public String getName_contact() {
        return name_contact;
    }

    public void setName_contact(String name_contact) {
        this.name_contact = name_contact;
    }

    public String getValue_contact() {
        return value_contact;
    }

    public void setValue_contact(String value_contact) {
        this.value_contact = value_contact;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id_contact=" + id_contact +
                ", name_contact='" + name_contact + '\'' +
                ", value_contact='" + value_contact + '\'' +
                '}';
    }


    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
