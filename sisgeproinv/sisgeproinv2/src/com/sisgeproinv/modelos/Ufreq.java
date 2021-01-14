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
public class Ufreq {
   private int IDUNDFREQ;
   private String UNIDAD;
   private int FK_DISPOSITIVO;

    public Ufreq(int IDUNDFREQ, String UNIDAD, int FK_DISPOSITIVO) {
        this.IDUNDFREQ = IDUNDFREQ;
        this.UNIDAD = UNIDAD;
        this.FK_DISPOSITIVO = FK_DISPOSITIVO;
    }

    public int getIDUNDFREQ() {
        return IDUNDFREQ;
    }

    public void setIDUNDFREQ(int IDUNDFREQ) {
        this.IDUNDFREQ = IDUNDFREQ;
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
