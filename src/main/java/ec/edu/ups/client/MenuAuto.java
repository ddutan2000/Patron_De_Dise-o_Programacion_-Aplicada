/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.client;

import ec.edu.ups.invoker.ControlRemoto;
import ec.edu.ups.receiver.Automovil;

/**
 *
 * @author Dutan2000
 */
public class MenuAuto extends javax.swing.JFrame {

    private Automovil auto;
    private ControlRemoto control;
    /** Creates new form MenuAuto */
    public MenuAuto() {
        initComponents();
        auto=new Automovil(txtOperacion);
        control=new ControlRemoto(auto);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEncenderAuto = new javax.swing.JButton();
        btnApagarAuto = new javax.swing.JButton();
        btnPrenderAlarma = new javax.swing.JButton();
        btnApagarAlarma = new javax.swing.JButton();
        txtOperacion = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEncenderAuto.setText("ENCENDER");
        btnEncenderAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncenderAutoActionPerformed(evt);
            }
        });

        btnApagarAuto.setText("APAGAR");
        btnApagarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarAutoActionPerformed(evt);
            }
        });

        btnPrenderAlarma.setText("ENCENDER ALARMA");
        btnPrenderAlarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrenderAlarmaActionPerformed(evt);
            }
        });

        btnApagarAlarma.setText("APAGAR ALARMA");
        btnApagarAlarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarAlarmaActionPerformed(evt);
            }
        });

        txtOperacion.setEditable(false);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnApagarAlarma)
                    .addComponent(btnPrenderAlarma)
                    .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEncenderAuto)
                        .addGap(18, 18, 18)
                        .addComponent(btnApagarAuto)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEncenderAuto)
                    .addComponent(btnApagarAuto))
                .addGap(18, 18, 18)
                .addComponent(btnPrenderAlarma)
                .addGap(18, 18, 18)
                .addComponent(btnApagarAlarma)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void btnApagarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarAutoActionPerformed
        control.boton(1);
    }//GEN-LAST:event_btnApagarAutoActionPerformed

    private void btnApagarAlarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarAlarmaActionPerformed
        control.boton(3);
    }//GEN-LAST:event_btnApagarAlarmaActionPerformed

    private void btnEncenderAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncenderAutoActionPerformed
        control.boton(0);
    }//GEN-LAST:event_btnEncenderAutoActionPerformed

    private void btnPrenderAlarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrenderAlarmaActionPerformed
        control.boton(2);
    }//GEN-LAST:event_btnPrenderAlarmaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAuto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagarAlarma;
    private javax.swing.JButton btnApagarAuto;
    private javax.swing.JButton btnEncenderAuto;
    private javax.swing.JButton btnPrenderAlarma;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTextField txtOperacion;
    // End of variables declaration//GEN-END:variables

}
