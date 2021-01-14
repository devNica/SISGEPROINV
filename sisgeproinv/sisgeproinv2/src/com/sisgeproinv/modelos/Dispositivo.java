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
public class Dispositivo {
    private int IDDSP;
    private int FK_FAMDSP;
    private double UCAP;
    private int FK_UCAP;
    private double UFREQ;
    private int FK_UFREQ;

    public Dispositivo(int IDDSP, int FK_FAMDSP, double UCAP, int FK_UCAP, double UFREQ, int FK_UFREQ) {
        this.IDDSP = IDDSP;
        this.FK_FAMDSP = FK_FAMDSP;
        this.UCAP = UCAP;
        this.FK_UCAP = FK_UCAP;
        this.UFREQ = UFREQ;
        this.FK_UFREQ = FK_UFREQ;
    }

    public int getIDDSP() {
        return IDDSP;
    }

    public void setIDDSP(int IDDSP) {
        this.IDDSP = IDDSP;
    }

    public int getFK_FAMDSP() {
        return FK_FAMDSP;
    }

    public void setFK_FAMDSP(int FK_FAMDSP) {
        this.FK_FAMDSP = FK_FAMDSP;
    }

    public double getUCAP() {
        return UCAP;
    }

    public void setUCAP(double UCAP) {
        this.UCAP = UCAP;
    }

    public int getFK_UCAP() {
        return FK_UCAP;
    }

    public void setFK_UCAP(int FK_UCAP) {
        this.FK_UCAP = FK_UCAP;
    }

    public double getUFREQ() {
        return UFREQ;
    }

    public void setUFREQ(double UFREQ) {
        this.UFREQ = UFREQ;
    }

    public int getFK_UFREQ() {
        return FK_UFREQ;
    }

    public void setFK_UFREQ(int FK_UFREQ) {
        this.FK_UFREQ = FK_UFREQ;
    }
    
    
}
