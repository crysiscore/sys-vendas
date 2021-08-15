/*     */ package Presentation;
/*     */ import BussinessLogic.Unidade;
/*     */ import DataAcessLayer.UnidadeDao;
/*     */ import Service.UnidadeServicos;
/*     */ import java.awt.Component;
import java.awt.Cursor;
/*     */ import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.ResultSet;
import java.sql.SQLException;
/*     */ import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
/*     */ 
/*     */ public final class CadUnidades extends JFrame {
/*     */   private JTable TabelaUnidade;
/*     */   
/*     */   public CadUnidades() {
/*  27 */     initComponents();
/*  28 */     preencheertabela();
/*     */   }
/*     */   private JButton jBATUALIZAR; private JButton jBCancelar;
/*     */   private JButton jBEditar;
/*     */   private JButton jBGuardar;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JPanel jPanel1;
/*     */   private JPanel jPanel3;
/*     */   private JPanel jPanel5;
/*     */   private JScrollPane jScrollPane1;
/*     */   private JTextField jTDescricao_Unidade;
/*     */   
/*     */   private void initComponents() {
/*  43 */     this.jPanel1 = new JPanel();
/*  44 */     this.jPanel5 = new JPanel();
/*  45 */     this.jScrollPane1 = new JScrollPane();
/*  46 */     this.TabelaUnidade = new JTable();
/*  47 */     this.jBGuardar = new JButton();
/*  48 */     this.jBEditar = new JButton();
/*  49 */     this.jBATUALIZAR = new JButton();
/*  50 */     this.jBCancelar = new JButton();
/*  51 */     this.jPanel3 = new JPanel();
/*  52 */     this.jLabel1 = new JLabel();
/*  53 */     this.jTDescricao_Unidade = new JTextField();
/*  54 */     this.jLabel3 = new JLabel();
/*  55 */     this.jLabel2 = new JLabel();
/*     */     
/*  57 */     setDefaultCloseOperation(2);
/*  58 */     setTitle("unidades de  Produtos   ");
/*  59 */     setCursor(new Cursor(0));
/*  60 */     setResizable(false);
/*  61 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/*  63 */     this.jPanel1.setBorder(BorderFactory.createTitledBorder("CADASTROS DE UNIDADES"));
/*  64 */     this.jPanel1.setOpaque(false);
/*     */     
/*  66 */     this.jPanel5.setOpaque(false);
/*     */     
/*  68 */     this.TabelaUnidade.setModel(new DefaultTableModel(new Object[][] { { null, null },  { null, null }, { null, null } , { null, null }  } , (Object[])new String[] { "Title 1", "Title 2" }));
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
/*  79 */     this.jScrollPane1.setViewportView(this.TabelaUnidade);
/*     */     
/*  81 */     this.jBGuardar.setText("SALVAR");
/*  82 */     this.jBGuardar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  84 */             CadUnidades.this.jBGuardarActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  88 */     this.jBEditar.setText("EDITAR");
/*  89 */     this.jBEditar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  91 */             CadUnidades.this.jBEditarActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  95 */     this.jBATUALIZAR.setText("ATUALIZAR");
/*  96 */     this.jBATUALIZAR.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  98 */             CadUnidades.this.jBATUALIZARActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 102 */     this.jBCancelar.setText("CANCELAR");
/* 103 */     this.jBCancelar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 105 */             CadUnidades.this.jBCancelarActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 109 */     GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
/* 110 */     this.jPanel5.setLayout(jPanel5Layout);
/* 111 */     jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGap(24, 24, 24).addComponent(this.jScrollPane1, -2, 380, -2)).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.jBGuardar, -2, 87, -2).addGap(18, 18, 18).addComponent(this.jBEditar, -2, 91, -2).addGap(18, 18, 18).addComponent(this.jBATUALIZAR).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jBCancelar))).addContainerGap(37, 32767)));
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
/* 130 */     jPanel5Layout.linkSize(0, new Component[] { this.jBATUALIZAR, this.jBCancelar, this.jBEditar, this.jBGuardar });
/*     */     
/* 132 */     jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGap(30, 30, 30).addComponent(this.jScrollPane1, -2, 117, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 54, 32767).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jBGuardar, -2, 34, -2).addComponent(this.jBEditar, -2, 32, -2).addComponent(this.jBATUALIZAR).addComponent(this.jBCancelar)).addContainerGap()));
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
/* 146 */     jPanel5Layout.linkSize(1, new Component[] { this.jBATUALIZAR, this.jBCancelar, this.jBEditar, this.jBGuardar });
/*     */     
/* 148 */     this.jPanel3.setOpaque(false);
/*     */     
/* 150 */     this.jLabel1.setFont(new Font("Tahoma", 0, 13));
/* 151 */     this.jLabel1.setText("Unidade  :");
/*     */     
/* 153 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/* 154 */     this.jPanel3.setLayout(jPanel3Layout);
/* 155 */     jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addGap(18, 18, 18).addComponent(this.jTDescricao_Unidade, -2, 307, -2).addContainerGap(27, 32767)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 164 */     jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(32, 32, 32).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.jTDescricao_Unidade, -2, 28, -2)).addContainerGap(18, 32767)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 174 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 175 */     this.jPanel1.setLayout(jPanel1Layout);
/* 176 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel5, -2, -1, -2).addComponent(this.jPanel3, -2, -1, -2)).addContainerGap(131, 32767)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 185 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(44, 44, 44).addComponent(this.jPanel3, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jPanel5, -2, -1, -2).addGap(4, 4, 4)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 195 */     getContentPane().add(this.jPanel1, new AbsoluteConstraints(20, 10, 610, 410));
/*     */     
/* 197 */     this.jLabel3.setIcon(new ImageIcon(getClass().getResource("/images/Fundo.png")));
/* 198 */     getContentPane().add(this.jLabel3, new AbsoluteConstraints(0, 0, 910, 460));
/* 199 */     getContentPane().add(this.jLabel2, new AbsoluteConstraints(0, 0, 900, 450));
/*     */     
/* 201 */     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
/* 202 */     setBounds((screenSize.width - 666) / 2, (screenSize.height - 478) / 2, 666, 478);
/*     */   }
/*     */   
/*     */   public boolean verificadados() {
/* 206 */     boolean b = true;
/* 207 */     if (this.jTDescricao_Unidade.getText().equals("")) {
/* 208 */       JOptionPane.showMessageDialog(this.rootPane, "INTRODUZA A UNIDADE ANTES DE SALVAR");
/* 209 */       b = false;
/*     */     } 
/* 211 */     return b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void desabilitados() {
/* 217 */     this.jTDescricao_Unidade.setEnabled(false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void habilitados() {
/* 224 */     this.jTDescricao_Unidade.setEnabled(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void cadastro() {
/*     */     try {
/* 230 */       Unidade un = new Unidade();
/* 231 */       un.setDescricao_Unidade(this.jTDescricao_Unidade.getText());
/* 232 */       UnidadeServicos uo = new UnidadeServicos();
/* 233 */       uo.cadastrarUnidade(un);
/* 234 */       JOptionPane.showMessageDialog(this.rootPane, "Unidade Cadastrada");
/* 235 */       preencheertabela();
/*     */     }
/* 237 */     catch (Exception e) {
/*     */       
/* 239 */       JOptionPane.showMessageDialog(null, "Unidade nao Foi Cadastrada");
/* 240 */       preencheertabela();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void preencheertabela() {
/*     */     try {
/* 252 */       UnidadeDao uni = new UnidadeDao();
/* 253 */       ResultSet rs = uni.ListaUnidade();
/* 254 */       ResultSetTableModel us = new ResultSetTableModel(rs);
/* 255 */       this.TabelaUnidade.setModel(us);
/* 256 */       this.TabelaUnidade.getSelectionModel().addListSelectionListener(new RowListenermexertabela());
/*     */ 
/*     */     
/*     */     }
/* 260 */     catch (Exception e) {
/* 261 */       System.out.println("Erro" + e.getMessage());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void jBGuardarActionPerformed(ActionEvent evt) {
/* 268 */     if (verificadados()) {
/*     */       
/* 270 */       cadastro();
/* 271 */       this.jTDescricao_Unidade.setText("");
/* 272 */       habilitados();
/* 273 */       preencheertabela();
/*     */     } 
/*     */   }
/*     */   private class RowListenermexertabela implements ListSelectionListener { private RowListenermexertabela() {}
/*     */     
/*     */     public void valueChanged(ListSelectionEvent event) {
/* 279 */       if (event.getValueIsAdjusting()) {
/*     */         return;
/*     */       }
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jBCancelarActionPerformed(ActionEvent evt) {
/* 289 */     dispose();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void jBATUALIZARActionPerformed(ActionEvent evt) {
/* 295 */     habilitados();
/*     */ 
/*     */     
/* 298 */     try { if (this.jTDescricao_Unidade.getText().contentEquals(""))
/*     */       {
/* 300 */         throw new VendasException("Click No botao Editar primeiro");
/*     */       }
/* 302 */       int row = this.TabelaUnidade.getSelectedRow();
/* 303 */       int col = 0;
/* 304 */       String Descricao = this.jTDescricao_Unidade.getText();
/* 305 */       int i = Integer.parseInt(this.TabelaUnidade.getValueAt(row, col).toString());
/* 306 */       Unidade unida = new Unidade();
/* 307 */       unida.setCod_unidade(i);
/* 308 */       unida.setDescricao_Unidade(Descricao);
/* 309 */       UnidadeServicos uni = new UnidadeServicos();
/* 310 */       uni.atualizaUnidade(unida);
/* 311 */       this.jTDescricao_Unidade.setText("");
/* 312 */       desabilitados();
/* 313 */       preencheertabela();
/* 314 */       JOptionPane.showMessageDialog(this.rootPane, "Actualizado com sucesso", "", 3, null);
/* 315 */       this.jBGuardar.setEnabled(true); }
/*     */     catch (VendasException e)
/*     */     
/* 318 */     { JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null); }
/* 319 */     catch (Exception e) { JOptionPane.showMessageDialog(this.rootPane, " Selecione A unidade que quer apagar", "", 3, null); }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   private void jBEditarActionPerformed(ActionEvent evt) {
/*     */     try {
/* 326 */       habilitados();
/* 327 */       this.jBGuardar.setEnabled(false);
/* 328 */       int row = this.TabelaUnidade.getSelectedRow();
/* 329 */       int colunaCodunidade = 0;
/* 330 */       int colunaDescrUnidade = 1;
/* 331 */       String Descricao = this.TabelaUnidade.getValueAt(row, colunaDescrUnidade).toString();
/* 332 */       int codUnidade = Integer.parseInt(this.TabelaUnidade.getValueAt(row, colunaCodunidade).toString());
/* 333 */       this.jTDescricao_Unidade.setText(Descricao);
/* 334 */       this.jBGuardar.setEnabled(false);
/*     */     
/*     */     }
/* 337 */     catch (Exception e) {
/*     */       
/* 339 */       JOptionPane.showMessageDialog(this.rootPane, "Clique na Unidade que Deseja Editar");
/* 340 */       this.jBGuardar.setEnabled(true);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) throws SQLException {
/* 348 */     (new CadUnidades()).setVisible(true);
/* 349 */     (new CadUnidades()).setTitle("UNIDADES");
/* 350 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {}
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Sistema de vendas\SysVendas.jar!\Presentation\CadUnidades.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */