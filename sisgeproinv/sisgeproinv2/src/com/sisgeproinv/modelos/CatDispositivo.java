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
public class CatDispositivo {
    private int IDCATDISPOSITIVO;
    private String DISPOSITIVO;

    public CatDispositivo(int IDCATDISPOSITIVO, String DISPOSITIVO) {
        this.IDCATDISPOSITIVO = IDCATDISPOSITIVO;
        this.DISPOSITIVO = DISPOSITIVO;
    }

    public int getIDCATDISPOSITIVO() {
        return IDCATDISPOSITIVO;
    }

    public void setIDCATDISPOSITIVO(int IDCATDISPOSITIVO) {
        this.IDCATDISPOSITIVO = IDCATDISPOSITIVO;
    }

    public String getDISPOSITIVO() {
        return DISPOSITIVO;
    }

    public void setDISPOSITIVO(String DISPOSITIVO) {
        this.DISPOSITIVO = DISPOSITIVO;
    }
    
    
}
