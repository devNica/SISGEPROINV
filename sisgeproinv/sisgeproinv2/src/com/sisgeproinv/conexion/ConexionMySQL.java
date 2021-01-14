/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sisgeproinv.conexion;


import com.sisgeproinv.credenciales.Credenciales;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Gonzalez
 */
public class ConexionMySQL {
    
    public static Connection conn = null;
    private final String PASSWORD = Credenciales.PASSWORD;
    private final String USUARIO = Credenciales.USERNAME;
    private final String BASEDATOS = Credenciales.DATABASE;
    private final String URL = Credenciales.URL;
    private boolean ERROR;
    
    public  void abrirConexionMySQL()
    {        
        try
        {         
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(URL,USUARIO,PASSWORD);
            if (conn!=null)
            {
                System.out.println("Conexion a la base de datos:\t"+BASEDATOS+"\nsatisfactoria");
            }
        }
        catch(SQLException | ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,
                        "No se ha logrado realizar la conexion al servidor de bases de datos",
                        "Error de conexion...",
            JOptionPane.ERROR_MESSAGE);
            setERROR(true);
           
        }
        setERROR(false);
    }
    
    //CERRAR LA CONEXION A LA BASE DE DATOS
    public void cerrarConexionMySQL()
    {
        try 
        {
            conn.close();
            System.out.println("La conexion a la base de datos se ha cerrado");
        } 
        catch (SQLException e) 
        {
            System.out.println(e);
        }
    }

    public boolean isERROR() {
        return ERROR;
    }

    public void setERROR(boolean ERROR) {
        this.ERROR = ERROR;
    }
}
