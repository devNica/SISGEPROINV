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
public class FamDsp {
    private int IDFAMDSP;
    private int FK_DISPOSITIVO;
    private String FAMILIA;
    private String ARQUITECTURA;
    private int FK_MARCA;

    public FamDsp(int IDFAMDSP, int FK_DISPOSITIVO, String FAMILIA, String ARQUITECTURA, int FK_MARCA) {
        this.IDFAMDSP = IDFAMDSP;
        this.FK_DISPOSITIVO = FK_DISPOSITIVO;
        this.FAMILIA = FAMILIA;
        this.ARQUITECTURA = ARQUITECTURA;
        this.FK_MARCA = FK_MARCA;
    }

    public int getIDFAMDSP() {
        return IDFAMDSP;
    }

    public void setIDFAMDSP(int IDFAMDSP) {
        this.IDFAMDSP = IDFAMDSP;
    }

    public int getFK_DISPOSITIVO() {
        return FK_DISPOSITIVO;
    }

    public void setFK_DISPOSITIVO(int FK_DISPOSITIVO) {
        this.FK_DISPOSITIVO = FK_DISPOSITIVO;
    }

    public String getFAMILIA() {
        return FAMILIA;
    }

    public void setFAMILIA(String FAMILIA) {
        this.FAMILIA = FAMILIA;
    }

    public String getARQUITECTURA() {
        return ARQUITECTURA;
    }

    public void setARQUITECTURA(String ARQUITECTURA) {
        this.ARQUITECTURA = ARQUITECTURA;
    }

    public int getFK_MARCA() {
        return FK_MARCA;
    }

    public void setFK_MARCA(int FK_MARCA) {
        this.FK_MARCA = FK_MARCA;
    }
    
    
}
