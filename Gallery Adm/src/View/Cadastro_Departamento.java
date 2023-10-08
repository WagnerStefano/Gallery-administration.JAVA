
package View;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;



public class Cadastro_Departamento extends javax.swing.JFrame {


    public Cadastro_Departamento() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeDPTO = new javax.swing.JLabel();
        lblCodDPTO = new javax.swing.JLabel();
        txtCodDPTO = new javax.swing.JTextField();
        txtNomeDPTO = new javax.swing.JTextField();
        lblGaleria = new javax.swing.JLabel();
        txtGaleria = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btnSalvar1 = new javax.swing.JButton();

        setTitle("Cadastro de Departamentos");
        getContentPane().setLayout(null);

        lblNomeDPTO.setText("Nome do Departamento:");
        getContentPane().add(lblNomeDPTO);
        lblNomeDPTO.setBounds(130, 40, 140, 40);

        lblCodDPTO.setText("Código do Departamento:");
        getContentPane().add(lblCodDPTO);
        lblCodDPTO.setBounds(130, 100, 140, 40);
        getContentPane().add(txtCodDPTO);
        txtCodDPTO.setBounds(270, 100, 230, 40);

        txtNomeDPTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDPTOActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeDPTO);
        txtNomeDPTO.setBounds(270, 40, 370, 40);

        lblGaleria.setText("Galeria:");
        getContentPane().add(lblGaleria);
        lblGaleria.setBounds(170, 160, 100, 40);
        getContentPane().add(txtGaleria);
        txtGaleria.setBounds(270, 160, 370, 40);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(510, 100, 130, 40);

        lblTelefone.setText("Telefone:");
        getContentPane().add(lblTelefone);
        lblTelefone.setBounds(170, 220, 100, 40);
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(270, 220, 180, 40);

        btnSalvar1.setText("Salvar");
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar1);
        btnSalvar1.setBounds(380, 280, 130, 40);

        setSize(new java.awt.Dimension(782, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/art_gallery", "root", "18ws1098");
            PreparedStatement st = conectar.prepareStatement("INSERT INTO departamentos Values(?,?,?,?)");
            st.setInt(1,Integer.parseInt(txtCodDPTO.getText()));
            st.setString(2, txtNomeDPTO.getText());
            st.setString(3, txtGaleria.getText());
            st.setString(4, txtTelefone.getText());
            st.executeUpdate();//executa a atualização no banco de dados
            JOptionPane.showMessageDialog(null, "Departamento cadastrado com sucesso!");
            //limpa os campos do formulario após cadastro
            txtCodDPTO.setText("");
            txtNomeDPTO.setText("");
            txtGaleria.setText("");
            txtTelefone.setText("");
            
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtNomeDPTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDPTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDPTOActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvar1ActionPerformed


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
            java.util.logging.Logger.getLogger(Cadastro_Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Departamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JLabel lblCodDPTO;
    private javax.swing.JLabel lblGaleria;
    private javax.swing.JLabel lblNomeDPTO;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtCodDPTO;
    private javax.swing.JTextField txtGaleria;
    private javax.swing.JTextField txtNomeDPTO;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
