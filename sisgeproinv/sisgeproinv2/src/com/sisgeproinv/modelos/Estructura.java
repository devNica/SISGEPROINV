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
public class Estructura {
    private int IDESTRUCTURA;
    private String DESCRIPCION;
    private int DEPENDEID;
    private boolean ESTADO;

    public Estructura(int IDESTRUCTURA, String DESCRIPCION, int DEPENDEID, boolean ESTADO) {
        this.IDESTRUCTURA = IDESTRUCTURA;
        this.DESCRIPCION = DESCRIPCION;
        this.DEPENDEID = DEPENDEID;
        this.ESTADO = ESTADO;
    }

    public int getIDESTRUCTURA() {
        return IDESTRUCTURA;
    }

    public void setIDESTRUCTURA(int IDESTRUCTURA) {
        this.IDESTRUCTURA = IDESTRUCTURA;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public int getDEPENDEID() {
        return DEPENDEID;
    }

    public void setDEPENDEID(int DEPENDEID) {
        this.DEPENDEID = DEPENDEID;
    }

    public boolean isESTADO() {
        return ESTADO;
    }

    public void setESTADO(boolean ESTADO) {
        this.ESTADO = ESTADO;
    }
    
    
}
