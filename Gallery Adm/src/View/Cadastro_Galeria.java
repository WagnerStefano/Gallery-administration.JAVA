
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Cadastro_Galeria extends javax.swing.JFrame {


    public Cadastro_Galeria() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNomeGaleria = new javax.swing.JTextField();
        lblCodigoGaleria = new javax.swing.JLabel();
        txtCodigoGaleria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        lblEndereço = new javax.swing.JLabel();
        txtEndereço = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();

        setTitle("Cadastro de Galerias");
        getContentPane().setLayout(null);

        jLabel1.setText("Nome da Galeria:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 40, 100, 40);

        txtNomeGaleria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeGaleriaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeGaleria);
        txtNomeGaleria.setBounds(131, 40, 370, 40);

        lblCodigoGaleria.setText("Código de Galeria:");
        getContentPane().add(lblCodigoGaleria);
        lblCodigoGaleria.setBounds(30, 100, 100, 40);

        txtCodigoGaleria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoGaleriaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoGaleria);
        txtCodigoGaleria.setBounds(130, 100, 370, 40);

        jLabel3.setText("Nome da Galeria:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 40, 100, 40);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(131, 40, 370, 40);

        lblEndereço.setText("Endereço:");
        getContentPane().add(lblEndereço);
        lblEndereço.setBounds(30, 160, 100, 40);
        getContentPane().add(txtEndereço);
        txtEndereço.setBounds(130, 160, 370, 40);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(230, 290, 130, 40);

        lblTelefone.setText("Telefone:");
        getContentPane().add(lblTelefone);
        lblTelefone.setBounds(30, 220, 100, 40);
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(130, 220, 180, 40);

        setSize(new java.awt.Dimension(782, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/art_gallery", "root", "18ws1098");
            PreparedStatement st = conectar.prepareStatement("INSERT INTO galerias Values(?,?,?,?)");
            st.setString(2,txtNomeGaleria.getText());
            st.setInt(1,Integer.parseInt(txtCodigoGaleria.getText()));
            st.setString(3, txtEndereço.getText());
            st.setString(4,txtTelefone.getText());
            st.executeUpdate();//executa a atualização no banco de dados
            JOptionPane.showMessageDialog(null, "Galeria cadastrada com sucesso!");
            //limpa os campos do formulario após cadastro
            txtNomeGaleria.setText("");
            txtCodigoGaleria.setText("");
            txtEndereço.setText("");
            txtTelefone.setText("");
            
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeGaleriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeGaleriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeGaleriaActionPerformed

    private void txtCodigoGaleriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoGaleriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoGaleriaActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Galeria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblCodigoGaleria;
    private javax.swing.JLabel lblEndereço;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtCodigoGaleria;
    private javax.swing.JTextField txtEndereço;
    private javax.swing.JTextField txtNomeGaleria;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
