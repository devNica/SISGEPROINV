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
public class Marca {
    private int IDMARCA;
    private String MARCA;

    public Marca(int IDMARCA, String MARCA) {
        this.IDMARCA = IDMARCA;
        this.MARCA = MARCA;
    }

    public int getIDMARCA() {
        return IDMARCA;
    }

    public void setIDMARCA(int IDMARCA) {
        this.IDMARCA = IDMARCA;
    }

    public String getMARCA() {
        return MARCA;
    }

    public void setMARCA(String MARCA) {
        this.MARCA = MARCA;
    }
    
    
}
