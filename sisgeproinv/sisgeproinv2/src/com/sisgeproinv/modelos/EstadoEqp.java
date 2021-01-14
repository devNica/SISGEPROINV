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
public class EstadoEqp {
    private int IDESTADOEQP;
    private String INFORMACION;
    private String RERGUARDO;
    private boolean ESTADO;

    public EstadoEqp(int IDESTADOEQP, String INFORMACION, String RERGUARDO, boolean ESTADO) {
        this.IDESTADOEQP = IDESTADOEQP;
        this.INFORMACION = INFORMACION;
        this.RERGUARDO = RERGUARDO;
        this.ESTADO = ESTADO;
    }

    public int getIDESTADOEQP() {
        return IDESTADOEQP;
    }

    public void setIDESTADOEQP(int IDESTADOEQP) {
        this.IDESTADOEQP = IDESTADOEQP;
    }

    public String getINFORMACION() {
        return INFORMACION;
    }

    public void setINFORMACION(String INFORMACION) {
        this.INFORMACION = INFORMACION;
    }

    public String getRERGUARDO() {
        return RERGUARDO;
    }

    public void setRERGUARDO(String RERGUARDO) {
        this.RERGUARDO = RERGUARDO;
    }

    public boolean isESTADO() {
        return ESTADO;
    }

    public void setESTADO(boolean ESTADO) {
        this.ESTADO = ESTADO;
    }
    
    
    
}
