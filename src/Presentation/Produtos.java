/*     */ package Presentation;
/*     */ import BussinessLogic.Produto;
/*     */ import DataAcessLayer.ProdutoDAO;
import Service.ProdutosServicos;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JTextField;
          import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
/*     */ 
/*     */ public class Produtos extends JFrame {
/*     */   private JButton btnCancel;
/*     */   private JButton btnEditar;
/*     */   private JComboBox cmbCategoria;
/*     */   private JComboBox cmbUnidade;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JButton jButton4;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel11;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   private JLabel jLabel5;
/*     */   private JLabel jLabel6;
/*     */   private JLabel jLabel7;
/*     */   private JLabel jLabel8;
/*     */   
/*     */   public Produtos() {
/*  30 */     initComponents();
/*  31 */     PopularTabela();
/*  32 */     Desabilitar();
/*  33 */     DesbilitarEdicao();
/*  34 */     populacombo();
/*  35 */     combocategoria();
/*  36 */     setLocation(5, 5);
/*     */   }
/*     */   private JLabel jLabel9; private JPanel jPanel1; private JPanel jPanel2; private JPanel jPanel3; private JScrollPane jScrollPane1; private JLabel lblCatEdit; private JLabel lblUniEdit; private JTable tblProdutos; private JTextField tfCategoria; private JTextField tfCodigo; private JTextField tfDesc; private JTextField tfNome; private JTextField tfPrecoUnitario; private JTextField tfProcurar; private JTextField tfQuantidade; private JTextField tfUnidade;
/*     */   public boolean verificadados() {
/*  40 */     boolean fds = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  50 */     if (this.tfNome.getText().equals("")) {
/*     */       
/*  52 */       JOptionPane.showMessageDialog(this.rootPane, "INTRODUZA NOME DO PRODUTO ");
/*  53 */       fds = true;
/*     */     }
/*  55 */     else if (this.tfPrecoUnitario.getText().equals("")) {
/*     */       
/*  57 */       JOptionPane.showMessageDialog(this.rootPane, "INTRODUZA PRECO UNITARIO ");
/*  58 */       fds = true;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  64 */     else if (this.tfQuantidade.getText().equals("")) {
/*     */       
/*  66 */       JOptionPane.showMessageDialog(this.rootPane, "INTRODUZA  QUANTIDADE NO STOCK");
/*  67 */       fds = true;
/*  68 */     } else if (this.cmbCategoria.getSelectedItem().toString().contains(" ")) {
/*     */       
/*  70 */       JOptionPane.showMessageDialog(this.rootPane, "INTRODUZA A CATEGORIA DO PRODUTO");
/*  71 */       fds = true;
/*     */     }
/*  73 */     else if (this.cmbUnidade.getSelectedItem().toString().contains(" ")) {
/*     */       
/*  75 */       JOptionPane.showMessageDialog(this.rootPane, "INTRODUZA UNIDADE DO PRODUTO");
/*  76 */       fds = true;
/*     */     } 
/*     */ 
/*     */     
/*  80 */     return fds;
/*     */   }
/*     */   
/*     */   public void populacombo() {
/*     */     try {
/*  85 */       ProdutoDAO pd = new ProdutoDAO();
/*  86 */       ResultSet rs = pd.popularunidade();
/*  87 */       while (rs.next())
/*     */       {
/*  89 */         this.cmbUnidade.addItem(rs.getString("Descricao_Unidade"));
/*     */       
/*     */       }
/*     */     }
/*  93 */     catch (Exception e) {
/*  94 */       System.out.println("" + e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void combocategoria() {
/*     */     try {
/* 103 */       ProdutoDAO ppd = new ProdutoDAO();
/* 104 */       ResultSet rs = ppd.populacombocategoria();
/* 105 */       while (rs.next())
/*     */       {
/* 107 */         this.cmbCategoria.addItem(rs.getString("Nome"));
/*     */       
/*     */       }
/*     */     }
/* 111 */     catch (Exception e) {
/*     */       
/* 113 */       JOptionPane.showMessageDialog(this.rootPane, "" + e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void initComponents() {
/* 155 */     this.jPanel1 = new JPanel();
/* 156 */     this.tfProcurar = new JTextField();
/* 157 */     this.jPanel3 = new JPanel();
/* 158 */     this.jScrollPane1 = new JScrollPane();
/* 159 */     this.tblProdutos = new JTable();
/* 160 */     this.jPanel2 = new JPanel();
/* 161 */     this.jLabel1 = new JLabel();
/* 162 */     this.jLabel2 = new JLabel();
/* 163 */     this.jLabel3 = new JLabel();
/* 164 */     this.jLabel4 = new JLabel();
/* 165 */     this.jLabel6 = new JLabel();
/* 166 */     this.tfNome = new JTextField();
/* 167 */     this.tfPrecoUnitario = new JTextField();
/* 168 */     this.tfQuantidade = new JTextField();
/* 169 */     this.tfCategoria = new JTextField();
/* 170 */     this.tfUnidade = new JTextField();
/* 171 */     this.jLabel7 = new JLabel();
/* 172 */     this.tfCodigo = new JTextField();
/* 173 */     this.cmbCategoria = new JComboBox();
/* 174 */     this.cmbUnidade = new JComboBox();
/* 175 */     this.lblUniEdit = new JLabel();
/* 176 */     this.lblCatEdit = new JLabel();
/* 177 */     this.jLabel8 = new JLabel();
/* 178 */     this.tfDesc = new JTextField();
/* 179 */     this.jLabel9 = new JLabel();
/* 180 */     this.jButton2 = new JButton();
/* 181 */     this.jLabel5 = new JLabel();
/* 182 */     this.btnCancel = new JButton();
/* 183 */     this.jButton4 = new JButton();
/* 184 */     this.jButton1 = new JButton();
/* 185 */     this.btnEditar = new JButton();
/* 186 */     this.jLabel11 = new JLabel();
/*     */     
/* 188 */     setDefaultCloseOperation(2);
/* 189 */     setTitle("Produtos");
/* 190 */     setResizable(false);
/* 191 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/* 193 */     this.jPanel1.setOpaque(false);
/* 194 */     this.jPanel1.setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/* 196 */     this.tfProcurar.setText("Nome ou Codigo do produto");
/* 197 */     this.tfProcurar.addMouseListener(new MouseAdapter() {
/*     */           public void mouseClicked(MouseEvent evt) {
/* 199 */             Produtos.this.tfProcurarMouseClicked(evt);
/*     */           }
/*     */           public void mouseEntered(MouseEvent evt) {
/* 202 */             Produtos.this.tfProcurarMouseEntered(evt);
/*     */           }
/*     */         });
/* 205 */     this.tfProcurar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 207 */             Produtos.this.tfProcurarActionPerformed(evt);
/*     */           }
/*     */         });
/* 210 */     this.tfProcurar.addKeyListener(new KeyAdapter() {
/*     */           public void keyTyped(KeyEvent evt) {
/* 212 */             Produtos.this.tfProcurarKeyTyped(evt);
/*     */           }
/*     */         });
/* 215 */     this.jPanel1.add(this.tfProcurar, new AbsoluteConstraints(70, 50, 250, 30));
/*     */     
/* 217 */     this.jPanel3.setBorder(BorderFactory.createTitledBorder(null, "Produtos", 0, 0, new Font("Tahoma", 0, 14)));
/* 218 */     this.jPanel3.setOpaque(false);
/*     */     
/* 220 */     this.tblProdutos.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, 
    { null, null, null, null },  { null, null, null, null },  { null, null, null, null },  { null, null, null, null },  { null, null, null, null }  }, (Object[])new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 233 */     this.tblProdutos.setRowHeight(26);
/* 234 */     this.tblProdutos.setShowVerticalLines(false);
/* 235 */     this.jScrollPane1.setViewportView(this.tblProdutos);
/*     */     
/* 237 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/* 238 */     this.jPanel3.setLayout(jPanel3Layout);
/* 239 */     jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(29, 29, 29).addComponent(this.jScrollPane1, -2, 697, -2).addContainerGap(32, 32767)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 246 */     jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -1, 178, 32767).addContainerGap()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 254 */     this.jPanel1.add(this.jPanel3, new AbsoluteConstraints(70, 110, -1, -1));
/*     */     
/* 256 */     this.jPanel2.setOpaque(false);
/* 257 */     this.jPanel2.setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/* 259 */     this.jLabel1.setText("Nome :");
/* 260 */     this.jPanel2.add(this.jLabel1, new AbsoluteConstraints(10, 70, -1, -1));
/*     */     
/* 262 */     this.jLabel2.setText("Quantidade :");
/* 263 */     this.jPanel2.add(this.jLabel2, new AbsoluteConstraints(10, 162, -1, -1));
/*     */     
/* 265 */     this.jLabel3.setText("Preco Unitario :");
/* 266 */     this.jPanel2.add(this.jLabel3, new AbsoluteConstraints(10, 116, -1, -1));
/*     */     
/* 268 */     this.jLabel4.setText("Categoria :");
/* 269 */     this.jPanel2.add(this.jLabel4, new AbsoluteConstraints(442, 18, -1, -1));
/*     */     
/* 271 */     this.jLabel6.setText("Unidade :");
/* 272 */     this.jPanel2.add(this.jLabel6, new AbsoluteConstraints(450, 64, -1, -1));
/* 273 */     this.jPanel2.add(this.tfNome, new AbsoluteConstraints(107, 63, 254, 28));
/* 274 */     this.jPanel2.add(this.tfPrecoUnitario, new AbsoluteConstraints(107, 109, 254, 28));
/* 275 */     this.jPanel2.add(this.tfQuantidade, new AbsoluteConstraints(107, 155, 254, 28));
/* 276 */     this.jPanel2.add(this.tfCategoria, new AbsoluteConstraints(514, 11, 254, 28));
/* 277 */     this.jPanel2.add(this.tfUnidade, new AbsoluteConstraints(514, 57, 254, 28));
/*     */     
/* 279 */     this.jLabel7.setText("Codigo :");
/* 280 */     this.jPanel2.add(this.jLabel7, new AbsoluteConstraints(10, 18, -1, -1));
/* 281 */     this.jPanel2.add(this.tfCodigo, new AbsoluteConstraints(107, 11, 254, 28));
/*     */     
/* 283 */     this.jPanel2.add(this.cmbCategoria, new AbsoluteConstraints(520, 160, 116, -1));
/*     */     
/* 285 */     this.jPanel2.add(this.cmbUnidade, new AbsoluteConstraints(520, 200, 116, -1));
/*     */     
/* 287 */     this.lblUniEdit.setText("Unidade :");
/* 288 */     this.jPanel2.add(this.lblUniEdit, new AbsoluteConstraints(450, 210, -1, -1));
/*     */     
/* 290 */     this.lblCatEdit.setText("Categoria :");
/* 291 */     this.jPanel2.add(this.lblCatEdit, new AbsoluteConstraints(440, 170, -1, -1));
/*     */     
/* 293 */     this.jLabel8.setFont(new Font("Tahoma", 0, 12));
/* 294 */     this.jLabel8.setText("Mt");
/* 295 */     this.jPanel2.add(this.jLabel8, new AbsoluteConstraints(370, 120, -1, -1));
/* 296 */     this.jPanel2.add(this.tfDesc, new AbsoluteConstraints(510, 100, 254, 28));
/*     */     
/* 298 */     this.jLabel9.setText("Descricao :");
/* 299 */     this.jPanel2.add(this.jLabel9, new AbsoluteConstraints(450, 110, -1, -1));
/*     */     
/* 301 */     this.jPanel1.add(this.jPanel2, new AbsoluteConstraints(70, 360, 780, 230));
/*     */     
/* 303 */     this.jButton2.setIcon(new ImageIcon(getClass().getResource("/images/search_1.png")));
/* 304 */     this.jButton2.setText("Procurar");
/* 305 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 307 */             Produtos.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/* 310 */     this.jPanel1.add(this.jButton2, new AbsoluteConstraints(350, 50, 110, 30));
/* 311 */     this.jPanel1.add(this.jLabel5, new AbsoluteConstraints(389, 0, 940, 690));
/*     */     
/* 313 */     getContentPane().add(this.jPanel1, new AbsoluteConstraints(0, 0, 940, 610));
/*     */     
/* 315 */     this.btnCancel.setText("Cancel");
/* 316 */     this.btnCancel.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 318 */             Produtos.this.btnCancelActionPerformed(evt);
/*     */           }
/*     */         });
/* 321 */     getContentPane().add(this.btnCancel, new AbsoluteConstraints(470, 630, 99, 30));
/*     */     
/* 323 */     this.jButton4.setText("Salvar");
/* 324 */     this.jButton4.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 326 */             Produtos.this.jButton4ActionPerformed(evt);
/*     */           }
/*     */         });
/* 329 */     getContentPane().add(this.jButton4, new AbsoluteConstraints(340, 630, 99, 30));
/*     */     
/* 331 */     this.jButton1.setText("Apagar");
/* 332 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 334 */             Produtos.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/* 337 */     getContentPane().add(this.jButton1, new AbsoluteConstraints(210, 630, 99, 30));
/*     */     
/* 339 */     this.btnEditar.setText("Editar");
/* 340 */     this.btnEditar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 342 */             Produtos.this.btnEditarActionPerformed(evt);
/*     */           }
/*     */         });
/* 345 */     getContentPane().add(this.btnEditar, new AbsoluteConstraints(90, 630, 99, 30));
/*     */     
/* 347 */     this.jLabel11.setIcon(new ImageIcon(getClass().getResource("/images/Fundo.png")));
/* 348 */     getContentPane().add(this.jLabel11, new AbsoluteConstraints(0, 0, 910, 720));
/*     */     
/* 350 */     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
/* 351 */     setBounds((screenSize.width - 912) / 2, (screenSize.height - 730) / 2, 912, 730);
/*     */   }
/*     */ 
/*     */   
/*     */   private void tfProcurarMouseEntered(MouseEvent evt) {
/* 356 */     this.tfProcurar.requestFocus();
/*     */   }
/*     */ 
/*     */   
/*     */   private void tfProcurarActionPerformed(ActionEvent evt) {
/* 361 */     this.tfProcurar.setText("");
/*     */   }
/*     */ 
/*     */   
/*     */   private void tfProcurarMouseClicked(MouseEvent evt) {
/* 366 */     if (this.tfProcurar.getText().contentEquals("Nome ou Codigo do produto")) {
/* 367 */       this.tfProcurar.setText("");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private void btnEditarActionPerformed(ActionEvent evt) {
/*     */     try {
/* 374 */       if (this.tfCodigo.getText().isEmpty()) {
/* 375 */         throw new VendasException("Selecione um Produto");
/*     */       }
/* 377 */       Habilitar();
/* 378 */       HabilitarEdicao();
/*     */     
/*     */     }
/* 381 */     catch (VendasException e) {
/* 382 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "Atencao", 3, null);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void tfProcurarKeyTyped(KeyEvent evt) {
/* 389 */     if (this.tfProcurar.getText().contentEquals("Nome ou Codigo do produto")) {
/* 390 */       this.tfProcurar.setText("");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 396 */     String parametro = this.tfProcurar.getText();
/* 397 */     if (parametro.isEmpty() || parametro.contains("Nome ou Codigo do produto")) {
/*     */       
/* 399 */       JOptionPane.showMessageDialog(this.rootPane, "Nome ou codigo nao devem ser vazios", "", 3, null);
/*     */     } else {
/* 401 */       PopularTabelaProdutos(parametro);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void jButton4ActionPerformed(ActionEvent evt) {
/* 407 */     if (!verificadados()) {
/*     */ 
/*     */       
/*     */       try { 
/*     */         
/* 412 */         int codigo = Integer.parseInt(this.tfCodigo.getText().toString());
/* 413 */         String nome = this.tfNome.getText();
/* 414 */         double preco_unitario = Double.parseDouble(this.tfPrecoUnitario.getText());
/* 415 */         int quantidadeStock = Integer.parseInt(this.tfQuantidade.getText().toString());
/* 416 */         ProdutosServicos ps = new ProdutosServicos();
/* 417 */         int unidade = ps.CapturaIdUnidade(this.cmbUnidade.getSelectedItem().toString());
/* 418 */         int categoria = ps.CapturaIdCategoria(this.cmbCategoria.getSelectedItem().toString());
/* 419 */         String descricao = this.tfDesc.getText();
/*     */         
/* 421 */         ProdutoDAO dao = new ProdutoDAO();
/* 422 */         dao.Editarproduto(codigo, nome, preco_unitario, quantidadeStock, unidade, categoria, descricao);
/* 423 */         PopularTabela();
/* 424 */         DesbilitarEdicao();
/* 425 */         Desabilitar();
/* 426 */         JOptionPane.showMessageDialog(this.rootPane, "O Produto Foi Editado Com Sucesso"); }
/*     */       catch (NumberFormatException e)
/*     */       
/* 429 */       { JOptionPane.showMessageDialog(this.rootPane, "Quantidade e Preco Devem ser Numeros", "", 3, null); }
/* 430 */       catch (Exception e) { JOptionPane.showMessageDialog(this.rootPane, "Nao e Possivel Editar o Produto", "erro", 3, null); }
/*     */     
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void btnCancelActionPerformed(ActionEvent evt) {
/* 439 */     dispose();
/*     */   }
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/*     */     try {
/* 445 */       if (this.tfCodigo.getText().isEmpty()) {
/* 446 */         throw new VendasException("Selecione o Produto que deseja apagar");
/*     */       }
/*     */       
/* 449 */       int pipas = JOptionPane.showConfirmDialog(this, "Tem Certeza que quer Apagar o produto?", "CONFIRMACAO", 0);
/* 450 */       if (pipas == 0)
/*     */       {
/* 452 */         ProdutoDAO pd = new ProdutoDAO();
/* 453 */         pd.ApagarProduto(Integer.parseInt(this.tfCodigo.getText()));
/* 454 */         PopularTabela();
/* 455 */         DesbilitarEdicao();
/* 456 */         Desabilitar();
/*     */       
/*     */       }
/*     */     
/*     */     }
/* 461 */     catch (VendasException e) {
/* 462 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "Atencao", 3, null);
/*     */     } catch (Exception e) {
/* 464 */       JOptionPane.showMessageDialog(this.rootPane, "Nao foi Possivel apagar o produto", "Erro", 3, null);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void PopularTabela() {
/*     */     try {
/* 476 */       ProdutoDAO p = new ProdutoDAO();
/* 477 */       ResultSet rs = p.TodosProdutos();
/* 478 */       if (!rs.next()) {
/*     */         
/* 480 */         this.tblProdutos.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null } ,
    { null, null, null, null },  { null, null, null, null },  { null, null, null, null }, { null, null, null, null },  { null, null, null, null }
        , { null, null, null, null } , { null, null, null, null }, { null, null, null, null }, { null, null, null, null }
        , { null, null, null, null }  }, (Object[])new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 498 */         this.tblProdutos.setRowHeight(26);
/* 499 */         this.tblProdutos.setShowVerticalLines(false);
/* 500 */         this.jScrollPane1.setViewportView(this.tblProdutos);
/*     */         
/* 502 */         throw new VendasException("Produtos nao foram encontrados");
/*     */       } 
/* 504 */       ResultSetTableModel produtosTablemodel = new ResultSetTableModel(rs);
/* 505 */       this.tblProdutos.setModel(produtosTablemodel);
/*     */ 
/*     */       
/* 508 */       this.tblProdutos.setRowHeight(27);
/* 509 */       this.tblProdutos.getSelectionModel().addListSelectionListener(new RowListenerProdutos());
/*     */     }
/* 511 */     catch (VendasException e) {
/* 512 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null);
/* 513 */     } catch (SQLException e) {
/* 514 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null);
/*     */     } 
/*     */   }
/*     */   
/*     */   private class RowListenerProdutos
/*     */     implements ListSelectionListener {
/*     */     private RowListenerProdutos() {}
/*     */     
/*     */     public void valueChanged(ListSelectionEvent event) {
/* 523 */       if (event.getValueIsAdjusting()) {
/*     */         return;
/*     */       }
/*     */       
/* 527 */       int colunaCodigo = 0;
/* 528 */       int linhaCodigo = Produtos.this.tblProdutos.getSelectedRow();
/* 529 */       int ColunaNome = 1;
/* 530 */       int colunaPreco = 2;
/* 531 */       int colunaQuantidade = 3;
/* 532 */       int colunaUnidade = 4;
/* 533 */       int colunaCategoria = 5;
/* 534 */       int colunaDesc = 6;
/*     */       try {
/* 536 */         int codigoProduto = Integer.valueOf(Produtos.this.tblProdutos.getValueAt(linhaCodigo, colunaCodigo).toString()).intValue();
/* 537 */         if (Produtos.this.tblProdutos.getValueAt(linhaCodigo, colunaCodigo).toString().contentEquals("")) {
/* 538 */           throw new Exception("");
/*     */         }
/*     */         
/* 541 */         Produto pr = new Produto();
/* 542 */         pr.setCod_produto(Integer.valueOf(codigoProduto));
/* 543 */         pr.setNome(Produtos.this.tblProdutos.getValueAt(linhaCodigo, ColunaNome).toString());
/* 544 */         pr.setQuantidadeStock(Integer.valueOf(Produtos.this.tblProdutos.getValueAt(linhaCodigo, colunaQuantidade).toString()));
/* 545 */         pr.setPreco_unitario(Double.valueOf(Produtos.this.tblProdutos.getValueAt(linhaCodigo, colunaPreco).toString()));
/* 546 */         pr.setUnidade(Produtos.this.tblProdutos.getValueAt(linhaCodigo, colunaUnidade).toString());
/* 547 */         pr.setCategoria(Produtos.this.tblProdutos.getValueAt(linhaCodigo, colunaCategoria).toString());
/* 548 */         pr.setDescricao(Produtos.this.tblProdutos.getValueAt(linhaCodigo, colunaDesc).toString());
/*     */ 
/*     */         
/* 551 */         Produtos.this.setDetalhesProduto(pr);
/*     */       }
/* 553 */       catch (Exception e) {}
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setDetalhesProduto(Produto p) {
/* 562 */     this.tfCodigo.setText(p.getCod_produto().toString());
/* 563 */     this.tfNome.setText(p.getNome());
/* 564 */     this.tfCategoria.setText(p.getCategoria());
/* 565 */     this.tfPrecoUnitario.setText(p.getPreco_unitario().toString());
/* 566 */     this.tfQuantidade.setText(p.getQuantidadeStock().toString());
/* 567 */     this.tfUnidade.setText(p.getUnidade());
/* 568 */     this.tfDesc.setText(p.getDescricao());
/*     */   }
/*     */   
/*     */   private void Desabilitar() {
/* 572 */     this.tfCodigo.setEditable(false);
/* 573 */     this.tfNome.setEditable(false);
/* 574 */     this.tfCategoria.setEditable(false);
/* 575 */     this.tfPrecoUnitario.setEditable(false);
/* 576 */     this.tfQuantidade.setEditable(false);
/* 577 */     this.tfUnidade.setEditable(false);
/* 578 */     this.tfDesc.setEditable(false);
/* 579 */     this.tfCodigo.setText("");
/* 580 */     this.tfNome.setText("");
/* 581 */     this.tfCategoria.setText("");
/* 582 */     this.tfPrecoUnitario.setText("");
/* 583 */     this.tfQuantidade.setText("");
/* 584 */     this.tfUnidade.setText("");
/* 585 */     this.tfDesc.setText("");
/*     */   }
/*     */ 
/*     */   
/*     */   private void Habilitar() {
/* 590 */     this.tfCodigo.setEditable(false);
/* 591 */     this.tfNome.setEditable(true);
/* 592 */     this.tfCategoria.setEditable(true);
/* 593 */     this.tfPrecoUnitario.setEditable(true);
/* 594 */     this.tfQuantidade.setEditable(true);
/* 595 */     this.tfUnidade.setEditable(true);
/* 596 */     this.tfDesc.setEditable(true);
/*     */   }
/*     */   
/*     */   private void HabilitarEdicao() {
/* 600 */     this.lblCatEdit.setVisible(true);
/* 601 */     this.lblUniEdit.setVisible(true);
/* 602 */     this.cmbUnidade.setVisible(true);
/* 603 */     this.cmbCategoria.setVisible(true);
/* 604 */     this.jLabel6.setVisible(false);
/* 605 */     this.jLabel4.setVisible(false);
/* 606 */     this.tfCategoria.setVisible(false);
/* 607 */     this.tfUnidade.setVisible(false);
/*     */   }
/*     */ 
/*     */   
/*     */   private void DesbilitarEdicao() {
/* 612 */     this.lblCatEdit.setVisible(false);
/* 613 */     this.lblUniEdit.setVisible(false);
/* 614 */     this.cmbUnidade.setVisible(false);
/* 615 */     this.cmbCategoria.setVisible(false);
/* 616 */     this.tfCategoria.setVisible(true);
/* 617 */     this.tfUnidade.setVisible(true);
/* 618 */     this.jLabel6.setVisible(true);
/* 619 */     this.jLabel4.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void PopularTabelaProdutos(String parametro) {
/*     */     try {
/* 627 */       ProdutoDAO p = new ProdutoDAO();
/* 628 */       ResultSet rs = p.SearchProdutoVenda(parametro);
/* 629 */       if (!rs.next()) {
/* 630 */         this.tblProdutos.setModel(new ResultSetTableModel(rs));
/* 631 */         this.tblProdutos.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null },  { null, null, null, null, null, null },
    { null, null, null, null, null, null },  { null, null, null, null, null, null }, { null, null, null, null, null, null },  { null, null, null, null, null, null }, 
    { null, null, null, null, null, null },  }, (Object[])new String[] { "Codigo", "Nome", "Preco Unitario", "Quantidade de Comprar", "Unidade", "Categoria" }));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 642 */         this.tblProdutos.setRowHeight(26);
/* 643 */         this.tblProdutos.setShowVerticalLines(false);
/* 644 */         this.jScrollPane1.setViewportView(this.tblProdutos);
/* 645 */         throw new VendasException("Produto nao foi encontrado");
/*     */       } 
/* 647 */       ResultSetTableModel produtosTablemodel = new ResultSetTableModel(rs);
/* 648 */       this.tblProdutos.setModel(produtosTablemodel);
/* 649 */       TableColumnAdjuster ajustaColunas = new TableColumnAdjuster(this.tblProdutos);
/* 650 */       ajustaColunas.adjustColumns();
/*     */     }
/* 652 */     catch (VendasException e) {
/* 653 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null);
/* 654 */     } catch (SQLException e) {
/* 655 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/* 662 */     EventQueue.invokeLater(new Runnable()
/*     */         {
/*     */           public void run() {
/* 665 */             (new Produtos()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Sistema de vendas\SysVendas.jar!\Presentation\Produtos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */