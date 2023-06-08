package Alfaiataria;

public class Fornecedor extends javax.swing.JFrame {

    public Fornecedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Pesquisar = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        Pesquisar.setBackground(new java.awt.Color(0,0,0,0));
        Pesquisar.setForeground(new java.awt.Color(139, 64, 13));
        Pesquisar.setIcon(new javax.swing.ImageIcon("C:\\Users\\afons\\Documents\\NetBeansProjects\\Alfaiatari\\Imagens\\Pesquisar-removebg-preview (1).png")); // NOI18N
        Pesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(Pesquisar);
        Pesquisar.setBounds(80, 160, 130, 40);

        Cadastrar.setBackground(new java.awt.Color(0,0,0,0));
        Cadastrar.setForeground(new java.awt.Color(139, 64, 13));
        Cadastrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\afons\\Documents\\NetBeansProjects\\Alfaiatari\\Imagens\\Cadastrar-removebg-preview.png")); // NOI18N
        Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(Cadastrar);
        Cadastrar.setBounds(80, 70, 130, 40);

        Voltar.setBackground(new java.awt.Color(0,0,0,0));
        Voltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\afons\\Documents\\NetBeansProjects\\Alfaiatari\\Imagens\\Voltar-removebg-preview (1).png")); // NOI18N
        Voltar.setBorder(null);
        Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        jPanel1.add(Voltar);
        Voltar.setBounds(10, 10, 70, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        dispose();
        new PesqFornecedor().setVisible(true);
    }//GEN-LAST:event_PesquisarActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        dispose();
        new CadFornecedor().setVisible(true);
    }//GEN-LAST:event_CadastrarActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
        new Principal().setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JButton Voltar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
