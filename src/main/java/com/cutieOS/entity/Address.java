package com.cutieOS.entity;

import javax.persistence.*;

@Entity
@Table(name = "adress")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_address;

    private String address;

    public Address(){}

    public Address(String address){
        this.setAddress(address);
    }


    public int getId_address() {
        return id_address;
    }

    public void setId_address(int id_address) {
        this.id_address = id_address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
