/*     */ package Presentation;
/*     */ import DataAcessLayer.ProdutoDAO;
/*     */ import Service.ProdutosServicos;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*     */ import org.netbeans.lib.awtextra.AbsoluteLayout;
/*     */ 
/*     */ public class CadProduto extends JFrame {
/*     */   private JButton btnCancelar;
/*     */   private JButton btnGuardar;
/*     */   private JButton btnVer;
/*     */   private JComboBox jCCategoria;
/*     */   
/*     */   public CadProduto() {
/*  29 */     initComponents();
/*  30 */     populacombo();
/*  31 */     combocategoria();
/*     */   }
/*     */   private JComboBox jCUnidade; private JLabel jLabel1; private JLabel jLabel2; private JLabel jLabel3; private JLabel jLabel4; private JLabel jLabel5; private JLabel jLabel6;
/*     */   private JLabel jLabel7;
/*     */   
/*     */   public void populacombo() {
/*     */     try {
/*  38 */       ProdutoDAO pd = new ProdutoDAO();
/*  39 */       ResultSet rs = pd.popularunidade();
/*  40 */       while (rs.next())
/*     */       {
/*     */         
/*  43 */         this.jCUnidade.addItem(rs.getString("Descricao_Unidade"));
/*     */       
/*     */       }
/*     */     
/*     */     }
/*  48 */     catch (Exception e) {
/*  49 */       System.out.println("" + e);
/*     */     } 
/*     */   }
/*     */   private JPanel jPanel1; private JTextField jTDescricao; private JTextField jTNomeProduto;
/*     */   private JTextField jTPrecoUnitario;
/*     */   private JTextField jTQuantidadeStock;
/*     */   
/*     */   public void combocategoria() {
/*     */     try {
/*  58 */       ProdutoDAO ppd = new ProdutoDAO();
/*  59 */       ResultSet rs = ppd.populacombocategoria();
/*  60 */       while (rs.next())
/*     */       {
/*     */         
/*  63 */         this.jCCategoria.addItem(rs.getString("Nome"));
/*     */       
/*     */       }
/*     */     }
/*  67 */     catch (Exception e) {
/*     */       
/*  69 */       JOptionPane.showMessageDialog(this.rootPane, "" + e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean verificadados() {
/*  77 */     boolean fds = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  87 */     if (this.jTNomeProduto.getText().equals("")) {
/*     */       
/*  89 */       JOptionPane.showMessageDialog(this.rootPane, "INTRODUZA NOME DO PRODUTO ");
/*  90 */       fds = true;
/*     */     }
/*  92 */     else if (this.jTPrecoUnitario.getText().equals("")) {
/*     */       
/*  94 */       JOptionPane.showMessageDialog(this.rootPane, "INTRODUZA PRECO UNITARIO ");
/*  95 */       fds = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 102 */     else if (this.jTQuantidadeStock.getText().equals("")) {
/*     */       
/* 104 */       JOptionPane.showMessageDialog(this.rootPane, "INTRODUZA  QUANTIDADE NO STOCK");
/* 105 */       fds = true;
/* 106 */     } else if (this.jCCategoria.getSelectedItem().toString().contains(" ")) {
/*     */       
/* 108 */       JOptionPane.showMessageDialog(this.rootPane, "INTRODUZA A CATEGORIA DO PRODUTO");
/* 109 */       fds = true;
/*     */     
/*     */     }
/* 112 */     else if (this.jCUnidade.getSelectedItem().toString().contains(" ")) {
/*     */       
/* 114 */       JOptionPane.showMessageDialog(this.rootPane, "INTRODUZA UNIDADE DO PRODUTO");
/* 115 */       fds = true;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 122 */     return fds;
/*     */   }
/*     */ 
/*     */   
/*     */   public final void desabilitados() {
/* 127 */     this.jTNomeProduto.setEnabled(false);
/* 128 */     this.jTPrecoUnitario.setEnabled(false);
/* 129 */     this.jTDescricao.setEnabled(false);
/* 130 */     this.jTQuantidadeStock.setEnabled(false);
/* 131 */     this.jCCategoria.setEnabled(false);
/* 132 */     this.jCUnidade.setEnabled(false);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void habilitados() {
/* 138 */     this.jTNomeProduto.setText("");
/* 139 */     this.jTPrecoUnitario.setText("");
/* 140 */     this.jTDescricao.setText("");
/* 141 */     this.jTQuantidadeStock.setText("");
/* 142 */     this.jCCategoria.setEnabled(true);
/* 143 */     this.jCUnidade.setEnabled(true);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void cadastro() throws SQLException {
/* 149 */     Double preco_unitario = Double.valueOf(0.0D);
/* 150 */     Integer quantidadeStock = Integer.valueOf(0);
/*     */ 
/*     */ 
/*     */     
/* 154 */     String nome = this.jTNomeProduto.getText();
/* 155 */     preco_unitario = Double.valueOf(Double.parseDouble(this.jTPrecoUnitario.getText()));
/* 156 */     quantidadeStock = Integer.valueOf(Integer.parseInt(this.jTQuantidadeStock.getText()));
/* 157 */     ProdutosServicos ps = new ProdutosServicos();
/* 158 */     Integer unidade = Integer.valueOf(ps.CapturaIdUnidade(this.jCUnidade.getSelectedItem().toString()));
/* 159 */     Integer categoria = Integer.valueOf(ps.CapturaIdCategoria(this.jCCategoria.getSelectedItem().toString()));
/* 160 */     String descricao = this.jTDescricao.getText();
/* 161 */     ProdutoDAO dao = new ProdutoDAO();
/* 162 */     dao.cadastrarprodutos(nome, preco_unitario.doubleValue(), quantidadeStock.intValue(), unidade.intValue(), categoria.intValue(), descricao);
/*     */     
/* 164 */     JOptionPane.showMessageDialog(this.rootPane, "O Produto foi Cadastrado com Sucesso");
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
/*     */   private void initComponents() {
/* 183 */     this.jPanel1 = new JPanel();
/* 184 */     this.jLabel1 = new JLabel();
/* 185 */     this.jTNomeProduto = new JTextField();
/* 186 */     this.jTPrecoUnitario = new JTextField();
/* 187 */     this.jLabel2 = new JLabel();
/* 188 */     this.jTDescricao = new JTextField();
/* 189 */     this.jTQuantidadeStock = new JTextField();
/* 190 */     this.jLabel3 = new JLabel();
/* 191 */     this.jLabel4 = new JLabel();
/* 192 */     this.jCUnidade = new JComboBox();
/* 193 */     this.jLabel5 = new JLabel();
/* 194 */     this.jLabel6 = new JLabel();
/* 195 */     this.btnGuardar = new JButton();
/* 196 */     this.btnCancelar = new JButton();
/* 197 */     this.jCCategoria = new JComboBox();
/* 198 */     this.btnVer = new JButton();
/* 199 */     this.jLabel7 = new JLabel();
/*     */     
/* 201 */     setDefaultCloseOperation(2);
/* 202 */     setTitle("Registar produtos");
/* 203 */     setResizable(false);
/* 204 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/* 206 */     this.jPanel1.setBorder(BorderFactory.createBevelBorder(0));
/* 207 */     this.jPanel1.setOpaque(false);
/* 208 */     this.jPanel1.setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/* 210 */     this.jLabel1.setText("Nome Produto :");
/* 211 */     this.jPanel1.add(this.jLabel1, new AbsoluteConstraints(12, 30, 100, 24));
/* 212 */     this.jPanel1.add(this.jTNomeProduto, new AbsoluteConstraints(120, 30, 578, 31));
/* 213 */     this.jPanel1.add(this.jTPrecoUnitario, new AbsoluteConstraints(120, 130, 578, 31));
/*     */     
/* 215 */     this.jLabel2.setText("Preco Unitario:");
/* 216 */     this.jPanel1.add(this.jLabel2, new AbsoluteConstraints(12, 140, 90, 22));
/* 217 */     this.jPanel1.add(this.jTDescricao, new AbsoluteConstraints(120, 80, 578, 31));
/* 218 */     this.jPanel1.add(this.jTQuantidadeStock, new AbsoluteConstraints(120, 180, 578, 31));
/*     */     
/* 220 */     this.jLabel3.setText("Quantidade :");
/* 221 */     this.jPanel1.add(this.jLabel3, new AbsoluteConstraints(12, 188, 90, 23));
/*     */     
/* 223 */     this.jLabel4.setText("Descricao :");
/* 224 */     this.jPanel1.add(this.jLabel4, new AbsoluteConstraints(12, 81, 90, 23));
/*     */     
/* 226 */     this.jPanel1.add(this.jCUnidade, new AbsoluteConstraints(120, 250, 224, -1));
/*     */     
/* 228 */     this.jLabel5.setText("Unidade :");
/* 229 */     this.jPanel1.add(this.jLabel5, new AbsoluteConstraints(17, 250, 60, 17));
/*     */     
/* 231 */     this.jLabel6.setText("Categoria :");
/* 232 */     this.jPanel1.add(this.jLabel6, new AbsoluteConstraints(10, 300, 65, 17));
/*     */     
/* 234 */     this.btnGuardar.setText("Salvar");
/* 235 */     this.btnGuardar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 237 */             CadProduto.this.btnGuardarActionPerformed(evt);
/*     */           }
/*     */         });
/* 240 */     this.jPanel1.add(this.btnGuardar, new AbsoluteConstraints(20, 380, 154, 35));
/*     */     
/* 242 */     this.btnCancelar.setText("Cancelar");
/* 243 */     this.btnCancelar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 245 */             CadProduto.this.btnCancelarActionPerformed(evt);
/*     */           }
/*     */         });
/* 248 */     this.jPanel1.add(this.btnCancelar, new AbsoluteConstraints(200, 380, 159, 35));
/*     */     
/* 250 */     this.jPanel1.add(this.jCCategoria, new AbsoluteConstraints(120, 300, 224, -1));
/*     */     
/* 252 */     this.btnVer.setText("Ver Produtos Cadastrados");
/* 253 */     this.btnVer.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 255 */             CadProduto.this.btnVerActionPerformed(evt);
/*     */           }
/*     */         });
/* 258 */     this.jPanel1.add(this.btnVer, new AbsoluteConstraints(380, 380, -1, 35));
/*     */     
/* 260 */     getContentPane().add(this.jPanel1, new AbsoluteConstraints(12, 13, 730, 430));
/*     */     
/* 262 */     this.jLabel7.setIcon(new ImageIcon(getClass().getResource("/images/Fundo.png")));
/* 263 */     getContentPane().add(this.jLabel7, new AbsoluteConstraints(0, 0, 790, 500));
/*     */     
/* 265 */     setBounds(230, 180, 774, 493);
/*     */   }
/*     */ 
/*     */   
/*     */   private void btnGuardarActionPerformed(ActionEvent evt) {
/* 270 */     if (!verificadados()) {
/*     */       
/*     */       try {
/* 273 */         cadastro();
/* 274 */         habilitados();
/*     */       } catch (NumberFormatException e) {
/* 276 */         JOptionPane.showMessageDialog(this.rootPane, "Quantidade e Preco Devem ser Numeros", "", 3, null);
/* 277 */       } catch (Exception e) {
/*     */         
/* 279 */         JOptionPane.showMessageDialog(this.rootPane, "O Produto Nao foi Cadastrado com Sucesso" + e);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void btnCancelarActionPerformed(ActionEvent evt) {
/* 287 */     dispose();
/*     */   }
/*     */ 
/*     */   
/*     */   private void btnVerActionPerformed(ActionEvent evt) {
/* 292 */     Produtos pr = new Produtos();
/* 293 */     pr.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/* 301 */     EventQueue.invokeLater(new Runnable()
/*     */         {
/*     */           public void run() {
/* 304 */             (new CadProduto()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Sistema de vendas\SysVendas.jar!\Presentation\CadProduto.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */