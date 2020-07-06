/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import bin.Categoria;
import bin.Fornecedor;
import bin.Produto;
import connection.DAOFactory;
import interfaces.CategoriaDAO;
import interfaces.FornecedorDAO;
import interfaces.ProdutoDAO;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Usuario
 */
public class Menu extends javax.swing.JFrame {

    public DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.SQLITE);
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        initProduto();
        jBoxProd();
        jBoxFn();
        readJTableProd();
        initCategoria();
        readJTableCat();
        initFornecedor();
        readJTableFn();
        
    }

    private void initCategoria() {
        txt_cat_nome.setEnabled(false);
        txt_cat_descricao.setEnabled(false);
        btn_cat_salvar.setEnabled(false);
        btn_cat_cancelar.setEnabled(false);
        txt_cat_nome.setText("");
        txt_cat_descricao.setText("");
        btn_cat_editar.setEnabled(false);
        btn_cat_remover.setEnabled(false);
    }
    
    private void initProduto() {
        txt_prod_nome.setEnabled(false);
        txt_prod_estoque.setEnabled(false);
        txt_prod_quantidade.setEnabled(false);
        txt_prod_preco.setEnabled(false);
        btn_prod_salvar.setEnabled(false);
        btn_prod_cancelar.setEnabled(false);
        jbox_prod.setEnabled(false);
        jbox_fn.setEnabled(false);
        btn_prod_editar.setEnabled(false);
        btn_prod_remover.setEnabled(false);
        txt_prod_nome.setText("");
        txt_prod_estoque.setText("");
        txt_prod_quantidade.setText("");
        txt_prod_preco.setText("");
    }
    
    
    private void initFornecedor() {
        txt_fn_nome.setEnabled(false);
        txt_fn_endereco.setEnabled(false);
        txt_fn_cidade.setEnabled(false);
        txt_fn_telefone.setEnabled(false);
        btn_fn_salvar.setEnabled(false);
        btn_fn_cancelar.setEnabled(false);
        btn_fn_editar.setEnabled(false);
        btn_fn_remover.setEnabled(false);
        txt_fn_nome.setText("");
        txt_fn_endereco.setText("");
        txt_fn_cidade.setText("");
        txt_fn_telefone.setText("");
    }
    
    public void readJTableCat() {
        DefaultTableModel model = (DefaultTableModel) tbl_categoria.getModel();
        model.setNumRows(0);
        CategoriaDAO catdao = factory.getCategoriaDAO();
        Iterator<Categoria> iterator = catdao.read();
        while(iterator.hasNext()) {
            Categoria categoria = iterator.next();
            model.addRow(new Object[]{
               categoria.getId(),
               categoria.getName(),
               categoria.getDescription()
            });
            
        }
    }
    
    public void readJTableProd() {
        DefaultTableModel model = (DefaultTableModel) tbl_produto.getModel();
        model.setNumRows(0);
        ProdutoDAO proddao = factory.getProdutoDAO();
        Iterator<Produto> iterator = proddao.read();
        while(iterator.hasNext()) {
            Produto produto = iterator.next();
            model.addRow(new Object[]{
               produto.getId(),
               produto.getName(),
               produto.getStock(),
               produto.getQuantity(),
               produto.getPrice(),
               produto.getCategory(),
               produto.getSupplier()
            });
            
        }
    }
    
    public void readJTableFn() {
        DefaultTableModel model = (DefaultTableModel) tbl_fornecedor.getModel();
        model.setNumRows(0);
        FornecedorDAO fndao = factory.getFornecedorDAO();
        Iterator<Fornecedor> iterator = fndao.read();
        while(iterator.hasNext()) {
            Fornecedor fornecedor = iterator.next();
            model.addRow(new Object[]{
               fornecedor.getId(),
               fornecedor.getName(),
               fornecedor.getAddress(),
               fornecedor.getCity(),
               fornecedor.getPhone()
            });
            
        }
    }
    
    public void jBoxProd() {
        jbox_prod.removeAllItems();
        CategoriaDAO catdao = factory.getCategoriaDAO();
        Iterator iterator = catdao.read();
        while(iterator.hasNext()) {
            
            jbox_prod.addItem(iterator.next());
            
        }
    }
    
    public void jBoxFn() {
        jbox_fn.removeAllItems();
        FornecedorDAO fndao = factory.getFornecedorDAO();
        Iterator iterator = fndao.read();
        while(iterator.hasNext()) {
            
            jbox_fn.addItem(iterator.next());
            
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_prod_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_prod_estoque = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_prod_quantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbox_prod = new javax.swing.JComboBox<>();
        btn_prod_cancelar = new javax.swing.JButton();
        btn_prod_salvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_prod_preco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jbox_fn = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_produto = new javax.swing.JTable();
        btn_prod_cadastrar = new javax.swing.JButton();
        btn_prod_remover = new javax.swing.JButton();
        btn_prod_editar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_cat_editar = new javax.swing.JButton();
        btn_cat_cadastrar = new javax.swing.JButton();
        btn_cat_remover = new javax.swing.JButton();
        cat_panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_cat_nome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_cat_descricao = new javax.swing.JTextField();
        btn_cat_cancelar = new javax.swing.JButton();
        btn_cat_salvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_categoria = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_fn_nome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_fn_endereco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_fn_cidade = new javax.swing.JTextField();
        btn_fn_cancelar = new javax.swing.JButton();
        btn_fn_salvar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_fn_telefone = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_fornecedor = new javax.swing.JTable();
        btn_fn_cadastrar = new javax.swing.JButton();
        btn_fn_remover = new javax.swing.JButton();
        btn_fn_editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Produto"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome:*");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Estoque:*");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Quantidade:*");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Categoria:*");

        btn_prod_cancelar.setText("Cancelar");
        btn_prod_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prod_cancelarActionPerformed(evt);
            }
        });

        btn_prod_salvar.setText("Salvar");
        btn_prod_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prod_salvarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Preço:*");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Fornecedor:*");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_prod_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_prod_estoque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_prod_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_prod_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(btn_prod_salvar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_prod_cancelar))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel8)
                                        .addGap(1, 1, 1)
                                        .addComponent(jbox_fn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbox_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_prod_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_prod_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_prod_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jbox_fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_prod_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_prod_salvar)
                            .addComponent(btn_prod_cancelar)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jbox_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tbl_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Estoque", "Quantidade", "Preço", "Categoria", "Fornecedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_produtoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_produto);

        btn_prod_cadastrar.setText("Cadastrar");
        btn_prod_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prod_cadastrarActionPerformed(evt);
            }
        });

        btn_prod_remover.setText("Remover");
        btn_prod_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prod_removerActionPerformed(evt);
            }
        });

        btn_prod_editar.setText("Editar");
        btn_prod_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prod_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_prod_cadastrar)
                        .addGap(11, 11, 11)
                        .addComponent(btn_prod_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_prod_remover)
                        .addGap(0, 214, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_prod_cadastrar)
                    .addComponent(btn_prod_remover)
                    .addComponent(btn_prod_editar))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Produtos", jPanel1);

        btn_cat_editar.setText("Editar");
        btn_cat_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cat_editarActionPerformed(evt);
            }
        });

        btn_cat_cadastrar.setText("Cadastrar");
        btn_cat_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cat_cadastrarActionPerformed(evt);
            }
        });

        btn_cat_remover.setText("Remover");
        btn_cat_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cat_removerActionPerformed(evt);
            }
        });

        cat_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Categoria"));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nome:*");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Descrição:");

        btn_cat_cancelar.setText("Cancelar");
        btn_cat_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cat_cancelarActionPerformed(evt);
            }
        });

        btn_cat_salvar.setText("Salvar");
        btn_cat_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cat_salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cat_panelLayout = new javax.swing.GroupLayout(cat_panel);
        cat_panel.setLayout(cat_panelLayout);
        cat_panelLayout.setHorizontalGroup(
            cat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cat_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cat_panelLayout.createSequentialGroup()
                        .addGroup(cat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cat_panelLayout.createSequentialGroup()
                                .addComponent(txt_cat_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_cat_descricao)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cat_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_cat_salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cat_cancelar)))
                .addContainerGap())
        );
        cat_panelLayout.setVerticalGroup(
            cat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cat_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_cat_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_cat_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cat_cancelar)
                    .addComponent(btn_cat_salvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_categoriaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_categoria);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cat_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_cat_cadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_cat_editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_cat_remover))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cat_editar)
                    .addComponent(btn_cat_cadastrar)
                    .addComponent(btn_cat_remover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cat_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Categoria", jPanel2);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fornecedor"));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Fornecedor:*");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Endereço:*");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Cidade:*");

        btn_fn_cancelar.setText("Cancelar");
        btn_fn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fn_cancelarActionPerformed(evt);
            }
        });

        btn_fn_salvar.setText("Salvar");
        btn_fn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fn_salvarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Telefone:*");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(btn_fn_salvar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_fn_cancelar))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(24, 24, 24)
                            .addComponent(txt_fn_telefone)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_fn_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                            .addComponent(txt_fn_endereco)
                            .addComponent(txt_fn_cidade))))
                .addGap(51, 51, 51))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_fn_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_fn_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txt_fn_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fn_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_fn_cancelar)
                    .addComponent(btn_fn_salvar))
                .addContainerGap())
        );

        tbl_fornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Endereço", "Cidade", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_fornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_fornecedorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_fornecedor);

        btn_fn_cadastrar.setText("Cadastrar");
        btn_fn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fn_cadastrarActionPerformed(evt);
            }
        });

        btn_fn_remover.setText("Remover");
        btn_fn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fn_removerActionPerformed(evt);
            }
        });

        btn_fn_editar.setText("Editar");
        btn_fn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 452, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btn_fn_cadastrar)
                        .addGap(11, 11, 11)
                        .addComponent(btn_fn_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_fn_remover)
                        .addGap(0, 214, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_fn_cadastrar)
                    .addComponent(btn_fn_remover)
                    .addComponent(btn_fn_editar))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Fornecedores", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_prod_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prod_removerActionPerformed
        if(tbl_produto.getSelectedRow() != -1) {
            
            Produto produto = new Produto();
            ProdutoDAO proddao = factory.getProdutoDAO();

            produto.setId((int)tbl_produto.getValueAt(tbl_produto.getSelectedRow(), 0));
            proddao.delete(produto);

            initProduto();
            btn_prod_cadastrar.setEnabled(true);
            readJTableProd();
        } 
    }//GEN-LAST:event_btn_prod_removerActionPerformed

    private void btn_cat_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cat_cadastrarActionPerformed
        
        txt_cat_nome.setEnabled(true);
        txt_cat_descricao.setEnabled(true);
        btn_cat_salvar.setEnabled(true);
        btn_cat_cancelar.setEnabled(true);
        
    }//GEN-LAST:event_btn_cat_cadastrarActionPerformed

    private void btn_cat_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cat_cancelarActionPerformed
        initCategoria();
    }//GEN-LAST:event_btn_cat_cancelarActionPerformed

    private void btn_cat_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cat_salvarActionPerformed
        
        Categoria categoria = new Categoria();
        CategoriaDAO catdao = factory.getCategoriaDAO();
        
        
        categoria.setName(txt_cat_nome.getText());
        categoria.setDescription(txt_cat_descricao.getText());
        catdao.insert(categoria);
        
        initCategoria();
        readJTableCat();
        jBoxProd();
    }//GEN-LAST:event_btn_cat_salvarActionPerformed

    private void btn_cat_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cat_removerActionPerformed
        
        if(tbl_categoria.getSelectedRow() != -1) {
            Categoria categoria = new Categoria();
            CategoriaDAO catdao = factory.getCategoriaDAO();

            categoria.setId((int)tbl_categoria.getValueAt(tbl_categoria.getSelectedRow(), 0));
            catdao.delete(categoria);

            initCategoria();
            btn_cat_cadastrar.setEnabled(true);
            readJTableCat();
            jBoxProd();
        } 
        
        
    }//GEN-LAST:event_btn_cat_removerActionPerformed

    private void btn_cat_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cat_editarActionPerformed
        
        if(tbl_categoria.getSelectedRow() != -1) {
            Categoria categoria = new Categoria();
            CategoriaDAO catdao = factory.getCategoriaDAO();

            categoria.setName(txt_cat_nome.getText());
            categoria.setDescription(txt_cat_descricao.getText());
            categoria.setId((int)tbl_categoria.getValueAt(tbl_categoria.getSelectedRow(), 0));
            catdao.update(categoria);

            initCategoria();
            btn_cat_cadastrar.setEnabled(true);
            readJTableCat();
            jBoxProd();
        } 
        
        
    }//GEN-LAST:event_btn_cat_editarActionPerformed

    private void tbl_categoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_categoriaMouseClicked

        if(tbl_categoria.getSelectedRow() != -1) {
            btn_cat_cadastrar.setEnabled(false);
            btn_cat_editar.setEnabled(true);
            btn_cat_remover.setEnabled(true);
            
            txt_cat_nome.setText(tbl_categoria.getValueAt(tbl_categoria.getSelectedRow(), 1).toString());
            txt_cat_descricao.setText(tbl_categoria.getValueAt(tbl_categoria.getSelectedRow(), 2).toString());
            
            txt_cat_nome.setEnabled(true);
            txt_cat_descricao.setEnabled(true);
        } 

    }//GEN-LAST:event_tbl_categoriaMouseClicked

    private void btn_prod_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prod_cancelarActionPerformed
        initProduto();
    }//GEN-LAST:event_btn_prod_cancelarActionPerformed

    private void btn_prod_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prod_cadastrarActionPerformed
        txt_prod_nome.setEnabled(true);
        txt_prod_estoque.setEnabled(true);
        txt_prod_quantidade.setEnabled(true);
        txt_prod_preco.setEnabled(true);
        btn_prod_salvar.setEnabled(true);
        btn_prod_cancelar.setEnabled(true);
        jbox_prod.setEnabled(true);
        jbox_fn.setEnabled(true);
    }//GEN-LAST:event_btn_prod_cadastrarActionPerformed

    private void btn_prod_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prod_salvarActionPerformed
        Produto produto = new Produto();
        Categoria jbox = (Categoria) jbox_prod.getSelectedItem();
        Fornecedor jbox2 = (Fornecedor) jbox_fn.getSelectedItem();
        ProdutoDAO proddao = factory.getProdutoDAO();
        
        produto.setName(txt_prod_nome.getText());
        produto.setStock(Integer.parseInt(txt_prod_estoque.getText()));
        produto.setQuantity(Integer.parseInt(txt_prod_quantidade.getText()));
        produto.setPrice(Double.parseDouble(txt_prod_preco.getText()));
        produto.setCategory(jbox.getName());
        produto.setCategoryId(jbox.getId());
        produto.setSupplier(jbox2.getName());
        produto.setSupplierId(jbox2.getId());
        
        
        proddao.insert(produto);
        initProduto();
        readJTableProd();
    }//GEN-LAST:event_btn_prod_salvarActionPerformed

    private void tbl_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_produtoMouseClicked
        
        if(tbl_produto.getSelectedRow() != -1) {
            btn_prod_cadastrar.setEnabled(false);
            btn_prod_editar.setEnabled(true);
            btn_prod_remover.setEnabled(true);
            CategoriaDAO catdao = factory.getCategoriaDAO();
            
            txt_prod_nome.setText(tbl_produto.getValueAt(tbl_produto.getSelectedRow(), 1).toString());
            txt_prod_estoque.setText(tbl_produto.getValueAt(tbl_produto.getSelectedRow(), 2).toString());
            txt_prod_quantidade.setText(tbl_produto.getValueAt(tbl_produto.getSelectedRow(), 3).toString());
            txt_prod_preco.setText(tbl_produto.getValueAt(tbl_produto.getSelectedRow(), 4).toString());
            jbox_prod.setSelectedItem(catdao.retornaCategoria(tbl_produto.getValueAt(tbl_produto.getSelectedRow(), 5).toString()));
            txt_prod_nome.setEnabled(true);
            txt_prod_estoque.setEnabled(true);
            txt_prod_quantidade.setEnabled(true);
            txt_prod_preco.setEnabled(true);
            jbox_prod.setEnabled(true);
            jbox_fn.setEnabled(true);
        } 
        
    }//GEN-LAST:event_tbl_produtoMouseClicked

    private void btn_prod_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prod_editarActionPerformed
        Produto produto = new Produto();
        Categoria jbox = (Categoria) jbox_prod.getSelectedItem();
        Fornecedor jbox2 = (Fornecedor) jbox_fn.getSelectedItem();
        ProdutoDAO proddao = factory.getProdutoDAO();
        
        produto.setName(txt_prod_nome.getText());
        produto.setStock(Integer.parseInt(txt_prod_estoque.getText()));
        produto.setQuantity(Integer.parseInt(txt_prod_quantidade.getText()));
        produto.setPrice(Double.parseDouble(txt_prod_preco.getText()));
        produto.setCategory(jbox.getName());
        produto.setCategoryId(jbox.getId());
        produto.setSupplier(jbox2.getName());
        produto.setSupplierId(jbox2.getId());
        produto.setId((int)tbl_produto.getValueAt(tbl_produto.getSelectedRow(), 0));
        
        proddao.update(produto);
        initProduto();
        btn_prod_cadastrar.setEnabled(true);
        readJTableProd();
    }//GEN-LAST:event_btn_prod_editarActionPerformed

    private void btn_fn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fn_cancelarActionPerformed
        initFornecedor();
    }//GEN-LAST:event_btn_fn_cancelarActionPerformed

    private void btn_fn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fn_salvarActionPerformed
        Fornecedor fornecedor = new Fornecedor();
        FornecedorDAO fndao = factory.getFornecedorDAO();
        
        fornecedor.setName(txt_fn_nome.getText());
        fornecedor.setAddress(txt_fn_endereco.getText());
        fornecedor.setPhone(txt_fn_telefone.getText());
        fornecedor.setCity(txt_fn_cidade.getText());
        
        fndao.insert(fornecedor);
        initFornecedor();
        readJTableFn();
    }//GEN-LAST:event_btn_fn_salvarActionPerformed

    private void tbl_fornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_fornecedorMouseClicked
        if(tbl_fornecedor.getSelectedRow() != -1) {
            btn_fn_cancelar.setEnabled(true);
            btn_fn_editar.setEnabled(true);
            btn_fn_remover.setEnabled(true);
            
            txt_fn_nome.setText(tbl_fornecedor.getValueAt(tbl_fornecedor.getSelectedRow(), 1).toString());
            txt_fn_endereco.setText(tbl_fornecedor.getValueAt(tbl_fornecedor.getSelectedRow(), 2).toString());
            txt_fn_cidade.setText(tbl_fornecedor.getValueAt(tbl_fornecedor.getSelectedRow(), 3).toString());
            txt_fn_telefone.setText(tbl_fornecedor.getValueAt(tbl_fornecedor.getSelectedRow(), 4).toString());
            
            txt_fn_nome.setEnabled(true);
            txt_fn_endereco.setEnabled(true);
            txt_fn_cidade.setEnabled(true);
            txt_fn_telefone.setEnabled(true);
        } 
    }//GEN-LAST:event_tbl_fornecedorMouseClicked

    private void btn_fn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fn_cadastrarActionPerformed
        txt_fn_nome.setEnabled(true);
        txt_fn_endereco.setEnabled(true);
        txt_fn_cidade.setEnabled(true);
        txt_fn_telefone.setEnabled(true);
        btn_fn_salvar.setEnabled(true);
        btn_fn_cancelar.setEnabled(true);
        jbox_fn.setEnabled(true);
        jBoxFn();
    }//GEN-LAST:event_btn_fn_cadastrarActionPerformed

    private void btn_fn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fn_removerActionPerformed
        if(tbl_fornecedor.getSelectedRow() != -1) {
            Fornecedor fornecedor = new Fornecedor();
            FornecedorDAO fndao = factory.getFornecedorDAO();

            fornecedor.setId((int)tbl_fornecedor.getValueAt(tbl_fornecedor.getSelectedRow(), 0));
            fndao.delete(fornecedor);

            initFornecedor();
            btn_fn_cadastrar.setEnabled(true);
            readJTableFn();
            jBoxFn();
        } 
    }//GEN-LAST:event_btn_fn_removerActionPerformed

    private void btn_fn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fn_editarActionPerformed
        Fornecedor fornecedor = new Fornecedor();
        FornecedorDAO fndao = factory.getFornecedorDAO();
        
        fornecedor.setName(txt_fn_nome.getText());
        fornecedor.setAddress(txt_fn_endereco.getText());
        fornecedor.setCity(txt_fn_cidade.getText());
        fornecedor.setPhone(txt_fn_telefone.getText());
        fornecedor.setId((int)tbl_fornecedor.getValueAt(tbl_fornecedor.getSelectedRow(), 0));
        
        fndao.update(fornecedor);
        initFornecedor();
        btn_fn_cadastrar.setEnabled(true);
        readJTableFn();
        jBoxFn();
    }//GEN-LAST:event_btn_fn_editarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cat_cadastrar;
    private javax.swing.JButton btn_cat_cancelar;
    private javax.swing.JButton btn_cat_editar;
    private javax.swing.JButton btn_cat_remover;
    private javax.swing.JButton btn_cat_salvar;
    private javax.swing.JButton btn_fn_cadastrar;
    private javax.swing.JButton btn_fn_cancelar;
    private javax.swing.JButton btn_fn_editar;
    private javax.swing.JButton btn_fn_remover;
    private javax.swing.JButton btn_fn_salvar;
    private javax.swing.JButton btn_prod_cadastrar;
    private javax.swing.JButton btn_prod_cancelar;
    private javax.swing.JButton btn_prod_editar;
    private javax.swing.JButton btn_prod_remover;
    private javax.swing.JButton btn_prod_salvar;
    private javax.swing.JPanel cat_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<Object> jbox_fn;
    private javax.swing.JComboBox<Object> jbox_prod;
    private javax.swing.JTable tbl_categoria;
    private javax.swing.JTable tbl_fornecedor;
    private javax.swing.JTable tbl_produto;
    private javax.swing.JTextField txt_cat_descricao;
    private javax.swing.JTextField txt_cat_nome;
    private javax.swing.JTextField txt_fn_cidade;
    private javax.swing.JTextField txt_fn_endereco;
    private javax.swing.JTextField txt_fn_nome;
    private javax.swing.JTextField txt_fn_telefone;
    private javax.swing.JTextField txt_prod_estoque;
    private javax.swing.JTextField txt_prod_nome;
    private javax.swing.JTextField txt_prod_preco;
    private javax.swing.JTextField txt_prod_quantidade;
    // End of variables declaration//GEN-END:variables
}
