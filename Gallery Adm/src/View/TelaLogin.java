
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class TelaLogin extends javax.swing.JFrame {


    public TelaLogin() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        LblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(null);

        lblLogin.setText("Login");
        getContentPane().add(lblLogin);
        lblLogin.setBounds(166, 120, 44, 40);

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        getContentPane().add(txtLogin);
        txtLogin.setBounds(216, 120, 235, 40);

        LblSenha.setText("Senha");
        getContentPane().add(LblSenha);
        LblSenha.setBounds(166, 178, 44, 40);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(216, 178, 235, 40);

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(266, 275, 103, 37);

        setSize(new java.awt.Dimension(697, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
         new ControleGaleria().setVisible(true);
       // try {
        //    Class.forName("com.mysql.cj.jdbc.Driver");
        //    Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/art_gallery", "root", "******");
        //    PreparedStatement st = conectar.prepareStatement("SELECT * FROM funcionarios WHERE usuarios = ? AND senha = ?");
        //    //PreparedStatement st = conectar.prepareStatement("SELECT * FROM funcionarios WHERE usuarios = ? AND senha = ?");
        //    st.setString(1,txtLogin.getText());
        //    st.setString(2, txtSenha.getText());
         //   st.executeUpdate();//executa a atualização no banco de dados
          //  JOptionPane.showMessageDialog(null, "Artista cadastrado(a) com sucesso!");
        //    //limpa os campos do formulario após cadastro
          //  ResultSet resultado = st.executeQuery();
         //   if(resultado.next()){ //Se encontrou os dados do usuário
         ////      dispose(); //Fecha a tela de login
           ////    new ControleGaleria().setVisible(true); //abre a tela de menu
          //  } else { //Se não encontrou o dados do usuário
            //   JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos");
           //    txtLogin.requestFocus();
           // }
       // } catch (ClassNotFoundException | SQLException ex) {
          //  JOptionPane.showMessageDialog(null, ex.getMessage());
       // }
    
    
    }//GEN-LAST:event_btnEntrarActionPerformed


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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblSenha;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
