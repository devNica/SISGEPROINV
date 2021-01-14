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
public class Consecutivo {
    private int IDCONSECUTIVO;
    private String CONSECUTIVO;
    private String ESTADO;
    private int FK_CATEGORIAEQP;
    private int FK_USUARIO;

    public Consecutivo(int IDCONSECUTIVO, String CONSECUTIVO, String ESTADO, int FK_CATEGORIAEQP, int FK_USUARIO) {
        this.IDCONSECUTIVO = IDCONSECUTIVO;
        this.CONSECUTIVO = CONSECUTIVO;
        this.ESTADO = ESTADO;
        this.FK_CATEGORIAEQP = FK_CATEGORIAEQP;
        this.FK_USUARIO = FK_USUARIO;
    }

    public int getIDCONSECUTIVO() {
        return IDCONSECUTIVO;
    }

    public void setIDCONSECUTIVO(int IDCONSECUTIVO) {
        this.IDCONSECUTIVO = IDCONSECUTIVO;
    }

    public String getCONSECUTIVO() {
        return CONSECUTIVO;
    }

    public void setCONSECUTIVO(String CONSECUTIVO) {
        this.CONSECUTIVO = CONSECUTIVO;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public int getFK_CATEGORIAEQP() {
        return FK_CATEGORIAEQP;
    }

    public void setFK_CATEGORIAEQP(int FK_CATEGORIAEQP) {
        this.FK_CATEGORIAEQP = FK_CATEGORIAEQP;
    }

    public int getFK_USUARIO() {
        return FK_USUARIO;
    }

    public void setFK_USUARIO(int FK_USUARIO) {
        this.FK_USUARIO = FK_USUARIO;
    }
    
    
}
