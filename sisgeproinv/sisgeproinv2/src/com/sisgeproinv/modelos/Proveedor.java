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
public class Proveedor {
    private int IDPROVEEDOR;
    private String PROVEEDOR;
    private String CONTACTO;
    private String TELF;
    private String EMAIL;

    public Proveedor(int IDPROVEEDOR, String PROVEEDOR, String CONTACTO, String TELF, String EMAIL) {
        this.IDPROVEEDOR = IDPROVEEDOR;
        this.PROVEEDOR = PROVEEDOR;
        this.CONTACTO = CONTACTO;
        this.TELF = TELF;
        this.EMAIL = EMAIL;
    }

    public int getIDPROVEEDOR() {
        return IDPROVEEDOR;
    }

    public void setIDPROVEEDOR(int IDPROVEEDOR) {
        this.IDPROVEEDOR = IDPROVEEDOR;
    }

    public String getPROVEEDOR() {
        return PROVEEDOR;
    }

    public void setPROVEEDOR(String PROVEEDOR) {
        this.PROVEEDOR = PROVEEDOR;
    }

    public String getCONTACTO() {
        return CONTACTO;
    }

    public void setCONTACTO(String CONTACTO) {
        this.CONTACTO = CONTACTO;
    }

    public String getTELF() {
        return TELF;
    }

    public void setTELF(String TELF) {
        this.TELF = TELF;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
    
    
}
