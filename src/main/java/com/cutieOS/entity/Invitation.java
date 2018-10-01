package com.cutieOS.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "invitation")
public class Invitation{


 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_invitation;
    private String num_token;
    private int contador;
    private Date date_release;
    private boolean status;
    private String name_invitation;
    private String texto;

    public Invitation(){}

    public Invitation(String num_token,Integer contador,Date date_release,Boolean status,String name_invitation,String texto){
        this.setNum_token(num_token);
        this.setContador(contador);
        this.setDate_release(date_release);
        this.setStatus(status);
        this.setName_invitation(name_invitation);
        this.setTexto(texto);
    }


    public int getId_invitation() {
        return id_invitation;
    }

    public void setId_invitation(int id_invitation) {
        this.id_invitation = id_invitation;
    }

    public String getNum_token() {
        return num_token;
    }

    public void setNum_token(String num_token) {
        this.num_token = num_token;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Date getDate_release() {
        return date_release;
    }

    public void setDate_release(Date date_release) {
        this.date_release = date_release;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName_invitation() {
        return name_invitation;
    }

    public void setName_invitation(String name_invitation) {
        this.name_invitation = name_invitation;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}




