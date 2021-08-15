/*     */ package Presentation;
/*     */ import BussinessLogic.Usuario;
/*     */ import DataAcessLayer.UsuarioDAO;
/*     */ import Service.UsuarioServicos;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.EventQueue;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
/*     */ import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JPasswordField;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextField;
import javax.swing.LayoutStyle;
/*     */ import javax.swing.event.ListSelectionEvent;
/*     */ import javax.swing.event.ListSelectionListener;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
/*     */ 
/*     */ public class CadUsuarios extends JFrame {
/*     */   private JTable TabelaUsuarios;
/*     */   private JButton jBATUALIZAR;
/*     */   
/*     */   public CadUsuarios() {
/*  31 */     initComponents();
/*  32 */     habilitados();
/*  33 */     preenchertabelausuarios();
/*     */   }
/*     */   private JButton jBCancelar; private JButton jBEditar; private JButton jBGuardar; private JComboBox jCCategoria;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   private JLabel jLabel5;
/*     */   private JPanel jPanel1;
/*     */   private JPanel jPanel2;
/*     */   private JPanel jPanel4;
/*     */   private JPanel jPanel5;
/*     */   private JScrollPane jScrollPane1;
/*     */   private JTextField jTNome;
/*     */   private JPasswordField jTSenha;
/*     */   
/*     */   private void initComponents() {
/*  50 */     this.jPanel1 = new JPanel();
/*  51 */     this.jPanel5 = new JPanel();
/*  52 */     this.jScrollPane1 = new JScrollPane();
/*  53 */     this.TabelaUsuarios = new JTable();
/*  54 */     this.jPanel4 = new JPanel();
/*  55 */     this.jBGuardar = new JButton();
/*  56 */     this.jBATUALIZAR = new JButton();
/*  57 */     this.jBCancelar = new JButton();
/*  58 */     this.jBEditar = new JButton();
/*  59 */     this.jPanel2 = new JPanel();
/*  60 */     this.jLabel1 = new JLabel();
/*  61 */     this.jLabel2 = new JLabel();
/*  62 */     this.jCCategoria = new JComboBox();
/*  63 */     this.jLabel3 = new JLabel();
/*  64 */     this.jTNome = new JTextField();
/*  65 */     this.jTSenha = new JPasswordField();
/*  66 */     this.jLabel4 = new JLabel();
/*  67 */     this.jLabel5 = new JLabel();
/*     */     
/*  69 */     setDefaultCloseOperation(2);
/*  70 */     setTitle("Usuario Do Sistema");
/*  71 */     setCursor(new Cursor(0));
/*  72 */     setResizable(false);
/*  73 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/*  75 */     this.jPanel1.setBorder(BorderFactory.createTitledBorder("CADASTROS DE USUARIOS"));
/*  76 */     this.jPanel1.setOpaque(false);
/*     */     
/*  78 */     this.jPanel5.setOpaque(false);
/*     */     
/*  80 */     this.TabelaUsuarios.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null },  { null, null, null, null }, 
    { null, null, null, null },  { null, null, null, null }  }, (Object[])new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
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
/*  91 */     this.jScrollPane1.setViewportView(this.TabelaUsuarios);
/*     */     
/*  93 */     GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
/*  94 */     this.jPanel5.setLayout(jPanel5Layout);
/*  95 */     jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -2, 609, -2).addContainerGap(20, 32767)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -2, 117, -2).addContainerGap(-1, 32767)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 110 */     this.jPanel4.setOpaque(false);
/*     */     
/* 112 */     this.jBGuardar.setText("GUARDAR");
/* 113 */     this.jBGuardar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 115 */             CadUsuarios.this.jBGuardarActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 119 */     this.jBATUALIZAR.setText("ATUALIZAR");
/* 120 */     this.jBATUALIZAR.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 122 */             CadUsuarios.this.jBATUALIZARActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 126 */     this.jBCancelar.setText("CANCELAR");
/* 127 */     this.jBCancelar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 129 */             CadUsuarios.this.jBCancelarActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 133 */     this.jBEditar.setText("EDITAR");
/* 134 */     this.jBEditar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 136 */             CadUsuarios.this.jBEditarActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 140 */     GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
/* 141 */     this.jPanel4.setLayout(jPanel4Layout);
/* 142 */     jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jBGuardar, -2, 120, -2).addGap(18, 18, 18).addComponent(this.jBEditar, -2, 111, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jBATUALIZAR, -2, 107, -2).addGap(18, 18, 18).addComponent(this.jBCancelar, -2, 100, -2).addGap(340, 340, 340)));
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
/* 155 */     jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap(16, 32767).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jBGuardar, -2, 27, -2).addComponent(this.jBEditar).addComponent(this.jBATUALIZAR).addComponent(this.jBCancelar)).addContainerGap()));
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
/* 167 */     jPanel4Layout.linkSize(1, new Component[] { this.jBATUALIZAR, this.jBCancelar, this.jBGuardar });
/*     */     
/* 169 */     this.jPanel2.setOpaque(false);
/*     */     
/* 171 */     this.jLabel1.setText("NOME  :");
/*     */     
/* 173 */     this.jLabel2.setText("SENHA :");
/*     */     
/* 175 */     this.jCCategoria.setModel(new DefaultComboBoxModel<String>(new String[] { "Gerente", "Funcionario" }));
/*     */     
/* 177 */     this.jLabel3.setText("CATEGORIA :");
/*     */     
/* 179 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/* 180 */     this.jPanel2.setLayout(jPanel2Layout);
/* 181 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(23, 23, 23).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel2, GroupLayout.Alignment.TRAILING).addComponent(this.jLabel1, GroupLayout.Alignment.TRAILING).addComponent(this.jLabel3, GroupLayout.Alignment.TRAILING)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jCCategoria, -2, 336, -2).addComponent(this.jTNome, -1, 432, 32767).addComponent(this.jTSenha)).addContainerGap(219, 32767)));
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
/* 196 */     jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(26, 26, 26).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.jTNome, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel2).addComponent(this.jTSenha, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.jCCategoria, -2, -1, -2)).addContainerGap(53, 32767)));
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
/* 214 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 215 */     this.jPanel1.setLayout(jPanel1Layout);
/* 216 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767).addComponent(this.jPanel5, -2, -1, -2))).addGroup(jPanel1Layout.createSequentialGroup().addGap(62, 62, 62).addComponent(this.jPanel4, -2, 509, -2))).addContainerGap()).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(0, 778, 32767).addComponent(this.jLabel4).addGap(0, 0, 32767))));
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
/* 235 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addGap(18, 18, 18).addComponent(this.jPanel5, -2, -1, -2).addGap(18, 18, 18).addComponent(this.jPanel4, -1, -1, 32767).addGap(19, 19, 19)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(0, 211, 32767).addComponent(this.jLabel4).addGap(0, 212, 32767))));
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
/* 251 */     getContentPane().add(this.jPanel1, new AbsoluteConstraints(10, 11, 790, 450));
/*     */     
/* 253 */     this.jLabel5.setIcon(new ImageIcon(getClass().getResource("/images/Fundo.png")));
/* 254 */     getContentPane().add(this.jLabel5, new AbsoluteConstraints(0, 0, 900, 480));
/*     */     
/* 256 */     setBounds(220, 170, 826, 511);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean verificadados() {
/* 261 */     if (this.jTNome.getText().equals("") && this.jTNome.getText().equals("") && this.jCCategoria.getSelectedItem().equals("")) {
/* 262 */       JOptionPane.showMessageDialog(this.rootPane, "INTRODUZA DADOS ANTES DE GUARDA-LOS");
/* 263 */       habilitados();
/* 264 */       return true;
/* 265 */     }  if (this.jTNome.getText().equals("")) {
/*     */       
/* 267 */       JOptionPane.showMessageDialog(this.rootPane, "INTRODUZA NOME ANTES DE SALVAR");
/* 268 */       habilitados();
/* 269 */       return true;
/* 270 */     }  if (this.jTSenha.getText().equals("")) {
/*     */       
/* 272 */       JOptionPane.showMessageDialog(this.rootPane, "INTRODUZA A SENHA");
/* 273 */       habilitados();
/* 274 */       return true;
/*     */     } 
/* 276 */     if (this.jCCategoria.getSelectedItem().toString().contains(" ")) {
/* 277 */       JOptionPane.showMessageDialog(this.rootPane, "INTRODUZA A CATEGORIA");
/* 278 */       habilitados();
/* 279 */       return true;
/*     */     } 
/*     */     
/* 282 */     dispose();
/*     */     
/* 284 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void preenchertabelausuarios() {
/*     */     try {
/* 293 */       UsuarioDAO usa = new UsuarioDAO();
/* 294 */       ResultSet rs = usa.ListarUsuarios();
/* 295 */       ResultSetTableModel us = new ResultSetTableModel(rs);
/* 296 */       this.TabelaUsuarios.setModel(us);
/* 297 */       this.TabelaUsuarios.getSelectionModel().addListSelectionListener(new RowListenermexertabela());
/*     */     
/*     */     }
/* 300 */     catch (Exception e) {
/* 301 */       System.out.println("" + e.getMessage());
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void desabilitados() {
/* 306 */     this.jTNome.setEnabled(false);
/* 307 */     this.jTSenha.setEnabled(false);
/* 308 */     this.jCCategoria.setEnabled(false);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void habilitados() {
/* 314 */     this.jTNome.setText("");
/* 315 */     this.jTSenha.setText("");
/* 316 */     this.jCCategoria.setSelectedItem("");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void cadastro() throws SQLException {
/*     */     try {
/* 324 */       Usuario us = new Usuario();
/* 325 */       us.setNome(this.jTNome.getText());
/* 326 */       us.setSenha(this.jTSenha.getText().toString());
/* 327 */       us.setCategoria(this.jCCategoria.getSelectedItem().toString());
/*     */ 
/*     */       
/* 330 */       UsuarioServicos uo = new UsuarioServicos();
/* 331 */       uo.cadastrarUsuario(us);
/* 332 */       JOptionPane.showMessageDialog(this.rootPane, "O Usuario foi Cadastrado com Sucesso");
/* 333 */       preenchertabelausuarios();
/*     */     
/*     */     }
/*     */     catch (Exception e) {
/*     */       
/* 338 */       JOptionPane.showMessageDialog(null, "NAO FOI POSSIVEL CADASTRAR O USUARIO");
/* 339 */       preenchertabelausuarios();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void jBGuardarActionPerformed(ActionEvent evt) {
/* 344 */     if (!verificadados())
/*     */       try {
/* 346 */         cadastro();
/* 347 */         habilitados();
/*     */       }
/* 349 */       catch (Exception ex) {
/*     */         
/* 351 */         JOptionPane.showMessageDialog(this.rootPane, "NAO FOI POSSIVEL CADASTRAR O USUARIO" + ex);
/*     */         
/* 353 */         habilitados();
/*     */       }  
/*     */   }
/*     */   
/*     */   private class RowListenermexertabela implements ListSelectionListener {
/*     */     private RowListenermexertabela() {}
/*     */     
/*     */     public void valueChanged(ListSelectionEvent event) {
/* 361 */       if (event.getValueIsAdjusting()) {
/*     */         return;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jBCancelarActionPerformed(ActionEvent evt) {
/* 371 */     dispose();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jBATUALIZARActionPerformed(ActionEvent evt) {
/*     */     try {
/* 379 */       int row = this.TabelaUsuarios.getSelectedRow();
/* 380 */       int col = 0;
/* 381 */       int Codigo = Integer.valueOf(this.TabelaUsuarios.getValueAt(row, col).toString()).intValue();
/* 382 */       String Nome = this.jTNome.getText();
/* 383 */       String Senha = this.jTSenha.getText();
/* 384 */       String Categoria = this.jCCategoria.getSelectedItem().toString();
/* 385 */       UsuarioDAO unid = new UsuarioDAO();
/*     */       
/* 387 */       unid.editarusuario(Codigo, Nome, Senha, Categoria);
/* 388 */       preenchertabelausuarios();
/* 389 */       this.jTNome.setText("");
/* 390 */       this.jTSenha.setText("");
/* 391 */       this.jCCategoria.setSelectedIndex(2);
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 396 */     catch (Exception e) {
/*     */       
/* 398 */       JOptionPane.showMessageDialog(this.rootPane, "Seleccione a linha que deseja atualizar");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jBEditarActionPerformed(ActionEvent evt) {
/*     */     try {
/* 408 */       int row = this.TabelaUsuarios.getSelectedRow();
/* 409 */       String Nome = this.TabelaUsuarios.getValueAt(row, 1).toString();
/* 410 */       String Senha = this.TabelaUsuarios.getValueAt(row, 2).toString();
/* 411 */       String Categoria = this.TabelaUsuarios.getValueAt(row, 3).toString();
/*     */       
/* 413 */       this.jTNome.setText(Nome);
/* 414 */       this.jTSenha.setText(Senha);
/*     */ 
/*     */     
/*     */     }
/* 418 */     catch (Exception e) {
/*     */       
/* 420 */       JOptionPane.showMessageDialog(this.rootPane, "CLIKE NO USUARIO QUE DESEJA EDITAR" + e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) throws SQLException {
/* 428 */     (new CadUsuarios()).setVisible(true);
/* 429 */     (new CadUsuarios()).setTitle("UNIDADES");
/* 430 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {}
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Sistema de vendas\SysVendas.jar!\Presentation\CadUsuarios.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */