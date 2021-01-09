/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sisgeproinv.formularios;

/**
 *
 * @author Alejandro Gonzalez
 */
public class Contenedor extends javax.swing.JFrame {

    /**
     * Creates new form Contenedor
     */
    public Contenedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCabezera = new javax.swing.JPanel();
        PanelMenu = new javax.swing.JPanel();
        EtiquetaIconoUsuarioMenu = new javax.swing.JLabel();
        EtiquetaEstadoMenu = new javax.swing.JLabel();
        EtiquetaUsuarioMenu = new javax.swing.JLabel();
        SeparadorMenu = new javax.swing.JSeparator();
        BotonReportes = new javax.swing.JLabel();
        BotonModulos = new javax.swing.JLabel();
        PanelInferior = new javax.swing.JPanel();
        EtiquetaCredito = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelCabezera.setBackground(new java.awt.Color(0, 77, 131));
        PanelCabezera.setPreferredSize(new java.awt.Dimension(873, 40));

        javax.swing.GroupLayout PanelCabezeraLayout = new javax.swing.GroupLayout(PanelCabezera);
        PanelCabezera.setLayout(PanelCabezeraLayout);
        PanelCabezeraLayout.setHorizontalGroup(
            PanelCabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1163, Short.MAX_VALUE)
        );
        PanelCabezeraLayout.setVerticalGroup(
            PanelCabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(PanelCabezera, java.awt.BorderLayout.PAGE_START);

        PanelMenu.setBackground(new java.awt.Color(43, 47, 66));
        PanelMenu.setPreferredSize(new java.awt.Dimension(190, 607));
        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EtiquetaIconoUsuarioMenu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        EtiquetaIconoUsuarioMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaIconoUsuarioMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/usuarioBlanco26.png"))); // NOI18N
        PanelMenu.add(EtiquetaIconoUsuarioMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 40));

        EtiquetaEstadoMenu.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        EtiquetaEstadoMenu.setForeground(new java.awt.Color(51, 255, 51));
        EtiquetaEstadoMenu.setText("ONLINE");
        EtiquetaEstadoMenu.setToolTipText("");
        PanelMenu.add(EtiquetaEstadoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 120, -1));

        EtiquetaUsuarioMenu.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        EtiquetaUsuarioMenu.setForeground(new java.awt.Color(249, 247, 247));
        EtiquetaUsuarioMenu.setText("LMARSELL");
        EtiquetaUsuarioMenu.setToolTipText("");
        PanelMenu.add(EtiquetaUsuarioMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        SeparadorMenu.setBackground(new java.awt.Color(74, 84, 109));
        SeparadorMenu.setForeground(new java.awt.Color(74, 84, 109));
        SeparadorMenu.setOpaque(true);
        PanelMenu.add(SeparadorMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, 5));

        BotonReportes.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        BotonReportes.setForeground(new java.awt.Color(255, 255, 255));
        BotonReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/reporte25.png"))); // NOI18N
        BotonReportes.setText("Reportes");
        PanelMenu.add(BotonReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 170, 30));

        BotonModulos.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        BotonModulos.setForeground(new java.awt.Color(255, 255, 255));
        BotonModulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sisgeproinv/iconos/modulo25.png"))); // NOI18N
        BotonModulos.setText("Modulos");
        PanelMenu.add(BotonModulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, 30));

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

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 973, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );

        getContentPane().add(PanelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    public javax.swing.JLabel BotonModulos;
    public javax.swing.JLabel BotonReportes;
    private javax.swing.JLabel EtiquetaCredito;
    private javax.swing.JLabel EtiquetaEstadoMenu;
    private javax.swing.JLabel EtiquetaIconoUsuarioMenu;
    private javax.swing.JLabel EtiquetaUsuarioMenu;
    private javax.swing.JPanel PanelCabezera;
    private javax.swing.JPanel PanelInferior;
    public javax.swing.JPanel PanelMenu;
    public javax.swing.JPanel PanelPrincipal;
    private javax.swing.JSeparator SeparadorMenu;
    // End of variables declaration//GEN-END:variables
}