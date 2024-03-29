/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.ImageIcon;

/**
 *
 * @author adria
 */
public class EditarTramite extends javax.swing.JFrame {

    /**
     * Creates new form EditarTramite
     */
    public EditarTramite() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/media/logo.png")).getImage());
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atrasButton = new javax.swing.JButton();
        nombreTextField = new javax.swing.JTextField();
        matriculaTextField = new javax.swing.JTextField();
        folioTextField = new javax.swing.JTextField();
        guardarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atrasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/atras.png"))); // NOI18N
        atrasButton.setBorder(null);
        atrasButton.setContentAreaFilled(false);
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });
        getContentPane().add(atrasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 50, -1));

        nombreTextField.setBackground(new java.awt.Color(220, 236, 246));
        nombreTextField.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        nombreTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 236, 246), 3, true));
        getContentPane().add(nombreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 800, 90));

        matriculaTextField.setBackground(new java.awt.Color(220, 236, 246));
        matriculaTextField.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        matriculaTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 236, 246), 3, true));
        getContentPane().add(matriculaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 370, 90));

        folioTextField.setBackground(new java.awt.Color(220, 236, 246));
        folioTextField.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        folioTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 236, 246), 3, true));
        getContentPane().add(folioTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 370, 90));

        guardarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Guardar_1.png"))); // NOI18N
        guardarButton.setBorder(null);
        guardarButton.setContentAreaFilled(false);
        getContentPane().add(guardarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 200, 50));

        cancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/cancelar.png"))); // NOI18N
        cancelarButton.setBorder(null);
        cancelarButton.setContentAreaFilled(false);
        getContentPane().add(cancelarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 200, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/EditarTram.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        Tramite tramite = new Tramite();
        this.setVisible(false);
        tramite.setVisible(true);
    }//GEN-LAST:event_atrasButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EditarTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarTramite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField folioTextField;
    private javax.swing.JButton guardarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField matriculaTextField;
    private javax.swing.JTextField nombreTextField;
    // End of variables declaration//GEN-END:variables
}
