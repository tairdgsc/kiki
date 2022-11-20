/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import connections.MySQL;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author Taila Rodrigues
 */
public class ViewLogin extends javax.swing.JFrame {
    Usuario novoUsuario;
    MySQL mySQLcon;

    /**
     * Creates new form ViewLogin
     */
    public ViewLogin() {
        initComponents();
        mySQLcon = new MySQL();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonEntrar = new javax.swing.JButton();
        jTextFieldLogin = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jCheckBoxMostrar = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 255));
        jLabel1.setText("Faça seu login (:");

        jLabel2.setText("Login:");

        jLabel3.setText("Senha:");

        jButtonEntrar.setForeground(new java.awt.Color(204, 153, 255));
        jButtonEntrar.setText("ENTRAR");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });

        jCheckBoxMostrar.setForeground(new java.awt.Color(204, 153, 255));
        jCheckBoxMostrar.setText("Mostrar");
        jCheckBoxMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMostrarActionPerformed(evt);
            }
        });

        jLabel4.setText("Ainda não tem uma conta?");

        jButtonCadastrar.setForeground(new java.awt.Color(204, 153, 255));
        jButtonCadastrar.setText("CADASTRAR");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxMostrar)
                            .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonEntrar)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonCadastrar)
                        .addGap(113, 113, 113))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxMostrar)
                .addGap(27, 27, 27)
                .addComponent(jButtonEntrar)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadastrar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        mySQLcon.conectaBanco();
        novoUsuario = new Usuario();
        String usuario = jTextFieldLogin.getText();
        String senha = new String(jPasswordFieldSenha.getPassword());

        try {
            this.mySQLcon.executarSQL(
                    "SELECT "
                    + "nome,"
                    + "email,"
                    + "senha"
                    + " FROM"
                    + " usuario"
                    + " WHERE"
                    + " email = '" + usuario + "'"
                    + ";"
            );

            while (mySQLcon.getResultSet().next()) {
                novoUsuario.setNome(mySQLcon.getResultSet().getString(1));
                novoUsuario.setEmail(mySQLcon.getResultSet().getString(2));
                novoUsuario.setSenha(mySQLcon.getResultSet().getString(3));

            }

            if (novoUsuario.getNome().equals("")) {
                JOptionPane.showMessageDialog(null, "Usuario nao encontrado.", "ERRO", JOptionPane.ERROR_MESSAGE, null);

            } else if(novoUsuario.getSenha().equals(senha)) {
                ViewMain janelaMain = new ViewMain();
                janelaMain.setVisible(true);
                this.setVisible(false);
            } else {
               JOptionPane.showMessageDialog(null, "Verifique suas credenciais.", "ERRO", JOptionPane.ERROR_MESSAGE, null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro na Busca", "ERRO", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            mySQLcon.fechaBanco();
        }

    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jCheckBoxMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMostrarActionPerformed

        boolean isSelected = jCheckBoxMostrar.isSelected();
        
        if(isSelected) {
            jPasswordFieldSenha.setEchoChar((char)0);
        } else {
            jPasswordFieldSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxMostrarActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        ViewCadastro janelaCadastro = new ViewCadastro();
        janelaCadastro.setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JCheckBox jCheckBoxMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}