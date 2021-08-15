/*    */ package Presentation;
/*    */ 
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.ResultSetMetaData;
/*    */ import java.sql.SQLException;
/*    */ import javax.swing.event.TableModelListener;
/*    */ import javax.swing.table.TableModel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ResultSetTableModel
/*    */   implements TableModel
/*    */ {
/*    */   ResultSet results;
/*    */   ResultSetMetaData metadata;
/*    */   int numcols;
/*    */   int numrows;
/*    */   
/*    */   public ResultSetTableModel(ResultSet results) throws SQLException {
/* 25 */     this.results = results;
/* 26 */     this.metadata = results.getMetaData();
/* 27 */     this.numcols = this.metadata.getColumnCount();
/* 28 */     results.last();
/* 29 */     this.numrows = results.getRow();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ResultSetTableModel() {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void close() {
/*    */     try {
/* 41 */       this.results.getStatement().close();
/* 42 */     } catch (SQLException e) {}
/*    */   }
/*    */   
/*    */   protected void finalize() {
/* 46 */     close();
/*    */   }
/*    */   
/* 49 */   public int getColumnCount() { return this.numcols; } public int getRowCount() {
/* 50 */     return this.numrows;
/*    */   }
/*    */   
/*    */   public String getColumnName(int column) {
/*    */     
/* 55 */     try { return this.metadata.getColumnLabel(column + 1); }
/* 56 */     catch (SQLException e) { return e.toString(); }
/*    */   
/*    */   }
/*    */ 
/*    */   
/*    */   public Class getColumnClass(int column) {
/* 62 */     return String.class;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object getValueAt(int row, int column) {
/*    */     
/* 73 */     try { this.results.absolute(row + 1);
/* 74 */       Object o = this.results.getObject(column + 1);
/* 75 */       if (o == null) return null; 
/* 76 */       return o.toString(); }
/* 77 */     catch (SQLException e) { return e.toString(); }
/*    */   
/*    */   }
/*    */   public boolean isCellEditable(int row, int column) {
/* 81 */     return false;
/*    */   }
/*    */   
/*    */   public void setValueAt(Object value, int row, int column) {}
/*    */   
/*    */   public void addTableModelListener(TableModelListener l) {}
/*    */   
/*    */   public void removeTableModelListener(TableModelListener l) {}
/*    */ }


/* Location:              C:\Program Files (x86)\Sistema de vendas\SysVendas.jar!\Presentation\ResultSetTableModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */