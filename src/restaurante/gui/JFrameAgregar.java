/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.gui;

/**
 *
 * @author Estudiantes
 */
public class JFrameAgregar extends javax.swing.JFrame {

    /**
     * Creates new form JFrameAgregar
     */
    public JFrameAgregar() {
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

        jrbtnAperitivo = new javax.swing.JRadioButton();
        jrbtnFuerte = new javax.swing.JRadioButton();
        jrbtnBebida = new javax.swing.JRadioButton();
        jrbtnPostre = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jrbtnAperitivo.setText("Aperitivo");
        jrbtnAperitivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnAperitivoActionPerformed(evt);
            }
        });

        jrbtnFuerte.setText("Plato Fuerte");
        jrbtnFuerte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnFuerteActionPerformed(evt);
            }
        });

        jrbtnBebida.setText("Bebida");
        jrbtnBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnBebidaActionPerformed(evt);
            }
        });

        jrbtnPostre.setText("Postre");
        jrbtnPostre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnPostreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbtnPostre)
                    .addComponent(jrbtnBebida)
                    .addComponent(jrbtnFuerte)
                    .addComponent(jrbtnAperitivo))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jrbtnAperitivo)
                .addGap(18, 18, 18)
                .addComponent(jrbtnFuerte)
                .addGap(18, 18, 18)
                .addComponent(jrbtnBebida)
                .addGap(18, 18, 18)
                .addComponent(jrbtnPostre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbtnAperitivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnAperitivoActionPerformed
        new JFrameAperitivo().setVisible(true);
        jrbtnBebida.setSelected(false);
        jrbtnFuerte.setSelected(false);
        jrbtnPostre.setSelected(false);
    }//GEN-LAST:event_jrbtnAperitivoActionPerformed

    private void jrbtnFuerteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnFuerteActionPerformed
        new JFrameFuerte().setVisible(true);
        jrbtnBebida.setSelected(false);
        jrbtnAperitivo.setSelected(false);
        jrbtnPostre.setSelected(false);
    }//GEN-LAST:event_jrbtnFuerteActionPerformed

    private void jrbtnBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnBebidaActionPerformed
        new JFrameBebida().setVisible(true);
        jrbtnPostre.setSelected(false);
        jrbtnFuerte.setSelected(false);
        jrbtnAperitivo.setSelected(false);
    }//GEN-LAST:event_jrbtnBebidaActionPerformed

    private void jrbtnPostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnPostreActionPerformed
        new JFramePostre().setVisible(true);
        jrbtnBebida.setSelected(false);
        jrbtnFuerte.setSelected(false);
        jrbtnAperitivo.setSelected(false);
    }//GEN-LAST:event_jrbtnPostreActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton jrbtnAperitivo;
    private javax.swing.JRadioButton jrbtnBebida;
    private javax.swing.JRadioButton jrbtnFuerte;
    private javax.swing.JRadioButton jrbtnPostre;
    // End of variables declaration//GEN-END:variables
}
