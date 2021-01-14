/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sisgeproinv.modelos;

import java.sql.Date;

/**
 *
 * @author Alejandro Gonzalez
 */
public class GarantiaEqp {
    private int IDGARANTIAEQP;
    private int FK_EQUIPO;
    private int FK_PROVEEDOR;
    private Date INICIOGARANTIA;
    private Date FINGARANTIA;
    private Object DOCUMENTO;
    private boolean ESTADOGARANTIA;

    public GarantiaEqp(int IDGARANTIAEQP, int FK_EQUIPO, int FK_PROVEEDOR, Date INICIOGARANTIA, Date FINGARANTIA, Object DOCUMENTO, boolean ESTADOGARANTIA) {
        this.IDGARANTIAEQP = IDGARANTIAEQP;
        this.FK_EQUIPO = FK_EQUIPO;
        this.FK_PROVEEDOR = FK_PROVEEDOR;
        this.INICIOGARANTIA = INICIOGARANTIA;
        this.FINGARANTIA = FINGARANTIA;
        this.DOCUMENTO = DOCUMENTO;
        this.ESTADOGARANTIA = ESTADOGARANTIA;
    }

    public int getIDGARANTIAEQP() {
        return IDGARANTIAEQP;
    }

    public void setIDGARANTIAEQP(int IDGARANTIAEQP) {
        this.IDGARANTIAEQP = IDGARANTIAEQP;
    }

    public int getFK_EQUIPO() {
        return FK_EQUIPO;
    }

    public void setFK_EQUIPO(int FK_EQUIPO) {
        this.FK_EQUIPO = FK_EQUIPO;
    }

    public int getFK_PROVEEDOR() {
        return FK_PROVEEDOR;
    }

    public void setFK_PROVEEDOR(int FK_PROVEEDOR) {
        this.FK_PROVEEDOR = FK_PROVEEDOR;
    }

    public Date getINICIOGARANTIA() {
        return INICIOGARANTIA;
    }

    public void setINICIOGARANTIA(Date INICIOGARANTIA) {
        this.INICIOGARANTIA = INICIOGARANTIA;
    }

    public Date getFINGARANTIA() {
        return FINGARANTIA;
    }

    public void setFINGARANTIA(Date FINGARANTIA) {
        this.FINGARANTIA = FINGARANTIA;
    }

    public Object getDOCUMENTO() {
        return DOCUMENTO;
    }

    public void setDOCUMENTO(Object DOCUMENTO) {
        this.DOCUMENTO = DOCUMENTO;
    }

    public boolean isESTADOGARANTIA() {
        return ESTADOGARANTIA;
    }

    public void setESTADOGARANTIA(boolean ESTADOGARANTIA) {
        this.ESTADOGARANTIA = ESTADOGARANTIA;
    }
    
    
    
}
