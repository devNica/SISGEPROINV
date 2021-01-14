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
public class EspecificacionEqp {
    private int CANTIDAD;
    private int FK_EQUIPO;
    private int FK_DSP;

    public EspecificacionEqp(int CANTIDAD, int FK_EQUIPO, int FK_DSP) {
        this.CANTIDAD = CANTIDAD;
        this.FK_EQUIPO = FK_EQUIPO;
        this.FK_DSP = FK_DSP;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public int getFK_EQUIPO() {
        return FK_EQUIPO;
    }

    public void setFK_EQUIPO(int FK_EQUIPO) {
        this.FK_EQUIPO = FK_EQUIPO;
    }

    public int getFK_DSP() {
        return FK_DSP;
    }

    public void setFK_DSP(int FK_DSP) {
        this.FK_DSP = FK_DSP;
    }
    
    
}
