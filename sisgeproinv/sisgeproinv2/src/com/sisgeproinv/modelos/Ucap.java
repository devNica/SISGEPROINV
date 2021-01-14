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
public class Ucap {
    private int IDUCAP;
    private String UNIDAD;
    private int FK_DISPOSITIVO;

    public Ucap(int IDUCAP, String UNIDAD, int FK_DISPOSITIVO) {
        this.IDUCAP = IDUCAP;
        this.UNIDAD = UNIDAD;
        this.FK_DISPOSITIVO = FK_DISPOSITIVO;
    }

    public int getIDUCAP() {
        return IDUCAP;
    }

    public void setIDUCAP(int IDUCAP) {
        this.IDUCAP = IDUCAP;
    }

    public String getUNIDAD() {
        return UNIDAD;
    }

    public void setUNIDAD(String UNIDAD) {
        this.UNIDAD = UNIDAD;
    }

    public int getFK_DISPOSITIVO() {
        return FK_DISPOSITIVO;
    }

    public void setFK_DISPOSITIVO(int FK_DISPOSITIVO) {
        this.FK_DISPOSITIVO = FK_DISPOSITIVO;
    }
    
    
}
