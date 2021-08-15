/*     */ package Presentation;
/*     */ import BussinessLogic.Produto;
/*     */ import DataAcessLayer.ProdutoDAO;
/*     */ import Service.ProdutosServicos;
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
import java.awt.EventQueue;
/*     */ import java.awt.Font;
import java.awt.LayoutManager;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
/*     */ import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import javax.naming.CannotProceedException;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JRootPane;
import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextField;
import javax.swing.LayoutStyle;
/*     */ import javax.swing.ProgressMonitor;
/*     */ import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
/*     */ 
/*     */ public class AddStock extends JFrame {
/*     */   private ProgressMonitor progressMonitor;
/*     */   private Task task;
/*     */   private JButton btnAddStock;
/*     */   private JButton btnProcurar;
/*     */   private JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   
/*     */   public AddStock() {
/*  41 */     initComponents();
/*  42 */     setLocation(5, 5);
/*     */   }
/*     */   private JLabel jLabel2; private JLabel jLabel3; private JLabel jLabel4; private JLabel jLabel5; private JLabel jLabel6; private JLabel jLabel8; private JLabel jLabel9; private JPanel jPanel1; private JPanel jPanel2; private JPanel jPanel3; private JPanel jPanel4; private JScrollPane jScrollPane1; private JLabel lblCategoriaP;
/*     */   private JLabel lblCodigoP;
/*     */   private JLabel lblNomeP;
/*     */   private JLabel lblPrecoP;
/*     */   private JLabel lblQuantidadeP;
/*     */   private JLabel lblUnidadeP;
/*     */   private JTable tblProdutos;
/*     */   private JTextField tfProcurar;
/*     */   private JTextField tfQuantidadeAdd;
/*     */   
/*     */   private void initComponents() {
/*  55 */     this.jPanel1 = new JPanel();
/*  56 */     this.tfProcurar = new JTextField();
/*  57 */     this.btnProcurar = new JButton();
/*  58 */     this.jPanel3 = new JPanel();
/*  59 */     this.jLabel8 = new JLabel();
/*  60 */     this.tfQuantidadeAdd = new JTextField();
/*  61 */     this.btnAddStock = new JButton();
/*  62 */     this.jPanel4 = new JPanel();
/*  63 */     this.jScrollPane1 = new JScrollPane();
/*  64 */     this.tblProdutos = new JTable();
/*  65 */     this.jPanel2 = new JPanel();
/*  66 */     this.jLabel1 = new JLabel();
/*  67 */     this.jLabel2 = new JLabel();
/*  68 */     this.jLabel3 = new JLabel();
/*  69 */     this.jLabel4 = new JLabel();
/*  70 */     this.jLabel5 = new JLabel();
/*  71 */     this.jLabel6 = new JLabel();
/*  72 */     this.lblCodigoP = new JLabel();
/*  73 */     this.lblNomeP = new JLabel();
/*  74 */     this.lblPrecoP = new JLabel();
/*  75 */     this.lblCategoriaP = new JLabel();
/*  76 */     this.lblQuantidadeP = new JLabel();
/*  77 */     this.lblUnidadeP = new JLabel();
/*  78 */     this.jButton1 = new JButton();
/*  79 */     this.jLabel9 = new JLabel();
/*     */     
/*  81 */     setDefaultCloseOperation(2);
/*  82 */     setTitle("Adicionar Stock");
/*  83 */     setResizable(false);
/*  84 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/*  86 */     this.jPanel1.setOpaque(false);
/*  87 */     this.jPanel1.setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/*  89 */     this.tfProcurar.setText("Nome ou Codigo do produto...");
/*  90 */     this.tfProcurar.addMouseListener(new MouseAdapter() {
/*     */           public void mouseClicked(MouseEvent evt) {
/*  92 */             AddStock.this.tfProcurarMouseClicked(evt);
/*     */           }
/*     */           public void mouseExited(MouseEvent evt) {
/*  95 */             AddStock.this.tfProcurarMouseExited(evt);
/*     */           }
/*     */         });
/*  98 */     this.tfProcurar.addFocusListener(new FocusAdapter() {
/*     */           public void focusLost(FocusEvent evt) {
/* 100 */             AddStock.this.tfProcurarFocusLost(evt);
/*     */           }
/*     */         });
/* 103 */     this.tfProcurar.addKeyListener(new KeyAdapter() {
/*     */           public void keyTyped(KeyEvent evt) {
/* 105 */             AddStock.this.tfProcurarKeyTyped(evt);
/*     */           }
/*     */         });
/* 108 */     this.jPanel1.add(this.tfProcurar, new AbsoluteConstraints(60, 50, 284, 29));
/*     */     
/* 110 */     this.btnProcurar.setIcon(new ImageIcon(getClass().getResource("/images/search_1.png")));
/* 111 */     this.btnProcurar.setText("Procurar");
/* 112 */     this.btnProcurar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 114 */             AddStock.this.btnProcurarActionPerformed(evt);
/*     */           }
/*     */         });
/* 117 */     this.jPanel1.add(this.btnProcurar, new AbsoluteConstraints(360, 50, -1, 32));
/*     */     
/* 119 */     this.jPanel3.setBorder(BorderFactory.createTitledBorder(""));
/* 120 */     this.jPanel3.setOpaque(false);
/*     */     
/* 122 */     this.jLabel8.setFont(new Font("Segoe UI", 0, 12));
/* 123 */     this.jLabel8.setText("Quantidade a adicionar : ");
/*     */     
/* 125 */     this.btnAddStock.setText("Ok");
/* 126 */     this.btnAddStock.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 128 */             AddStock.this.btnAddStockActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 132 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/* 133 */     this.jPanel3.setLayout(jPanel3Layout);
/* 134 */     jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.btnAddStock, -2, 77, -2)).addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel8).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.tfQuantidadeAdd, -2, 161, -2))).addContainerGap(91, 32767)));
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
/* 148 */     jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel8).addComponent(this.tfQuantidadeAdd, -2, 29, -2)).addGap(18, 18, 18).addComponent(this.btnAddStock, -2, 30, -2).addContainerGap()));
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
/* 160 */     this.jPanel1.add(this.jPanel3, new AbsoluteConstraints(560, 390, 410, -1));
/*     */     
/* 162 */     this.jPanel4.setBorder(BorderFactory.createTitledBorder(null, "Produtos", 0, 0, new Font("Cambria", 0, 16)));
/* 163 */     this.jPanel4.setOpaque(false);
/*     */     
/* 165 */     this.tblProdutos.setModel(
        new DefaultTableModel(new Object[][] { { null, null, null, null } } , (Object[]) new String[] { "Codigo", "Nome", "Preco", "Quantidade" }) );
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
/* 180 */     this.tblProdutos.setRowHeight(26);
/* 181 */     this.tblProdutos.setShowVerticalLines(false);
/* 182 */     this.jScrollPane1.setViewportView(this.tblProdutos);
/*     */     
/* 184 */     GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
/* 185 */     this.jPanel4.setLayout(jPanel4Layout);
/* 186 */     jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -1, 438, 32767).addContainerGap()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 193 */     jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -1, 205, 32767).addContainerGap()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 201 */     this.jPanel1.add(this.jPanel4, new AbsoluteConstraints(50, 120, 470, 260));
/*     */     
/* 203 */     this.jPanel2.setBorder(BorderFactory.createTitledBorder(null, "Detalhes do Produto", 0, 0, new Font("Tahoma", 0, 14)));
/* 204 */     this.jPanel2.setFont(new Font("Tahoma", 0, 14));
/* 205 */     this.jPanel2.setOpaque(false);
/*     */     
/* 207 */     this.jLabel1.setFont(new Font("Segoe UI", 0, 12));
/* 208 */     this.jLabel1.setText("Codigo :");
/*     */     
/* 210 */     this.jLabel2.setFont(new Font("Segoe UI", 0, 12));
/* 211 */     this.jLabel2.setText("Nome :");
/*     */     
/* 213 */     this.jLabel3.setFont(new Font("Segoe UI", 0, 12));
/* 214 */     this.jLabel3.setText("Preco :");
/*     */     
/* 216 */     this.jLabel4.setFont(new Font("Segoe UI", 0, 12));
/* 217 */     this.jLabel4.setText("Categoria :");
/*     */     
/* 219 */     this.jLabel5.setFont(new Font("Segoe UI", 0, 12));
/* 220 */     this.jLabel5.setText("Quantidade :");
/*     */     
/* 222 */     this.jLabel6.setFont(new Font("Segoe UI", 0, 12));
/* 223 */     this.jLabel6.setText("Unidade :");
/*     */     
/* 225 */     this.lblCodigoP.setFont(new Font("Segoe UI", 0, 12));
/*     */     
/* 227 */     this.lblNomeP.setFont(new Font("Segoe UI", 0, 12));
/*     */     
/* 229 */     this.lblPrecoP.setFont(new Font("Segoe UI", 0, 12));
/*     */     
/* 231 */     this.lblCategoriaP.setFont(new Font("Segoe UI", 0, 12));
/*     */     
/* 233 */     this.lblQuantidadeP.setFont(new Font("Segoe UI", 0, 12));
/*     */     
/* 235 */     this.lblUnidadeP.setFont(new Font("Segoe UI", 0, 12));
/*     */     
/* 237 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/* 238 */     this.jPanel2.setLayout(jPanel2Layout);
/* 239 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(28, 28, 28).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel4).addGap(93, 93, 93).addComponent(this.lblCategoriaP, -1, 363, 32767)).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel1).addComponent(this.jLabel2).addComponent(this.jLabel3)).addGap(108, 108, 108).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.lblPrecoP, -1, 360, 32767).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.lblCodigoP, -1, 360, 32767).addComponent(this.lblNomeP)))).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel6).addComponent(this.jLabel5)).addGap(80, 80, 80).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.lblQuantidadeP, -1, 365, 32767).addComponent(this.lblUnidadeP, GroupLayout.Alignment.LEADING, -1, 365, 32767)))).addGap(27, 27, 27)));
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
/* 269 */     jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(24, 24, 24).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel1).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.lblNomeP)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.lblPrecoP)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.lblCategoriaP)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel5).addComponent(this.lblQuantidadeP)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel6).addComponent(this.lblUnidadeP))).addComponent(this.lblCodigoP)).addContainerGap(20, 32767)));
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
/* 300 */     this.jPanel1.add(this.jPanel2, new AbsoluteConstraints(560, 120, 410, 260));
/*     */     
/* 302 */     this.jButton1.setText("Cancel");
/* 303 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 305 */             AddStock.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/* 308 */     this.jPanel1.add(this.jButton1, new AbsoluteConstraints(880, 530, 90, 30));
/*     */     
/* 310 */     getContentPane().add(this.jPanel1, new AbsoluteConstraints(0, 0, 1020, 600));
/*     */     
/* 312 */     this.jLabel9.setIcon(new ImageIcon(getClass().getResource("/images/Fundo.png")));
/* 313 */     getContentPane().add(this.jLabel9, new AbsoluteConstraints(0, 0, 1010, 600));
/*     */     
/* 315 */     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
/* 316 */     setBounds((screenSize.width - 1012) / 2, (screenSize.height - 621) / 2, 1012, 621);
/*     */   }
/*     */   private void setDetalhesProduto(Produto p) {
/* 319 */     this.lblCodigoP.setText(p.getCod_produto().toString());
/* 320 */     this.lblNomeP.setText(p.getNome());
/* 321 */     this.lblCategoriaP.setText(p.getCategoria());
/* 322 */     this.lblPrecoP.setText(p.getPreco_unitario().toString() + "   mt");
/* 323 */     this.lblQuantidadeP.setText(p.getQuantidadeStock().toString());
/* 324 */     this.lblUnidadeP.setText(p.getUnidade());
/*     */   }
/*     */   private void ResetDetalhesProduto() {
/* 327 */     this.lblCodigoP.setText("");
/* 328 */     this.lblNomeP.setText("");
/* 329 */     this.lblCategoriaP.setText("");
/* 330 */     this.lblPrecoP.setText("");
/* 331 */     this.lblQuantidadeP.setText("");
/* 332 */     this.lblUnidadeP.setText("");
/*     */   }
/*     */ 
/*     */   
/*     */   private void PopularTabelaProdutos(String parametro) {
/*     */     
/* 338 */     try { ProdutoDAO p = new ProdutoDAO();
/* 339 */       ResultSet rs = p.ProcurarProdutos(parametro);
/* 340 */       if (!rs.next()) {
/*     */ 
/*     */         
/* 343 */         ResetDetalhesProduto();
/* 344 */         this.tblProdutos.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }}, (Object[])new String[] { "Codigo", "Nome", "Preco", "Quantidade" }));
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
/* 359 */         this.tblProdutos.setRowHeight(26);
/* 360 */         this.tblProdutos.setShowVerticalLines(false);
/* 361 */         this.jScrollPane1.setViewportView(this.tblProdutos);
/* 362 */         throw new VendasException("Produto nao foi encontrado");
/*     */       } 
/*     */       
/* 365 */       ResultSetTableModel produtosTablemodel = new ResultSetTableModel(rs);
/* 366 */       this.tblProdutos.setModel(produtosTablemodel);
/*     */ 
/*     */       
/* 369 */       this.tblProdutos.getSelectionModel().addListSelectionListener(new RowListenerProdutos());
/* 370 */       ProdutosServicos ps = new ProdutosServicos();
/* 371 */       int coluna = 0, linha = 0;
/* 372 */       int codigoProduto = Integer.valueOf(this.tblProdutos.getValueAt(linha, coluna).toString()).intValue();
/*     */       
/* 374 */       Produto produto = ps.getDetalhesProduto(codigoProduto);
/* 375 */       setDetalhesProduto(produto); }
/*     */     catch (VendasException e)
/* 377 */     { JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null); }
/* 378 */     catch (SQLException e) { JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null); }
/*     */   
/*     */   }
/*     */   
/*     */   private class RowListenerProdutos implements ListSelectionListener { private RowListenerProdutos() {}
/*     */     
/*     */     public void valueChanged(ListSelectionEvent event) {
/* 385 */       if (event.getValueIsAdjusting()) {
/*     */         return;
/*     */       }
/* 388 */       ProdutosServicos ps = new ProdutosServicos();
/* 389 */       int coluna = 0;
/* 390 */       int linha = AddStock.this.tblProdutos.getSelectedRow();
/* 391 */       int codigoProduto = Integer.valueOf(AddStock.this.tblProdutos.getValueAt(linha, coluna).toString()).intValue();
/*     */       
/*     */       try {
/* 394 */         Produto produto = ps.getDetalhesProduto(codigoProduto);
/* 395 */         AddStock.this.setDetalhesProduto(produto);
/*     */       } catch (Exception e) {
/* 397 */         JOptionPane.showMessageDialog(AddStock.this.rootPane, e.getMessage() + " " + "Contacte o Desenvolvedor do software", "", 3, null);
/*     */       } 
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void btnAddStockActionPerformed(ActionEvent evt) {
/* 406 */     this.progressMonitor = new ProgressMonitor(this.rootPane, "Adicionado Quantidade...", null, 0, 100);
/* 407 */     this.progressMonitor.setProgress(0);
/* 408 */     this.task = new Task();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 413 */     try { String codProduto = this.lblCodigoP.getText();
/* 414 */       String quant = this.tfQuantidadeAdd.getText();
/*     */       
/* 416 */       if (codProduto.isEmpty())
/*     */       {
/*     */         
/* 419 */         throw new VendasException("Identifique o Produto");
/*     */       }
/*     */       
/* 422 */       if (quant.isEmpty())
/*     */       {
/* 424 */         throw new CannotProceedException("Introduz a quantidade");
/*     */       }
/* 426 */       int quantidade = Integer.parseInt(quant);
/* 427 */       if (quantidade < 0)
/*     */       {
/* 429 */         throw new NegativeNumberException("A quantidade deve ser maior que 0");
/*     */       }
/*     */       
/* 432 */       Produto p = new Produto(Integer.valueOf(codProduto));
/* 433 */       ProdutosServicos produtoservico = new ProdutosServicos();
/* 434 */       produtoservico.AdicionarStock(p, quantidade);
/* 435 */       this.task.addPropertyChangeListener(new ProdutosChangeListener());
/* 436 */       this.task.execute();
/*     */       
/* 438 */       this.tfQuantidadeAdd.setText("");
/*     */       
/*     */        }
/*     */     
/*     */     catch (NegativeNumberException e)
/*     */     
/*     */     { 
/* 445 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 0, null); }
/* 446 */     catch (NumberFormatException e) { JOptionPane.showMessageDialog(this.rootPane, "Deve introduzir Numeros Decimais", "Erro", 0, null); }
/* 447 */     catch (VendasException e) { JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null); }
/* 448 */     catch (CannotProceedException e) { JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 0, null); }
/* 449 */     catch (Exception e) { JOptionPane.showMessageDialog(this.rootPane, "Contacte o desenvolvedor do Software", "ERR0", 0, null); }
/*     */   
/*     */   }
/*     */   
/*     */   private void btnProcurarActionPerformed(ActionEvent evt) {
/* 454 */     String parametro = this.tfProcurar.getText();
/* 455 */     if (parametro.isEmpty() || parametro.contains("Nome ou Codigo do produto...")) {
/*     */       
/* 457 */       this.tfProcurar.setText("");
/* 458 */       JOptionPane.showMessageDialog(this.rootPane, "Nome ou codigo nao devem ser vazios", "", 3, null);
/*     */     }
/*     */     else {
/*     */       
/* 462 */       PopularTabelaProdutos(parametro);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void tfProcurarKeyTyped(KeyEvent evt) {
/* 468 */     if (this.tfProcurar.getText().contentEquals("Nome ou Codigo do produto..."))
/*     */     {
/* 470 */       this.tfProcurar.setText("");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void tfProcurarMouseClicked(MouseEvent evt) {
/* 480 */     if (this.tfProcurar.getText().contentEquals("Nome ou Codigo do produto..."))
/*     */     {
/* 482 */       this.tfProcurar.setText("");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void tfProcurarMouseExited(MouseEvent evt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void tfProcurarFocusLost(FocusEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 499 */     dispose();
/*     */   }
/*     */   
/*     */   private class TabelaProdutosRowListener implements ListSelectionListener {
/*     */     public void valueChanged(ListSelectionEvent event) {
/* 504 */       if (event.getValueIsAdjusting())
/*     */         return; 
/*     */     }
/*     */   }
/*     */   
/*     */   private class ProdutosErroChangeListener
/*     */     implements PropertyChangeListener {
/*     */     public void propertyChange(PropertyChangeEvent evt) {
/* 512 */       if ("progress" == evt.getPropertyName()) {
/* 513 */         int progress = ((Integer)evt.getNewValue()).intValue();
/* 514 */         AddStock.this.progressMonitor.setProgress(progress);
/* 515 */         String message = String.format("Completed %d%%.\n", new Object[] { Integer.valueOf(progress) });
/*     */         
/* 517 */         AddStock.this.progressMonitor.setNote(message);
/* 518 */         if (progress > 40) {
/*     */           
/* 520 */           Toolkit.getDefaultToolkit().beep();
/* 521 */           AddStock.this.task.cancel(true);
/* 522 */           AddStock.this.progressMonitor.close();
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private class ProdutosChangeListener implements PropertyChangeListener {
/*     */     private ProdutosChangeListener() {}
/*     */     
/*     */     public void propertyChange(PropertyChangeEvent evt) {
/* 532 */       if ("progress" == evt.getPropertyName()) {
/* 533 */         int progress = ((Integer)evt.getNewValue()).intValue();
/* 534 */         AddStock.this.progressMonitor.setProgress(progress);
/* 535 */         String message = String.format("Progresso %d%%.\n", new Object[] { Integer.valueOf(progress) });
/*     */         
/* 537 */         AddStock.this.progressMonitor.setNote(message);
/*     */         
/* 539 */         if (AddStock.this.progressMonitor.isCanceled() || AddStock.this.task.isDone()) {
/* 540 */           Toolkit.getDefaultToolkit().beep();
/* 541 */           if (AddStock.this.progressMonitor.isCanceled()) {
/* 542 */             AddStock.this.task.cancel(true);
/*     */           } else {
/*     */ 
/*     */             
/*     */             try {
/* 547 */               JOptionPane.showMessageDialog(AddStock.this.rootPane, "Quantidade Adicionada", "", 3, null);
/* 548 */               int codProduto = Integer.valueOf(AddStock.this.lblCodigoP.getText()).intValue();
/* 549 */               Produto p = new Produto();
/* 550 */               p.setCod_produto(Integer.valueOf(codProduto));
/* 551 */               ProdutosServicos produtoservico = new ProdutosServicos();
/* 552 */               Produto produto = produtoservico.getDetalhesProduto(p.getCod_produto().intValue());
/* 553 */               AddStock.this.setDetalhesProduto(produto);
/* 554 */               AddStock.this.PopularTabelaProdutos(AddStock.this.tfProcurar.getText());
/* 555 */               AddStock.this.tfQuantidadeAdd.setText("");
/*     */             }
/* 557 */             catch (Exception e) {}
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 563 */           AddStock.this.btnAddStock.setEnabled(true);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/* 575 */     EventQueue.invokeLater(new Runnable()
/*     */         {
/*     */           public void run() {
/* 578 */             AddStock addStock = new AddStock();
/* 579 */             addStock.setVisible(true);
/*     */             
/* 581 */             addStock.setBackground(new Color(0, 0, 0, 254));
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Sistema de vendas\SysVendas.jar!\Presentation\AddStock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */