package com.example.projectEcomerce.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private int id;
    private int numProduto;
    private String nomeProduto;
    private String detalhesPedido;
    private int qtdProduto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumProduto() {
        return numProduto;
    }

    public void setNumProduto(int numProduto) {
        this.numProduto = numProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDetalhesPedido() {
        return detalhesPedido;
    }

    public void setDetalhesPedido(String detalhesPedido) {
        this.detalhesPedido = detalhesPedido;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "numProduto=" + numProduto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", detalhesPedido='" + detalhesPedido + '\'' +
                ", qtdProduto=" + qtdProduto +
                '}';
    }
}
