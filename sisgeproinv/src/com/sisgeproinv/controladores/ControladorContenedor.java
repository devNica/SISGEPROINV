/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sisgeproinv.controladores;

import com.sisgeproinv.accesos.Accesos;
import com.sisgeproinv.accesos.Reportes;
import com.sisgeproinv.contenedores.Contenedor;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Alejandro Gonzalez
 */
public class ControladorContenedor {
    
    private final Contenedor FC;         //Formulario Contenedor
    private final Accesos AC;           //Panel Accesos a Modulos
    private final Reportes RP;
    
    EventosMouse eventoMouse = new EventosMouse();
    
    public ControladorContenedor(Contenedor FC, Accesos AC, Reportes RP) {
        this.FC = FC;
        this.AC = AC;
        this.RP = RP;
        
        FC.BotonModulos.addMouseListener(eventoMouse);
        FC.BotonReportes.addMouseListener(eventoMouse);
        
    }
    
    private void mostrarModulos(){
        FC.PanelContenedorModulo.add(AC);
        AC.setVisible(true);
        RP.setVisible(false);
        FC.revalidate();
        FC.repaint();
    }
    
    private void mostrarReportes(){
        FC.PanelContenedorModulo.add(RP);
        AC.setVisible(false);
        RP.setVisible(true);
        FC.revalidate();
        FC.repaint();
    }
    
    
    private class EventosMouse extends MouseAdapter{
        
        @Override
        public void mouseReleased(MouseEvent evt){
            if(evt.getSource() == FC.BotonModulos){
                mostrarModulos();
            }
            if(evt.getSource() == FC.BotonReportes){
                mostrarReportes();
            }
        }
        
        @Override
        public void mouseEntered(MouseEvent evt){
            FC.BotonModulos.setCursor(new Cursor(Cursor.HAND_CURSOR));
            FC.BotonReportes.setCursor(new Cursor(Cursor.HAND_CURSOR));
            AC.RegistroEquiposAcceso.setCursor(new Cursor(Cursor.HAND_CURSOR));
            AC.InventarioEquiposAcceso.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    
    }
    
}
