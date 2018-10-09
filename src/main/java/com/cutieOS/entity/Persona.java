package com.cutieOS.entity;




import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="persona") //, catalog = "conPersona")
public class Persona {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PERSONA_ID", unique = true,nullable = false)
    private int id_persona;

    private String name_persona;



    /*
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "stock_Services", catalog = "conPersona",joinColumns =
            {@JoinColumn(name = "PERSONA_ID",nullable = false,updatable = false)},inverseJoinColumns = {@JoinColumn(name = "SERVICIO_ID",nullable = false,updatable = false)})
    private Collection<Servicio> service;
     */


    /*@ManyToMany
    private Servicio service;*/



        public Persona() {}


        //nuevo constructor
    public Persona(String name_persona, int id_persona) {
        this.name_persona = name_persona;
        this.id_persona = id_persona;
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
    public Collection<Servicio> getService() {
        return service;
    }

    public void setService(Collection<Servicio> service) {
        this.service = service;
    }
    */
}



