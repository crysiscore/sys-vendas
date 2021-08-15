/*     */ package Presentation;
/*     */ import BussinessLogic.Previlegio;
/*     */ import DataAcessLayer.UsuarioDAO;
/*     */ import Service.UsuarioServicos;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
import java.sql.ResultSet;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.*;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
/*     */ 
/*     */ public class LoginPage extends JFrame {
/*     */   ResultSet rs;
/*     */   
/*     */   public LoginPage() {
/*  29 */     initComponents();
/*     */   }
/*     */   private JButton btnCancel; private JButton btnLogin; private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JPanel jPanel2;
/*     */   private JPanel jPanel3;
/*     */   private JLabel lbl_loginpage_erro;
/*     */   private JLabel lbl_password1;
/*     */   private JLabel lbl_username1;
/*     */   private JPasswordField tf_login_password;
/*     */   private JTextField tf_login_userName;
/*     */   
/*     */   private void initComponents() {
/*  42 */     this.jPanel2 = new JPanel();
/*  43 */     this.jPanel3 = new JPanel();
/*  44 */     this.lbl_username1 = new JLabel();
/*  45 */     this.tf_login_userName = new JTextField();
/*  46 */     this.tf_login_password = new JPasswordField();
/*  47 */     this.lbl_password1 = new JLabel();
/*  48 */     this.btnLogin = new JButton();
/*  49 */     this.btnCancel = new JButton();
/*  50 */     this.lbl_loginpage_erro = new JLabel();
/*  51 */     this.jLabel2 = new JLabel();
/*  52 */     this.jLabel1 = new JLabel();
/*     */     
/*  54 */     setDefaultCloseOperation(3);
/*  55 */     setTitle("Entrar no sistema");
/*  56 */     setResizable(false);
/*     */     
/*  58 */     this.jPanel2.setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/*  60 */     this.jPanel3.setOpaque(false);
/*  61 */     this.jPanel3.setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/*  63 */     this.lbl_username1.setFont(new Font("Segoe UI", 1, 14));
/*  64 */     this.lbl_username1.setText("Nome do Usuario :");
/*  65 */     this.jPanel3.add(this.lbl_username1, new AbsoluteConstraints(12, 46, -1, -1));
/*     */     
/*  67 */     this.tf_login_userName.setFont(new Font("Segoe UI", 0, 14));
/*  68 */     this.tf_login_userName.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  70 */             LoginPage.this.tf_login_userNameActionPerformed(evt);
/*     */           }
/*     */         });
/*  73 */     this.tf_login_userName.addKeyListener(new KeyAdapter() {
/*     */           public void keyTyped(KeyEvent evt) {
/*  75 */             LoginPage.this.tf_login_userNameKeyTyped(evt);
/*     */           }
/*     */         });
/*  78 */     this.jPanel3.add(this.tf_login_userName, new AbsoluteConstraints(151, 51, 181, -1));
/*     */     
/*  80 */     this.tf_login_password.setFont(new Font("Segoe UI", 0, 14));
/*  81 */     this.tf_login_password.addKeyListener(new KeyAdapter() {
/*     */           public void keyTyped(KeyEvent evt) {
/*  83 */             LoginPage.this.tf_login_passwordKeyTyped(evt);
/*     */           }
/*     */         });
/*  86 */     this.jPanel3.add(this.tf_login_password, new AbsoluteConstraints(151, 95, 181, 27));
/*     */     
/*  88 */     this.lbl_password1.setFont(new Font("Segoe UI", 1, 14));
/*  89 */     this.lbl_password1.setText("Senha :");
/*  90 */     this.jPanel3.add(this.lbl_password1, new AbsoluteConstraints(12, 96, -1, -1));
/*     */     
/*  92 */     this.btnLogin.setText("Login");
/*  93 */     this.btnLogin.addMouseListener(new MouseAdapter() {
/*     */           public void mouseEntered(MouseEvent evt) {
/*  95 */             LoginPage.this.btnLoginMouseEntered(evt);
/*     */           }
/*     */         });
/*  98 */     this.btnLogin.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 100 */             LoginPage.this.btnLoginActionPerformed(evt);
/*     */           }
/*     */         });
/* 103 */     this.jPanel3.add(this.btnLogin, new AbsoluteConstraints(151, 133, 67, -1));
/*     */     
/* 105 */     this.btnCancel.setText("Cancel");
/* 106 */     this.btnCancel.addMouseListener(new MouseAdapter() {
/*     */           public void mouseEntered(MouseEvent evt) {
/* 108 */             LoginPage.this.btnCancelMouseEntered(evt);
/*     */           }
/*     */         });
/* 111 */     this.btnCancel.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 113 */             LoginPage.this.btnCancelActionPerformed(evt);
/*     */           }
/*     */         });
/* 116 */     this.jPanel3.add(this.btnCancel, new AbsoluteConstraints(228, 133, -1, -1));
/*     */     
/* 118 */     this.lbl_loginpage_erro.setFont(new Font("Tahoma", 1, 12));
/* 119 */     this.lbl_loginpage_erro.setForeground(new Color(249, 50, 24));
/* 120 */     this.lbl_loginpage_erro.setText(" ");
/* 121 */     this.jPanel3.add(this.lbl_loginpage_erro, new AbsoluteConstraints(10, 10, 303, 27));
/*     */     
/* 123 */     this.jPanel2.add(this.jPanel3, new AbsoluteConstraints(180, 70, 348, 183));
/*     */     
/* 125 */     this.jLabel2.setIcon(new ImageIcon(getClass().getResource("/images/lock.png")));
/* 126 */     this.jPanel2.add(this.jLabel2, new AbsoluteConstraints(20, 100, -1, -1));
/*     */     
/* 128 */     this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/bg_Login.jpg")));
/* 129 */     this.jPanel2.add(this.jLabel1, new AbsoluteConstraints(0, 0, 580, 300));
/*     */     
/* 131 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 132 */     getContentPane().setLayout(layout);
/* 133 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767));
/*     */ 
/*     */ 
/*     */     
/* 137 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 142 */     setBounds(250, 200, 573, 309);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void tf_login_userNameActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */   
/*     */   private void btnLoginActionPerformed(ActionEvent evt) {
/* 151 */     String username = this.tf_login_userName.getText();
/*     */     
/* 153 */     String password = this.tf_login_password.getText();
/* 154 */     UsuarioServicos us = new UsuarioServicos();
/* 155 */     this.lbl_loginpage_erro.setText("");
/* 156 */     this.jLabel2.setIcon(new ImageIcon(getClass().getResource("/images/lock_off.png")));
/*     */     
/*     */     try {
/* 159 */       if (us.AutenticarUsuario(username, password) == true)
/*     */       {
/*     */         
/* 162 */         UsuarioDAO userDao = new UsuarioDAO();
/* 163 */         this.rs = userDao.getCategoriaUsuario(username, password);
/* 164 */         this.rs.next();
/* 165 */         String categoriaUsuario = this.rs.getString("Categoria");
/* 166 */         String codUsuario = this.rs.getString("Cod_Funcionario");
/*     */         
/* 168 */         if (categoriaUsuario.contentEquals("Funcionario"))
/*     */         {
/* 170 */           Previlegio prev = us.VerificarPrevilegios();
/* 171 */           us.Login(username, password);
/* 172 */           Trick formularioPrincipal = new Trick();
/* 173 */           formularioPrincipal.UserInfo(username, codUsuario);
/* 174 */           formularioPrincipal.setVisible(true);
/* 175 */           formularioPrincipal.VerificarPrevilegio(prev);
/* 176 */           dispose();
/*     */         }
/* 178 */         else if (categoriaUsuario.contentEquals("Gerente"))
/*     */         {
/* 180 */           us.Login(username, password);
/* 181 */           Trick formularioPrincipal = new Trick();
/* 182 */           formularioPrincipal.UserInfo(username, codUsuario);
/* 183 */           formularioPrincipal.setVisible(true);
/* 184 */           dispose();
/*     */ 
/*     */         
/*     */         }
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */         
/* 196 */         this.lbl_loginpage_erro.setText("Nome e senha nao correspondem");
/* 197 */         this.jLabel2.setIcon(new ImageIcon(getClass().getResource("/images/lock.png")));
/*     */       }
/*     */     
/*     */     }
/* 201 */     catch (Exception ex) {
/* 202 */       System.out.println("" + ex + ex.getLocalizedMessage());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void btnCancelActionPerformed(ActionEvent evt) {
/* 208 */     System.exit(0);
/*     */   }
/*     */ 
/*     */   
/*     */   private void tf_login_userNameKeyTyped(KeyEvent evt) {
/* 213 */     this.lbl_loginpage_erro.setText((String)null);
/*     */   }
/*     */ 
/*     */   
/*     */   private void tf_login_passwordKeyTyped(KeyEvent evt) {
/* 218 */     this.lbl_loginpage_erro.setText((String)null);
/*     */   }
/*     */ 
/*     */   
/*     */   private void btnLoginMouseEntered(MouseEvent evt) {
/* 223 */     this.btnLogin.setCursor(new Cursor(12));
/*     */   }
/*     */ 
/*     */   
/*     */   private void btnCancelMouseEntered(MouseEvent evt) {
/* 228 */     this.btnCancel.setCursor(new Cursor(12));
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
/*     */   public static void main(String[] args) {
/*     */     try {
/* 241 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 242 */         if ("Nimbus".equals(info.getName())) {
/* 243 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 247 */     } catch (ClassNotFoundException ex) {
/* 248 */       Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 249 */     } catch (InstantiationException ex) {
/* 250 */       Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 251 */     } catch (IllegalAccessException ex) {
/* 252 */       Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 253 */     } catch (UnsupportedLookAndFeelException ex) {
/* 254 */       Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 259 */     EventQueue.invokeLater(new Runnable()
/*     */         {
/*     */           public void run()
/*     */           {
/* 263 */             (new LoginPage()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Sistema de vendas\SysVendas.jar!\Presentation\LoginPage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */