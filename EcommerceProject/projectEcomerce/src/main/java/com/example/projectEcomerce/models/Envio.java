package com.example.projectEcomerce.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Envio {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private int id;
    private int numFrete;
    private String tipoFrete;
    private int precoFrete;
    private int numRegistro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumFrete() {
        return numFrete;
    }

    public void setNumFrete(int numFrete) {
        this.numFrete = numFrete;
    }

    public String getTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(String tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public int getPrecoFrete() {
        return precoFrete;
    }

    public void setPrecoFrete(int precoFrete) {
        this.precoFrete = precoFrete;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }


}
