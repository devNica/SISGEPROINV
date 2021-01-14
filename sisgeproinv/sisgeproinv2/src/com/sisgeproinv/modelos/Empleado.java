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
public class Empleado {
    private int IDEMPLEADO;
    private String COD_EMPLEADO;
    private String NUM_EMPLEADO;
    private String NOMBRE;
    private String DNI;
    private boolean ESTADO;

    public Empleado(int IDEMPLEADO, String COD_EMPLEADO, String NUM_EMPLEADO, String NOMBRE, String DNI, boolean ESTADO) {
        this.IDEMPLEADO = IDEMPLEADO;
        this.COD_EMPLEADO = COD_EMPLEADO;
        this.NUM_EMPLEADO = NUM_EMPLEADO;
        this.NOMBRE = NOMBRE;
        this.DNI = DNI;
        this.ESTADO = ESTADO;
    }

    public int getIDEMPLEADO() {
        return IDEMPLEADO;
    }

    public void setIDEMPLEADO(int IDEMPLEADO) {
        this.IDEMPLEADO = IDEMPLEADO;
    }

    public String getCOD_EMPLEADO() {
        return COD_EMPLEADO;
    }

    public void setCOD_EMPLEADO(String COD_EMPLEADO) {
        this.COD_EMPLEADO = COD_EMPLEADO;
    }

    public String getNUM_EMPLEADO() {
        return NUM_EMPLEADO;
    }

    public void setNUM_EMPLEADO(String NUM_EMPLEADO) {
        this.NUM_EMPLEADO = NUM_EMPLEADO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public boolean isESTADO() {
        return ESTADO;
    }

    public void setESTADO(boolean ESTADO) {
        this.ESTADO = ESTADO;
    }
    
    
    
}
