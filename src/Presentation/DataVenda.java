/*     */ package Presentation;
/*     */ 
/*     */ import com.toedter.calendar.JDateChooser;
/*     */ import java.awt.Component;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.Date;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.LayoutStyle;
/*     */ import relatorios.Relatorios;
/*     */ 
/*     */ public class DataVenda
/*     */   extends JFrame {
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JDateChooser jDateChooser;
/*     */   private JLabel jLabel1;
/*     */   
/*     */   public DataVenda() {
/*  24 */     initComponents();
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
/*     */   private void initComponents() {
/*  36 */     this.jDateChooser = new JDateChooser();
/*  37 */     this.jLabel1 = new JLabel();
/*  38 */     this.jButton1 = new JButton();
/*  39 */     this.jButton2 = new JButton();
/*     */     
/*  41 */     setDefaultCloseOperation(2);
/*  42 */     setTitle("Data de Venda");
/*  43 */     setResizable(false);
/*     */     
/*  45 */     this.jDateChooser.setDateFormatString("yyyy,MM,dd");
/*     */     
/*  47 */     this.jLabel1.setText("Data de Venda :");
/*     */     
/*  49 */     this.jButton1.setText("Ok");
/*  50 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  52 */             DataVenda.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  56 */     this.jButton2.setText("Cancel");
/*  57 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  59 */             DataVenda.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  63 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  64 */     getContentPane().setLayout(layout);
/*  65 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jButton1, -2, 84, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton2, -2, 84, -2)).addComponent((Component)this.jDateChooser, -2, 176, -2)).addContainerGap(16, 32767)));
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
/*  79 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(26, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent((Component)this.jDateChooser, -2, -1, -2).addComponent(this.jLabel1)).addGap(32, 32, 32).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton2)).addContainerGap()));
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
/*  93 */     pack();
/*     */   }
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/*     */     try {
/*  99 */       Date datavenda = new Date(this.jDateChooser.getDate().getYear(), this.jDateChooser.getDate().getMonth(), this.jDateChooser.getDate().getDate());
/* 100 */       Relatorios trickRelatorios = new Relatorios();
/* 101 */       trickRelatorios.abrirRelatorioVendasPorData(datavenda);
/* 102 */       dispose();
/*     */     }
/* 104 */     catch (Exception e) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 113 */     dispose();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/* 120 */     EventQueue.invokeLater(new Runnable()
/*     */         {
/*     */           public void run() {
/* 123 */             (new DataVenda()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Sistema de vendas\SysVendas.jar!\Presentation\DataVenda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */