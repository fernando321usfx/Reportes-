/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad;

/**
 *
 * @author Fernando
 */
public class Autentificaion extends javax.swing.JFrame {

    /**
     * Creates new form Autentificaion
     */
    public Autentificaion() {
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

        jLabelLogin = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelContrasena = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelRecuperarCuenta = new javax.swing.JLabel();
        jButtonIngresar = new javax.swing.JButton();
        jLabelImagenUsuario = new javax.swing.JLabel();
        jLabelImagenContra = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogin.setFont(new java.awt.Font("Bauhaus 93", 1, 48)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(255, 102, 0));
        jLabelLogin.setText("LOGIN");
        getContentPane().add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 11, -1, -1));

        jLabelUsuario.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 102, 0));
        jLabelUsuario.setText("C.I.");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 109, 86, 45));

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 111, 211, 49));

        jLabelContrasena.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabelContrasena.setForeground(new java.awt.Color(255, 102, 0));
        jLabelContrasena.setText("Contraseña");
        getContentPane().add(jLabelContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 251, -1, 45));

        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 246, 190, 50));

        jLabelRecuperarCuenta.setBackground(new java.awt.Color(0, 51, 255));
        jLabelRecuperarCuenta.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelRecuperarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRecuperarCuenta.setText("Olvido su contraseña o Usuario");
        jLabelRecuperarCuenta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelRecuperarCuentaazul(evt);
            }
        });
        getContentPane().add(jLabelRecuperarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 307, 200, -1));

        jButtonIngresar.setBackground(new java.awt.Color(51, 204, 255));
        jButtonIngresar.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jButtonIngresar.setForeground(new java.awt.Color(255, 102, 0));
        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 378, -1, -1));

        jLabelImagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        getContentPane().add(jLabelImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 78, -1, -1));

        jLabelImagenContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/passwor.png"))); // NOI18N
        getContentPane().add(jLabelImagenContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 224, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-azul-exagonos-fotorecurso.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jLabelRecuperarCuentaazul(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRecuperarCuentaazul
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelRecuperarCuentaazul

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Autentificaion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Autentificaion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Autentificaion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Autentificaion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Autentificaion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelImagenContra;
    private javax.swing.JLabel jLabelImagenUsuario;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelRecuperarCuenta;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}