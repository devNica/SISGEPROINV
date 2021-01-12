/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sisgeproinv.controladores;

import com.sisgeproinv.accesos.Accesos;
import com.sisgeproinv.contenedores.Contenedor;
import com.sisgeproinv.modulos.ModuloRegistroEquipos;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Alejandro Gonzalez
 */
public class ControladorAcceso {
    
    private final Accesos AC;
    private final Contenedor FC;
    EventosMouse EventoMouse = new EventosMouse();
    ModuloRegistroEquipos MRE = new ModuloRegistroEquipos();

    public ControladorAcceso(Contenedor FC, Accesos AC) {
        this.FC = FC;
        this.AC = AC;
        
        AC.InventarioEquiposAcceso.addMouseListener(EventoMouse);
        AC.RegistroEquiposAcceso.addMouseListener(EventoMouse);
        AC.Catalogos.addMouseListener(EventoMouse);
        
        MRE.BtnSalir.addMouseListener(EventoMouse);
    }
    
    
    public void mostrarModuloRegistroEquipos(){
        FC.PanelContenedorModulo.add(MRE);
        FC.PanelContenedorModulo.remove(AC);
        MRE.setVisible(true);
        FC.revalidate();
        FC.repaint();
    }
    
    private void mostrarAccesoModulos(){
        FC.PanelContenedorModulo.add(AC);
        FC.PanelContenedorModulo.remove(MRE);
        AC.setVisible(true);
        FC.revalidate();
        FC.repaint();
    }
    
    
    
    private class EventosMouse extends MouseAdapter{
        
        @Override
        public void mouseReleased(MouseEvent evt){
            if(evt.getSource() == AC.RegistroEquiposAcceso){
                System.out.println("hago clic");
                mostrarModuloRegistroEquipos();
            }
            if(evt.getSource() == MRE.BtnSalir){
                mostrarAccesoModulos();
            }
            
        }
        
        @Override
        public void mouseEntered(MouseEvent evt){
          MRE.BtnSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
          
        }
    
    }
    
}
