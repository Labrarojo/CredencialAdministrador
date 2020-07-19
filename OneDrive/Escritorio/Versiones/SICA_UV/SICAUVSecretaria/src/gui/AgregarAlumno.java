/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author adria
 */
public class AgregarAlumno extends javax.swing.JFrame {

    /**
     * Creates new form AgregarAlumno
     */
    public AgregarAlumno() {
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

        maternoTextField = new javax.swing.JTextField();
        nombreTextField = new javax.swing.JTextField();
        matriculaTextField = new javax.swing.JTextField();
        paternoTextField1 = new javax.swing.JTextField();
        carreraComboBox = new javax.swing.JComboBox<>();
        aceptarButton = new javax.swing.JButton();
        facultadComboBox = new javax.swing.JComboBox<>();
        cancelarButton = new javax.swing.JButton();
        selecFotoButton1 = new javax.swing.JButton();
        selecFotoButton = new javax.swing.JButton();
        atrasButton = new javax.swing.JButton();
        fotoLabel = new javax.swing.JLabel();
        firmaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        maternoTextField.setBackground(new java.awt.Color(220, 236, 246));
        maternoTextField.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        maternoTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 236, 246), 3, true));
        maternoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maternoTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(maternoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 460, 60));

        nombreTextField.setBackground(new java.awt.Color(220, 236, 246));
        nombreTextField.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        nombreTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 236, 246), 3, true));
        getContentPane().add(nombreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 950, 60));

        matriculaTextField.setBackground(new java.awt.Color(220, 236, 246));
        matriculaTextField.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        matriculaTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 236, 246), 3, true));
        getContentPane().add(matriculaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 460, 60));

        paternoTextField1.setBackground(new java.awt.Color(220, 236, 246));
        paternoTextField1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        paternoTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 236, 246), 3, true));
        getContentPane().add(paternoTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 460, 60));

        carreraComboBox.setBackground(new java.awt.Color(220, 236, 246));
        carreraComboBox.setFont(new java.awt.Font("Tw Cen MT", 0, 28)); // NOI18N
        carreraComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniería de Software", "Administración", "Contabilidad" }));
        carreraComboBox.setBorder(null);
        carreraComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(carreraComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 460, 60));

        aceptarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/aceptar.png"))); // NOI18N
        aceptarButton.setBorder(null);
        aceptarButton.setContentAreaFilled(false);
        getContentPane().add(aceptarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 610, 200, 50));

        facultadComboBox.setBackground(new java.awt.Color(220, 236, 246));
        facultadComboBox.setFont(new java.awt.Font("Tw Cen MT", 0, 28)); // NOI18N
        facultadComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facultad de Contaduria y Administración", "Facultad de Ingeniería" }));
        facultadComboBox.setBorder(null);
        facultadComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(facultadComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 960, 60));

        cancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/cancelar.png"))); // NOI18N
        cancelarButton.setBorder(null);
        cancelarButton.setContentAreaFilled(false);
        getContentPane().add(cancelarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 610, 200, 50));

        selecFotoButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Grupo 178.png"))); // NOI18N
        selecFotoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecFotoButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(selecFotoButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 520, 180, 50));

        selecFotoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Grupo 6.png"))); // NOI18N
        selecFotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecFotoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(selecFotoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 300, 180, 50));

        atrasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/atras.png"))); // NOI18N
        atrasButton.setBorder(null);
        atrasButton.setContentAreaFilled(false);
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });
        getContentPane().add(atrasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 50, -1));

        fotoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/redes-sociales.png"))); // NOI18N
        getContentPane().add(fotoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 140, 160, 150));

        firmaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Rectángulo 46.png"))); // NOI18N
        getContentPane().add(firmaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 390, -1, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Registrar alumno – 1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maternoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maternoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maternoTextFieldActionPerformed

    private void selecFotoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecFotoButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser Buscar = new JFileChooser();
        FileNameExtensionFilter Extension= new FileNameExtensionFilter("Seleccionar imagen", "jpg","png");
        Buscar.setFileFilter(Extension);
        
        if (Buscar.showOpenDialog(this)== JFileChooser.APPROVE_OPTION) {
            Toolkit Tool=Toolkit.getDefaultToolkit();
            String Ruta=Buscar.getSelectedFile().toString();
            Image Imagen=Tool.createImage(Ruta);
            firmaLabel.setIcon(new ImageIcon(Imagen.getScaledInstance(firmaLabel.getWidth(), firmaLabel.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
    }//GEN-LAST:event_selecFotoButton1ActionPerformed

    private void selecFotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecFotoButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser Buscar = new JFileChooser();
        FileNameExtensionFilter Extension= new FileNameExtensionFilter("Seleccionar imagen", "jpg","png");
        Buscar.setFileFilter(Extension);
        
        if (Buscar.showOpenDialog(this)== JFileChooser.APPROVE_OPTION) {
            Toolkit Tool=Toolkit.getDefaultToolkit();
            String Ruta=Buscar.getSelectedFile().toString();
            Image Imagen=Tool.createImage(Ruta);
            fotoLabel.setIcon(new ImageIcon(Imagen.getScaledInstance(fotoLabel.getWidth(), fotoLabel.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
    }//GEN-LAST:event_selecFotoButtonActionPerformed

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        AlumnosRegistrados alumnos = new AlumnosRegistrados();
        this.setVisible(false);
        alumnos.setVisible(true);
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
            java.util.logging.Logger.getLogger(AgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JButton atrasButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JComboBox<String> carreraComboBox;
    private javax.swing.JComboBox<String> facultadComboBox;
    private javax.swing.JLabel firmaLabel;
    private javax.swing.JLabel fotoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField maternoTextField;
    private javax.swing.JTextField matriculaTextField;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField paternoTextField1;
    private javax.swing.JButton selecFotoButton;
    private javax.swing.JButton selecFotoButton1;
    // End of variables declaration//GEN-END:variables
}