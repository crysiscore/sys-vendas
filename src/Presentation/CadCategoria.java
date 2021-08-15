/*     */ package Presentation;
/*     */ import BussinessLogic.Categoria;
/*     */ import DataAcessLayer.CategoriaDAO;
/*     */ import Service.CategoriaServicos;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.ResultSet;
/*     */ import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.LayoutStyle;
import javax.swing.border.SoftBevelBorder;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
/*     */ 
/*     */ public class CadCategoria extends JFrame {
/*     */   private JButton btnAtualizar;
/*     */   private JButton btnCancelar;
/*     */   private JButton btnEditar;
/*     */   
/*     */   public CadCategoria() {
/*  32 */     initComponents();
/*  33 */     preencheertabela();
/*     */   }
/*     */   private JButton btnSalvar; private JLabel jLabel1; private JLabel jLabel2; private JPanel jPanel1; private JPanel jPanel2; private JPanel jPanel3; private JScrollPane jScrollPane1; private JTable tabelacategoria;
/*     */   private JTextField tfnome;
/*     */   
/*     */   public void preencheertabela() {
/*     */     try {
/*  40 */       CategoriaDAO uni = new CategoriaDAO();
/*  41 */       ResultSet rs = uni.ListaCategoria();
/*  42 */       ResultSetTableModel us = new ResultSetTableModel(rs);
/*  43 */       this.tabelacategoria.setModel(us);
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  48 */     catch (Exception e) {
/*  49 */       System.out.println("" + e.getMessage());
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
/*     */   public void cadastro() {
/*     */     try {
/*  62 */       Categoria un = new Categoria();
/*  63 */       un.setNome(this.tfnome.getText());
/*     */       
/*  65 */       CategoriaServicos uo = new CategoriaServicos();
/*  66 */       uo.cadastrarcategoria(un);
/*  67 */       JOptionPane.showMessageDialog(this.rootPane, "Categoria Cadastrada");
/*  68 */       preencheertabela();
/*     */     }
/*  70 */     catch (Exception e) {
/*     */       
/*  72 */       JOptionPane.showMessageDialog(null, "Categoria ja Foi Cadastrada");
/*  73 */       preencheertabela();
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
/*     */   private void initComponents() {
/*  89 */     this.jPanel1 = new JPanel();
/*  90 */     this.jScrollPane1 = new JScrollPane();
/*  91 */     this.tabelacategoria = new JTable();
/*  92 */     this.jPanel2 = new JPanel();
/*  93 */     this.btnCancelar = new JButton();
/*  94 */     this.btnAtualizar = new JButton();
/*  95 */     this.btnEditar = new JButton();
/*  96 */     this.btnSalvar = new JButton();
/*  97 */     this.jPanel3 = new JPanel();
/*  98 */     this.jLabel1 = new JLabel();
/*  99 */     this.tfnome = new JTextField();
/* 100 */     this.jLabel2 = new JLabel();
/*     */     
/* 102 */     setDefaultCloseOperation(2);
/* 103 */     setTitle("Categorias de  Produtod");
/* 104 */     setResizable(false);
/* 105 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/* 107 */     this.jPanel1.setBorder(new SoftBevelBorder(0));
/* 108 */     this.jPanel1.setOpaque(false);
/*     */     
/* 110 */     this.tabelacategoria.setModel(new DefaultTableModel(new Object[][] { { null, null }, { null, null },  { null, null }, { null, null },  { null, null },  { null, null },  { null, null }  }, (Object[])new String[] { "Codigo", "Nome" }));
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
/* 124 */     this.jScrollPane1.setViewportView(this.tabelacategoria);
/*     */     
/* 126 */     this.jPanel2.setOpaque(false);
/*     */     
/* 128 */     this.btnCancelar.setText("Cancelar");
/* 129 */     this.btnCancelar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 131 */             CadCategoria.this.btnCancelarActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 135 */     this.btnAtualizar.setText("Atualizar");
/* 136 */     this.btnAtualizar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 138 */             CadCategoria.this.btnAtualizarActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 142 */     this.btnEditar.setText("Editar");
/* 143 */     this.btnEditar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 145 */             CadCategoria.this.btnEditarActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 149 */     this.btnSalvar.setText("Salvar");
/* 150 */     this.btnSalvar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 152 */             CadCategoria.this.btnSalvarActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 156 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/* 157 */     this.jPanel2.setLayout(jPanel2Layout);
/* 158 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.btnSalvar, -2, 91, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.btnEditar, -2, 83, -2).addGap(18, 18, 18).addComponent(this.btnAtualizar).addGap(18, 18, 18).addComponent(this.btnCancelar).addContainerGap(19, 32767)));
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
/* 172 */     jPanel2Layout.linkSize(0, new Component[] { this.btnAtualizar, this.btnCancelar, this.btnEditar, this.btnSalvar });
/*     */     
/* 174 */     jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(26, 26, 26).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.btnSalvar, -2, 31, -2).addComponent(this.btnEditar).addComponent(this.btnAtualizar).addComponent(this.btnCancelar)).addContainerGap(30, 32767)));
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
/* 186 */     jPanel2Layout.linkSize(1, new Component[] { this.btnAtualizar, this.btnCancelar, this.btnEditar, this.btnSalvar });
/*     */     
/* 188 */     this.jPanel3.setOpaque(false);
/*     */     
/* 190 */     this.jLabel1.setFont(new Font("Tahoma", 0, 13));
/* 191 */     this.jLabel1.setText("Categoria :");
/*     */     
/* 193 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/* 194 */     this.jPanel3.setLayout(jPanel3Layout);
/* 195 */     jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1, -2, 81, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.tfnome, -2, 290, -2).addContainerGap(29, 32767)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 204 */     jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(25, 25, 25).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1, -2, 25, -2).addComponent(this.tfnome, -2, 34, -2)).addContainerGap(25, 32767)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 214 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 215 */     this.jPanel1.setLayout(jPanel1Layout);
/* 216 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(28, 28, 28).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane1, -2, 370, -2).addComponent(this.jPanel3, -2, -1, -2).addComponent(this.jPanel2, -2, -1, -2)).addContainerGap(97, 32767)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 226 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(46, 46, 46).addComponent(this.jPanel3, -2, -1, -2).addGap(18, 18, 18).addComponent(this.jScrollPane1, -2, 104, -2).addGap(28, 28, 28).addComponent(this.jPanel2, -2, -1, -2).addContainerGap(48, 32767)));
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
/* 238 */     getContentPane().add(this.jPanel1, new AbsoluteConstraints(20, 20, 570, -1));
/*     */     
/* 240 */     this.jLabel2.setIcon(new ImageIcon(getClass().getResource("/images/Fundo.png")));
/* 241 */     this.jLabel2.setPreferredSize(new Dimension(400, 400));
/* 242 */     getContentPane().add(this.jLabel2, new AbsoluteConstraints(0, 0, 610, 470));
/*     */     
/* 244 */     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
/* 245 */     setBounds((screenSize.width - 622) / 2, (screenSize.height - 501) / 2, 622, 501);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void btnSalvarActionPerformed(ActionEvent evt) {
/*     */     
/* 254 */     try { if (this.tfnome.getText().contentEquals("")) {
/* 255 */         throw new VendasException("Introduza o nome da categoria");
/*     */       }
/* 257 */       cadastro(); }
/*     */     catch (VendasException e)
/* 259 */     { JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "Atencao", 3, null); }
/* 260 */     catch (Exception e) { JOptionPane.showMessageDialog(this.rootPane, e); }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   private void btnCancelarActionPerformed(ActionEvent evt) {
/* 266 */     dispose();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void btnEditarActionPerformed(ActionEvent evt) {
/*     */     try {
/* 274 */       int row = this.tabelacategoria.getSelectedRow();
/* 275 */       int col = 1;
/* 276 */       String nome = this.tabelacategoria.getValueAt(row, col).toString();
/* 277 */       this.tfnome.setText(nome);
/* 278 */       this.btnSalvar.setEnabled(false);
/*     */     } catch (Exception e) {
/*     */       
/* 281 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "Atencao", 3, null);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void btnAtualizarActionPerformed(ActionEvent evt) {
/*     */     try {
/* 288 */       if (this.tfnome.getText().contentEquals(""))
/*     */       {
/* 290 */         throw new VendasException("Click No botao Editar primeiro");
/*     */       }
/* 292 */       int row = this.tabelacategoria.getSelectedRow();
/* 293 */       int col = 0;
/*     */       
/* 295 */       int i = Integer.parseInt(this.tabelacategoria.getValueAt(row, col).toString());
/*     */ 
/*     */       
/* 298 */       Categoria unida = new Categoria();
/* 299 */       unida.setIdCategoria(Integer.valueOf(i));
/* 300 */       unida.setNome(this.tfnome.getText());
/*     */       
/* 302 */       CategoriaServicos uni = new CategoriaServicos();
/* 303 */       uni.atualizacategoria(unida);
/* 304 */       JOptionPane.showMessageDialog(this.rootPane, "Actualizado", "", 3, null);
/* 305 */       this.tfnome.setText("");
/* 306 */       preencheertabela();
/* 307 */       this.btnSalvar.setEnabled(true);
/*     */     } catch (VendasException e) {
/*     */       
/* 310 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null);
/* 311 */     } catch (Exception e) {
/* 312 */       JOptionPane.showMessageDialog(this.rootPane, "erro Interno" + e.getMessage(), "", 3, null);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/* 323 */     EventQueue.invokeLater(new Runnable()
/*     */         {
/*     */           public void run()
/*     */           {
/* 327 */             (new CadCategoria()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Sistema de vendas\SysVendas.jar!\Presentation\CadCategoria.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */