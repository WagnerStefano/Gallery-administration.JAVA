
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Cadastro_Artista extends javax.swing.JFrame {


    public Cadastro_Artista() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodArt = new javax.swing.JLabel();
        txtCodArt = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblGaleria = new javax.swing.JLabel();
        txtGaleria = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();

        setTitle(" ");
        getContentPane().setLayout(null);

        lblCodArt.setText("Código do Artista:");
        getContentPane().add(lblCodArt);
        lblCodArt.setBounds(190, 70, 110, 40);
        getContentPane().add(txtCodArt);
        txtCodArt.setBounds(311, 72, 230, 40);

        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(190, 120, 80, 40);
        getContentPane().add(txtNome);
        txtNome.setBounds(310, 120, 230, 40);

        lblGaleria.setText("Galeria:");
        getContentPane().add(lblGaleria);
        lblGaleria.setBounds(190, 170, 80, 40);
        getContentPane().add(txtGaleria);
        txtGaleria.setBounds(310, 170, 230, 40);

        lblTelefone.setText("Telefone:");
        getContentPane().add(lblTelefone);
        lblTelefone.setBounds(190, 230, 70, 40);
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(310, 230, 230, 40);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(340, 320, 130, 40);

        setSize(new java.awt.Dimension(784, 416));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/art_gallery", "root", "18ws1098");
            PreparedStatement st = conectar.prepareStatement("INSERT INTO artistas Values(?,?,?,?)");
            st.setString(1,txtCodArt.getText());
            st.setString(2, txtNome.getText());
            st.setString(3, txtGaleria.getText());
            st.setString(4,txtTelefone.getText());
            st.executeUpdate();//executa a atualização no banco de dados
            JOptionPane.showMessageDialog(null, "Artista cadastrado(a) com sucesso!");
            //limpa os campos do formulario após cadastro
            txtCodArt.setText("");
            txtNome.setText("");
            txtGaleria.setText("");
            txtTelefone.setText("");
            
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
                                          
    }//GEN-LAST:event_btnCadastrarActionPerformed


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
            java.util.logging.Logger.getLogger(Cadastro_Artista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Artista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Artista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Artista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Artista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel lblCodArt;
    private javax.swing.JLabel lblGaleria;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtCodArt;
    private javax.swing.JTextField txtGaleria;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
