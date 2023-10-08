package View;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Cadastro_Obras extends javax.swing.JFrame {

    private File selectedImageFile;
    
    public Cadastro_Obras() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeObra = new javax.swing.JLabel();
        txtNomeObra = new javax.swing.JTextField();
        lblCodObra = new javax.swing.JLabel();
        txtCodObra = new javax.swing.JTextField();
        lblArtista = new javax.swing.JLabel();
        txtArtista = new javax.swing.JTextField();
        lblExposta = new javax.swing.JLabel();
        txtExposta = new javax.swing.JTextField();
        lblEntrada = new javax.swing.JLabel();
        txtEntrada = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnSalvarIMG = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        btnInsiraIMG = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Obras");
        getContentPane().setLayout(null);

        lblNomeObra.setText("Nome:");
        getContentPane().add(lblNomeObra);
        lblNomeObra.setBounds(29, 40, 108, 31);

        txtNomeObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeObraActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeObra);
        txtNomeObra.setBounds(143, 40, 314, 31);

        lblCodObra.setText("Código da Obra:");
        getContentPane().add(lblCodObra);
        lblCodObra.setBounds(29, 83, 108, 31);

        txtCodObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodObraActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodObra);
        txtCodObra.setBounds(143, 83, 314, 31);

        lblArtista.setText("Criador:");
        getContentPane().add(lblArtista);
        lblArtista.setBounds(29, 126, 108, 31);

        txtArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArtistaActionPerformed(evt);
            }
        });
        getContentPane().add(txtArtista);
        txtArtista.setBounds(143, 126, 314, 31);

        lblExposta.setText("Exposta em:");
        getContentPane().add(lblExposta);
        lblExposta.setBounds(30, 170, 108, 31);

        txtExposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpostaActionPerformed(evt);
            }
        });
        getContentPane().add(txtExposta);
        txtExposta.setBounds(140, 170, 314, 31);

        lblEntrada.setText("Entrada da Obra:");
        getContentPane().add(lblEntrada);
        lblEntrada.setBounds(30, 210, 108, 31);

        txtEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(txtEntrada);
        txtEntrada.setBounds(140, 210, 314, 31);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(143, 291, 111, 38);

        btnSalvarIMG.setText("Salvar Imagem");
        btnSalvarIMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarIMGActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarIMG);
        btnSalvarIMG.setBounds(840, 360, 140, 40);

        lblImagem.setText("Insira uma Imagem");
        getContentPane().add(lblImagem);
        lblImagem.setBounds(650, 20, 400, 320);

        btnInsiraIMG.setText("Insira uma Imagem");
        btnInsiraIMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsiraIMGActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsiraIMG);
        btnInsiraIMG.setBounds(680, 360, 140, 40);

        setSize(new java.awt.Dimension(1096, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeObraActionPerformed

    private void txtCodObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodObraActionPerformed

    private void txtArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArtistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArtistaActionPerformed

    private void txtExpostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpostaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpostaActionPerformed

    private void txtEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntradaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/art_gallery", "root", "18ws1098");
            PreparedStatement st = conectar.prepareStatement("INSERT INTO obras Values(?,?,?,?,?)");
            st.setString(1, txtNomeObra.getText());
            st.setInt(2, Integer.parseInt(txtCodObra.getText()));
            st.setString(3, txtArtista.getText());
            st.setString(4, txtExposta.getText());
            st.setString(5, txtEntrada.getText());
            st.executeUpdate();//executa a atualização no banco de dados
            JOptionPane.showMessageDialog(null, "Artista cadastrado(a) com sucesso!");
            //limpa os campos do formulario após cadastro
            txtNomeObra.setText("");
            txtCodObra.setText("");
            txtArtista.setText("");
            txtExposta.setText("");
            txtEntrada.setText("");

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnSalvarIMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarIMGActionPerformed
                try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/art_gallery", "root", "18ws1098");
            PreparedStatement st = conectar.prepareStatement("INSERT INTO obras (imagem) VALUES (?)");
                    String selectedFile = null;
            FileInputStream fis = new FileInputStream(selectedFile);
            st.setBinaryStream(6, fis);
            st.executeUpdate();//executa a atualização no banco de dados
            JOptionPane.showMessageDialog(null, "Imagem salva com sucesso!");

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cadastro_Obras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                            

    private void btnInsiraIMGActionPerformed() {                                             
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            lblImagem.setIcon(new ImageIcon(selectedFile.getAbsolutePath()));
        }

    }//GEN-LAST:event_btnSalvarIMGActionPerformed

    private void btnInsiraIMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsiraIMGActionPerformed
        
                JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
            lblImagem.setIcon(new ImageIcon(selectedFile.getAbsolutePath()));
        }
           
    }//GEN-LAST:event_btnInsiraIMGActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_Obras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Obras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Obras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Obras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Obras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnInsiraIMG;
    private javax.swing.JButton btnSalvarIMG;
    private javax.swing.JLabel lblArtista;
    private javax.swing.JLabel lblCodObra;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblExposta;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblNomeObra;
    private javax.swing.JTextField txtArtista;
    private javax.swing.JTextField txtCodObra;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextField txtExposta;
    private javax.swing.JTextField txtNomeObra;
    // End of variables declaration//GEN-END:variables

    private void salvarImagem(File selectedFile) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
