// autualizar os botoes do tipo, botao OK, mouseClikded e pesquissar
package telas;
//import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trabalhofinal.Estoque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class TelaEstoque extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    
    //static ArrayList<Estoque> listaDeProdutos;
    
    private Map<String, List<Estoque>> mapaProdutosPorTipo;
    
    private String tipoAlimentoSelecionado = "";
    
    String botao;
    
   public TelaEstoque() {
       initComponents();
       mapaProdutosPorTipo = new HashMap<>();
       
       txtCusto.setEnabled(false);
       snrQuantidade.setEnabled(false);
       cbxUnidade.setEnabled(false);
       txtUnidade.setEnabled(false);
       txtValidade.setEnabled(false);
       txtNome.setEnabled(false);
       txtCodigo.setEnabled(false);
       
       
       // Desabilitar botoes tipos
       btnCarnes.setEnabled(false);
       btnBebidas.setEnabled(false);
       btnGraoseCereais.setEnabled(false);
       btnProdutosdePadaria.setEnabled(false);
       btnProdutosLacteos.setEnabled(false);
       btnVegetais.setEnabled(false);
       
       
       // Desabilitar botoes 
       btnEditar.setEnabled(false);
       btnSalvar.setEnabled(false);
       btnCancelar.setEnabled(false);
       btnOk.setEnabled(false);
       btnExcluir.setEnabled(false);
       
       // comboBox começa sem item 
       cbxUnidade.setSelectedItem(null);
       
       // deixando tabela e titulo invisivel
       pnltabela.setVisible(false);
       lblTituloTabela.setVisible(false);
       
    
       
        
       }
    
    // Método para carregar a tabela de produtos com base no tipo de alimento
    public void carregarTabelaProdutos(String tipoAlimento) {
        DefaultTableModel tableModel = (DefaultTableModel) tabela.getModel();
        tableModel.setRowCount(0);

        List<Estoque> produtosDoTipo = mapaProdutosPorTipo.get(tipoAlimento);

        if (produtosDoTipo != null) {
            for (Estoque produto : produtosDoTipo) {
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
    
    // Método para adicionar um produto ao mapa com base no tipo de alimento
    private void adicionarProdutoAoMapa(Estoque produto, String tipoAlimento) {
        mapaProdutosPorTipo.computeIfAbsent(tipoAlimento, k -> new ArrayList<>()).add(produto);
    }

    // Método para remover um produto do mapa com base no tipo de alimento
    private void removerProdutoDoMapa(int index, String tipoAlimento) {
        List<Estoque> produtosDoTipo = mapaProdutosPorTipo.get(tipoAlimento);

        if (produtosDoTipo != null && index >= 0 && index < produtosDoTipo.size()) {
            produtosDoTipo.remove(index);
        }
    }
    
    private void limparCampos() {
        txtNome.setText("");
        cbxUnidade.setSelectedItem(null);
        txtUnidade.setText("");
        snrQuantidade.setValue(0);
        txtValidade.setText("");
        txtCusto.setText("");
        txtCodigo.setText("");
}
    
    private void habilitarCampos() {
        txtNome.setEnabled(true);
        txtCodigo.setEnabled(true);
        txtCusto.setEnabled(true);
        snrQuantidade.setEnabled(true);
        cbxUnidade.setEnabled(true);
        txtUnidade.setEnabled(true);
        txtValidade.setEnabled(true);
    }
    
    private void desabilitarCampos() {
        txtNome.setEnabled(false);
        txtCodigo.setEnabled(false);
        txtCusto.setEnabled(false);
        snrQuantidade.setEnabled(false);
        cbxUnidade.setEnabled(false);
        txtUnidade.setEnabled(false);
        txtValidade.setEnabled(false);
    }
    
    private void desabilitarBotoesTipoDeAlimento() {
        btnCarnes.setEnabled(false);
        btnBebidas.setEnabled(false);
        btnGraoseCereais.setEnabled(false);
        btnProdutosdePadaria.setEnabled(false);
        btnProdutosLacteos.setEnabled(false);
        btnVegetais.setEnabled(false);
    }
    
    private void habilitarBotoesTipoDeAlimento() {
        btnCarnes.setEnabled(true);
        btnBebidas.setEnabled(true);
        btnGraoseCereais.setEnabled(true);
        btnProdutosdePadaria.setEnabled(true);
        btnProdutosLacteos.setEnabled(true);
        btnVegetais.setEnabled(true);
    }
    
    private String obterTipoAlimentoSelecionado() {
        return tipoAlimentoSelecionado;
    }
    
    private void validarCampoCodigo() {
    String codigoTexto = txtCodigo.getText();

    try {
        // Tenta converter o texto para um número inteiro
        int codigo = Integer.parseInt(codigoTexto);
        // Se a conversão for bem-sucedida, o código é um número inteiro
        // Aqui você pode realizar outras ações se necessário
    } catch (NumberFormatException e) {
        // Se a conversão falhar, exibe uma mensagem de aviso
        JOptionPane.showMessageDialog(null, "Por favor, insira apenas números inteiros no campo de código.", "Aviso", JOptionPane.WARNING_MESSAGE);
        // Limpa o campo de código
        txtCodigo.setText("");
    }
}
    
    // Titulo tabela
    private void atualizarTituloTabela(String tipoAlimento) {
        lblTituloTabela.setText("Tipo de Alimento Atual: " + tipoAlimento);
}
    /*private void mostrarTabela() {
        // Ajustar o tamanho do layout para se adequar à tabela
        //int larguraTabela = tabela.getPreferredSize().width;
        //int alturaTabela = tabela.getPreferredSize().height;

        // Adapte conforme necessário para considerar bordas, barras de rolagem, etc.
        setSize(new Dimension(800 , 900));
        pnltabela.setVisible(true);
    }*/

           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnlTiposDeAlimento = new javax.swing.JPanel();
        btnCarnes = new javax.swing.JButton();
        btnProdutosLacteos = new javax.swing.JButton();
        btnVegetais = new javax.swing.JButton();
        btnGraoseCereais = new javax.swing.JButton();
        btnBebidas = new javax.swing.JButton();
        btnProdutosdePadaria = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pnltabela = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCusto = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        cbxUnidade = new javax.swing.JComboBox<>();
        snrQuantidade = new javax.swing.JSpinner();
        txtUnidade = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        txtValidade = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVisualizarTabela = new javax.swing.JButton();
        lblTituloTabela = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel7.setText("jLabel7");

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

        btnProdutosdePadaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pao.png"))); // NOI18N
        btnProdutosdePadaria.setText("Produtos de Padaria");
        btnProdutosdePadaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosdePadariaActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addGroup(pnlTiposDeAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTiposDeAlimentoLayout.createSequentialGroup()
                        .addComponent(btnProdutosdePadaria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBebidas))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTiposDeAlimentoLayout.createSequentialGroup()
                        .addComponent(btnProdutosLacteos)
                        .addGap(209, 209, 209)
                        .addComponent(btnVegetais)))
                .addContainerGap())
        );
        pnlTiposDeAlimentoLayout.setVerticalGroup(
            pnlTiposDeAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTiposDeAlimentoLayout.createSequentialGroup()
                .addGroup(pnlTiposDeAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTiposDeAlimentoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnlTiposDeAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCarnes)
                            .addComponent(btnProdutosLacteos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlTiposDeAlimentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVegetais)))
                .addGroup(pnlTiposDeAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTiposDeAlimentoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(pnlTiposDeAlimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGraoseCereais)
                            .addComponent(btnBebidas))
                        .addGap(19, 19, 19))
                    .addGroup(pnlTiposDeAlimentoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnProdutosdePadaria)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        pnltabela.setViewportView(tabela);
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
        jLabel3.setToolTipText("");

        jLabel4.setText("Validade:");

        jLabel5.setText("Custo:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        btnSalvar.setMnemonic('s');
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

        cbxUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "g", "kg", "ml", "litro(s)" }));
        cbxUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUnidadeActionPerformed(evt);
            }
        });

        txtUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadeActionPerformed(evt);
            }
        });

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        try {
            txtValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(snrQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar)
                        .addGap(168, 168, 168))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnOk))
                            .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOk))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(snrQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbxUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        btnExcluir.setMnemonic('e');
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/EditarPa.png"))); // NOI18N
        btnEditar.setMnemonic('d');
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        btnPesquisar.setMnemonic('p');
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar32.png"))); // NOI18N
        btnAdicionar.setMnemonic('a');
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelarP.png"))); // NOI18N
        btnCancelar.setMnemonic('c');
        btnCancelar.setText("cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnVisualizarTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/visualizar.png"))); // NOI18N
        btnVisualizarTabela.setMnemonic('v');
        btnVisualizarTabela.setText("Visualizar Tabela");
        btnVisualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnCancelar)
                    .addComponent(btnAdicionar)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisualizarTabela)))
        );

        lblTituloTabela.setText("Tipo de Alimento: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTituloTabela, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnltabela, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTituloTabela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnltabela, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/signout_106525.png"))); // NOI18N
        jButton1.setMnemonic('i');
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addComponent(pnlTiposDeAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTiposDeAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVegetaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVegetaisActionPerformed
        
        tipoAlimentoSelecionado = "Vegetais";
        carregarTabelaProdutos(tipoAlimentoSelecionado);
        
        // se o o botao for igual adicionar entao os campos ficam habilitados
        if (botao.equals("adicionar")){
            habilitarCampos();
            btnOk.setEnabled(false);
        }
        
        else if (botao.equals("pesquisar")) {
        // Verifica se há produtos desse tipo no mapa
        List<Estoque> produtosDoTipo = mapaProdutosPorTipo.get(tipoAlimentoSelecionado);

        if (produtosDoTipo != null && !produtosDoTipo.isEmpty()) {
            // Apenas o campo do código e o botão OK são habilitados
            txtNome.setEnabled(false);
            txtCodigo.setEnabled(true);
            txtCusto.setEnabled(false);
            snrQuantidade.setEnabled(false);
            cbxUnidade.setEnabled(false);
            txtUnidade.setEnabled(false);
            txtValidade.setEnabled(false);
            btnOk.setEnabled(true);
        } else {
            // Desabilita todos os campos
            desabilitarCampos();
            btnOk.setEnabled(false);
            

            JOptionPane.showMessageDialog(null, "Não há itens desse tipo cadastrados no estoque.", "Messagem",
                    JOptionPane.PLAIN_MESSAGE);
             btnAdicionar.setEnabled(true);
        }
            desabilitarBotoesTipoDeAlimento();
            }
            

               
                
       
        if (botao.equals("adicionar") || botao.equals("editar") || botao.equals("visualizar tabela")) {
            
            limparCampos();
           
            // Habilitar botoes
            btnSalvar.setEnabled(true);
            //btnCancelar.setEnabled(true);

            // Desabilitar botoes
           btnCarnes.setEnabled(false);
           btnBebidas.setEnabled(false);
           btnGraoseCereais.setEnabled(false);
           btnProdutosdePadaria.setEnabled(false);
           btnProdutosLacteos.setEnabled(false);

           atualizarTituloTabela( tipoAlimentoSelecionado);
           
           // Tabela e titulo visivel
           pnltabela.setVisible(true);
           lblTituloTabela.setVisible(true);
           //mostrarTabela();


           txtCodigo.requestFocus();
        }
       
        
    }//GEN-LAST:event_btnVegetaisActionPerformed

    private void btnGraoseCereaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraoseCereaisActionPerformed
        
        tipoAlimentoSelecionado = "Grãos e Cereais";
        carregarTabelaProdutos(tipoAlimentoSelecionado);

        
        // se o o botao forigual adicionar entao os campos ficam habilitados
        if (botao.equals("adicionar")){
            habilitarCampos();
            btnOk.setEnabled(false);
        }
        
        else if (botao.equals("pesquisar")) {
        // Verifica se há produtos desse tipo no mapa
        List<Estoque> produtosDoTipo = mapaProdutosPorTipo.get(tipoAlimentoSelecionado);

        if (produtosDoTipo != null && !produtosDoTipo.isEmpty()) {
            // Apenas o campo do código e o botão OK são habilitados
            txtNome.setEnabled(false);
            txtCodigo.setEnabled(true);
            txtCusto.setEnabled(false);
            snrQuantidade.setEnabled(false);
            cbxUnidade.setEnabled(false);
            txtUnidade.setEnabled(false);
            txtValidade.setEnabled(false);
            btnOk.setEnabled(true);
        } else {
            
            desabilitarCampos();
            btnOk.setEnabled(false);
            

            JOptionPane.showMessageDialog(null, "Não há itens desse tipo cadastrados no estoque.", "Messagem",
                    JOptionPane.PLAIN_MESSAGE);
             btnAdicionar.setEnabled(true);
        }
            desabilitarBotoesTipoDeAlimento();
            }
                
        if (botao.equals("adicionar") || botao.equals("editar") || botao.equals("visualizar tabela")) {
            
            limparCampos();

            // Habilitar botoes
            btnSalvar.setEnabled(true);
            //btnCancelar.setEnabled(true);

            // Desabilitar botoes
           btnCarnes.setEnabled(false);
           btnBebidas.setEnabled(false);
           btnVegetais.setEnabled(false);
           btnProdutosdePadaria.setEnabled(false);
           btnProdutosLacteos.setEnabled(false);

           atualizarTituloTabela( tipoAlimentoSelecionado);
       
           pnltabela.setVisible(true);
           lblTituloTabela.setVisible(true);

           txtCodigo.requestFocus();
        }

    }//GEN-LAST:event_btnGraoseCereaisActionPerformed

    private void btnCarnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarnesActionPerformed
        
        tipoAlimentoSelecionado = "Carnes";
        carregarTabelaProdutos(tipoAlimentoSelecionado);
  
        
        // se o o botao forigual adicionar entao os campos ficam habilitados
        if (botao.equals("adicionar")){
            habilitarCampos();
            btnOk.setEnabled(false);
        }
        
        else if (botao.equals("pesquisar")) {
        // Verifica se há produtos desse tipo no mapa
            List<Estoque> produtosDoTipo = mapaProdutosPorTipo.get(tipoAlimentoSelecionado);

        if (produtosDoTipo != null && !produtosDoTipo.isEmpty()) {
            // Apenas o campo do código e o botão OK são habilitados
            txtNome.setEnabled(false);
            txtCodigo.setEnabled(true);
            txtCusto.setEnabled(false);
            snrQuantidade.setEnabled(false);
            cbxUnidade.setEnabled(false);
            txtUnidade.setEnabled(false);
            txtValidade.setEnabled(false);
            btnOk.setEnabled(true);
        } else {
            desabilitarCampos();
            btnOk.setEnabled(false);

            JOptionPane.showMessageDialog(null, "Não há itens desse tipo cadastrados no estoque.", "Messagem",
                    JOptionPane.PLAIN_MESSAGE);
             btnAdicionar.setEnabled(true);
        }
            desabilitarBotoesTipoDeAlimento();
            }
           
        if (botao.equals("adicionar") || botao.equals("editar") || botao.equals("visualizar tabela")) {
            
            limparCampos();
            // Habilitar botoes
            btnSalvar.setEnabled(true);
            //btnCancelar.setEnabled(true);

            // Desabilitar botoes
           btnGraoseCereais.setEnabled(false);
           btnBebidas.setEnabled(false);
           btnVegetais.setEnabled(false);
           btnProdutosdePadaria.setEnabled(false);
           btnProdutosLacteos.setEnabled(false);

           atualizarTituloTabela( tipoAlimentoSelecionado);
          
           pnltabela.setVisible(true);
           lblTituloTabela.setVisible(true);

           txtCodigo.requestFocus();
        }

                                           
        
    }//GEN-LAST:event_btnCarnesActionPerformed

    private void btnProdutosLacteosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosLacteosActionPerformed
   
        tipoAlimentoSelecionado = "Produtos Lácteos";
        carregarTabelaProdutos(tipoAlimentoSelecionado);
       
        
        // se o o botao forigual adicionar entao os campos ficam habilitados
        if (botao.equals("adicionar")){
            habilitarCampos();
            btnOk.setEnabled(false);
        }
        
        else if (botao.equals("pesquisar")) {
            // Verifica se há produtos desse tipo no mapa
            List<Estoque> produtosDoTipo = mapaProdutosPorTipo.get(tipoAlimentoSelecionado);

        if (produtosDoTipo != null && !produtosDoTipo.isEmpty()) {
            // Apenas o campo do código e o botão OK são habilitados
            txtNome.setEnabled(false);
            txtCodigo.setEnabled(true);
            txtCusto.setEnabled(false);
            snrQuantidade.setEnabled(false);
            cbxUnidade.setEnabled(false);
            txtUnidade.setEnabled(false);
            txtValidade.setEnabled(false);
            btnOk.setEnabled(true);
        } else {
            desabilitarCampos();
            btnOk.setEnabled(false);

            JOptionPane.showMessageDialog(null, "Não há itens desse tipo cadastrados no estoque.", "Messagem",
                    JOptionPane.PLAIN_MESSAGE);
             btnAdicionar.setEnabled(true);
        }
            desabilitarBotoesTipoDeAlimento();
            }
            
               
        if (botao.equals("adicionar") || botao.equals("editar") || botao.equals("visualizar tabela")) {
            
            limparCampos();

            // Habilitar botoes
            btnSalvar.setEnabled(true);
            //btnCancelar.setEnabled(true);

            // Desabilitar botoes
           btnCarnes.setEnabled(false);
           btnBebidas.setEnabled(false);
           btnVegetais.setEnabled(false);
           btnProdutosdePadaria.setEnabled(false);
           btnGraoseCereais.setEnabled(false);

           atualizarTituloTabela( tipoAlimentoSelecionado);
           
           pnltabela.setVisible(true);
           lblTituloTabela.setVisible(true);

           txtCodigo.requestFocus();
        }
     
    }//GEN-LAST:event_btnProdutosLacteosActionPerformed

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed
 
        tipoAlimentoSelecionado = "Bebidas";
        carregarTabelaProdutos(tipoAlimentoSelecionado);
      
        
        // se o o botao forigual adicionar entao os campos ficam habilitados
        if (botao.equals("adicionar")){
            habilitarCampos();
            btnOk.setEnabled(false);
        }
        
        else if (botao.equals("pesquisar")) {
        // Verifica se há produtos desse tipo no mapa
        List<Estoque> produtosDoTipo = mapaProdutosPorTipo.get(tipoAlimentoSelecionado);

        if (produtosDoTipo != null && !produtosDoTipo.isEmpty()) {
            // Apenas o campo do código e o botão OK são habilitados
            txtNome.setEnabled(false);
            txtCodigo.setEnabled(true);
            txtCusto.setEnabled(false);
            snrQuantidade.setEnabled(false);
            cbxUnidade.setEnabled(false);
            txtUnidade.setEnabled(false);
            txtValidade.setEnabled(false);
            btnOk.setEnabled(true);
        } else {
            desabilitarCampos();
            btnOk.setEnabled(false);

            JOptionPane.showMessageDialog(null, "Não há itens desse tipo cadastrados no estoque.", "Messagem",
                    JOptionPane.PLAIN_MESSAGE);
             btnAdicionar.setEnabled(true);
        }
            desabilitarBotoesTipoDeAlimento();
        }
    
        if (botao.equals("adicionar") || botao.equals("editar") || botao.equals("visualizar tabela")) {
            
            limparCampos();

            // Habilitar botoes
            btnSalvar.setEnabled(true);
            //btnCancelar.setEnabled(true);

            // Desabilitar botoes
           btnCarnes.setEnabled(false);
           btnGraoseCereais.setEnabled(false);
           btnVegetais.setEnabled(false);
           btnProdutosdePadaria.setEnabled(false);
           btnProdutosLacteos.setEnabled(false);

           atualizarTituloTabela( tipoAlimentoSelecionado);
           
           pnltabela.setVisible(true);
           lblTituloTabela.setVisible(true);

           txtCodigo.requestFocus();
        }
     
    }//GEN-LAST:event_btnBebidasActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
        if (txtCodigo.getText().equals("") ||txtUnidade.getText().equals("") ||txtNome.getText().equals("") || cbxUnidade.getSelectedItem().equals("") || snrQuantidade.getValue().equals(0) || txtCusto.getText().equals("") || txtValidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser inseridos", "Messagem", JOptionPane.PLAIN_MESSAGE);
        }
        else {
            
            String textoCampo = txtUnidade.getText(); 
            Object itemSelecionado = (String) cbxUnidade.getSelectedItem(); 
            
        
            String nome = txtNome.getText();
            String unidade = textoCampo + " " + itemSelecionado;
            int quantidade = (Integer) snrQuantidade.getValue();
            String validade = txtValidade.getText();
            double custo = Double.parseDouble(txtCusto.getText());
            int codigo = Integer.parseInt(txtCodigo.getText());
            
            
            // Adicionar o código para criar e definir o tipo de alimento aqui
            String tipoAlimentoSelecionado = obterTipoAlimentoSelecionado(); 
            if (botao.equals("adicionar")) {
                // Metodo construtor
                Estoque estoque = new Estoque(codigo, nome, quantidade, unidade,  validade, custo);
                // Adicione o produto ao mapa com base no tipo de alimento
                adicionarProdutoAoMapa(estoque, tipoAlimentoSelecionado);
                
                limparCampos();
            
                desabilitarCampos(); 

                JOptionPane.showMessageDialog(null, "Item adicinado com sucesso", "Messagem", JOptionPane.INFORMATION_MESSAGE);
                estoque.setTipo(tipoAlimentoSelecionado);
                }
                
            else if (botao.equals("editar")) {
                
               
               int index = tabela.getSelectedRow();
            
                // Obtenha a lista de produtos do tipo de alimento específico
                List<Estoque> produtosDoTipo = mapaProdutosPorTipo.get(tipoAlimentoSelecionado);

                // Obtenha o produto na posição do índice
                Estoque produtoEditado = produtosDoTipo.get(index);

                // Atualize os campos do produto editado
                produtoEditado.setCodigo(codigo);
                produtoEditado.setNomeProduto(nome);
                produtoEditado.setUnidade(unidade);
                produtoEditado.setQuantidade(quantidade);
                produtoEditado.setValidade(validade);
                produtoEditado.setCusto(custo);

                // Atualize o mapa com a lista modificada
                mapaProdutosPorTipo.put(tipoAlimentoSelecionado, produtosDoTipo);
                limparCampos();
            
                desabilitarCampos(); 

            }
           
            //carregar tabela
            carregarTabelaProdutos(tipoAlimentoSelecionado); 
            
            
            
            desabilitarBotoesTipoDeAlimento();
    
            btnSalvar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
            
            
            // Habilitar botoes
            btnAdicionar.setEnabled(true);
            btnPesquisar.setEnabled(true);
            
            tableModel = (DefaultTableModel) tabela.getModel();
        }
        } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Certifique-se de que o código é um número inteiro e o custo é um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        
         int index = tabela.getSelectedRow();

    if (index >= 0 && index < mapaProdutosPorTipo.get(tipoAlimentoSelecionado).size()) {
        // Remova o produto do mapa com base no tipo de alimento
        removerProdutoDoMapa(index, tipoAlimentoSelecionado);
    }


    // Carregue a tabela novamente com base no tipo de alimento
    carregarTabelaProdutos(tipoAlimentoSelecionado);
        
        desabilitarCampos();
        
        btnOk.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        limparCampos();
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed


        botao = "editar";
        habilitarCampos();
    
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        btnPesquisar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnOk.setEnabled(false);
        
        txtCodigo.requestFocus();
        
         
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
     
        botao = "pesquisar";
     if (mapaProdutosPorTipo.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Não há itens cadastrados no estoque.", "Messagem", JOptionPane.PLAIN_MESSAGE);
    } else {
        // Limpar os campos
        limparCampos();

        desabilitarCampos();
        

        habilitarBotoesTipoDeAlimento();

        // Desabilitar outros botões
        btnExcluir.setEnabled(false);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnAdicionar.setEnabled(false);
        btnOk.setEnabled(false);
    
        
     
    }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        int selectedRow = tabela.getSelectedRow();

        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnAdicionar.setEnabled(false);

        if (selectedRow >= 0 && selectedRow < tabela.getRowCount()) {
            String tipoAlimento = obterTipoAlimentoSelecionado();
            List<Estoque> produtosDoTipo = mapaProdutosPorTipo.get(tipoAlimento);

            if (produtosDoTipo != null && !produtosDoTipo.isEmpty()) {
                // Obter o código do produto selecionado
                int codigoProdutoSelecionado = (int) tabela.getValueAt(selectedRow, 0);

                // Procurar o produto pelo código na lista
                Estoque produtoSelecionado = null;
                for (Estoque produto : produtosDoTipo) {
                    if (produto.getCodigo() == codigoProdutoSelecionado) {
                        produtoSelecionado = produto;
                        break;
                    }
                }

                if (produtoSelecionado != null) {
                    // Preencher os campos com os dados do produto selecionado
                    txtCodigo.setText(String.valueOf(produtoSelecionado.getCodigo()));
                    txtNome.setText(produtoSelecionado.getNomeProduto());
                    txtValidade.setText(produtoSelecionado.getValidade());
                    snrQuantidade.setValue(produtoSelecionado.getQuantidade());
                    String[] partesUnidade = produtoSelecionado.getUnidade().split(" ");
                    txtUnidade.setText(partesUnidade[0]);
                    cbxUnidade.setSelectedItem(partesUnidade[1]);
                    txtCusto.setText(String.valueOf(produtoSelecionado.getCusto()));
                }
                 }
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        desabilitarBotoesTipoDeAlimento();
        limparCampos();
        desabilitarCampos();
       
        btnExcluir.setEnabled(false);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        btnAdicionar.setEnabled(true);
        btnPesquisar.setEnabled(true);
       
        tabela.clearSelection();
       
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        botao = "adicionar";
       habilitarBotoesTipoDeAlimento();
       
       btnAdicionar.setEnabled(false);
       btnPesquisar.setEnabled(false);
       btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void cbxUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUnidadeActionPerformed
        // TODO add your handling code h ere:
    }//GEN-LAST:event_cbxUnidadeActionPerformed

    private void txtUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (txtCodigo.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "O código deve ser informado", "Messagem", JOptionPane.PLAIN_MESSAGE);
    } else {
        String tipoAlimento = obterTipoAlimentoSelecionado();
        int codigo = Integer.parseInt(txtCodigo.getText());

        // Verifica se o produto existe no mapa
        List<Estoque> produtosDoTipo = mapaProdutosPorTipo.get(tipoAlimento);

        if (produtosDoTipo != null) {
            Estoque est = null;

            // Procura o produto no mapa com base no código
            for (Estoque produto : produtosDoTipo) {
                if (produto.getCodigo() == codigo) {
                    est = produto;
                    break;
                }
            }

            if (est != null) {
                // Preenche os campos com os dados do produto encontrado
                txtNome.setText(est.getNomeProduto());
                cbxUnidade.setSelectedItem(est.getUnidade());
                String[] partesUnidade = est.getUnidade().split(" ");
                txtUnidade.setText(partesUnidade[0]);
                txtValidade.setText(est.getValidade());
                txtCusto.setText(String.valueOf(est.getCusto()));
                snrQuantidade.setValue(est.getQuantidade());
        }
            else {
                // Se o produto não for encontrado, exibe uma mensagem
                JOptionPane.showMessageDialog(null, "O código informado não existe", "Messagem", JOptionPane.PLAIN_MESSAGE);

                // Limpar os campos
                limparCampos();
            }
        }
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnProdutosdePadariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosdePadariaActionPerformed
        tipoAlimentoSelecionado = "Produtos de Padaria";
        carregarTabelaProdutos(tipoAlimentoSelecionado);
      
        
        // se o o botao forigual adicionar entao os campos ficam habilitados
        if (botao.equals("adicionar")){
            habilitarCampos();
            btnOk.setEnabled(false);
        }
        
        else if (botao.equals("pesquisar")) {
            // Verifica se há produtos desse tipo no mapa
            List<Estoque> produtosDoTipo = mapaProdutosPorTipo.get(tipoAlimentoSelecionado);

        if (produtosDoTipo != null && !produtosDoTipo.isEmpty()) {
            // Apenas o campo do código e o botão OK são habilitados
            txtNome.setEnabled(false);
            txtCodigo.setEnabled(true);
            txtCusto.setEnabled(false);
            snrQuantidade.setEnabled(false);
            cbxUnidade.setEnabled(false);
            txtUnidade.setEnabled(false);
            txtValidade.setEnabled(false);
            btnOk.setEnabled(true);
        } else {
            desabilitarCampos();
            btnOk.setEnabled(false);

            JOptionPane.showMessageDialog(null, "Não há itens desse tipo cadastrados no estoque.", "Messagem",
                    JOptionPane.PLAIN_MESSAGE);
             btnAdicionar.setEnabled(true);
        }
            desabilitarBotoesTipoDeAlimento();
        }
    
        if (botao.equals("adicionar") || botao.equals("editar") || botao.equals("visualizar tabela")) {
            limparCampos();
            

            // Habilitar botoes
            btnSalvar.setEnabled(true);
            //btnCancelar.setEnabled(true);

            // Desabilitar botoes
           btnCarnes.setEnabled(false);
           btnGraoseCereais.setEnabled(false);
           btnVegetais.setEnabled(false);
           btnBebidas.setEnabled(false);
           btnProdutosLacteos.setEnabled(false);

           atualizarTituloTabela( tipoAlimentoSelecionado);
           
           pnltabela.setVisible(true);
           lblTituloTabela.setVisible(true);

           txtCodigo.requestFocus();
        }
     
    }//GEN-LAST:event_btnProdutosdePadariaActionPerformed

    private void btnVisualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarTabelaActionPerformed
        botao = "visualizar tabela";
        habilitarBotoesTipoDeAlimento();
        
       btnEditar.setEnabled(false);
       btnSalvar.setEnabled(false);
       btnCancelar.setEnabled(true);
       btnAdicionar.setEnabled(true);
       btnOk.setEnabled(false);
       btnExcluir.setEnabled(false);
       
    }//GEN-LAST:event_btnVisualizarTabelaActionPerformed

    private void txtCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustoActionPerformed


        
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

        /* Create     public static void main(String args[]) {
and display the form */
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
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnProdutosLacteos;
    private javax.swing.JButton btnProdutosdePadaria;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVegetais;
    private javax.swing.JButton btnVisualizarTabela;
    private javax.swing.JComboBox<String> cbxUnidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTituloTabela;
    private javax.swing.JPanel pnlTiposDeAlimento;
    private javax.swing.JScrollPane pnltabela;
    private javax.swing.JSpinner snrQuantidade;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCusto;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtUnidade;
    private javax.swing.JFormattedTextField txtValidade;
    // End of variables declaration//GEN-END:variables
}
