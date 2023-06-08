/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Alfaiataria;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

public class PesqFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form PesqFornecedor
     */
    public PesqFornecedor() {
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

        jPanel2 = new javax.swing.JPanel();
        cod_forn = new javax.swing.JTextField();
        rSocial = new javax.swing.JTextField();
        nFantasia = new javax.swing.JTextField();
        CNPJ = new javax.swing.JTextField();
        Pesquisar = new javax.swing.JButton();
        KeyboardFocusManager.getCurrentKeyboardFocusManager()
        .addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent event) {
                if (event.getID() == KeyEvent.KEY_PRESSED
                    && event.getKeyCode() == KeyEvent.VK_ENTER) {

                    dispose();
                    new Fornecedor().setVisible(true);

                    return true;
                }
                return false;
            }
        });
        Voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        cod_forn.setBackground(new java.awt.Color(0,0,0,0));
        cod_forn.setBorder(null);
        cod_forn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_fornActionPerformed(evt);
            }
        });
        jPanel2.add(cod_forn);
        cod_forn.setBounds(282, 148, 60, 22);

        rSocial.setBackground(new java.awt.Color(0,0,0,0));
        rSocial.setBorder(null);
        jPanel2.add(rSocial);
        rSocial.setBounds(280, 180, 240, 15);

        nFantasia.setBackground(new java.awt.Color(0,0,0,0));
        nFantasia.setBorder(null);
        jPanel2.add(nFantasia);
        nFantasia.setBounds(280, 210, 240, 15);

        CNPJ.setBackground(new java.awt.Color(0,0,0,0));
        CNPJ.setBorder(null);
        jPanel2.add(CNPJ);
        CNPJ.setBounds(280, 240, 240, 30);

        Pesquisar.setBackground(new java.awt.Color(0,0,0,0));
        Pesquisar.setForeground(new java.awt.Color(139, 64, 13));
        Pesquisar.setIcon(new javax.swing.ImageIcon("C:\\Users\\afons\\Documents\\NetBeansProjects\\Alfaiatari\\Imagens\\Pesquisar-removebg-preview (1).png")); // NOI18N
        Pesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(Pesquisar);
        Pesquisar.setBounds(260, 330, 130, 40);

        Voltar.setBackground(new java.awt.Color(0,0,0,0));
        Voltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\afons\\Documents\\NetBeansProjects\\Alfaiatari\\Imagens\\Voltar-removebg-preview (1).png")); // NOI18N
        Voltar.setBorder(null);
        Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        jPanel2.add(Voltar);
        Voltar.setBounds(20, 30, 70, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\afons\\Documents\\NetBeansProjects\\Alfaiatari\\Imagens\\Tela Pesquisa Fornecedor.png")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(-3, -4, 810, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        new Funcionário1().setVisible(true);
        dispose();
    }//GEN-LAST:event_PesquisarActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
        new Funcionário1().setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

    private void cod_fornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_fornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_fornActionPerformed

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
            java.util.logging.Logger.getLogger(PesqFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesqFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesqFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesqFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PesqFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CNPJ;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JButton Voltar;
    private javax.swing.JTextField cod_forn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nFantasia;
    private javax.swing.JTextField rSocial;
    // End of variables declaration//GEN-END:variables
}