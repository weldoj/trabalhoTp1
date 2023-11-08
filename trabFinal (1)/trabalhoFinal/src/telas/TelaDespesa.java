/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Caio Martins
 */
public class TelaDespesa extends javax.swing.JFrame {

    /**
     * Creates new form TelaDespesa
     */
    public TelaDespesa() {
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

        pnlDespesa = new javax.swing.JPanel();
        lblValorDespesa = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblDescricaoDespesa = new javax.swing.JLabel();
        entValorDespesa = new javax.swing.JTextField();
        entDataDespesa = new javax.swing.JTextField();
        bntNovoDespesa = new javax.swing.JButton();
        bntSalvarDespesa = new javax.swing.JButton();
        bntCancelarDespesa = new javax.swing.JButton();
        bntEditarDespesa = new javax.swing.JButton();
        bntExcluirDespesa = new javax.swing.JButton();
        scrDescricaoDespesa = new javax.swing.JScrollPane();
        entDescricaoDespesa = new javax.swing.JTextArea();
        scrDespesa = new javax.swing.JScrollPane();
        tblDespesa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlDespesa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Despesa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell", 1, 15))); // NOI18N

        lblValorDespesa.setText("Valor:");

        lblData.setText("Data:");

        lblDescricaoDespesa.setText("Descriçao:");

        entValorDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entValorDespesaActionPerformed(evt);
            }
        });

        bntNovoDespesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/plus_circle_new_create_icon_145948.png"))); // NOI18N
        bntNovoDespesa.setText("Novo");
        bntNovoDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNovoDespesaActionPerformed(evt);
            }
        });

        bntSalvarDespesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/4213410-arrow-down-download-move-save_115410.png"))); // NOI18N
        bntSalvarDespesa.setText("Salvar");
        bntSalvarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarDespesaActionPerformed(evt);
            }
        });

        bntCancelarDespesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/4115230-cancel-close-cross-delete_114048.png"))); // NOI18N
        bntCancelarDespesa.setText("Cancelar");
        bntCancelarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarDespesaActionPerformed(evt);
            }
        });

        bntEditarDespesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit_modify_icon-icons.com_49882.png"))); // NOI18N
        bntEditarDespesa.setText("Editar");
        bntEditarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEditarDespesaActionPerformed(evt);
            }
        });

        bntExcluirDespesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/4115230-cancel-close-cross-delete_114048.png"))); // NOI18N
        bntExcluirDespesa.setText("Excluir");
        bntExcluirDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirDespesaActionPerformed(evt);
            }
        });

        entDescricaoDespesa.setColumns(20);
        entDescricaoDespesa.setRows(5);
        scrDescricaoDespesa.setViewportView(entDescricaoDespesa);

        javax.swing.GroupLayout pnlDespesaLayout = new javax.swing.GroupLayout(pnlDespesa);
        pnlDespesa.setLayout(pnlDespesaLayout);
        pnlDespesaLayout.setHorizontalGroup(
            pnlDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorDespesa)
                    .addComponent(lblData)
                    .addComponent(lblDescricaoDespesa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(entValorDespesa, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(entDataDespesa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrDescricaoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDespesaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnlDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntNovoDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntEditarDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bntExcluirDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntCancelarDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(bntSalvarDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDespesaLayout.setVerticalGroup(
            pnlDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDespesaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDespesaLayout.createSequentialGroup()
                        .addGroup(pnlDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDespesaLayout.createSequentialGroup()
                                .addGroup(pnlDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bntCancelarDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlDespesaLayout.createSequentialGroup()
                                        .addComponent(lblValorDespesa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblData)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bntExcluirDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDescricaoDespesa)))
                            .addGroup(pnlDespesaLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(bntNovoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bntEditarDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(bntSalvarDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(pnlDespesaLayout.createSequentialGroup()
                        .addComponent(entValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entDataDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrDescricaoDespesa)
                        .addGap(12, 12, 12))))
        );

        tblDespesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Valor", "Data", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDespesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDespesaMouseClicked(evt);
            }
        });
        scrDespesa.setViewportView(tblDespesa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrDespesa)
                    .addComponent(pnlDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entValorDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entValorDespesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entValorDespesaActionPerformed

    private void bntNovoDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNovoDespesaActionPerformed

    }//GEN-LAST:event_bntNovoDespesaActionPerformed

    private void bntSalvarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarDespesaActionPerformed

    }//GEN-LAST:event_bntSalvarDespesaActionPerformed

    private void bntCancelarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarDespesaActionPerformed

    }//GEN-LAST:event_bntCancelarDespesaActionPerformed

    private void bntEditarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEditarDespesaActionPerformed

    }//GEN-LAST:event_bntEditarDespesaActionPerformed

    private void bntExcluirDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirDespesaActionPerformed

    }//GEN-LAST:event_bntExcluirDespesaActionPerformed

    private void tblDespesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDespesaMouseClicked

    }//GEN-LAST:event_tblDespesaMouseClicked

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
            java.util.logging.Logger.getLogger(TelaDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDespesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancelarDespesa;
    private javax.swing.JButton bntEditarDespesa;
    private javax.swing.JButton bntExcluirDespesa;
    private javax.swing.JButton bntNovoDespesa;
    private javax.swing.JButton bntSalvarDespesa;
    private javax.swing.JTextField entDataDespesa;
    private javax.swing.JTextArea entDescricaoDespesa;
    private javax.swing.JTextField entValorDespesa;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDescricaoDespesa;
    private javax.swing.JLabel lblValorDespesa;
    private javax.swing.JPanel pnlDespesa;
    private javax.swing.JScrollPane scrDescricaoDespesa;
    private javax.swing.JScrollPane scrDespesa;
    private javax.swing.JTable tblDespesa;
    // End of variables declaration//GEN-END:variables
}
