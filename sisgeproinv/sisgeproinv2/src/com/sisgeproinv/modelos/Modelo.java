/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sisgeproinv.modelos;

/**
 *
 * @author Alejandro Gonzalez
 */
public class Modelo {
    private int IDMODELO;
    private String MODELO;
    private int FK_MARCA;
    private int FK_CATEGORIA;

    public Modelo(int IDMODELO, String MODELO, int FK_MARCA, int FK_CATEGORIA) {
        this.IDMODELO = IDMODELO;
        this.MODELO = MODELO;
        this.FK_MARCA = FK_MARCA;
        this.FK_CATEGORIA = FK_CATEGORIA;
    }

    public int getIDMODELO() {
        return IDMODELO;
    }

    public void setIDMODELO(int IDMODELO) {
        this.IDMODELO = IDMODELO;
    }

    public String getMODELO() {
        return MODELO;
    }

    public void setMODELO(String MODELO) {
        this.MODELO = MODELO;
    }

    public int getFK_MARCA() {
        return FK_MARCA;
    }

    public void setFK_MARCA(int FK_MARCA) {
        this.FK_MARCA = FK_MARCA;
    }

    public int getFK_CATEGORIA() {
        return FK_CATEGORIA;
    }

    public void setFK_CATEGORIA(int FK_CATEGORIA) {
        this.FK_CATEGORIA = FK_CATEGORIA;
    }
    
    
    
}
