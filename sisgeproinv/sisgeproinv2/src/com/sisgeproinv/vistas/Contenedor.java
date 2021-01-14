/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sisgeproinv.vistas;

import com.sisgeproinv.menus.MenuReportes;
import com.sisgeproinv.menus.MenuTableroModulos;
import java.awt.Cursor;
import javax.swing.JLabel;



/**
 *
 * @author Alejandro Gonzalez
 */
public class Contenedor extends javax.swing.JFrame {
    
    MenuTableroModulos tablero;
    MenuReportes reporte;
    
    public Contenedor() {
        initComponents();
        tablero = new MenuTableroModulos(this);
        reporte = new MenuReportes();
        establercerRuta(" ", " ");
    }
    
    public final void establercerRuta(String a, String b){
        EtiquetaModuloRuta.setText(a);
        EtiquetaSubModuloRuta.setText(b);
    }
    
    private void mostrarTableroModulos(){
       PanelContenedor.remove(reporte);
       PanelContenedor.add(tablero);
       tablero.setVisible(true);
       this.revalidate();
       this.repaint();
    }
    
    private void mostrarMenuReportes(){
       PanelContenedor.remove(tablero);
       PanelContenedor.add(reporte);
       tablero.setVisible(true);
       this.revalidate();
       this.repaint();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCabezera = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EtiquetaIconoUsuario = new javax.swing.JLabel();
        EtiquetaUsuario = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        EtiquetaEstadoMenu = new javax.swing.JLabel();
        SeparadorMenu = new javax.swing.JSeparator();
        MenuReportes = new javax.swing.JLabel();
        MenuTablero = new javax.swing.JLabel();
        EtiquetaIconoUsuarioMenu = new javax.swing.JLabel();
        EtiquetaRolMenu = new javax.swing.JLabel();
        PanelInferior = new javax.swing.JPanel();
        EtiquetaCredito = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        PanelRuta = new javax.swing.JPanel();
        EtiquetaIconoRuta = new javax.swing.JLabel();
        EtiquetaModuloRuta = new javax.swing.JLabel();
        EtiquetaSubModuloRuta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PanelContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelCabezera.setBackground(new java.awt.Color(0, 77, 131));
        PanelCabezera.setPreferredSize(new java.awt.Dimension(873, 40));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QBD");

        EtiquetaIconoUsuario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        EtiquetaIconoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaIconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/usuarioB26.png"))); // NOI18N

        EtiquetaUsuario.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        EtiquetaUsuario.setForeground(new java.awt.Color(249, 247, 247));
        EtiquetaUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaUsuario.setText("LMARSELL");
        EtiquetaUsuario.setToolTipText("");

        javax.swing.GroupLayout PanelCabezeraLayout = new javax.swing.GroupLayout(PanelCabezera);
        PanelCabezera.setLayout(PanelCabezeraLayout);
        PanelCabezeraLayout.setHorizontalGroup(
            PanelCabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCabezeraLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 861, Short.MAX_VALUE)
                .addComponent(EtiquetaIconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EtiquetaUsuario)
                .addContainerGap())
        );
        PanelCabezeraLayout.setVerticalGroup(
            PanelCabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCabezeraLayout.createSequentialGroup()
                .addComponent(EtiquetaIconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelCabezeraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EtiquetaUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelCabezera, java.awt.BorderLayout.PAGE_START);

        PanelMenu.setBackground(new java.awt.Color(43, 47, 66));
        PanelMenu.setPreferredSize(new java.awt.Dimension(190, 607));
        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EtiquetaEstadoMenu.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        EtiquetaEstadoMenu.setForeground(new java.awt.Color(51, 255, 51));
        EtiquetaEstadoMenu.setText("ONLINE");
        EtiquetaEstadoMenu.setToolTipText("");
        PanelMenu.add(EtiquetaEstadoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 120, -1));

        SeparadorMenu.setBackground(new java.awt.Color(74, 84, 109));
        SeparadorMenu.setForeground(new java.awt.Color(74, 84, 109));
        SeparadorMenu.setOpaque(true);
        PanelMenu.add(SeparadorMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 170, 5));

        MenuReportes.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        MenuReportes.setForeground(new java.awt.Color(255, 255, 255));
        MenuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/reporte25.png"))); // NOI18N
        MenuReportes.setText("Reportes");
        MenuReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuReportesMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuReportesMouseReleased(evt);
            }
        });
        PanelMenu.add(MenuReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 170, 30));

        MenuTablero.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        MenuTablero.setForeground(new java.awt.Color(255, 255, 255));
        MenuTablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/moduloB25.png"))); // NOI18N
        MenuTablero.setText("Modulos");
        MenuTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuTableroMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuTableroMouseReleased(evt);
            }
        });
        PanelMenu.add(MenuTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 30));

        EtiquetaIconoUsuarioMenu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        EtiquetaIconoUsuarioMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaIconoUsuarioMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/usuarioB26.png"))); // NOI18N
        PanelMenu.add(EtiquetaIconoUsuarioMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 40, 40));

        EtiquetaRolMenu.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        EtiquetaRolMenu.setForeground(new java.awt.Color(249, 247, 247));
        EtiquetaRolMenu.setText("ADMINISTRADOR");
        EtiquetaRolMenu.setToolTipText("");
        PanelMenu.add(EtiquetaRolMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 120, -1));

        getContentPane().add(PanelMenu, java.awt.BorderLayout.LINE_START);

        PanelInferior.setBackground(new java.awt.Color(0, 77, 131));
        PanelInferior.setPreferredSize(new java.awt.Dimension(988, 30));

        EtiquetaCredito.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 10)); // NOI18N
        EtiquetaCredito.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaCredito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaCredito.setText("SISTEMA DESARROLLADO POR LUCAS ANDRES MARSELL");

        javax.swing.GroupLayout PanelInferiorLayout = new javax.swing.GroupLayout(PanelInferior);
        PanelInferior.setLayout(PanelInferiorLayout);
        PanelInferiorLayout.setHorizontalGroup(
            PanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EtiquetaCredito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1163, Short.MAX_VALUE)
        );
        PanelInferiorLayout.setVerticalGroup(
            PanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EtiquetaCredito, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(PanelInferior, java.awt.BorderLayout.PAGE_END);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        EtiquetaIconoRuta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EtiquetaIconoRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/moduloN20.png"))); // NOI18N
        EtiquetaIconoRuta.setText("Modulo >");

        EtiquetaModuloRuta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EtiquetaModuloRuta.setText("Nombre del Modulo >");

        EtiquetaSubModuloRuta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EtiquetaSubModuloRuta.setText("Nombre del Sub Modulo");

        javax.swing.GroupLayout PanelRutaLayout = new javax.swing.GroupLayout(PanelRuta);
        PanelRuta.setLayout(PanelRutaLayout);
        PanelRutaLayout.setHorizontalGroup(
            PanelRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRutaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EtiquetaIconoRuta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EtiquetaModuloRuta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EtiquetaSubModuloRuta)
                .addContainerGap(605, Short.MAX_VALUE))
        );
        PanelRutaLayout.setVerticalGroup(
            PanelRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(EtiquetaIconoRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EtiquetaModuloRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(EtiquetaSubModuloRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel2.setText("sisgeproinv");

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 10)); // NOI18N
        jLabel3.setText("Version 1.0");

        PanelContenedor.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(PanelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuTableroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuTableroMouseReleased
        mostrarTableroModulos();
        
    }//GEN-LAST:event_MenuTableroMouseReleased

    private void MenuReportesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuReportesMouseReleased
       mostrarMenuReportes();
    }//GEN-LAST:event_MenuReportesMouseReleased

    private void MenuTableroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuTableroMouseEntered
        MenuTablero.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MenuTableroMouseEntered

    private void MenuReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuReportesMouseEntered
        MenuReportes.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MenuReportesMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contenedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiquetaCredito;
    public javax.swing.JLabel EtiquetaEstadoMenu;
    private javax.swing.JLabel EtiquetaIconoRuta;
    private javax.swing.JLabel EtiquetaIconoUsuario;
    private javax.swing.JLabel EtiquetaIconoUsuarioMenu;
    public javax.swing.JLabel EtiquetaModuloRuta;
    public javax.swing.JLabel EtiquetaRolMenu;
    public javax.swing.JLabel EtiquetaSubModuloRuta;
    public javax.swing.JLabel EtiquetaUsuario;
    public javax.swing.JLabel MenuReportes;
    public javax.swing.JLabel MenuTablero;
    private javax.swing.JPanel PanelCabezera;
    public javax.swing.JPanel PanelContenedor;
    private javax.swing.JPanel PanelInferior;
    public javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelRuta;
    private javax.swing.JSeparator SeparadorMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
