
package telas;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
//import javax.swing.event.ListSelectionEvent;
//import javax.swing.event.ListSelectionListener;
import trabalhofinal.Cardapio;
//import classes.CardapioInfo;
//

public class TelaCardapio extends javax.swing.JFrame {

    private DefaultListModel<String> cardapioListModel;
    private List<Cardapio> cardapios;
    //private List<CardapioInfo> cardapioInfoList;

    
    
    
    public TelaCardapio() {
        initComponents();
        cardapioListModel = new DefaultListModel<>();
       //listaCardapio = new JList<>(cardapioListModel);
        //jScrollPane3.setViewportView(listaCardapio);
        
        listaCardapio.setModel(cardapioListModel);

        cardapios = new ArrayList<>();
        //cardapioInfoList = new ArrayList<>();
         
       
        
        // Adicione um ListSelectionListener à lista de cardápios
       /* listaCardapio.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedIndex = listaCardapio.getSelectedIndex();
                    if (selectedIndex != -1) {
                        atualizarTabela(cardapios.get(selectedIndex));
                    }
                }
            }
        });*/
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCardapio = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaCardapio = new javax.swing.JList<>();
        btnAdicionarCardapio = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        txtNomeCardapio = new javax.swing.JTextField();
        btnExcluirCardapio = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de cardapios");

        pnlCardapio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cardapios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell", 1, 15))); // NOI18N

        jScrollPane3.setViewportView(listaCardapio);

        btnAdicionarCardapio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionarCardapio3.png"))); // NOI18N
        btnAdicionarCardapio.setText("Adicionar  Cardapio");
        btnAdicionarCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCardapioActionPerformed(evt);
            }
        });

        lblNome.setText("Nome:");

        txtNomeCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCardapioActionPerformed(evt);
            }
        });

        btnExcluirCardapio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluirCardapio.png"))); // NOI18N
        btnExcluirCardapio.setText("Excluir Cardapio");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrar.png"))); // NOI18N
        jButton1.setText("Cadastrar itens");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCardapioLayout = new javax.swing.GroupLayout(pnlCardapio);
        pnlCardapio.setLayout(pnlCardapioLayout);
        pnlCardapioLayout.setHorizontalGroup(
            pnlCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardapioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNome)
                .addGap(18, 18, 18)
                .addGroup(pnlCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(btnExcluirCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(btnAdicionarCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(txtNomeCardapio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCardapioLayout.setVerticalGroup(
            pnlCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardapioLayout.createSequentialGroup()
                .addGroup(pnlCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCardapioLayout.createSequentialGroup()
                        .addGroup(pnlCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionarCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnExcluirCardapio)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCardapioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(pnlCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pnlCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCardapioActionPerformed

        /*String nomeCardapio = txtNomeCardapio.getText();
                if (!nomeCardapio.isEmpty()) {
                    cardapioListModel.addElement(nomeCardapio);
                    // Aqui você pode criar uma instância de um objeto Cardapio com o nome e fazer a gestão.
                    txtNomeCardapio.setText(""); // Limpa o campo após adicionar.*/
                                                      
        String nomeCardapio = txtNomeCardapio.getText();
        if (!nomeCardapio.isEmpty()) {
            Cardapio cardapio = new Cardapio(nomeCardapio);
            cardapios.add(cardapio);

            // Crie uma lista de informações do cardápio para o novo cardápio
            //List<CardapioInfo> novoCardapioInfoList = new ArrayList<>();
            //cardapio.setCardapioInfoList(novoCardapioInfoList);

            cardapioListModel.addElement(nomeCardapio);
            txtNomeCardapio.setText("");
    }

    }//GEN-LAST:event_btnAdicionarCardapioActionPerformed

    private void txtNomeCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCardapioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCardapioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

   /*private void atualizarTabela(Cardapio cardapio) {
        tabelaModel.setRowCount(0); // Limpa a tabela

        if (cardapio != null) {
            for (CardapioInfo cardapioInfo : cardapio.getCardapioInfoList()) {
                tabelaModel.addRow(new Object[]{cardapioInfo.getNomeItem(), cardapioInfo.getReceita()});
        }
    }
}
*/

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
            java.util.logging.Logger.getLogger(TelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCardapio().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCardapio;
    private javax.swing.JButton btnExcluirCardapio;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblNome;
    private javax.swing.JList<String> listaCardapio;
    private javax.swing.JPanel pnlCardapio;
    private javax.swing.JTextField txtNomeCardapio;
    // End of variables declaration//GEN-END:variables
}
