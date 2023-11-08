
package telas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trabalhofinal.Estoque;




public class TelaEstoque extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    
    static ArrayList<Estoque> listaDeProdutos;
    
    private String tipoAlimentoSelecionado = "";
    
    
    public TelaEstoque() {
        initComponents();
        tableModel = (DefaultTableModel) tabela.getModel();
        
        
       listaDeProdutos = new ArrayList();
       
       txtNome.setEnabled(false);
       txtCodigo.setEnabled(false);
       txtCusto.setEnabled(false);
       txtQuantidade.setEnabled(false);
       txtUnidade.setEnabled(false);
       txtValidade.setEnabled(false);
       
       btnCarnes.setEnabled(false);
       btnBebidas.setEnabled(false);
       btnGraoseCereais.setEnabled(false);
       btnProdutosDePadaria.setEnabled(false);
       btnProdutosLacteos.setEnabled(false);
       btnVegetais.setEnabled(false);
       
       
       
        
       }
    public void carregarTabelaProdutos(String tipoAlimento) {
        tableModel.setRowCount(0); // Limpa a tabela

    for (Estoque produto : listaDeProdutos) {
        if (produto.getTipo().equals(tipoAlimento)) {
            tableModel.addRow(new Object[]{
                produto.getCodigo(),
                produto.getNomeProduto(),
                produto.getQuantidade(),
                produto.getUnidade(),
                produto.getValidade(),
                produto.getCusto()
            });
        }
    }
}
    
    
        
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnlTiposDeAlimento = new javax.swing.JPanel();
        btnCarnes = new javax.swing.JButton();
        btnProdutosLacteos = new javax.swing.JButton();
        btnVegetais = new javax.swing.JButton();
        btnGraoseCereais = new javax.swing.JButton();
        btnBebidas = new javax.swing.JButton();
        btnProdutosDePadaria = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtUnidade = new javax.swing.JTextField();
        txtValidade = new javax.swing.JTextField();
        txtCusto = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jButton6.setText("jButton6");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de estoques");

        pnlTiposDeAlimento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipos de Alimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell", 1, 15))); // NOI18N

        btnCarnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carnes.png"))); // NOI18N
        btnCarnes.setText("Carnes");
        btnCarnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarnesActionPerformed(evt);
            }
        });

        btnProdutosLacteos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/queijo.png"))); // NOI18N
        btnProdutosLacteos.setText("Produtos Lácteos");
        btnProdutosLacteos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosLacteosActionPerformed(evt);
            }
        });

        btnVegetais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vegetais.png"))); // NOI18N
        btnVegetais.setText("Vegetais");
        btnVegetais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVegetaisActionPerformed(evt);
            }
        });

        btnGraoseCereais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graosCereais.png"))); // NOI18N
        btnGraoseCereais.setText("Grãos e Cereais");
        btnGraoseCereais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraoseCereaisActionPerformed(evt);
            }
        });

        btnBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bebidas.png"))); // NOI18N
        btnBebidas.setText("Bebidas");
        btnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasActionPerformed(evt);
            }
        });

        btnProdutosDePadaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pao.png"))); // NOI18N
        btnProdutosDePadaria.setText("Produtos de Padaria");
        btnProdutosDePadaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosDePadariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTiposDeAlimentoLayout = new javax.swing.GroupLayout(pnlTiposDeAlimento);
        pnlTiposDeAlimento.setLayout(pnlTiposDeAlimentoLayout);
        pnlTiposDeAlimentoLayout.setHorizontalGroup(
            pnlTiposDeAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTiposDeAlimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTiposDeAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCarnes)
                    .addComponent(btnGraoseCereais))
                .addGap(154, 154, 154)
                .addGroup(pnlTiposDeAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlTiposDeAlimentoLayout.createSequentialGroup()
                        .addComponent(btnProdutosDePadaria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBebidas))
                    .addGroup(pnlTiposDeAlimentoLayout.createSequentialGroup()
                        .addComponent(btnProdutosLacteos)
                        .addGap(172, 172, 172)
                        .addComponent(btnVegetais)))
                .addContainerGap())
        );
        pnlTiposDeAlimentoLayout.setVerticalGroup(
            pnlTiposDeAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTiposDeAlimentoLayout.createSequentialGroup()
                .addGroup(pnlTiposDeAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTiposDeAlimentoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnCarnes))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTiposDeAlimentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlTiposDeAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnProdutosLacteos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVegetais))))
                .addGroup(pnlTiposDeAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTiposDeAlimentoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBebidas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTiposDeAlimentoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(pnlTiposDeAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGraoseCereais)
                            .addComponent(btnProdutosDePadaria))
                        .addGap(19, 19, 19))))
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Quantidade", "Unidade", "Validade", "Custo"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setPreferredWidth(5);
            tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(5);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(10);
            tabela.getColumnModel().getColumn(4).setPreferredWidth(20);
            tabela.getColumnModel().getColumn(5).setPreferredWidth(7);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Item Estoque ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell", 1, 15))); // NOI18N

        jLabel1.setText("Nome:");

        jLabel2.setText("Quantidade:");

        jLabel3.setText("Unidade:");

        jLabel4.setText("Validade:");

        jLabel5.setText("Custo:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        txtUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadeActionPerformed(evt);
            }
        });

        txtCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel6.setText("Codigo:");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar)
                        .addGap(224, 224, 224))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/EditarPa.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar32.png"))); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelarP.png"))); // NOI18N
        btnCancelar.setText("cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnAdicionar)
                .addGap(31, 31, 31)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTiposDeAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlTiposDeAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVegetaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVegetaisActionPerformed
        //carregarDadosTabelaVegetais();
        tipoAlimentoSelecionado = "Vegetais";
        carregarTabelaProdutos(tipoAlimentoSelecionado);
        
        txtNome.setEnabled(true);
        txtCodigo.setEnabled(true);
        txtCusto.setEnabled(true);
        txtQuantidade.setEnabled(true);
        txtUnidade.setEnabled(true);
        txtValidade.setEnabled(true);
        
        //Limpar os campos
        txtNome.setText("");
        txtUnidade.setText("");
        txtQuantidade.setText("");
        txtValidade.setText("");
        txtCusto.setText("");
        txtCodigo.setText("");
        
    }//GEN-LAST:event_btnVegetaisActionPerformed

    private void btnGraoseCereaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraoseCereaisActionPerformed
        //carregarDadosTabelaGraosCereais();
        tipoAlimentoSelecionado = "GraoseCereais";
        carregarTabelaProdutos(tipoAlimentoSelecionado);
        
        txtNome.setEnabled(true);
        txtCodigo.setEnabled(true);
        txtCusto.setEnabled(true);
        txtQuantidade.setEnabled(true);
        txtUnidade.setEnabled(true);
        txtValidade.setEnabled(true);
        
        //Limpar os campos
        txtNome.setText("");
        txtUnidade.setText("");
        txtQuantidade.setText("");
        txtValidade.setText("");
        txtCusto.setText("");
        txtCodigo.setText("");
        
    }//GEN-LAST:event_btnGraoseCereaisActionPerformed

    private void btnCarnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarnesActionPerformed
        //carregarDadosTabelaCarnes();
        tipoAlimentoSelecionado = "Carnes";
        carregarTabelaProdutos(tipoAlimentoSelecionado);
        
        txtNome.setEnabled(true);
        txtCodigo.setEnabled(true);
        txtCusto.setEnabled(true);
        txtQuantidade.setEnabled(true);
        txtUnidade.setEnabled(true);
        txtValidade.setEnabled(true);
        
        //Limpar os campos
        txtNome.setText("");
        txtUnidade.setText("");
        txtQuantidade.setText("");
        txtValidade.setText("");
        txtCusto.setText("");
        txtCodigo.setText("");
    }//GEN-LAST:event_btnCarnesActionPerformed

    private void btnProdutosLacteosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosLacteosActionPerformed
        //carregarDadosTabelaProdutosLacteos();
        tipoAlimentoSelecionado = "ProdutosLacteos";
        carregarTabelaProdutos(tipoAlimentoSelecionado);
        
        txtNome.setEnabled(true);
        txtCodigo.setEnabled(true);
        txtCusto.setEnabled(true);
        txtQuantidade.setEnabled(true);
        txtUnidade.setEnabled(true);
        txtValidade.setEnabled(true);
        
        //Limpar os campos
        txtNome.setText("");
        txtUnidade.setText("");
        txtQuantidade.setText("");
        txtValidade.setText("");
        txtCusto.setText("");
        txtCodigo.setText("");
    }//GEN-LAST:event_btnProdutosLacteosActionPerformed

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed
        //carregarDadosTabelaBebidas();
        tipoAlimentoSelecionado = "Bebidas";
        carregarTabelaProdutos(tipoAlimentoSelecionado);
        
        txtNome.setEnabled(true);
        txtCodigo.setEnabled(true);
        txtCusto.setEnabled(true);
        txtQuantidade.setEnabled(true);
        txtUnidade.setEnabled(true);
        txtValidade.setEnabled(true);
        
        //Limpar os campos
        txtNome.setText("");
        txtUnidade.setText("");
        txtQuantidade.setText("");
        txtValidade.setText("");
        txtCusto.setText("");
        txtCodigo.setText("");
        
    }//GEN-LAST:event_btnBebidasActionPerformed

    private void btnProdutosDePadariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosDePadariaActionPerformed
        //carregarDadosTabelaProdutosPadaria();
        tipoAlimentoSelecionado = "ProdutosDePadaria";
        carregarTabelaProdutos(tipoAlimentoSelecionado);
        
        txtNome.setEnabled(true);
        txtCodigo.setEnabled(true);
        txtCusto.setEnabled(true);
        txtQuantidade.setEnabled(true);
        txtUnidade.setEnabled(true);
        txtValidade.setEnabled(true);
        
        //Limpar os campos
        txtNome.setText("");
        txtUnidade.setText("");
        txtQuantidade.setText("");
        txtValidade.setText("");
        txtCusto.setText("");
        txtCodigo.setText("");
    }//GEN-LAST:event_btnProdutosDePadariaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void txtUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadeActionPerformed

    private void txtCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        if (txtCodigo.getText().equals("") ||txtNome.getText().equals("") || txtUnidade.getText().equals("") || txtQuantidade.getText().equals("") || txtCusto.getText().equals("") || txtValidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser inseridos", "Messagem", JOptionPane.PLAIN_MESSAGE);
        }
        else {
        
            String nome = txtNome.getText();
            String unidade = txtUnidade.getText();
            int quantidade = Integer.parseInt(txtQuantidade.getText());
            String validade = txtValidade.getText();
            double custo = Double.parseDouble(txtCusto.getText());
            int codigo = Integer.parseInt(txtCodigo.getText());
            
            
            // Adicionar o código para criar e definir o tipo de alimento aqui
            String tipoAlimentoSelecionado = obterTipoAlimentoSelecionado(); // Você precisará criar essa função


            Estoque estoque = new Estoque(codigo, nome, quantidade, unidade,  validade, custo);
            listaDeProdutos.add(estoque);
            
            JOptionPane.showMessageDialog(null, "Item adicinado com sucesso", "Messagem", JOptionPane.INFORMATION_MESSAGE);
            estoque.setTipo(tipoAlimentoSelecionado);
            
            

            //carregar

            carregarTabelaProdutos(tipoAlimentoSelecionado); 
            
            //Limpar os campos
            txtNome.setText("");
            txtUnidade.setText("");
            txtQuantidade.setText("");
            txtValidade.setText("");
            txtCusto.setText("");
            txtCodigo.setText("");
            
            txtNome.setEnabled(false);
            txtCodigo.setEnabled(false);
            txtCusto.setEnabled(false);
            txtQuantidade.setEnabled(false);
            txtUnidade.setEnabled(false);
            txtValidade.setEnabled(false);
        }
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        int i =  tabela.getSelectedRow();
        
        if (i >= 0 && i <listaDeProdutos.size()) {
            Estoque est =  listaDeProdutos.get(i);
            txtCodigo.setText(String.valueOf(est.getCodigo()));
            txtNome.setText(est.getNomeProduto());
            txtValidade.setText(est.getValidade());
            txtQuantidade.setText(String.valueOf(est.getQuantidade()));
            txtUnidade.setText(est.getUnidade());
            txtCusto.setText(String.valueOf(est.getCusto()));
            
            
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

       btnCarnes.setEnabled(true);
       btnBebidas.setEnabled(true);
       btnGraoseCereais.setEnabled(true);
       btnProdutosDePadaria.setEnabled(true);
       btnProdutosLacteos.setEnabled(true);
       btnVegetais.setEnabled(true);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private String obterTipoAlimentoSelecionado() {
        return tipoAlimentoSelecionado;
    }

        

    

   

   
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
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstoque().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBebidas;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCarnes;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGraoseCereais;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnProdutosDePadaria;
    private javax.swing.JButton btnProdutosLacteos;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVegetais;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlTiposDeAlimento;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCusto;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtUnidade;
    private javax.swing.JTextField txtValidade;
    // End of variables declaration//GEN-END:variables
}
