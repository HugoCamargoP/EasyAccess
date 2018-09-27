package com.cutieOS.entity;

import javax.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_contact;

    private String name_contact;
    private String value_contact;

    public Contact() {
    }

    public Contact(String name_contact, String value_contact) {
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
}
