/*     */ package Presentation;
/*     */ import BussinessLogic.Previlegio;
/*     */ import Service.UsuarioServicos;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Font;
import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.*;
/*     */ import javax.swing.JPanel;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
/*     */ 
/*     */ public class Previlegios extends JFrame {
/*     */   private JCheckBox chkAddStock;
/*     */   private JCheckBox chkEditarProdutos;
/*     */   private JCheckBox chkRegCategoria;
/*     */   
/*     */   public Previlegios() {
/*  23 */     initComponents();
/*  24 */     enableChekboxPrevilegios();
/*     */   }
/*     */   private JCheckBox chkRegProdutos; private JCheckBox chkRegunidades; private JCheckBox chkRelProdutosMaisVendidos; private JCheckBox chkRelVendasPorData;
/*     */   private JCheckBox chkRelVendasRecentes;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JLabel jLabel1;
/*     */   private JPanel jPanel1;
/*     */   private JPanel jPanel2;
/*     */   private JPanel jPanel3;
/*     */   
/*     */   private void initComponents() {
/*  36 */     this.jPanel1 = new JPanel();
/*  37 */     this.jPanel2 = new JPanel();
/*  38 */     this.chkRegProdutos = new JCheckBox();
/*  39 */     this.chkEditarProdutos = new JCheckBox();
/*  40 */     this.chkAddStock = new JCheckBox();
/*  41 */     this.chkRegunidades = new JCheckBox();
/*  42 */     this.chkRegCategoria = new JCheckBox();
/*  43 */     this.jPanel3 = new JPanel();
/*  44 */     this.chkRelVendasPorData = new JCheckBox();
/*  45 */     this.chkRelVendasRecentes = new JCheckBox();
/*  46 */     this.chkRelProdutosMaisVendidos = new JCheckBox();
/*  47 */     this.jButton1 = new JButton();
/*  48 */     this.jButton2 = new JButton();
/*  49 */     this.jLabel1 = new JLabel();
/*     */     
/*  51 */     setDefaultCloseOperation(2);
/*  52 */     setTitle("Previlegios");
/*  53 */     setResizable(false);
/*  54 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/*  56 */     this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Previlegios do Funcionario", 0, 0, new Font("Tahoma", 0, 13)));
/*  57 */     this.jPanel1.setOpaque(false);
/*     */     
/*  59 */     this.jPanel2.setBorder(BorderFactory.createTitledBorder(null, "Produtos", 0, 0, new Font("Segoe UI", 0, 12)));
/*  60 */     this.jPanel2.setOpaque(false);
/*     */     
/*  62 */     this.chkRegProdutos.setText("Registar produtos ");
/*  63 */     this.chkRegProdutos.setOpaque(false);
/*     */     
/*  65 */     this.chkEditarProdutos.setText("Alterar Dados de Produtos");
/*  66 */     this.chkEditarProdutos.setOpaque(false);
/*  67 */     this.chkEditarProdutos.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  69 */             Previlegios.this.chkEditarProdutosActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  73 */     this.chkAddStock.setText("Adicionar produtos ao Stock");
/*  74 */     this.chkAddStock.setOpaque(false);
/*  75 */     this.chkAddStock.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  77 */             Previlegios.this.chkAddStockActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  81 */     this.chkRegunidades.setText("Registar unidades");
/*  82 */     this.chkRegunidades.setOpaque(false);
/*  83 */     this.chkRegunidades.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  85 */             Previlegios.this.chkRegunidadesActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  89 */     this.chkRegCategoria.setText("Registar Categoria ");
/*  90 */     this.chkRegCategoria.setOpaque(false);
/*  91 */     this.chkRegCategoria.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  93 */             Previlegios.this.chkRegCategoriaActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  97 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/*  98 */     this.jPanel2.setLayout(jPanel2Layout);
/*  99 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.chkRegProdutos).addComponent(this.chkRegCategoria).addComponent(this.chkEditarProdutos).addComponent(this.chkAddStock).addComponent(this.chkRegunidades)).addContainerGap(38, 32767)));
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
/* 111 */     jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.chkRegProdutos).addGap(18, 18, 18).addComponent(this.chkEditarProdutos).addGap(18, 18, 18).addComponent(this.chkAddStock).addGap(18, 18, 18).addComponent(this.chkRegunidades).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 20, 32767).addComponent(this.chkRegCategoria).addContainerGap()));
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
/* 126 */     this.jPanel3.setBorder(BorderFactory.createTitledBorder(null, "Relatorios", 0, 0, new Font("Segoe UI", 0, 12)));
/* 127 */     this.jPanel3.setOpaque(false);
/*     */     
/* 129 */     this.chkRelVendasPorData.setText("Ver Vendas Por data");
/* 130 */     this.chkRelVendasPorData.setOpaque(false);
/* 131 */     this.chkRelVendasPorData.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 133 */             Previlegios.this.chkRelVendasPorDataActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 137 */     this.chkRelVendasRecentes.setText("Ver Relatorios Vendas Recentes");
/* 138 */     this.chkRelVendasRecentes.setOpaque(false);
/* 139 */     this.chkRelVendasRecentes.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 141 */             Previlegios.this.chkRelVendasRecentesActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 145 */     this.chkRelProdutosMaisVendidos.setText("Ver Relatorios de Produtos mais vendidos");
/* 146 */     this.chkRelProdutosMaisVendidos.setOpaque(false);
/*     */     
/* 148 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/* 149 */     this.jPanel3.setLayout(jPanel3Layout);
/* 150 */     jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.chkRelVendasRecentes).addComponent(this.chkRelVendasPorData).addComponent(this.chkRelProdutosMaisVendidos, -1, -1, 32767)).addContainerGap()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 160 */     jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.chkRelVendasRecentes).addGap(18, 18, 18).addComponent(this.chkRelVendasPorData).addGap(18, 18, 18).addComponent(this.chkRelProdutosMaisVendidos).addContainerGap(45, 32767)));
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
/* 171 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 172 */     this.jPanel1.setLayout(jPanel1Layout);
/* 173 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(35, 35, 35).addComponent(this.jPanel2, -2, -1, -2).addGap(73, 73, 73).addComponent(this.jPanel3, -2, -1, -2).addContainerGap(106, 32767)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 182 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(19, 19, 19).addComponent(this.jPanel3, 0, -1, 32767).addGap(163, 163, 163)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel2, -2, -1, -2).addContainerGap(125, 32767)));
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
/* 194 */     getContentPane().add(this.jPanel1, new AbsoluteConstraints(50, 20, 690, 390));
/*     */     
/* 196 */     this.jButton1.setText("Salvar");
/* 197 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 199 */             Previlegios.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/* 202 */     getContentPane().add(this.jButton1, new AbsoluteConstraints(480, 420, 90, 30));
/*     */     
/* 204 */     this.jButton2.setText("Cancel");
/* 205 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 207 */             Previlegios.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/* 210 */     getContentPane().add(this.jButton2, new AbsoluteConstraints(600, 420, 90, 30));
/*     */     
/* 212 */     this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/Fundo.png")));
/* 213 */     getContentPane().add(this.jLabel1, new AbsoluteConstraints(0, 0, 770, 460));
/*     */     
/* 215 */     pack();
/*     */   }
/*     */ 
/*     */   
/*     */   public void enableChekboxPrevilegios() {
/*     */     try {
/* 221 */       UsuarioServicos us = new UsuarioServicos();
/* 222 */       Previlegio p = us.VerificarPrevilegios();
/* 223 */       this.chkRegProdutos.setSelected(p.isProdutosPodeRegistar());
/* 224 */       this.chkEditarProdutos.setSelected(p.isProdutosPodeAlterarDados());
/* 225 */       this.chkAddStock.setSelected(p.isProdutosPodeAdicionarStock());
/* 226 */       this.chkRegunidades.setSelected(p.isProdutosPodeRegistarUnid());
/* 227 */       this.chkRegCategoria.setSelected(p.isProdutosPodeRegistarCat());
/* 228 */       this.chkRelVendasRecentes.setSelected(p.isRelatoriosVendasRecentes());
/* 229 */       this.chkRelVendasPorData.setSelected(p.isRelatoriosVendasPorDaata());
/* 230 */       this.chkRelProdutosMaisVendidos.setSelected(p.isRelatoriosProdutosMaisVendidos());
/*     */     
/*     */     }
/* 233 */     catch (Exception e) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void chkRelVendasRecentesActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void chkRelVendasPorDataActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void chkAddStockActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void chkRegunidadesActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void chkRegCategoriaActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void chkEditarProdutosActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/*     */     try {
/* 269 */       Previlegio p = new Previlegio();
/*     */       
/* 271 */       p.setProdutosPodeRegistar(this.chkRegProdutos.isSelected());
/* 272 */       p.setProdutosPodeAlterarDados(this.chkEditarProdutos.isSelected());
/* 273 */       p.setProdutosPodeAdicionarStock(this.chkAddStock.isSelected());
/* 274 */       p.setProdutosPodeRegistarUnid(this.chkRegunidades.isSelected());
/* 275 */       p.setProdutosPodeRegistarCat(this.chkRegCategoria.isSelected());
/* 276 */       p.setRelatoriosVendasRecentes(this.chkRelVendasRecentes.isSelected());
/* 277 */       p.setRelatoriosVendasPorDaata(this.chkRelVendasPorData.isSelected());
/* 278 */       p.setRelatoriosProdutosMaisVendidos(this.chkRelProdutosMaisVendidos.isSelected());
/* 279 */       UsuarioServicos us = new UsuarioServicos();
/* 280 */       us.EditarPrevilegios(p);
/* 281 */       JOptionPane.showMessageDialog(this.rootPane, "Configuracoes guardadas", "", 3, null);
/*     */     } catch (Exception e) {
/* 283 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 292 */     dispose();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/* 299 */     EventQueue.invokeLater(new Runnable()
/*     */         {
/*     */           public void run() {
/* 302 */             (new Previlegios()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Sistema de vendas\SysVendas.jar!\Presentation\Previlegios.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */