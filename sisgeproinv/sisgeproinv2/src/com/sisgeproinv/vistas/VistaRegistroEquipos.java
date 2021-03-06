/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sisgeproinv.vistas;

import com.sisgeproinv.menus.MenuTableroModulos;
import java.awt.Cursor;

/**
 *
 * @author Alejandro Gonzalez
 */
public class VistaRegistroEquipos extends javax.swing.JPanel {
    
    MenuTableroModulos tablero;
    Contenedor contenedor;
    
    public VistaRegistroEquipos(Contenedor contenedor, MenuTableroModulos tablero) {
        initComponents();
        this.tablero = tablero;
        this.contenedor = contenedor;
        
    }
    
    private void salirMRE(){
        contenedor.PanelContenedor.remove(this);
        contenedor.PanelMenu.setVisible(true);
        tablero.setVisible(true);
        contenedor.revalidate();
        contenedor.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        DatosGenerales = new javax.swing.JPanel();
        DatosCPU = new javax.swing.JPanel();
        DatosDISK = new javax.swing.JPanel();
        DatosRAM = new javax.swing.JPanel();
        Resumen = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(887, 48));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 64, 232));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MODULO DE REGISTRO DE EQUIPOS Y ACCESORIOS INFORMATICOS");

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/salidaA48.png"))); // NOI18N
        BtnSalir.setToolTipText("Salir");
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnSalirMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnSalirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSalir)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BtnSalir)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setOpaque(true);

        javax.swing.GroupLayout DatosGeneralesLayout = new javax.swing.GroupLayout(DatosGenerales);
        DatosGenerales.setLayout(DatosGeneralesLayout);
        DatosGeneralesLayout.setHorizontalGroup(
            DatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 914, Short.MAX_VALUE)
        );
        DatosGeneralesLayout.setVerticalGroup(
            DatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Datos Generales del Equipo", DatosGenerales);

        javax.swing.GroupLayout DatosCPULayout = new javax.swing.GroupLayout(DatosCPU);
        DatosCPU.setLayout(DatosCPULayout);
        DatosCPULayout.setHorizontalGroup(
            DatosCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 914, Short.MAX_VALUE)
        );
        DatosCPULayout.setVerticalGroup(
            DatosCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Procesador", DatosCPU);

        javax.swing.GroupLayout DatosDISKLayout = new javax.swing.GroupLayout(DatosDISK);
        DatosDISK.setLayout(DatosDISKLayout);
        DatosDISKLayout.setHorizontalGroup(
            DatosDISKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 914, Short.MAX_VALUE)
        );
        DatosDISKLayout.setVerticalGroup(
            DatosDISKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Disco Duro", DatosDISK);

        javax.swing.GroupLayout DatosRAMLayout = new javax.swing.GroupLayout(DatosRAM);
        DatosRAM.setLayout(DatosRAMLayout);
        DatosRAMLayout.setHorizontalGroup(
            DatosRAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 914, Short.MAX_VALUE)
        );
        DatosRAMLayout.setVerticalGroup(
            DatosRAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Memoria", DatosRAM);

        javax.swing.GroupLayout ResumenLayout = new javax.swing.GroupLayout(Resumen);
        Resumen.setLayout(ResumenLayout);
        ResumenLayout.setHorizontalGroup(
            ResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 914, Short.MAX_VALUE)
        );
        ResumenLayout.setVerticalGroup(
            ResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Resumen", Resumen);

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMousePressed
        contenedor.establercerRuta(" ", " ");
        salirMRE();
    }//GEN-LAST:event_BtnSalirMousePressed

    private void BtnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseEntered
        BtnSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_BtnSalirMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel BtnSalir;
    public javax.swing.JPanel DatosCPU;
    public javax.swing.JPanel DatosDISK;
    public javax.swing.JPanel DatosGenerales;
    public javax.swing.JPanel DatosRAM;
    public javax.swing.JPanel Resumen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
