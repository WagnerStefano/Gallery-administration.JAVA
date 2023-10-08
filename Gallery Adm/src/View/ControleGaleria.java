
package View;


public class ControleGaleria extends javax.swing.JFrame {


    public ControleGaleria() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuObras = new javax.swing.JMenu();
        itmObrasCadastradas = new javax.swing.JMenuItem();
        itemAcervo = new javax.swing.JMenuItem();
        mnuFuncionarios = new javax.swing.JMenu();
        itmCadastrarFuncionarios = new javax.swing.JMenuItem();
        itmRelatorioFuncionarios = new javax.swing.JMenuItem();
        mnuArtistas = new javax.swing.JMenu();
        itmCadastrarArtista = new javax.swing.JMenuItem();
        itmConsultarArtista = new javax.swing.JMenuItem();
        mnuGalerias = new javax.swing.JMenu();
        itmCadastrarGalerias = new javax.swing.JMenuItem();
        itmGaleriasCadastradas = new javax.swing.JMenuItem();
        itmRelatorioDeGaleria = new javax.swing.JMenuItem();
        mnuDepartamentos = new javax.swing.JMenu();
        itmCadastrarDPTO = new javax.swing.JMenuItem();
        itmRelatorioDPTO = new javax.swing.JMenuItem();

        setTitle("Controle de Obras");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        mnuObras.setText("Obras");

        itmObrasCadastradas.setText("Obras cadastradas");
        itmObrasCadastradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmObrasCadastradasActionPerformed(evt);
            }
        });
        mnuObras.add(itmObrasCadastradas);

        itemAcervo.setText("Acervo");
        mnuObras.add(itemAcervo);

        jMenuBar1.add(mnuObras);

        mnuFuncionarios.setText("Funcionários");

        itmCadastrarFuncionarios.setText("Cadastrar Funcionário");
        itmCadastrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmCadastrarFuncionarios);

        itmRelatorioFuncionarios.setText("Relatório de Funcionários");
        mnuFuncionarios.add(itmRelatorioFuncionarios);

        jMenuBar1.add(mnuFuncionarios);

        mnuArtistas.setText("Artistas");

        itmCadastrarArtista.setText("Cadastrar Artista");
        itmCadastrarArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarArtistaActionPerformed(evt);
            }
        });
        mnuArtistas.add(itmCadastrarArtista);

        itmConsultarArtista.setText("Consultar Artistas");
        mnuArtistas.add(itmConsultarArtista);

        jMenuBar1.add(mnuArtistas);

        mnuGalerias.setText("Galerias");

        itmCadastrarGalerias.setText("Cadastrar Galerias");
        itmCadastrarGalerias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarGaleriasActionPerformed(evt);
            }
        });
        mnuGalerias.add(itmCadastrarGalerias);

        itmGaleriasCadastradas.setText("Galerias Cadastradas");
        mnuGalerias.add(itmGaleriasCadastradas);

        itmRelatorioDeGaleria.setText("Relatório de Galerias");
        itmRelatorioDeGaleria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatorioDeGaleriaActionPerformed(evt);
            }
        });
        mnuGalerias.add(itmRelatorioDeGaleria);

        jMenuBar1.add(mnuGalerias);

        mnuDepartamentos.setText("Departamentos");

        itmCadastrarDPTO.setText("Cadastrar Departamento");
        itmCadastrarDPTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarDPTOActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmCadastrarDPTO);

        itmRelatorioDPTO.setText("Relatorio Departamento");
        mnuDepartamentos.add(itmRelatorioDPTO);

        jMenuBar1.add(mnuDepartamentos);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(788, 416));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmObrasCadastradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmObrasCadastradasActionPerformed
        new Cadastro_Obras().setVisible(true);
    }//GEN-LAST:event_itmObrasCadastradasActionPerformed

    private void itmCadastrarGaleriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarGaleriasActionPerformed
        new Cadastro_Galeria().setVisible(true);
    }//GEN-LAST:event_itmCadastrarGaleriasActionPerformed

    private void itmRelatorioDeGaleriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatorioDeGaleriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmRelatorioDeGaleriaActionPerformed

    private void itmCadastrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarFuncionariosActionPerformed
        new Cadastro_Funcionario().setVisible(true);
    }//GEN-LAST:event_itmCadastrarFuncionariosActionPerformed

    private void itmCadastrarArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarArtistaActionPerformed
        new Cadastro_Artista().setVisible(true);
    }//GEN-LAST:event_itmCadastrarArtistaActionPerformed

    private void itmCadastrarDPTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarDPTOActionPerformed
        new Cadastro_Departamento().setVisible(true);
    }//GEN-LAST:event_itmCadastrarDPTOActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            
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
                new ControleGaleria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAcervo;
    private javax.swing.JMenuItem itmCadastrarArtista;
    private javax.swing.JMenuItem itmCadastrarDPTO;
    private javax.swing.JMenuItem itmCadastrarFuncionarios;
    private javax.swing.JMenuItem itmCadastrarGalerias;
    private javax.swing.JMenuItem itmConsultarArtista;
    private javax.swing.JMenuItem itmGaleriasCadastradas;
    private javax.swing.JMenuItem itmObrasCadastradas;
    private javax.swing.JMenuItem itmRelatorioDPTO;
    private javax.swing.JMenuItem itmRelatorioDeGaleria;
    private javax.swing.JMenuItem itmRelatorioFuncionarios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuArtistas;
    private javax.swing.JMenu mnuDepartamentos;
    private javax.swing.JMenu mnuFuncionarios;
    private javax.swing.JMenu mnuGalerias;
    private javax.swing.JMenu mnuObras;
    // End of variables declaration//GEN-END:variables
}
