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
public class Usuario {
    private int IDUSUARIO;
    private String USERNAME;
    private String PASSWORD;
    private boolean ESTADO;
    private String FK_EMPLEADO;

    public Usuario(int IDUSUARIO, String USERNAME, String PASSWORD, boolean ESTADO, String FK_EMPLEADO) {
        this.IDUSUARIO = IDUSUARIO;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
        this.ESTADO = ESTADO;
        this.FK_EMPLEADO = FK_EMPLEADO;
    }

    public int getIDUSUARIO() {
        return IDUSUARIO;
    }

    public void setIDUSUARIO(int IDUSUARIO) {
        this.IDUSUARIO = IDUSUARIO;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public boolean isESTADO() {
        return ESTADO;
    }

    public void setESTADO(boolean ESTADO) {
        this.ESTADO = ESTADO;
    }

    public String getFK_EMPLEADO() {
        return FK_EMPLEADO;
    }

    public void setFK_EMPLEADO(String FK_EMPLEADO) {
        this.FK_EMPLEADO = FK_EMPLEADO;
    }
    
    
}
