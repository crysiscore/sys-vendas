/*     */ package Presentation;
/*     */ 
/*     */ import java.awt.Component;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import javax.swing.AbstractAction;
/*     */ import javax.swing.Action;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.KeyStroke;
/*     */ import javax.swing.event.TableModelEvent;
/*     */ import javax.swing.event.TableModelListener;
/*     */ import javax.swing.table.TableCellRenderer;
/*     */ import javax.swing.table.TableColumn;
/*     */ import javax.swing.table.TableColumnModel;
/*     */ import javax.swing.table.TableModel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TableColumnAdjuster
/*     */   implements PropertyChangeListener, TableModelListener
/*     */ {
/*     */   private JTable table;
/*     */   private int spacing;
/*     */   private boolean isColumnHeaderIncluded;
/*     */   private boolean isColumnDataIncluded;
/*     */   private boolean isOnlyAdjustLarger;
/*     */   private boolean isDynamicAdjustment;
/*  33 */   private Map<TableColumn, Integer> columnSizes = new HashMap<TableColumn, Integer>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TableColumnAdjuster(JTable table) {
/*  40 */     this(table, 6);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TableColumnAdjuster(JTable table, int spacing) {
/*  48 */     this.table = table;
/*  49 */     this.spacing = spacing;
/*  50 */     setColumnHeaderIncluded(true);
/*  51 */     setColumnDataIncluded(true);
/*  52 */     setOnlyAdjustLarger(true);
/*  53 */     setDynamicAdjustment(false);
/*  54 */     installActions();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void adjustColumns() {
/*  62 */     TableColumnModel tcm = this.table.getColumnModel();
/*     */     
/*  64 */     for (int i = 0; i < tcm.getColumnCount(); i++)
/*     */     {
/*  66 */       adjustColumn(i);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void adjustColumn(int column) {
/*  75 */     TableColumn tableColumn = this.table.getColumnModel().getColumn(column);
/*     */     
/*  77 */     if (!tableColumn.getResizable())
/*     */       return; 
/*  79 */     int columnHeaderWidth = getColumnHeaderWidth(column);
/*  80 */     int columnDataWidth = getColumnDataWidth(column);
/*  81 */     int preferredWidth = Math.max(columnHeaderWidth, columnDataWidth);
/*     */     
/*  83 */     updateTableColumn(column, preferredWidth);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int getColumnHeaderWidth(int column) {
/*  91 */     if (!this.isColumnHeaderIncluded) return 0;
/*     */     
/*  93 */     TableColumn tableColumn = this.table.getColumnModel().getColumn(column);
/*  94 */     Object value = tableColumn.getHeaderValue();
/*  95 */     TableCellRenderer renderer = tableColumn.getHeaderRenderer();
/*     */     
/*  97 */     if (renderer == null)
/*     */     {
/*  99 */       renderer = this.table.getTableHeader().getDefaultRenderer();
/*     */     }
/*     */     
/* 102 */     Component c = renderer.getTableCellRendererComponent(this.table, value, false, false, -1, column);
/* 103 */     return (c.getPreferredSize()).width;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int getColumnDataWidth(int column) {
/* 112 */     if (!this.isColumnDataIncluded) return 0;
/*     */     
/* 114 */     int preferredWidth = 0;
/* 115 */     int maxWidth = this.table.getColumnModel().getColumn(column).getMaxWidth();
/*     */     
/* 117 */     for (int row = 0; row < this.table.getRowCount(); row++) {
/*     */       
/* 119 */       preferredWidth = Math.max(preferredWidth, getCellDataWidth(row, column));
/*     */ 
/*     */ 
/*     */       
/* 123 */       if (preferredWidth >= maxWidth) {
/*     */         break;
/*     */       }
/*     */     } 
/* 127 */     return preferredWidth;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int getCellDataWidth(int row, int column) {
/* 137 */     TableCellRenderer cellRenderer = this.table.getCellRenderer(row, column);
/* 138 */     Component c = this.table.prepareRenderer(cellRenderer, row, column);
/* 139 */     int width = (c.getPreferredSize()).width + (this.table.getIntercellSpacing()).width;
/*     */     
/* 141 */     return width;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void updateTableColumn(int column, int width) {
/* 149 */     TableColumn tableColumn = this.table.getColumnModel().getColumn(column);
/*     */     
/* 151 */     if (!tableColumn.getResizable())
/*     */       return; 
/* 153 */     width += this.spacing;
/*     */ 
/*     */ 
/*     */     
/* 157 */     if (this.isOnlyAdjustLarger)
/*     */     {
/* 159 */       width = Math.max(width, tableColumn.getPreferredWidth());
/*     */     }
/*     */     
/* 162 */     this.columnSizes.put(tableColumn, new Integer(tableColumn.getWidth()));
/* 163 */     this.table.getTableHeader().setResizingColumn(tableColumn);
/* 164 */     tableColumn.setWidth(width);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void restoreColumns() {
/* 172 */     TableColumnModel tcm = this.table.getColumnModel();
/*     */     
/* 174 */     for (int i = 0; i < tcm.getColumnCount(); i++)
/*     */     {
/* 176 */       restoreColumn(i);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void restoreColumn(int column) {
/* 185 */     TableColumn tableColumn = this.table.getColumnModel().getColumn(column);
/* 186 */     Integer width = this.columnSizes.get(tableColumn);
/*     */     
/* 188 */     if (width != null) {
/*     */       
/* 190 */       this.table.getTableHeader().setResizingColumn(tableColumn);
/* 191 */       tableColumn.setWidth(width.intValue());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setColumnHeaderIncluded(boolean isColumnHeaderIncluded) {
/* 200 */     this.isColumnHeaderIncluded = isColumnHeaderIncluded;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setColumnDataIncluded(boolean isColumnDataIncluded) {
/* 208 */     this.isColumnDataIncluded = isColumnDataIncluded;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnlyAdjustLarger(boolean isOnlyAdjustLarger) {
/* 216 */     this.isOnlyAdjustLarger = isOnlyAdjustLarger;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDynamicAdjustment(boolean isDynamicAdjustment) {
/* 227 */     if (this.isDynamicAdjustment != isDynamicAdjustment)
/*     */     {
/* 229 */       if (isDynamicAdjustment) {
/*     */         
/* 231 */         this.table.addPropertyChangeListener(this);
/* 232 */         this.table.getModel().addTableModelListener(this);
/*     */       }
/*     */       else {
/*     */         
/* 236 */         this.table.removePropertyChangeListener(this);
/* 237 */         this.table.getModel().removeTableModelListener(this);
/*     */       } 
/*     */     }
/*     */     
/* 241 */     this.isDynamicAdjustment = isDynamicAdjustment;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void propertyChange(PropertyChangeEvent e) {
/* 251 */     if ("model".equals(e.getPropertyName())) {
/*     */       
/* 253 */       TableModel model = (TableModel)e.getOldValue();
/* 254 */       model.removeTableModelListener(this);
/*     */       
/* 256 */       model = (TableModel)e.getNewValue();
/* 257 */       model.addTableModelListener(this);
/* 258 */       adjustColumns();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void tableChanged(TableModelEvent e) {
/* 266 */     if (!this.isColumnDataIncluded) {
/*     */       return;
/*     */     }
/*     */     
/* 270 */     if (e.getType() == 0) {
/*     */       
/* 272 */       int column = this.table.convertColumnIndexToView(e.getColumn());
/*     */ 
/*     */ 
/*     */       
/* 276 */       if (this.isOnlyAdjustLarger)
/*     */       {
/* 278 */         int row = e.getFirstRow();
/* 279 */         TableColumn tableColumn = this.table.getColumnModel().getColumn(column);
/*     */         
/* 281 */         if (tableColumn.getResizable())
/*     */         {
/* 283 */           int width = getCellDataWidth(row, column);
/* 284 */           updateTableColumn(column, width);
/*     */         
/*     */         }
/*     */ 
/*     */       
/*     */       }
/*     */       else
/*     */       {
/* 292 */         adjustColumn(column);
/*     */       
/*     */       }
/*     */ 
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 300 */       adjustColumns();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void installActions() {
/* 309 */     installColumnAction(true, true, "adjustColumn", "control ADD");
/* 310 */     installColumnAction(false, true, "adjustColumns", "control shift ADD");
/* 311 */     installColumnAction(true, false, "restoreColumn", "control SUBTRACT");
/* 312 */     installColumnAction(false, false, "restoreColumns", "control shift SUBTRACT");
/*     */     
/* 314 */     installToggleAction(true, false, "toggleDynamic", "control MULTIPLY");
/* 315 */     installToggleAction(false, true, "toggleLarger", "control DIVIDE");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void installColumnAction(boolean isSelectedColumn, boolean isAdjust, String key, String keyStroke) {
/* 324 */     Action action = new ColumnAction(isSelectedColumn, isAdjust);
/* 325 */     KeyStroke ks = KeyStroke.getKeyStroke(keyStroke);
/* 326 */     this.table.getInputMap().put(ks, key);
/* 327 */     this.table.getActionMap().put(key, action);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void installToggleAction(boolean isToggleDynamic, boolean isToggleLarger, String key, String keyStroke) {
/* 336 */     Action action = new ToggleAction(isToggleDynamic, isToggleLarger);
/* 337 */     KeyStroke ks = KeyStroke.getKeyStroke(keyStroke);
/* 338 */     this.table.getInputMap().put(ks, key);
/* 339 */     this.table.getActionMap().put(key, action);
/*     */   }
/*     */ 
/*     */   
/*     */   class ColumnAction
/*     */     extends AbstractAction
/*     */   {
/*     */     private boolean isSelectedColumn;
/*     */     
/*     */     private boolean isAdjust;
/*     */ 
/*     */     
/*     */     public ColumnAction(boolean isSelectedColumn, boolean isAdjust) {
/* 352 */       this.isSelectedColumn = isSelectedColumn;
/* 353 */       this.isAdjust = isAdjust;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void actionPerformed(ActionEvent e) {
/* 361 */       if (this.isSelectedColumn) {
/*     */         
/* 363 */         int[] columns = TableColumnAdjuster.this.table.getSelectedColumns();
/*     */         
/* 365 */         for (int i = 0; i < columns.length; i++)
/*     */         {
/* 367 */           if (this.isAdjust) {
/* 368 */             TableColumnAdjuster.this.adjustColumn(columns[i]);
/*     */           } else {
/* 370 */             TableColumnAdjuster.this.restoreColumn(columns[i]);
/*     */           }
/*     */         
/*     */         }
/*     */       
/* 375 */       } else if (this.isAdjust) {
/* 376 */         TableColumnAdjuster.this.adjustColumns();
/*     */       } else {
/* 378 */         TableColumnAdjuster.this.restoreColumns();
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   class ToggleAction
/*     */     extends AbstractAction
/*     */   {
/*     */     private boolean isToggleDynamic;
/*     */     
/*     */     private boolean isToggleLarger;
/*     */ 
/*     */     
/*     */     public ToggleAction(boolean isToggleDynamic, boolean isToggleLarger) {
/* 394 */       this.isToggleDynamic = isToggleDynamic;
/* 395 */       this.isToggleLarger = isToggleLarger;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void actionPerformed(ActionEvent e) {
/* 401 */       if (this.isToggleDynamic) {
/*     */         
/* 403 */         TableColumnAdjuster.this.setDynamicAdjustment(!TableColumnAdjuster.this.isDynamicAdjustment);
/*     */         
/*     */         return;
/*     */       } 
/* 407 */       if (this.isToggleLarger) {
/*     */         
/* 409 */         TableColumnAdjuster.this.setOnlyAdjustLarger(!TableColumnAdjuster.this.isOnlyAdjustLarger);
/*     */         return;
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files (x86)\Sistema de vendas\SysVendas.jar!\Presentation\TableColumnAdjuster.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */