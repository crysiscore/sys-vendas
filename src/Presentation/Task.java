/*    */ package Presentation;
/*    */ 
/*    */ import java.awt.Toolkit;
/*    */ import java.util.Random;
/*    */ import javax.swing.SwingWorker;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Task
/*    */   extends SwingWorker<Void, Void>
/*    */ {
/*    */   public Void doInBackground() {
/* 19 */     Random random = new Random();
/* 20 */     int progress = 0;
/* 21 */     setProgress(0);
/*    */     try {
/* 23 */       Thread.sleep(200L);
/* 24 */       while (progress < 100 && !isCancelled()) {
/*    */         
/* 26 */         Thread.sleep(random.nextInt(120));
/*    */         
/* 28 */         progress += random.nextInt(10);
/* 29 */         setProgress(Math.min(progress, 100));
/*    */       } 
/* 31 */     } catch (InterruptedException ignore) {}
/* 32 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void done() {
/* 37 */     Toolkit.getDefaultToolkit().beep();
/*    */   }
/*    */ }


/* Location:              C:\Program Files (x86)\Sistema de vendas\SysVendas.jar!\Presentation\Task.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */