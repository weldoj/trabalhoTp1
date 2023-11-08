/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Caio Martins
 */
public class TelaItemCardapio extends javax.swing.JFrame {

    /**
     * Creates new form TelaItemCardapio
     */
    public TelaItemCardapio() {
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

        pnlItemCardapio = new javax.swing.JPanel();
        scrItemCardapio = new javax.swing.JScrollPane();
        lstItemCardapio = new javax.swing.JList<>();
        btnAdicionarItemCardapio = new javax.swing.JButton();
        lblValorVendaItemCardapio = new javax.swing.JLabel();
        entNomeItemCardapio = new javax.swing.JTextField();
        btnExcluirItemCardapio = new javax.swing.JToggleButton();
        entValorVendaItemCardapio = new javax.swing.JTextField();
        entValorCustoItemCardapio = new javax.swing.JTextField();
        lblNomeItemCardapio = new javax.swing.JLabel();
        lblValorCustoItemCardapio = new javax.swing.JLabel();
        lblIngredientesItemCardapio = new javax.swing.JLabel();
        entIngredientesItemCardapio = new javax.swing.JTextField();
        lblInfoItemCardapio = new javax.swing.JLabel();
        lblInfo2ItemCardapio = new javax.swing.JLabel();
        btnEditarItemCardapio = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlItemCardapio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Itens do Cardápio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell", 1, 15))); // NOI18N

        scrItemCardapio.setViewportView(lstItemCardapio);

        btnAdicionarItemCardapio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/4213410-arrow-down-download-move-save_115410.png"))); // NOI18N
        btnAdicionarItemCardapio.setText("Adicionar  Item");
        btnAdicionarItemCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarItemCardapioActionPerformed(evt);
            }
        });

        lblValorVendaItemCardapio.setText("Valor de Venda:");

        entNomeItemCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entNomeItemCardapioActionPerformed(evt);
            }
        });

        btnExcluirItemCardapio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/4115230-cancel-close-cross-delete_114048.png"))); // NOI18N
        btnExcluirItemCardapio.setText("Excluir Item");
        btnExcluirItemCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirItemCardapioActionPerformed(evt);
            }
        });

        entValorVendaItemCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entValorVendaItemCardapioActionPerformed(evt);
            }
        });

        entValorCustoItemCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entValorCustoItemCardapioActionPerformed(evt);
            }
        });

        lblNomeItemCardapio.setText("Nome:");

        lblValorCustoItemCardapio.setText("Valor de Custo:");

        lblIngredientesItemCardapio.setText("Ingredientes:");

        entIngredientesItemCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entIngredientesItemCardapioActionPerformed(evt);
            }
        });

        lblInfoItemCardapio.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        lblInfoItemCardapio.setText("(Preencher os ingredientes no seguinte formarto:");

        lblInfo2ItemCardapio.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        lblInfo2ItemCardapio.setText("arroz 1, alho 2, sal 2, frango 1).");

        btnEditarItemCardapio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit_modify_icon-icons.com_49882.png"))); // NOI18N
        btnEditarItemCardapio.setText("Editar Item");
        btnEditarItemCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarItemCardapioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlItemCardapioLayout = new javax.swing.GroupLayout(pnlItemCardapio);
        pnlItemCardapio.setLayout(pnlItemCardapioLayout);
        pnlItemCardapioLayout.setHorizontalGroup(
            pnlItemCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItemCardapioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlItemCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItemCardapioLayout.createSequentialGroup()
                        .addComponent(btnEditarItemCardapio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirItemCardapio))
                    .addGroup(pnlItemCardapioLayout.createSequentialGroup()
                        .addComponent(scrItemCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(pnlItemCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlItemCardapioLayout.createSequentialGroup()
                                .addGroup(pnlItemCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeItemCardapio)
                                    .addComponent(lblValorCustoItemCardapio)
                                    .addComponent(lblValorVendaItemCardapio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlItemCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entValorVendaItemCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(entNomeItemCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(entValorCustoItemCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlItemCardapioLayout.createSequentialGroup()
                                .addComponent(lblIngredientesItemCardapio)
                                .addGap(18, 18, 18)
                                .addGroup(pnlItemCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInfo2ItemCardapio)
                                    .addComponent(lblInfoItemCardapio)
                                    .addComponent(entIngredientesItemCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdicionarItemCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        pnlItemCardapioLayout.setVerticalGroup(
            pnlItemCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItemCardapioLayout.createSequentialGroup()
                .addGroup(pnlItemCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItemCardapioLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(scrItemCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlItemCardapioLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnlItemCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(entNomeItemCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeItemCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlItemCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(entValorCustoItemCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorCustoItemCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlItemCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(entValorVendaItemCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorVendaItemCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlItemCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entIngredientesItemCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIngredientesItemCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoItemCardapio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfo2ItemCardapio)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionarItemCardapio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlItemCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditarItemCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirItemCardapio)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlItemCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlItemCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlItemCardapio.getAccessibleContext().setAccessibleName("Itens do Cardapios");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarItemCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarItemCardapioActionPerformed

    }//GEN-LAST:event_btnAdicionarItemCardapioActionPerformed

    private void entNomeItemCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entNomeItemCardapioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entNomeItemCardapioActionPerformed

    private void btnExcluirItemCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemCardapioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirItemCardapioActionPerformed

    private void entValorVendaItemCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entValorVendaItemCardapioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entValorVendaItemCardapioActionPerformed

    private void entValorCustoItemCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entValorCustoItemCardapioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entValorCustoItemCardapioActionPerformed

    private void entIngredientesItemCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entIngredientesItemCardapioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entIngredientesItemCardapioActionPerformed

    private void btnEditarItemCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarItemCardapioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarItemCardapioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaItemCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaItemCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaItemCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaItemCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaItemCardapio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarItemCardapio;
    private javax.swing.JToggleButton btnEditarItemCardapio;
    private javax.swing.JToggleButton btnExcluirItemCardapio;
    private javax.swing.JTextField entIngredientesItemCardapio;
    private javax.swing.JTextField entNomeItemCardapio;
    private javax.swing.JTextField entValorCustoItemCardapio;
    private javax.swing.JTextField entValorVendaItemCardapio;
    private javax.swing.JLabel lblInfo2ItemCardapio;
    private javax.swing.JLabel lblInfoItemCardapio;
    private javax.swing.JLabel lblIngredientesItemCardapio;
    private javax.swing.JLabel lblNomeItemCardapio;
    private javax.swing.JLabel lblValorCustoItemCardapio;
    private javax.swing.JLabel lblValorVendaItemCardapio;
    private javax.swing.JList<String> lstItemCardapio;
    private javax.swing.JPanel pnlItemCardapio;
    private javax.swing.JScrollPane scrItemCardapio;
    // End of variables declaration//GEN-END:variables
}
