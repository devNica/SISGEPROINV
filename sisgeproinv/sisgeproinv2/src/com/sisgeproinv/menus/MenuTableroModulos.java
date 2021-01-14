/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sisgeproinv.menus;

import com.sisgeproinv.vistas.Contenedor;
import com.sisgeproinv.vistas.VistaRegistroEquipos;
import java.awt.Cursor;

public class MenuTableroModulos extends javax.swing.JPanel {

    private VistaRegistroEquipos VRE;
    private final Contenedor contenedor;
    
    public MenuTableroModulos(Contenedor contenedor) {
        initComponents();
        this.contenedor =contenedor;
    }
    
    private void ingresarMRE(){
        this.setVisible(false);
        contenedor.PanelMenu.setVisible(false);
        contenedor.PanelContenedor.add(VRE);
        VRE.setVisible(true);
        contenedor.revalidate();
        contenedor.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ModuloRegistroEquipo = new javax.swing.JPanel();
        IconoRegistroEqp = new javax.swing.JLabel();
        TituloPrincipal = new javax.swing.JLabel();
        IconoSecundario = new javax.swing.JLabel();
        IconoCantidadUPS = new javax.swing.JLabel();
        IconoCantidadOrdenadores = new javax.swing.JLabel();
        IconoCantidadImpresoras = new javax.swing.JLabel();
        ModuloInventarioEquipos = new javax.swing.JPanel();
        IconoInventarioEqp = new javax.swing.JLabel();
        TituloPrincipalInv = new javax.swing.JLabel();
        IconoEqpActivos = new javax.swing.JLabel();
        EtiquetaPorcentajeActivos = new javax.swing.JLabel();
        IconoEqpInactivos = new javax.swing.JLabel();
        EtiquetaPorcentajeInactivos = new javax.swing.JLabel();
        ModuloCatalogos = new javax.swing.JPanel();
        IconoCatalogo = new javax.swing.JLabel();
        TituloPrincipalCatalogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        ModuloRegistroEquipo.setBackground(new java.awt.Color(255, 255, 255));
        ModuloRegistroEquipo.setPreferredSize(new java.awt.Dimension(310, 120));
        ModuloRegistroEquipo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoRegistroEqp.setBackground(new java.awt.Color(37, 216, 250));
        IconoRegistroEqp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconoRegistroEqp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/agregarB96.png"))); // NOI18N
        IconoRegistroEqp.setOpaque(true);
        IconoRegistroEqp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconoRegistroEqpMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IconoRegistroEqpMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                IconoRegistroEqpMouseReleased(evt);
            }
        });
        ModuloRegistroEquipo.add(IconoRegistroEqp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 130));

        TituloPrincipal.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TituloPrincipal.setForeground(new java.awt.Color(27, 30, 33));
        TituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloPrincipal.setText("REGISTRAR EQUIPO");
        ModuloRegistroEquipo.add(TituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 200, -1));

        IconoSecundario.setBackground(new java.awt.Color(255, 255, 255));
        IconoSecundario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconoSecundario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/equipoN48.png"))); // NOI18N
        IconoSecundario.setOpaque(true);
        ModuloRegistroEquipo.add(IconoSecundario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 60, 50));

        IconoCantidadUPS.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        IconoCantidadUPS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/bateriaN20.png"))); // NOI18N
        IconoCantidadUPS.setText(">> 23.6% <<");
        ModuloRegistroEquipo.add(IconoCantidadUPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        IconoCantidadOrdenadores.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        IconoCantidadOrdenadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/cpuN20.png"))); // NOI18N
        IconoCantidadOrdenadores.setText(">> 27.5% <<");
        ModuloRegistroEquipo.add(IconoCantidadOrdenadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        IconoCantidadImpresoras.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        IconoCantidadImpresoras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/impresoraN20.png"))); // NOI18N
        IconoCantidadImpresoras.setText(">> 14.8% <<");
        ModuloRegistroEquipo.add(IconoCantidadImpresoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        ModuloInventarioEquipos.setBackground(new java.awt.Color(255, 255, 255));
        ModuloInventarioEquipos.setPreferredSize(new java.awt.Dimension(310, 120));
        ModuloInventarioEquipos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoInventarioEqp.setBackground(new java.awt.Color(255, 51, 102));
        IconoInventarioEqp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconoInventarioEqp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/inventarioB96.png"))); // NOI18N
        IconoInventarioEqp.setOpaque(true);
        IconoInventarioEqp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconoInventarioEqpMouseEntered(evt);
            }
        });
        ModuloInventarioEquipos.add(IconoInventarioEqp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 130));

        TituloPrincipalInv.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TituloPrincipalInv.setForeground(new java.awt.Color(27, 30, 33));
        TituloPrincipalInv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloPrincipalInv.setText("INVENTARIO EQUIPOS");
        ModuloInventarioEquipos.add(TituloPrincipalInv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 200, -1));

        IconoEqpActivos.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        IconoEqpActivos.setForeground(new java.awt.Color(49, 75, 212));
        IconoEqpActivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/equipoN20.png"))); // NOI18N
        IconoEqpActivos.setText("EQUIPOS ACTIVOS");
        ModuloInventarioEquipos.add(IconoEqpActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        EtiquetaPorcentajeActivos.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        EtiquetaPorcentajeActivos.setForeground(new java.awt.Color(51, 51, 51));
        EtiquetaPorcentajeActivos.setText("85.7%");
        ModuloInventarioEquipos.add(EtiquetaPorcentajeActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, 20));

        IconoEqpInactivos.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        IconoEqpInactivos.setForeground(new java.awt.Color(219, 38, 79));
        IconoEqpInactivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/equipoN20.png"))); // NOI18N
        IconoEqpInactivos.setText("EQUIPOS INACTIVOS");
        ModuloInventarioEquipos.add(IconoEqpInactivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        EtiquetaPorcentajeInactivos.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        EtiquetaPorcentajeInactivos.setForeground(new java.awt.Color(51, 51, 51));
        EtiquetaPorcentajeInactivos.setText("14.3%");
        ModuloInventarioEquipos.add(EtiquetaPorcentajeInactivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, 20));

        ModuloCatalogos.setBackground(new java.awt.Color(255, 255, 255));
        ModuloCatalogos.setPreferredSize(new java.awt.Dimension(310, 120));
        ModuloCatalogos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoCatalogo.setBackground(new java.awt.Color(57, 191, 102));
        IconoCatalogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconoCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/catalogoB96.png"))); // NOI18N
        IconoCatalogo.setOpaque(true);
        IconoCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconoCatalogoMouseEntered(evt);
            }
        });
        ModuloCatalogos.add(IconoCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 130));

        TituloPrincipalCatalogo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TituloPrincipalCatalogo.setForeground(new java.awt.Color(27, 30, 33));
        TituloPrincipalCatalogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloPrincipalCatalogo.setText("CATALOGOS");
        ModuloCatalogos.add(TituloPrincipalCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 200, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/catalogoN20.png"))); // NOI18N
        jLabel1.setText(">> Dispositivos");
        ModuloCatalogos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 120, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/catalogoN20.png"))); // NOI18N
        jLabel2.setText(">> Modelos");
        ModuloCatalogos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 100, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/catalogoN20.png"))); // NOI18N
        jLabel3.setText(">> Equipos");
        ModuloCatalogos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(ModuloRegistroEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(ModuloInventarioEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(ModuloCatalogos, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ModuloCatalogos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ModuloRegistroEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ModuloInventarioEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                .addContainerGap(458, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IconoRegistroEqpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconoRegistroEqpMouseEntered
       IconoRegistroEqp.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_IconoRegistroEqpMouseEntered

    private void IconoInventarioEqpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconoInventarioEqpMouseEntered
       IconoInventarioEqp.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_IconoInventarioEqpMouseEntered

    private void IconoCatalogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconoCatalogoMouseEntered
       IconoCatalogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_IconoCatalogoMouseEntered

    private void IconoRegistroEqpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconoRegistroEqpMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_IconoRegistroEqpMousePressed

    private void IconoRegistroEqpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconoRegistroEqpMouseReleased
        contenedor.establercerRuta("Registrar Equipo ->", " ");
        VRE = new VistaRegistroEquipos(contenedor, this);
        ingresarMRE();
    }//GEN-LAST:event_IconoRegistroEqpMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiquetaPorcentajeActivos;
    private javax.swing.JLabel EtiquetaPorcentajeInactivos;
    private javax.swing.JLabel IconoCantidadImpresoras;
    private javax.swing.JLabel IconoCantidadOrdenadores;
    private javax.swing.JLabel IconoCantidadUPS;
    public javax.swing.JLabel IconoCatalogo;
    private javax.swing.JLabel IconoEqpActivos;
    private javax.swing.JLabel IconoEqpInactivos;
    public javax.swing.JLabel IconoInventarioEqp;
    public javax.swing.JLabel IconoRegistroEqp;
    private javax.swing.JLabel IconoSecundario;
    private javax.swing.JPanel ModuloCatalogos;
    private javax.swing.JPanel ModuloInventarioEquipos;
    private javax.swing.JPanel ModuloRegistroEquipo;
    private javax.swing.JLabel TituloPrincipal;
    private javax.swing.JLabel TituloPrincipalCatalogo;
    private javax.swing.JLabel TituloPrincipalInv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
