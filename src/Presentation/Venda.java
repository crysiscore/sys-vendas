/*     */ package Presentation;
/*     */ import BussinessLogic.DetalhesVenda;
/*     */ import DataAcessLayer.ProdutoDAO;
/*     */ import Service.ProdutosServicos;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JRootPane;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.ProgressMonitor;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*     */ import org.netbeans.lib.awtextra.AbsoluteLayout;
/*     */ import relatorios.Relatorios;
/*     */ 
/*     */ public class Venda extends JFrame {
/*     */   int counter;
/*     */   int counterVendap;
/*     */   double totalVenda;
/*     */   private ProgressMonitor progressMonitor;
/*     */   private Task task;
/*     */   private JButton btnAdicionar;
/*     */   private JButton btnEfectuarVenda;
/*     */   private JButton btnProcurar;
/*     */   private JButton btncancel;
/*     */   private JButton jButton6;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*  52 */   VendasTableModel vt = new VendasTableModel();
/*     */   private JLabel jLabel4;
/*     */   
/*     */   public Venda() {
/*  56 */     initComponents();
/*  57 */     this.counter = 0;
/*  58 */     this.counterVendap = 0;
/*  59 */     this.totalVenda = 0.0D;
/*  60 */     this.lblCarrinhoVenda.setIcon(new ImageIcon(getClass().getResource("/images/carrinhoEmppty.gif")));
/*     */ 
/*     */     
/*  63 */     this.tableProdutosVenda.setModel(this.vt);
/*  64 */     setLocation(5, 5);
/*     */   }
/*     */   private JLabel jLabel5; private JLabel jLabel6;
/*     */   private JLabel jLabel7;
/*     */   private JPanel jPanel1;
/*     */   private JPanel jPanel2;
/*     */   private JPanel jPanel3;
/*     */   private JScrollPane jScrollPane1;
/*     */   private JScrollPane jScrollPane2;
/*     */   private JLabel lblCarrinhoVenda;
/*     */   
/*     */   private void initComponents() {
/*  76 */     this.jPanel1 = new JPanel();
/*  77 */     this.btnEfectuarVenda = new JButton();
/*  78 */     this.btnProcurar = new JButton();
/*  79 */     this.btncancel = new JButton();
/*  80 */     this.jPanel2 = new JPanel();
/*  81 */     this.jScrollPane2 = new JScrollPane();
/*  82 */     this.tableProdutosVenda = new JTable();
/*  83 */     this.jPanel3 = new JPanel();
/*  84 */     this.jScrollPane1 = new JScrollPane();
/*  85 */     this.tblProdutos = new JTable();
/*  86 */     this.jLabel2 = new JLabel();
/*  87 */     this.jLabel5 = new JLabel();
/*  88 */     this.lblNomeFunc = new JLabel();
/*  89 */     this.lblTotalVendas = new JLabel();
/*  90 */     this.jLabel4 = new JLabel();
/*  91 */     this.jLabel1 = new JLabel();
/*  92 */     this.lblCodigoFunc = new JLabel();
/*  93 */     this.btnAdicionar = new JButton();
/*  94 */     this.jButton6 = new JButton();
/*  95 */     this.tfNomeCliente = new JTextField();
/*  96 */     this.jLabel3 = new JLabel();
/*  97 */     this.jLabel6 = new JLabel();
/*  98 */     this.lblCarrinhoVenda = new JLabel();
/*  99 */     this.tfProcurar = new JTextField();
/* 100 */     this.jLabel7 = new JLabel();
/*     */     
/* 102 */     setDefaultCloseOperation(2);
/* 103 */     setTitle("Venda de Produtos");
/* 104 */     setResizable(false);
/* 105 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/* 107 */     this.jPanel1.setOpaque(false);
/* 108 */     this.jPanel1.setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/* 110 */     this.btnEfectuarVenda.setFont(new Font("Tahoma", 0, 13));
/* 111 */     this.btnEfectuarVenda.setText("Vender ");
/* 112 */     this.btnEfectuarVenda.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 114 */             Venda.this.btnEfectuarVendaActionPerformed(evt);
/*     */           }
/*     */         });
/* 117 */     this.jPanel1.add(this.btnEfectuarVenda, new AbsoluteConstraints(1000, 630, 89, 33));
/*     */     
/* 119 */     this.btnProcurar.setIcon(new ImageIcon(getClass().getResource("/images/search_1.png")));
/* 120 */     this.btnProcurar.setText("Procurar");
/* 121 */     this.btnProcurar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 123 */             Venda.this.btnProcurarActionPerformed(evt);
/*     */           }
/*     */         });
/* 126 */     this.jPanel1.add(this.btnProcurar, new AbsoluteConstraints(390, 190, -1, 35));
/*     */     
/* 128 */     this.btncancel.setFont(new Font("Tahoma", 0, 13));
/* 129 */     this.btncancel.setText("Cancelar");
/* 130 */     this.btncancel.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 132 */             Venda.this.btncancelActionPerformed(evt);
/*     */           }
/*     */         });
/* 135 */     this.jPanel1.add(this.btncancel, new AbsoluteConstraints(1120, 630, 89, 33));
/*     */     
/* 137 */     this.jPanel2.setBorder(BorderFactory.createTitledBorder("PRODUTOS  A VENDER"));
/* 138 */     this.jPanel2.setOpaque(false);
/*     */     
/* 140 */     this.tableProdutosVenda.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null }, { null, null, null, null, null } , 
    { null, null, null, null, null },  { null, null, null, null, null },  { null, null, null, null, null },  { null, null, null, null, null }, 
    { null, null, null, null, null },  { null, null, null, null, null },  { null, null, null, null, null },  { null, null, null, null, null }  } , (Object[])new String[] { "Codigo", "Nome", "Preco", "Quant Compra", "Subtotal" }));
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
/* 157 */     this.tableProdutosVenda.setRowHeight(26);
/* 158 */     this.tableProdutosVenda.setShowVerticalLines(false);
/* 159 */     this.jScrollPane2.setViewportView(this.tableProdutosVenda);
/*     */     
/* 161 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/* 162 */     this.jPanel2.setLayout(jPanel2Layout);
/* 163 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane2, -1, 478, 32767).addContainerGap()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 170 */     jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jScrollPane2, -1, 252, 32767).addContainerGap()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 177 */     this.jPanel1.add(this.jPanel2, new AbsoluteConstraints(710, 240, 510, 290));
/*     */     
/* 179 */     this.jPanel3.setBorder(BorderFactory.createTitledBorder("LISTA DE PRODUTOS"));
/* 180 */     this.jPanel3.setOpaque(false);
/*     */     
/* 182 */     this.tblProdutos.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null, null },  { null, null, null, null, null, null, null },
     { null, null, null, null, null, null, null },  { null, null, null, null, null, null, null },  { null, null, null, null, null, null, null },  { null, null, null, null, null, null, null },
      { null, null, null, null, null, null, null },  { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, 
      { null, null, null, null, null, null, null } }, (Object[])new String[] { "Codigo", "Nome", "Preco Unitario", "Quantidade", "Unidade", "Categoria", "Descriacao" }));
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
/* 199 */     this.tblProdutos.setRowHeight(26);
/* 200 */     this.tblProdutos.setShowVerticalLines(false);
/* 201 */     this.jScrollPane1.setViewportView(this.tblProdutos);
/* 202 */     this.tblProdutos.getColumnModel().getColumn(3).setResizable(false);
/* 203 */     this.tblProdutos.getColumnModel().getColumn(4).setResizable(false);
/*     */     
/* 205 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/* 206 */     this.jPanel3.setLayout(jPanel3Layout);
/* 207 */     jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -1, 528, 32767).addContainerGap()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 214 */     jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jScrollPane1, -1, 248, 32767).addContainerGap()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 221 */     this.jPanel1.add(this.jPanel3, new AbsoluteConstraints(30, 240, 560, -1));
/*     */     
/* 223 */     this.jLabel2.setFont(new Font("Tahoma", 0, 14));
/* 224 */     this.jLabel2.setText("Funcionario :");
/* 225 */     this.jPanel1.add(this.jLabel2, new AbsoluteConstraints(40, 50, -1, -1));
/* 226 */     this.jPanel1.add(this.jLabel5, new AbsoluteConstraints(0, 32, -1, -1));
/*     */     
/* 228 */     this.lblNomeFunc.setFont(new Font("Tahoma", 0, 14));
/* 229 */     this.jPanel1.add(this.lblNomeFunc, new AbsoluteConstraints(180, 50, 203, -1));
/*     */     
/* 231 */     this.lblTotalVendas.setFont(new Font("Tahoma", 1, 14));
/* 232 */     this.jPanel1.add(this.lblTotalVendas, new AbsoluteConstraints(1130, 550, 65, 20));
/*     */     
/* 234 */     this.jLabel4.setFont(new Font("Tahoma", 1, 14));
/* 235 */     this.jLabel4.setText("Mt");
/* 236 */     this.jPanel1.add(this.jLabel4, new AbsoluteConstraints(1200, 550, -1, 20));
/*     */     
/* 238 */     this.jLabel1.setFont(new Font("Tahoma", 1, 14));
/* 239 */     this.jLabel1.setText("TOTAL :");
/* 240 */     this.jPanel1.add(this.jLabel1, new AbsoluteConstraints(1060, 550, -1, 20));
/*     */     
/* 242 */     this.lblCodigoFunc.setFont(new Font("Tahoma", 0, 14));
/* 243 */     this.jPanel1.add(this.lblCodigoFunc, new AbsoluteConstraints(390, 50, -1, -1));
/*     */     
/* 245 */     this.btnAdicionar.setText("ADICIONAR");
/* 246 */     this.btnAdicionar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 248 */             Venda.this.btnAdicionarActionPerformed(evt);
/*     */           }
/*     */         });
/* 251 */     this.jPanel1.add(this.btnAdicionar, new AbsoluteConstraints(600, 310, -1, 34));
/*     */     
/* 253 */     this.jButton6.setText("REMOVER");
/* 254 */     this.jButton6.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 256 */             Venda.this.jButton6ActionPerformed(evt);
/*     */           }
/*     */         });
/* 259 */     this.jPanel1.add(this.jButton6, new AbsoluteConstraints(600, 360, 100, 31));
/* 260 */     this.jPanel1.add(this.tfNomeCliente, new AbsoluteConstraints(180, 100, 240, 30));
/*     */     
/* 262 */     this.jLabel3.setFont(new Font("Tahoma", 0, 14));
/* 263 */     this.jLabel3.setText("Nome do Cliente :");
/* 264 */     this.jPanel1.add(this.jLabel3, new AbsoluteConstraints(40, 100, -1, -1));
/* 265 */     this.jPanel1.add(this.jLabel6, new AbsoluteConstraints(0, 32, -1, -1));
/*     */     
/* 267 */     this.lblCarrinhoVenda.setPreferredSize(new Dimension(190, 190));
/* 268 */     this.jPanel1.add(this.lblCarrinhoVenda, new AbsoluteConstraints(860, 120, 140, 140));
/*     */     
/* 270 */     this.tfProcurar.setText("Nome ou codigo do produto");
/* 271 */     this.tfProcurar.addMouseListener(new MouseAdapter() {
/*     */           public void mouseClicked(MouseEvent evt) {
/* 273 */             Venda.this.tfProcurarMouseClicked(evt);
/*     */           }
/*     */         });
/* 276 */     this.tfProcurar.addKeyListener(new KeyAdapter() {
/*     */           public void keyTyped(KeyEvent evt) {
/* 278 */             Venda.this.tfProcurarKeyTyped(evt);
/*     */           }
/*     */         });
/* 281 */     this.jPanel1.add(this.tfProcurar, new AbsoluteConstraints(40, 190, 304, 30));
/*     */     
/* 283 */     getContentPane().add(this.jPanel1, new AbsoluteConstraints(0, 0, 1220, 700));
/*     */     
/* 285 */     this.jLabel7.setIcon(new ImageIcon(getClass().getResource("/images/Fundo.png")));
/* 286 */     getContentPane().add(this.jLabel7, new AbsoluteConstraints(-50, 0, 1290, 700));
/*     */     
/* 288 */     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
/* 289 */     setBounds((screenSize.width - 1240) / 2, (screenSize.height - 738) / 2, 1240, 738);
/*     */   }
/*     */   
/*     */   private JLabel lblCodigoFunc;
/*     */   private JLabel lblNomeFunc;
/*     */   private JLabel lblTotalVendas;
/*     */   
/*     */   public void FuncionarioInformation(String userName, String codUser) {
/*     */     try {
/* 298 */       this.lblCodigoFunc.setText(codUser);
/* 299 */       this.lblNomeFunc.setText(userName);
/* 300 */       this.lblCodigoFunc.setVisible(false);
/*     */ 
/*     */     
/*     */     }
/* 304 */     catch (Exception e) {
/* 305 */       System.out.println("" + e);
/*     */     } 
/*     */   }
/*     */   private JTable tableProdutosVenda;
/*     */   private JTable tblProdutos;
/*     */   private JTextField tfNomeCliente;
/*     */   private JTextField tfProcurar;
/*     */   
/*     */   private void PopularTabelaProdutos(String parametro) {
/*     */     
/* 315 */     try { ProdutoDAO p = new ProdutoDAO();
/* 316 */       ResultSet rs = p.SearchProdutoVenda(parametro);
/* 317 */       if (!rs.next()) {
/*     */         
/* 319 */         this.tblProdutos.setModel(new ResultSetTableModel(rs));
/* 320 */         this.tblProdutos.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null },  { null, null, null, null, null, null }, 
    { null, null, null, null, null, null },  { null, null, null, null, null, null } }, (Object[])new String[] { "Codigo", "Nome", "Preco", "Quantidade de Comprar", "Unidade", "Categoria" }));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 328 */         this.tblProdutos.setRowHeight(26);
/* 329 */         this.tblProdutos.setShowVerticalLines(false);
/* 330 */         this.jScrollPane1.setViewportView(this.tblProdutos);
/* 331 */         throw new VendasException("Produto nao foi encontrado");
/*     */       } 
/* 333 */       ResultSetTableModel produtosTablemodel = new ResultSetTableModel(rs);
/* 334 */       this.tblProdutos.setModel(produtosTablemodel);
/* 335 */       TableColumnAdjuster ajustaColunas = new TableColumnAdjuster(this.tblProdutos);
/* 336 */       ajustaColunas.adjustColumns(); }
/*     */     catch (VendasException e)
/*     */     
/* 339 */     { JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null); }
/* 340 */     catch (SQLException e) { JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null); }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void btnProcurarActionPerformed(ActionEvent evt) {
/* 348 */     String parametro = this.tfProcurar.getText();
/* 349 */     if (parametro.isEmpty()) {
/*     */       
/* 351 */       JOptionPane.showMessageDialog(this.rootPane, "Nome ou codigo nao devem ser vazios", "", 3, null);
/*     */     }
/*     */     else {
/*     */       
/* 355 */       PopularTabelaProdutos(parametro);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void btnAdicionarActionPerformed(ActionEvent evt) {
/*     */     try {
/* 365 */       int selectedRow = this.tblProdutos.getSelectedRow();
/* 366 */       if (selectedRow == -1)
/*     */       {
/* 368 */         throw new ArrayIndexOutOfBoundsException("Deve selecionar algum produto");
/*     */       }
/*     */       
/* 371 */       int quant = Integer.parseInt(JOptionPane.showInputDialog(this.rootPane, "quantidade"));
/* 372 */       int colunaNomeProduto = 1;
/* 373 */       int colunaPrecoProduto = 2;
/* 374 */       int colunaCodigo = 0;
/* 375 */       String nomeP = this.tblProdutos.getValueAt(selectedRow, colunaNomeProduto).toString();
/* 376 */       String precoP = this.tblProdutos.getValueAt(selectedRow, colunaPrecoProduto).toString();
/* 377 */       String codigo = this.tblProdutos.getValueAt(selectedRow, colunaCodigo).toString();
/* 378 */       int quantStock = Integer.valueOf(this.tblProdutos.getValueAt(selectedRow, 3).toString()).intValue();
/* 379 */       for (int i = 0; i < this.counter; i++) {
/*     */         
/* 381 */         int codProdutoVenda = Integer.parseInt(this.tableProdutosVenda.getValueAt(i, 0).toString());
/* 382 */         if (codProdutoVenda == Integer.valueOf(codigo).intValue())
/*     */         {
/* 384 */           throw new VendasException("Esse Produto ja foi adicionado");
/*     */         }
/*     */       } 
/*     */       
/* 388 */       if (quant > quantStock)
/*     */       {
/* 390 */         throw new VendasException("Quantidade do Stock Insuficiente");
/*     */       }
/*     */       
/* 393 */       if (quant < 0)
/*     */       {
/* 395 */         throw new VendasException("Quantidade nao deve ser negativa");
/*     */       }
/*     */       
/* 398 */       this.tableProdutosVenda.getModel().setValueAt(codigo, this.counter, 0);
/* 399 */       this.tableProdutosVenda.getModel().setValueAt(nomeP, this.counter, 1);
/* 400 */       this.tableProdutosVenda.getModel().setValueAt(precoP, this.counter, 2);
/* 401 */       this.tableProdutosVenda.getModel().setValueAt(Integer.valueOf(quant), this.counter, 3);
/* 402 */       double subtotal = Double.valueOf(precoP).doubleValue() * quant;
/* 403 */       this.tableProdutosVenda.getModel().setValueAt(Double.valueOf(subtotal), this.counter, 4);
/* 404 */       this.tblProdutos.clearSelection();
/* 405 */       this.tableProdutosVenda.clearSelection();
/*     */       
/* 407 */       this.counterVendap = ++this.counter;
/*     */       
/* 409 */       this.totalVenda += subtotal;
/* 410 */       this.lblTotalVendas.setText(this.totalVenda + "");
/* 411 */       this.lblCarrinhoVenda.setIcon(new ImageIcon(getClass().getResource("/images/carrinhoFull.gif")));
/*     */ 
/*     */       
/* 414 */       this.tblProdutos.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null },  { null, null, null, null, null, null }
        , { null, null, null, null, null, null }, { null, null, null, null, null, null }  }, (Object[])new String[] { "Codigo", "Nome", "Preco Unitario", "Quantidade", "Unidade", "Categoria" }));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 422 */       this.tblProdutos.setRowHeight(26);
/* 423 */       this.tblProdutos.setShowVerticalLines(false);
/* 424 */       this.jScrollPane1.setViewportView(this.tblProdutos);
/*     */     }
/* 426 */     catch (ArrayIndexOutOfBoundsException e) {
/* 427 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null);
/*     */     } catch (VendasException e) {
/* 429 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null);
/* 430 */     } catch (NumberFormatException e) {
/* 431 */       JOptionPane.showMessageDialog(this.rootPane, "introduz numeros", "", 3, null);
/*     */     }
/* 433 */     catch (NullPointerException e) {
/* 434 */       JOptionPane.showMessageDialog(this.rootPane, "Nenhum produto selecinado", "", 3, null);
/*     */     }
/* 436 */     catch (Exception e) {
/* 437 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton6ActionPerformed(ActionEvent evt) {
/* 444 */     double subTotal = 0.0D;
/* 445 */     double totalp = 0.0D;
/*     */     
/*     */     try {
/* 448 */       int selectedRow = this.tableProdutosVenda.getSelectedRow();
/*     */       
/* 450 */       if (selectedRow == -1)
/*     */       {
/* 452 */         throw new VendasException("Deve selecionar algum produto");
/*     */       }
/*     */       
/* 455 */       subTotal = Double.valueOf(this.tableProdutosVenda.getValueAt(selectedRow, 4).toString()).doubleValue();
/* 456 */       totalp = Double.valueOf(this.lblTotalVendas.getText()).doubleValue();
/* 457 */       this.totalVenda = totalp - subTotal;
/* 458 */       this.lblTotalVendas.setText("" + this.totalVenda);
/* 459 */       this.vt.setValueAt("", selectedRow, 0);
/* 460 */       this.vt.setValueAt("", selectedRow, 1);
/* 461 */       this.vt.setValueAt("", selectedRow, 2);
/* 462 */       this.vt.setValueAt("", selectedRow, 3);
/* 463 */       this.vt.setValueAt("", selectedRow, 4);
/* 464 */       this.counter--;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*     */     catch (VendasException e) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 482 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null);
/* 483 */     } catch (ArrayIndexOutOfBoundsException e) {
/* 484 */       JOptionPane.showMessageDialog(this.rootPane, "Deve selecionar o produto que quer remover", "", 3, null);
/*     */     }
/*     */     catch (Exception e) {
/*     */       
/* 488 */       JOptionPane.showMessageDialog(this.rootPane, "Deve selecionar o produto que quer remover", "", 3, null);
/*     */     } 
/*     */   }
/*     */   
/*     */   private class VendasTableModel extends DefaultTableModel {
/*     */     Object[][] data;
/*     */     Object[] columnNames;
/*     */     
/*     */     public VendasTableModel() {
/* 497 */       this.data = new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null } };
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
/* 509 */       this.columnNames = (Object[])new String[] { "Codigo", "Nome", "Preco", "Quant Compra", "Subtotal" };
/*     */ 
/*     */       
/* 512 */       super.setDataVector(this.data, this.columnNames);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void removeRow(int row) {
/* 519 */       super.removeRow(row);
/* 520 */       fireTableDataChanged();
/*     */     }
/*     */ 
/*     */     
/*     */     public void setDataVector(Object[][] dataVector, Object[] columnIdentifiers) {
/* 525 */       super.setDataVector(dataVector, columnIdentifiers);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void btnEfectuarVendaActionPerformed(ActionEvent evt) {
/* 534 */     this.progressMonitor = new ProgressMonitor(this.rootPane, "Efectuando a venda...", null, 0, 100);
/* 535 */     this.progressMonitor.setProgress(0);
/* 536 */     this.task = new Task();
/*     */ 
/*     */     
/* 539 */     try { ProdutosServicos ps = new ProdutosServicos();
/* 540 */       BussinessLogic.Venda venda = new BussinessLogic.Venda();
/* 541 */       DetalhesVenda dv = new DetalhesVenda();
/* 542 */       if (this.counter <= 0)
/*     */       {
/* 544 */         throw new NegativeNumberException("Nehum produto por vender. selecione Produtos");
/*     */       }
/*     */       
/* 547 */       String nomeCLiente = this.tfNomeCliente.getText();
/* 548 */       if (nomeCLiente.isEmpty())
/*     */       {
/* 550 */         throw new VendasException("Introduz o nome do cliente");
/*     */       }
/* 552 */       venda.setNome_cliente(nomeCLiente);
/* 553 */       venda.setTotal_Venda(Double.valueOf(this.lblTotalVendas.getText()));
/* 554 */       venda.setUsuario_Cod_Funcionario(Integer.valueOf(this.lblCodigoFunc.getText()));
/* 555 */       ps.VenderProduto(venda);
/* 556 */       int vendacorrente = ps.CodVendacorrente();
/*     */       
/* 558 */       for (int i = 0; i < this.counter; i++) {
/*     */         
/* 560 */         int colunaCodProduto = 0;
/* 561 */         int colunaQuantCompra = 3;
/* 562 */         int colunaSubtotal = 4;
/*     */         
/* 564 */         String CodigoP = this.tableProdutosVenda.getValueAt(i, colunaCodProduto).toString();
/* 565 */         String quantVenda = this.tableProdutosVenda.getValueAt(i, colunaQuantCompra).toString();
/* 566 */         String subTotal = this.tableProdutosVenda.getValueAt(i, colunaSubtotal).toString();
/* 567 */         dv.setProduto_Cod_produto(Integer.valueOf(CodigoP));
/* 568 */         dv.setPreco(Double.valueOf(subTotal));
/* 569 */         dv.setQuantidade(Integer.valueOf(quantVenda));
/* 570 */         dv.setVenda_Cod_produto(Integer.valueOf(vendacorrente));
/* 571 */         ps.DetalhesVenda(dv);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 577 */       this.task.addPropertyChangeListener(new ProdutosChangeListener());
/* 578 */       this.task.execute();
/* 579 */       this.lblTotalVendas.setText("");
/* 580 */       this.tfProcurar.setText("Nome ou codigo do produto");
/* 581 */       this.tfNomeCliente.setText("");
/* 582 */       VendasTableModel vtm = new VendasTableModel();
/* 583 */       this.tableProdutosVenda.setModel(vtm);
/* 584 */       this.tableProdutosVenda.setRowHeight(26);
/* 585 */       this.tableProdutosVenda.setShowVerticalLines(false);
/* 586 */       this.jScrollPane2.setViewportView(this.tableProdutosVenda);
/* 587 */       this.totalVenda = 0.0D;
/* 588 */       this.counter = 0;
/*     */        }
/*     */     
/*     */     catch (VendasException e)
/*     */     
/* 593 */     { JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null); }
/* 594 */     catch (NegativeNumberException e) { JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null); }
/* 595 */
/*     */
/* 597 */
/*     */     catch (SQLException e)
/* 599 */     { JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null); }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   private void tfProcurarMouseClicked(MouseEvent evt) {
/* 605 */     if (this.tfProcurar.getText().contentEquals("Nome ou codigo do produto"))
/*     */     {
/* 607 */       this.tfProcurar.setText("");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private void tfProcurarKeyTyped(KeyEvent evt) {
/* 613 */     if (this.tfProcurar.getText().contentEquals("Nome ou codigo do produto"))
/*     */     {
/* 615 */       this.tfProcurar.setText("");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private void btncancelActionPerformed(ActionEvent evt) {
/* 621 */     dispose();
/*     */   }
/*     */   
/*     */   private class ProdutosChangeListener implements PropertyChangeListener { public void propertyChange(PropertyChangeEvent evt) {
/* 625 */       if ("progress" == evt.getPropertyName()) {
/* 626 */         int progress = ((Integer)evt.getNewValue()).intValue();
/* 627 */         Venda.this.progressMonitor.setProgress(progress);
/* 628 */         String message = String.format("Progresso %d%%.\n", new Object[] { Integer.valueOf(progress) });
/*     */         
/* 630 */         Venda.this.progressMonitor.setNote(message);
/*     */         
/* 632 */         if (Venda.this.progressMonitor.isCanceled() || Venda.this.task.isDone()) {
/* 633 */           Toolkit.getDefaultToolkit().beep();
/* 634 */           if (Venda.this.progressMonitor.isCanceled()) {
/* 635 */             Venda.this.task.cancel(true);
/*     */           } else {
/*     */ 
/*     */             
/*     */             try {
/*     */ 
/*     */               
/* 642 */               Relatorios trickRelatorios = new Relatorios();
/* 643 */               trickRelatorios.ImprimirRecibo();
/*     */             } catch (Exception e) {
/*     */               
/* 646 */               JOptionPane.showMessageDialog(Venda.this.rootPane, e.getMessage());
/*     */             } 
/*     */           } 
/*     */ 
/*     */ 
/*     */           
/* 652 */           Venda.this.btnEfectuarVenda.setEnabled(true);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     private ProdutosChangeListener() {} }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/* 663 */     EventQueue.invokeLater(new Runnable()
/*     */         {
/*     */           public void run() {
/* 666 */             (new Venda()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Sistema de vendas\SysVendas.jar!\Presentation\Venda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */