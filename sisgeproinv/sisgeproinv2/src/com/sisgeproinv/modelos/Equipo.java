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
public class Equipo {
    private int IDEQUIPO;
    private int FK_CATEGORIA;
    private int FK_MODELO;
    private int FK_EMPLEADO;
    private String NOTA;
    private Date INGRESO;
    private int FK_CONSECUTIVO;
    private int FK_UBQEQP;
    private String CODINVENTARIO;
    private String SERIE;
    private int FK_ESTADOEQP;

    public Equipo() {
    }

    public Equipo(int IDEQUIPO, 
            int FK_CATEGORIA, 
            int FK_MODELO, 
            int FK_EMPLEADO, 
            String NOTA, 
            Date INGRESO, 
            int FK_CONSECUTIVO, 
            int FK_UBQEQP, 
            String CODINVENTARIO, 
            String SERIE, 
            int FK_ESTADOEQP) {
        this.IDEQUIPO = IDEQUIPO;
        this.FK_CATEGORIA = FK_CATEGORIA;
        this.FK_MODELO = FK_MODELO;
        this.FK_EMPLEADO = FK_EMPLEADO;
        this.NOTA = NOTA;
        this.INGRESO = INGRESO;
        this.FK_CONSECUTIVO = FK_CONSECUTIVO;
        this.FK_UBQEQP = FK_UBQEQP;
        this.CODINVENTARIO = CODINVENTARIO;
        this.SERIE = SERIE;
        this.FK_ESTADOEQP = FK_ESTADOEQP;
    }
    
    
    
}
