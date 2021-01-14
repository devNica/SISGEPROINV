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
public class CategoriaEqp {
    private int IDCATEGORIAEQP;
    private String TIPOEQUIPO;
    private String CATEGORIA;

    public CategoriaEqp(int IDCATEGORIAEQP, String TIPOEQUIPO, String CATEGORIA) {
        this.IDCATEGORIAEQP = IDCATEGORIAEQP;
        this.TIPOEQUIPO = TIPOEQUIPO;
        this.CATEGORIA = CATEGORIA;
    }

    public int getIDCATEGORIAEQP() {
        return IDCATEGORIAEQP;
    }

    public void setIDCATEGORIAEQP(int IDCATEGORIAEQP) {
        this.IDCATEGORIAEQP = IDCATEGORIAEQP;
    }

    public String getTIPOEQUIPO() {
        return TIPOEQUIPO;
    }

    public void setTIPOEQUIPO(String TIPOEQUIPO) {
        this.TIPOEQUIPO = TIPOEQUIPO;
    }

    public String getCATEGORIA() {
        return CATEGORIA;
    }

    public void setCATEGORIA(String CATEGORIA) {
        this.CATEGORIA = CATEGORIA;
    }
    
    
}
