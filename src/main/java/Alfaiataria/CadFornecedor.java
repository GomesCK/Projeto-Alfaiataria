package Alfaiataria;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

public class CadFornecedor extends javax.swing.JFrame {



    public CadFornecedor() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        nFantasia = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        save = new javax.swing.JButton();
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
        rSocial = new javax.swing.JTextField();
        CNPJ = new javax.swing.JTextField();
        enderecoF1 = new javax.swing.JTextField();
        cod = new javax.swing.JTextField();
        CNPJ1 = new javax.swing.JTextField();
        Voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(lista);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 55));
        jPanel1.setLayout(null);

        nFantasia.setBackground(new java.awt.Color(0,0,0,0));
        nFantasia.setBorder(null);
        nFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nFantasiaActionPerformed(evt);
            }
        });
        jPanel1.add(nFantasia);
        nFantasia.setBounds(330, 180, 230, 30);

        email.setBackground(new java.awt.Color(0,0,0,0));
        email.setBorder(null);
        jPanel1.add(email);
        email.setBounds(230, 270, 330, 30);

        save.setBackground(new java.awt.Color(0,0,0,0));
        save.setForeground(new java.awt.Color(139, 64, 13));
        save.setIcon(new javax.swing.ImageIcon("C:\\Users\\afons\\Documents\\NetBeansProjects\\Alfaiatari\\Imagens\\Cadastrar-removebg-preview.png")); // NOI18N
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save);
        save.setBounds(320, 480, 140, 40);

        rSocial.setBackground(new java.awt.Color(0,0,0,0));
        rSocial.setBorder(null);
        jPanel1.add(rSocial);
        rSocial.setBounds(330, 130, 230, 30);

        CNPJ.setBackground(new java.awt.Color(0,0,0,0));
        CNPJ.setBorder(null);
        jPanel1.add(CNPJ);
        CNPJ.setBounds(330, 230, 110, 19);

        enderecoF1.setBackground(new java.awt.Color(0,0,0,0));
        enderecoF1.setBorder(null);
        enderecoF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoF1ActionPerformed(evt);
            }
        });
        jPanel1.add(enderecoF1);
        enderecoF1.setBounds(230, 320, 330, 30);

        cod.setBackground(new java.awt.Color(0,0,0,0));
        cod.setBorder(null);
        jPanel1.add(cod);
        cod.setBounds(230, 130, 90, 30);

        CNPJ1.setBackground(new java.awt.Color(0,0,0,0));
        CNPJ1.setBorder(null);
        jPanel1.add(CNPJ1);
        CNPJ1.setBounds(450, 230, 110, 20);

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
        Voltar.setBounds(20, 20, 70, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\afons\\Documents\\NetBeansProjects\\Alfaiatari\\Imagens\\Cadastro Fornecedor.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-3, -4, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        dispose();
        new Fornecedor().setVisible(true);
    }//GEN-LAST:event_saveActionPerformed

    private void nFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nFantasiaActionPerformed

    private void enderecoF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoF1ActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
        new Fornecedor().setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(CadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new CadFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CNPJ;
    private javax.swing.JTextField CNPJ1;
    private javax.swing.JButton Voltar;
    private javax.swing.JTextField cod;
    private javax.swing.JTextField email;
    private javax.swing.JTextField enderecoF1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private javax.swing.JTextField nFantasia;
    private javax.swing.JTextField rSocial;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
