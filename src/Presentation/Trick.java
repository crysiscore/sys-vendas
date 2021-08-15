/*      */ package Presentation;
/*      */ import BussinessLogic.Previlegio;
import Service.UsuarioServicos;
/*      */ import java.awt.Color;
/*      */ import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
/*      */ import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Toolkit;
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.awt.event.MouseAdapter;
/*      */ import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
/*      */ import java.awt.event.WindowEvent;
/*      */ import javax.swing.*;
/*      */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
/*      */ import relatorios.Relatorios;
/*      */ 
/*      */ public class Trick extends JFrame {
/*      */   private JButton jButton1;
/*      */   private JButton jButton2;
/*      */   private JButton jButton3;
/*      */   private JButton jButton4;
/*      */   private JLabel jLabel1;
/*      */   private JLabel jLabel10;
/*      */   private JLabel jLabel11;
/*      */   private JLabel jLabel12;
/*      */   private JLabel jLabel13;
/*      */   private JLabel jLabel14;
/*      */   private JLabel jLabel15;
/*      */   private JLabel jLabel16;
/*      */   private JLabel jLabel17;
/*      */   private JLabel jLabel18;
/*      */   private JLabel jLabel19;
/*      */   
/*      */   public Trick() {
/*   36 */     initComponents();
/*   37 */     HabilitarTabProdutos();
/*      */     
/*   39 */     setLocation(5, 5);
/*      */   }
/*      */   private JLabel jLabel2; private JLabel jLabel20; private JLabel jLabel21; private JLabel jLabel22; private JLabel jLabel3; private JLabel jLabel4; private JLabel jLabel5; private JLabel jLabel6; private JLabel jLabel7; private JLabel jLabel8; private JLabel jLabel9; private JMenu jMenu1; private JMenu jMenu2; private JMenu jMenu3; private JMenu jMenu4; private JMenu jMenu5; private JMenuBar jMenuBar1; private JMenuItem jMenuItem1; private JMenuItem jMenuItem10; private JMenuItem jMenuItem11; private JMenuItem jMenuItem12; private JMenuItem jMenuItem13; private JMenuItem jMenuItem14; private JMenuItem jMenuItem15; private JMenuItem jMenuItem2; private JMenuItem jMenuItem3; private JMenuItem jMenuItem4; private JMenuItem jMenuItem5; private JMenuItem jMenuItem6; private JMenuItem jMenuItem7; private JMenuItem jMenuItem8; private JMenuItem jMenuItem9;
/*      */   private JPanel jPanel2;
/*      */   private JToolBar.Separator jSeparator1;
/*      */   private JPopupMenu.Separator jSeparator2;
/*      */   private JPopupMenu.Separator jSeparator3;
/*      */   private JToolBar jToolBar1;
/*      */   private JLabel lblTabPaneProdutos;
/*      */   private JLabel lblTabPaneVendas;
/*      */   private JLabel lbl_Logout;
/*      */   private JLabel lbl_UserCod;
/*      */   private JLabel lbl_UserName;
/*      */   private JPanel panelPrincipal;
/*      */   private JPanel panelTabVendas;
/*      */   private JPanel panelTabprodutos;
/*      */   
/*      */   public void UserInfo(String userName, String codUsuario) {
/*   57 */     this.lbl_UserName.setText(this.lbl_UserName.getText() + userName + "  ");
/*   58 */     this.lbl_UserCod.setText(codUsuario);
/*   59 */     this.lbl_UserCod.setVisible(false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void VerificarPrevilegio(Previlegio prev) {
/*   66 */     this.jLabel8.setVisible(prev.isProdutosPodeRegistar());
/*   67 */     this.jLabel9.setVisible(prev.isProdutosPodeRegistar());
/*   68 */     this.jMenuItem6.setEnabled(prev.isProdutosPodeAlterarDados());
/*   69 */     this.jLabel14.setVisible(prev.isProdutosPodeAlterarDados());
/*   70 */     this.jMenuItem4.setEnabled(prev.isProdutosPodeAlterarDados());
/*   71 */     this.jLabel11.setVisible(prev.isProdutosPodeAlterarDados());
/*   72 */     this.jLabel10.setVisible(prev.isProdutosPodeAdicionarStock());
/*   73 */     this.jLabel12.setVisible(prev.isProdutosPodeAdicionarStock());
/*   74 */     this.jLabel16.setVisible(prev.isRelatoriosVendasRecentes());
/*   75 */     this.jLabel21.setVisible(prev.isRelatoriosVendasRecentes());
/*   76 */     this.jMenuItem3.setEnabled(prev.isProdutosPodeRegistar());
/*   77 */     this.jMenuItem5.setEnabled(prev.isProdutosPodeAdicionarStock());
/*   78 */     this.jMenuItem2.setEnabled(prev.isRelatoriosVendasRecentes());
/*   79 */     this.jMenuItem9.setEnabled(prev.isRelatoriosVendasRecentes());
/*   80 */     this.jMenuItem12.setEnabled(prev.isRelatoriosVendasPorDaata());
/*   81 */     this.jButton3.setVisible(prev.isProdutosPodeRegistar());
/*   82 */     this.jButton2.setVisible(prev.isProdutosPodeAdicionarStock());
/*   83 */     this.jMenuItem8.setEnabled(prev.isProdutosPodeRegistarUnid());
/*   84 */     this.jMenuItem10.setEnabled(prev.isProdutosPodeRegistarCat());
/*   85 */     this.jMenuItem14.setEnabled(false);
/*   86 */     this.jMenuItem15.setEnabled(false);
/*   87 */     this.jButton4.setEnabled(false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void initComponents() {
/*   94 */     this.jToolBar1 = new JToolBar();
/*   95 */     this.jButton3 = new JButton();
/*   96 */     this.jButton1 = new JButton();
/*   97 */     this.jButton2 = new JButton();
/*   98 */     this.jSeparator1 = new JToolBar.Separator();
/*   99 */     this.jLabel7 = new JLabel();
/*  100 */     this.jButton4 = new JButton();
/*  101 */     this.panelPrincipal = new JPanel();
/*  102 */     this.jLabel4 = new JLabel();
/*  103 */     this.lblTabPaneVendas = new JLabel();
/*  104 */     this.jLabel2 = new JLabel();
/*  105 */     this.jLabel6 = new JLabel();
/*  106 */     this.lblTabPaneProdutos = new JLabel();
/*  107 */     this.jLabel3 = new JLabel();
/*  108 */     this.jLabel1 = new JLabel();
/*  109 */     this.jPanel2 = new JPanel();
/*  110 */     this.panelTabVendas = new JPanel();
/*  111 */     this.jLabel20 = new JLabel();
/*  112 */     this.jLabel15 = new JLabel();
/*  113 */     this.jLabel21 = new JLabel();
/*  114 */     this.jLabel16 = new JLabel();
/*  115 */     this.jLabel22 = new JLabel();
/*  116 */     this.jLabel17 = new JLabel();
/*  117 */     this.panelTabprodutos = new JPanel();
/*  118 */     this.jLabel9 = new JLabel();
/*  119 */     this.jLabel8 = new JLabel();
/*  120 */     this.jLabel12 = new JLabel();
/*  121 */     this.jLabel10 = new JLabel();
/*  122 */     this.jLabel14 = new JLabel();
/*  123 */     this.jLabel11 = new JLabel();
/*  124 */     this.jLabel5 = new JLabel();
/*  125 */     this.jLabel13 = new JLabel();
/*  126 */     this.jLabel18 = new JLabel();
/*  127 */     this.jLabel19 = new JLabel();
/*  128 */     this.lbl_UserName = new JLabel();
/*  129 */     this.lbl_Logout = new JLabel();
/*  130 */     this.lbl_UserCod = new JLabel();
/*  131 */     this.jMenuBar1 = new JMenuBar();
/*  132 */     this.jMenu1 = new JMenu();
/*  133 */     this.jMenuItem3 = new JMenuItem();
/*  134 */     this.jMenuItem4 = new JMenuItem();
/*  135 */     this.jSeparator2 = new JPopupMenu.Separator();
/*  136 */     this.jMenuItem5 = new JMenuItem();
/*  137 */     this.jMenuItem6 = new JMenuItem();
/*  138 */     this.jSeparator3 = new JPopupMenu.Separator();
/*  139 */     this.jMenuItem7 = new JMenuItem();
/*  140 */     this.jMenu2 = new JMenu();
/*  141 */     this.jMenuItem1 = new JMenuItem();
/*  142 */     this.jMenuItem2 = new JMenuItem();
/*  143 */     this.jMenu5 = new JMenu();
/*  144 */     this.jMenuItem8 = new JMenuItem();
/*  145 */     this.jMenuItem10 = new JMenuItem();
/*  146 */     this.jMenuItem14 = new JMenuItem();
/*  147 */     this.jMenuItem15 = new JMenuItem();
/*  148 */     this.jMenu3 = new JMenu();
/*  149 */     this.jMenuItem9 = new JMenuItem();
/*  150 */     this.jMenuItem12 = new JMenuItem();
/*  151 */     this.jMenuItem13 = new JMenuItem();
/*  152 */     this.jMenu4 = new JMenu();
/*  153 */     this.jMenuItem11 = new JMenuItem();
/*      */     
/*  155 */     setDefaultCloseOperation(3);
/*  156 */     setTitle("Trick- Sistema de vendas");
/*  157 */     setResizable(false);
/*  158 */     addWindowListener(new WindowAdapter() {
/*      */           public void windowClosed(WindowEvent evt) {
/*  160 */             Trick.this.TrickLogout(evt);
/*      */           }
/*      */           public void windowClosing(WindowEvent evt) {
/*  163 */             Trick.this.windowClose(evt);
/*      */           }
/*      */         });
/*  166 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/*  168 */     this.jToolBar1.setRollover(true);
/*  169 */     this.jToolBar1.setOpaque(false);
/*      */     
/*  171 */     this.jButton3.setIcon(new ImageIcon(getClass().getResource("/images/database_add.png")));
/*  172 */     this.jButton3.setToolTipText("Novo Produto");
/*  173 */     this.jButton3.setFocusable(false);
/*  174 */     this.jButton3.setHorizontalTextPosition(0);
/*  175 */     this.jButton3.setVerticalTextPosition(3);
/*  176 */     this.jButton3.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  178 */             Trick.this.jButton3ActionPerformed(evt);
/*      */           }
/*      */         });
/*  181 */     this.jToolBar1.add(this.jButton3);
/*      */     
/*  183 */     this.jButton1.setIcon(new ImageIcon(getClass().getResource("/images/shopping_cart.png")));
/*  184 */     this.jButton1.setToolTipText("Nova Venda");
/*  185 */     this.jButton1.setFocusable(false);
/*  186 */     this.jButton1.setHorizontalTextPosition(0);
/*  187 */     this.jButton1.setVerticalTextPosition(3);
/*  188 */     this.jButton1.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  190 */             Trick.this.jButton1ActionPerformed(evt);
/*      */           }
/*      */         });
/*  193 */     this.jToolBar1.add(this.jButton1);
/*      */     
/*  195 */     this.jButton2.setIcon(new ImageIcon(getClass().getResource("/images/shopping_cart_up.png")));
/*  196 */     this.jButton2.setToolTipText("Adicionar Stock");
/*  197 */     this.jButton2.setFocusable(false);
/*  198 */     this.jButton2.setHorizontalTextPosition(0);
/*  199 */     this.jButton2.setVerticalTextPosition(3);
/*  200 */     this.jButton2.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  202 */             Trick.this.jButton2ActionPerformed(evt);
/*      */           }
/*      */         });
/*  205 */     this.jToolBar1.add(this.jButton2);
/*      */     
/*  207 */     this.jSeparator1.setBorder(BorderFactory.createCompoundBorder());
/*  208 */     this.jSeparator1.setPreferredSize(new Dimension(6, 4));
/*  209 */     this.jToolBar1.add(this.jSeparator1);
/*      */     
/*  211 */     this.jLabel7.setText("      ");
/*  212 */     this.jToolBar1.add(this.jLabel7);
/*      */     
/*  214 */     this.jButton4.setIcon(new ImageIcon(getClass().getResource("/images/users_process.png")));
/*  215 */     this.jButton4.setToolTipText("Previlegios");
/*  216 */     this.jButton4.setFocusable(false);
/*  217 */     this.jButton4.setHorizontalTextPosition(0);
/*  218 */     this.jButton4.setVerticalTextPosition(3);
/*  219 */     this.jButton4.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  221 */             Trick.this.jButton4ActionPerformed(evt);
/*      */           }
/*      */         });
/*  224 */     this.jToolBar1.add(this.jButton4);
/*      */     
/*  226 */     getContentPane().add(this.jToolBar1, new AbsoluteConstraints(0, 0, 1010, 40));
/*      */     
/*  228 */     this.panelPrincipal.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/*  230 */     this.jLabel4.setFont(new Font("Segoe UI", 1, 16));
/*  231 */     this.jLabel4.setText("Vendas");
/*  232 */     this.jLabel4.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  234 */             Trick.this.jLabel4MouseClicked(evt);
/*      */           }
/*      */           public void mouseEntered(MouseEvent evt) {
/*  237 */             Trick.this.jLabel4MouseEntered(evt);
/*      */           }
/*      */         });
/*  240 */     this.panelPrincipal.add(this.jLabel4, new AbsoluteConstraints(620, 100, -1, -1));
/*      */     
/*  242 */     this.lblTabPaneVendas.setIcon(new ImageIcon(getClass().getResource("/images/slice4.gif")));
/*  243 */     this.lblTabPaneVendas.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  245 */             Trick.this.lblTabPaneVendasMouseClicked(evt);
/*      */           }
/*      */           public void mouseEntered(MouseEvent evt) {
/*  248 */             Trick.this.lblTabPaneVendasMouseEntered(evt);
/*      */           }
/*      */           public void mouseExited(MouseEvent evt) {
/*  251 */             Trick.this.lblTabPaneVendasMouseExited(evt);
/*      */           }
/*      */         });
/*  254 */     this.panelPrincipal.add(this.lblTabPaneVendas, new AbsoluteConstraints(510, 90, 300, 40));
/*      */     
/*  256 */     this.jLabel2.setIcon(new ImageIcon(getClass().getResource("/images/Trick 1.gif")));
/*  257 */     this.panelPrincipal.add(this.jLabel2, new AbsoluteConstraints(470, 50, 420, 40));
/*      */     
/*  259 */     this.jLabel6.setFont(new Font("Segoe UI", 1, 16));
/*  260 */     this.jLabel6.setText("Produtos");
/*  261 */     this.jLabel6.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  263 */             Trick.this.jLabel6MouseClicked(evt);
/*      */           }
/*      */           public void mouseEntered(MouseEvent evt) {
/*  266 */             Trick.this.jLabel6MouseEntered(evt);
/*      */           }
/*      */         });
/*  269 */     this.panelPrincipal.add(this.jLabel6, new AbsoluteConstraints(310, 100, -1, -1));
/*      */     
/*  271 */     this.lblTabPaneProdutos.setIcon(new ImageIcon(getClass().getResource("/images/slice2.gif")));
/*  272 */     this.lblTabPaneProdutos.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  274 */             Trick.this.lblTabPaneProdutosMouseClicked(evt);
/*      */           }
/*      */           public void mouseEntered(MouseEvent evt) {
/*  277 */             Trick.this.lblTabPaneProdutosMouseEntered(evt);
/*      */           }
/*      */           public void mouseExited(MouseEvent evt) {
/*  280 */             Trick.this.lblTabPaneProdutosMouseExited(evt);
/*      */           }
/*      */         });
/*  283 */     this.panelPrincipal.add(this.lblTabPaneProdutos, new AbsoluteConstraints(210, 90, 300, 40));
/*      */     
/*  285 */     this.jLabel3.setIcon(new ImageIcon(getClass().getResource("/images/slice1.gif")));
/*  286 */     this.panelPrincipal.add(this.jLabel3, new AbsoluteConstraints(210, 90, 930, 40));
/*      */     
/*  288 */     this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/Untitled-3.png")));
/*  289 */     this.jLabel1.setText("jLabel1");
/*  290 */     this.jLabel1.setPreferredSize(new Dimension(1300, 94));
/*  291 */     this.panelPrincipal.add(this.jLabel1, new AbsoluteConstraints(0, 44, -1, 70));
/*      */     
/*  293 */     this.jPanel2.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/*  295 */     this.panelTabVendas.setOpaque(false);
/*  296 */     this.panelTabVendas.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/*  298 */     this.jLabel20.setFont(new Font("Segoe UI", 1, 14));
/*  299 */     this.jLabel20.setText("Nova Venda");
/*  300 */     this.jLabel20.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  302 */             Trick.this.jLabel20MouseClicked(evt);
/*      */           }
/*      */           public void mouseEntered(MouseEvent evt) {
/*  305 */             Trick.this.jLabel20MouseEntered(evt);
/*      */           }
/*      */         });
/*  308 */     this.panelTabVendas.add(this.jLabel20, new AbsoluteConstraints(80, 20, -1, -1));
/*      */     
/*  310 */     this.jLabel15.setIcon(new ImageIcon(getClass().getResource("/images/sliceLabel.gif")));
/*  311 */     this.jLabel15.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  313 */             Trick.this.jLabel15MouseClicked(evt);
/*      */           }
/*      */           public void mouseEntered(MouseEvent evt) {
/*  316 */             Trick.this.jLabel15MouseEntered(evt);
/*      */           }
/*      */           public void mouseExited(MouseEvent evt) {
/*  319 */             Trick.this.jLabel15MouseExited(evt);
/*      */           }
/*      */         });
/*  322 */     this.panelTabVendas.add(this.jLabel15, new AbsoluteConstraints(10, 10, -1, 40));
/*      */     
/*  324 */     this.jLabel21.setFont(new Font("Segoe UI", 1, 14));
/*  325 */     this.jLabel21.setText("Vendas Recentes");
/*  326 */     this.jLabel21.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  328 */             Trick.this.jLabel21MouseClicked(evt);
/*      */           }
/*      */           public void mouseEntered(MouseEvent evt) {
/*  331 */             Trick.this.jLabel21MouseEntered(evt);
/*      */           }
/*      */         });
/*  334 */     this.panelTabVendas.add(this.jLabel21, new AbsoluteConstraints(70, 80, -1, -1));
/*      */     
/*  336 */     this.jLabel16.setIcon(new ImageIcon(getClass().getResource("/images/sliceLabel.gif")));
/*  337 */     this.jLabel16.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  339 */             Trick.this.jLabel16MouseClicked(evt);
/*      */           }
/*      */           public void mouseEntered(MouseEvent evt) {
/*  342 */             Trick.this.jLabel16MouseEntered(evt);
/*      */           }
/*      */           public void mouseExited(MouseEvent evt) {
/*  345 */             Trick.this.jLabel16MouseExited(evt);
/*      */           }
/*      */         });
/*  348 */     this.panelTabVendas.add(this.jLabel16, new AbsoluteConstraints(10, 70, -1, 40));
/*      */     
/*  350 */     this.jLabel22.setFont(new Font("Tahoma", 1, 13));
/*  351 */     this.jLabel22.setText("Produtos Mais Vendidos");
/*  352 */     this.jLabel22.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  354 */             Trick.this.jLabel22MouseClicked(evt);
/*      */           }
/*      */           public void mouseEntered(MouseEvent evt) {
/*  357 */             Trick.this.jLabel22MouseEntered(evt);
/*      */           }
/*      */           public void mouseExited(MouseEvent evt) {
/*  360 */             Trick.this.jLabel22MouseExited(evt);
/*      */           }
/*      */         });
/*  363 */     this.panelTabVendas.add(this.jLabel22, new AbsoluteConstraints(50, 140, -1, -1));
/*      */     
/*  365 */     this.jLabel17.setIcon(new ImageIcon(getClass().getResource("/images/sliceLabel.gif")));
/*  366 */     this.jLabel17.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  368 */             Trick.this.jLabel17MouseClicked(evt);
/*      */           }
/*      */           public void mouseEntered(MouseEvent evt) {
/*  371 */             Trick.this.jLabel17MouseEntered(evt);
/*      */           }
/*      */           public void mouseExited(MouseEvent evt) {
/*  374 */             Trick.this.jLabel17MouseExited(evt);
/*      */           }
/*      */         });
/*  377 */     this.panelTabVendas.add(this.jLabel17, new AbsoluteConstraints(10, 130, -1, 40));
/*      */     
/*  379 */     this.jPanel2.add(this.panelTabVendas, new AbsoluteConstraints(440, 50, 260, 200));
/*      */     
/*  381 */     this.panelTabprodutos.setOpaque(false);
/*  382 */     this.panelTabprodutos.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/*  384 */     this.jLabel9.setFont(new Font("Segoe UI", 1, 13));
/*  385 */     this.jLabel9.setText("Novo Produto");
/*  386 */     this.jLabel9.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  388 */             Trick.this.jLabel9MouseClicked(evt);
/*      */           }
/*      */           public void mouseEntered(MouseEvent evt) {
/*  391 */             Trick.this.jLabel9MouseEntered(evt);
/*      */           }
/*      */         });
/*  394 */     this.panelTabprodutos.add(this.jLabel9, new AbsoluteConstraints(70, 20, -1, 20));
/*      */     
/*  396 */     this.jLabel8.setIcon(new ImageIcon(getClass().getResource("/images/sliceLabel.gif")));
/*  397 */     this.jLabel8.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  399 */             Trick.this.jLabel8MouseClicked(evt);
/*      */           }
/*      */           public void mouseEntered(MouseEvent evt) {
/*  402 */             Trick.this.jLabel8MouseEntered(evt);
/*      */           }
/*      */           public void mouseExited(MouseEvent evt) {
/*  405 */             Trick.this.jLabel8MouseExited(evt);
/*      */           }
/*      */         });
/*  408 */     this.panelTabprodutos.add(this.jLabel8, new AbsoluteConstraints(0, 10, -1, 40));
/*      */     
/*  410 */     this.jLabel12.setFont(new Font("Segoe UI", 1, 14));
/*  411 */     this.jLabel12.setText("Adicionar Stock");
/*  412 */     this.jLabel12.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  414 */             Trick.this.jLabel12MouseClicked(evt);
/*      */           }
/*      */           public void mouseEntered(MouseEvent evt) {
/*  417 */             Trick.this.jLabel12MouseEntered(evt);
/*      */           }
/*      */         });
/*  420 */     this.panelTabprodutos.add(this.jLabel12, new AbsoluteConstraints(60, 70, -1, -1));
/*      */     
/*  422 */     this.jLabel10.setIcon(new ImageIcon(getClass().getResource("/images/sliceLabel.gif")));
/*  423 */     this.jLabel10.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  425 */             Trick.this.jLabel10MouseClicked(evt);
/*      */           }
/*      */           public void mouseEntered(MouseEvent evt) {
/*  428 */             Trick.this.jLabel10MouseEntered(evt);
/*      */           }
/*      */           public void mouseExited(MouseEvent evt) {
/*  431 */             Trick.this.jLabel10MouseExited(evt);
/*      */           }
/*      */         });
/*  434 */     this.panelTabprodutos.add(this.jLabel10, new AbsoluteConstraints(0, 60, -1, 40));
/*      */     
/*  436 */     this.jLabel14.setFont(new Font("Segoe UI", 1, 14));
/*  437 */     this.jLabel14.setText("Lista de Produtos");
/*  438 */     this.jLabel14.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  440 */             Trick.this.jLabel14MouseClicked(evt);
/*      */           }
/*      */           public void mouseEntered(MouseEvent evt) {
/*  443 */             Trick.this.jLabel14MouseEntered(evt);
/*      */           }
/*      */         });
/*  446 */     this.panelTabprodutos.add(this.jLabel14, new AbsoluteConstraints(60, 120, -1, -1));
/*      */     
/*  448 */     this.jLabel11.setIcon(new ImageIcon(getClass().getResource("/images/sliceLabel.gif")));
/*  449 */     this.jLabel11.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  451 */             Trick.this.jLabel11MouseClicked(evt);
/*      */           }
/*      */           public void mouseEntered(MouseEvent evt) {
/*  454 */             Trick.this.jLabel11MouseEntered(evt);
/*      */           }
/*      */           public void mouseExited(MouseEvent evt) {
/*  457 */             Trick.this.jLabel11MouseExited(evt);
/*      */           }
/*      */         });
/*  460 */     this.panelTabprodutos.add(this.jLabel11, new AbsoluteConstraints(0, 110, -1, 40));
/*      */     
/*  462 */     this.jPanel2.add(this.panelTabprodutos, new AbsoluteConstraints(160, 50, 250, 210));
/*      */     
/*  464 */     this.jLabel5.setIcon(new ImageIcon(getClass().getResource("/images/slice3.gif")));
/*  465 */     this.jPanel2.add(this.jLabel5, new AbsoluteConstraints(120, 10, 900, 310));
/*      */     
/*  467 */     this.jLabel13.setText("jLabel13");
/*  468 */     this.jPanel2.add(this.jLabel13, new AbsoluteConstraints(800, 120, -1, -1));
/*      */     
/*  470 */     this.jLabel18.setText("jLabel18");
/*  471 */     this.jPanel2.add(this.jLabel18, new AbsoluteConstraints(770, 50, -1, -1));
/*      */     
/*  473 */     this.jLabel19.setText("jLabel19");
/*  474 */     this.jPanel2.add(this.jLabel19, new AbsoluteConstraints(760, 110, -1, -1));
/*      */     
/*  476 */     this.panelPrincipal.add(this.jPanel2, new AbsoluteConstraints(90, 120, 1090, 360));
/*      */     
/*  478 */     this.lbl_UserName.setFont(new Font("Segoe UI", 0, 13));
/*  479 */     this.panelPrincipal.add(this.lbl_UserName, new AbsoluteConstraints(1050, 10, 140, 20));
/*      */     
/*  481 */     this.lbl_Logout.setFont(new Font("Segoe UI", 0, 13));
/*  482 */     this.lbl_Logout.setForeground(new Color(27, 133, 250));
/*  483 */     this.lbl_Logout.setText("Sair");
/*  484 */     this.lbl_Logout.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  486 */             Trick.this.lbl_LogoutMouseClicked(evt);
/*      */           }
/*      */           public void mouseEntered(MouseEvent evt) {
/*  489 */             Trick.this.lbl_LogoutMouseEntered(evt);
/*      */           }
/*      */           public void mouseExited(MouseEvent evt) {
/*  492 */             Trick.this.lbl_LogoutMouseExited(evt);
/*      */           }
/*      */         });
/*  495 */     this.panelPrincipal.add(this.lbl_Logout, new AbsoluteConstraints(1190, 10, 70, 20));
/*  496 */     this.panelPrincipal.add(this.lbl_UserCod, new AbsoluteConstraints(1230, 10, -1, -1));
/*      */     
/*  498 */     getContentPane().add(this.panelPrincipal, new AbsoluteConstraints(0, 0, -1, -1));
/*      */     
/*  500 */     this.jMenuBar1.setFont(new Font("Segoe UI", 0, 19));
/*  501 */     this.jMenuBar1.setPreferredSize(new Dimension(243, 27));
/*      */     
/*  503 */     this.jMenu1.setText("Stock    ");
/*      */     
/*  505 */     this.jMenuItem3.setAccelerator(KeyStroke.getKeyStroke(80, 2));
/*  506 */     this.jMenuItem3.setText("Novo Produto");
/*  507 */     this.jMenuItem3.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  509 */             Trick.this.jMenuItem3ActionPerformed(evt);
/*      */           }
/*      */         });
/*  512 */     this.jMenu1.add(this.jMenuItem3);
/*      */     
/*  514 */     this.jMenuItem4.setAccelerator(KeyStroke.getKeyStroke(70, 2));
/*  515 */     this.jMenuItem4.setText("Procurar Produto");
/*  516 */     this.jMenuItem4.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  518 */             Trick.this.jMenuItem4ActionPerformed(evt);
/*      */           }
/*      */         });
/*  521 */     this.jMenu1.add(this.jMenuItem4);
/*  522 */     this.jMenu1.add(this.jSeparator2);
/*      */     
/*  524 */     this.jMenuItem5.setAccelerator(KeyStroke.getKeyStroke(83, 2));
/*  525 */     this.jMenuItem5.setText("Adicionar Stock");
/*  526 */     this.jMenuItem5.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  528 */             Trick.this.jMenuItem5ActionPerformed(evt);
/*      */           }
/*      */         });
/*  531 */     this.jMenu1.add(this.jMenuItem5);
/*      */     
/*  533 */     this.jMenuItem6.setText("Lista de Produtos");
/*  534 */     this.jMenuItem6.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  536 */             Trick.this.jMenuItem6ActionPerformed(evt);
/*      */           }
/*      */         });
/*  539 */     this.jMenu1.add(this.jMenuItem6);
/*  540 */     this.jMenu1.add(this.jSeparator3);
/*      */     
/*  542 */     this.jMenuItem7.setText("Sair");
/*  543 */     this.jMenuItem7.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  545 */             Trick.this.jMenuItem7ActionPerformed(evt);
/*      */           }
/*      */         });
/*  548 */     this.jMenu1.add(this.jMenuItem7);
/*      */     
/*  550 */     this.jMenuBar1.add(this.jMenu1);
/*      */     
/*  552 */     this.jMenu2.setText("Vendas     ");
/*      */     
/*  554 */     this.jMenuItem1.setText("Nova Venda");
/*  555 */     this.jMenuItem1.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  557 */             Trick.this.jMenuItem1ActionPerformed(evt);
/*      */           }
/*      */         });
/*  560 */     this.jMenu2.add(this.jMenuItem1);
/*      */     
/*  562 */     this.jMenuItem2.setText("Lista de Vendas");
/*  563 */     this.jMenuItem2.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  565 */             Trick.this.jMenuItem2ActionPerformed(evt);
/*      */           }
/*      */         });
/*  568 */     this.jMenu2.add(this.jMenuItem2);
/*      */     
/*  570 */     this.jMenuBar1.add(this.jMenu2);
/*      */     
/*  572 */     this.jMenu5.setText("Outros");
/*      */     
/*  574 */     this.jMenuItem8.setText("Unidades de Produtos");
/*  575 */     this.jMenuItem8.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  577 */             Trick.this.jMenuItem8ActionPerformed(evt);
/*      */           }
/*      */         });
/*  580 */     this.jMenu5.add(this.jMenuItem8);
/*      */     
/*  582 */     this.jMenuItem10.setText("Categorias de Produtos");
/*  583 */     this.jMenuItem10.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  585 */             Trick.this.jMenuItem10ActionPerformed(evt);
/*      */           }
/*      */         });
/*  588 */     this.jMenu5.add(this.jMenuItem10);
/*      */     
/*  590 */     this.jMenuItem14.setText("Usuarios");
/*  591 */     this.jMenuItem14.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  593 */             Trick.this.jMenuItem14ActionPerformed(evt);
/*      */           }
/*      */         });
/*  596 */     this.jMenu5.add(this.jMenuItem14);
/*      */     
/*  598 */     this.jMenuItem15.setText("Previlegios");
/*  599 */     this.jMenuItem15.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  601 */             Trick.this.jMenuItem15ActionPerformed(evt);
/*      */           }
/*      */         });
/*  604 */     this.jMenu5.add(this.jMenuItem15);
/*      */     
/*  606 */     this.jMenuBar1.add(this.jMenu5);
/*      */     
/*  608 */     this.jMenu3.setText("Relatorios     ");
/*  609 */     this.jMenu3.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  611 */             Trick.this.jMenu3ActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/*  615 */     this.jMenuItem9.setText("Vendas Recentes (Hoje)");
/*  616 */     this.jMenuItem9.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  618 */             Trick.this.jMenuItem9ActionPerformed(evt);
/*      */           }
/*      */         });
/*  621 */     this.jMenu3.add(this.jMenuItem9);
/*      */     
/*  623 */     this.jMenuItem12.setText("Vendas Por data");
/*  624 */     this.jMenuItem12.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  626 */             Trick.this.jMenuItem12ActionPerformed(evt);
/*      */           }
/*      */         });
/*  629 */     this.jMenu3.add(this.jMenuItem12);
/*      */     
/*  631 */     this.jMenuItem13.setText("Produtos Mais Vendidos");
/*  632 */     this.jMenuItem13.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  634 */             Trick.this.jMenuItem13ActionPerformed(evt);
/*      */           }
/*      */         });
/*  637 */     this.jMenu3.add(this.jMenuItem13);
/*      */     
/*  639 */     this.jMenuBar1.add(this.jMenu3);
/*      */     
/*  641 */     this.jMenu4.setText("Ajuda");
/*      */     
/*  643 */     this.jMenuItem11.setText("Sobre");
/*  644 */     this.jMenuItem11.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  646 */             Trick.this.jMenuItem11ActionPerformed(evt);
/*      */           }
/*      */         });
/*  649 */     this.jMenu4.add(this.jMenuItem11);
/*      */     
/*  651 */     this.jMenuBar1.add(this.jMenu4);
/*      */     
/*  653 */     setJMenuBar(this.jMenuBar1);
/*      */     
/*  655 */     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
/*  656 */     setBounds((screenSize.width - 1280) / 2, (screenSize.height - 770) / 2, 1280, 770);
/*      */   }
/*      */   
/*      */   private void HabilitarTabVendas() {
/*  660 */     this.lblTabPaneVendas.setIcon(new ImageIcon(getClass().getResource("/images/slicemeio.gif")));
/*  661 */     this.lblTabPaneProdutos.setIcon((Icon)null);
/*  662 */     this.panelTabVendas.setVisible(true);
/*  663 */     this.jLabel4.setVisible(true);
/*  664 */     this.jLabel4.setFont(new Font("Segoe UI", 1, 16));
/*  665 */     this.jLabel4.setForeground(Color.BLACK);
/*      */     
/*  667 */     this.panelTabprodutos.setVisible(false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void HabilitarTabProdutos() {
/*  677 */     this.lblTabPaneProdutos.setIcon(new ImageIcon(getClass().getResource("/images/slice2.gif")));
/*  678 */     this.panelTabprodutos.setVisible(true);
/*  679 */     this.lblTabPaneVendas.setIcon((Icon)null);
/*  680 */     this.jLabel4.setForeground(Color.white);
/*  681 */     this.panelTabVendas.setVisible(false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void jLabel8MouseEntered(MouseEvent evt) {
/*  688 */     this.jLabel8.setCursor(new Cursor(12));
/*  689 */     this.jLabel8.setIcon(new ImageIcon(getClass().getResource("/images/sliceHover.gif")));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void jLabel8MouseExited(MouseEvent evt) {
/*  695 */     this.jLabel8.setIcon(new ImageIcon(getClass().getResource("/images/sliceLabel.gif")));
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel10MouseEntered(MouseEvent evt) {
/*  700 */     this.jLabel10.setCursor(new Cursor(12));
/*  701 */     this.jLabel10.setIcon(new ImageIcon(getClass().getResource("/images/sliceHover.gif")));
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel10MouseExited(MouseEvent evt) {
/*  706 */     this.jLabel10.setIcon(new ImageIcon(getClass().getResource("/images/sliceLabel.gif")));
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel11MouseEntered(MouseEvent evt) {
/*  711 */     this.jLabel11.setCursor(new Cursor(12));
/*  712 */     this.jLabel11.setIcon(new ImageIcon(getClass().getResource("/images/sliceHover.gif")));
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel11MouseExited(MouseEvent evt) {
/*  717 */     this.jLabel11.setIcon(new ImageIcon(getClass().getResource("/images/sliceLabel.gif")));
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel15MouseEntered(MouseEvent evt) {
/*  722 */     this.jLabel15.setCursor(new Cursor(12));
/*  723 */     this.jLabel15.setIcon(new ImageIcon(getClass().getResource("/images/sliceHover.gif")));
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel15MouseExited(MouseEvent evt) {
/*  728 */     this.jLabel15.setIcon(new ImageIcon(getClass().getResource("/images/sliceLabel.gif")));
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel16MouseEntered(MouseEvent evt) {
/*  733 */     this.jLabel16.setCursor(new Cursor(12));
/*  734 */     this.jLabel16.setIcon(new ImageIcon(getClass().getResource("/images/sliceHover.gif")));
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel16MouseExited(MouseEvent evt) {
/*  739 */     this.jLabel16.setIcon(new ImageIcon(getClass().getResource("/images/sliceLabel.gif")));
/*      */   }
/*      */ 
/*      */   
/*      */   private void lblTabPaneVendasMouseEntered(MouseEvent evt) {
/*  744 */     this.lblTabPaneVendas.setCursor(new Cursor(12));
/*  745 */     this.jLabel4.setForeground(Color.getHSBColor(120.0F, 87.0F, 225.0F));
/*      */   }
/*      */ 
/*      */   
/*      */   private void lblTabPaneVendasMouseExited(MouseEvent evt) {
/*  750 */     this.jLabel4.setForeground(Color.BLACK);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel4MouseEntered(MouseEvent evt) {
/*  755 */     this.jLabel4.setCursor(new Cursor(12));
/*  756 */     this.jLabel4.setForeground(Color.getHSBColor(120.0F, 87.0F, 225.0F));
/*      */   }
/*      */ 
/*      */   
/*      */   private void lblTabPaneVendasMouseClicked(MouseEvent evt) {
/*  761 */     HabilitarTabVendas();
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel4MouseClicked(MouseEvent evt) {
/*  766 */     HabilitarTabVendas();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void lblTabPaneProdutosMouseClicked(MouseEvent evt) {
/*  772 */     HabilitarTabProdutos();
/*      */   }
/*      */ 
/*      */   
/*      */   private void lblTabPaneProdutosMouseEntered(MouseEvent evt) {
/*  777 */     this.lblTabPaneProdutos.setCursor(new Cursor(12));
/*  778 */     this.jLabel6.setForeground(Color.getHSBColor(120.0F, 87.0F, 225.0F));
/*      */   }
/*      */ 
/*      */   
/*      */   private void lblTabPaneProdutosMouseExited(MouseEvent evt) {
/*  783 */     this.jLabel6.setForeground(Color.BLACK);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel6MouseClicked(MouseEvent evt) {
/*  788 */     HabilitarTabProdutos();
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel6MouseEntered(MouseEvent evt) {
/*  793 */     this.jLabel6.setCursor(new Cursor(12));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void jLabel11MouseClicked(MouseEvent evt) {
/*  800 */     Produtos pr = new Produtos();
/*  801 */     pr.setVisible(true);
/*      */   }
/*      */ 
/*      */   
/*      */   private void lbl_LogoutMouseEntered(MouseEvent evt) {
/*  806 */     this.lbl_Logout.setCursor(new Cursor(12));
/*  807 */     this.lbl_Logout.setForeground(Color.red);
/*      */   }
/*      */ 
/*      */   
/*      */   private void lbl_LogoutMouseExited(MouseEvent evt) {
/*  812 */     this.lbl_Logout.setForeground(new Color(27, 133, 250));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void lbl_LogoutMouseClicked(MouseEvent evt) {
/*  818 */     dispose();
/*  819 */     LoginPage loginPage = new LoginPage();
/*  820 */     loginPage.setVisible(true);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel10MouseClicked(MouseEvent evt) {
/*  825 */     AddStock ad = new AddStock();
/*  826 */     ad.setVisible(true);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jMenuItem6ActionPerformed(ActionEvent evt) {
/*  831 */     Produtos produto = new Produtos();
/*  832 */     produto.setVisible(true);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jMenuItem5ActionPerformed(ActionEvent evt) {
/*  837 */     AddStock newStock = new AddStock();
/*  838 */     newStock.setVisible(true);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jMenuItem3ActionPerformed(ActionEvent evt) {
/*  843 */     CadProduto cadp = new CadProduto();
/*  844 */     cadp.setVisible(true);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void jMenuItem7ActionPerformed(ActionEvent evt) {
/*      */     try {
/*  851 */       UsuarioServicos us = new UsuarioServicos();
/*  852 */       us.Logout();
/*  853 */       System.exit(0);
/*      */     }
/*      */     catch (Exception e) {
/*      */       
/*  857 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void jMenuItem1ActionPerformed(ActionEvent evt) {
/*  865 */     Venda venda = new Venda();
/*  866 */     venda.FuncionarioInformation(this.lbl_UserName.getText(), this.lbl_UserCod.getText());
/*  867 */     venda.setVisible(true);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void jLabel9MouseEntered(MouseEvent evt) {
/*  873 */     this.jLabel9.setCursor(new Cursor(12));
/*  874 */     this.jLabel8.setIcon(new ImageIcon(getClass().getResource("/images/sliceHover.gif")));
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel12MouseEntered(MouseEvent evt) {
/*  879 */     this.jLabel12.setCursor(new Cursor(12));
/*  880 */     this.jLabel10.setIcon(new ImageIcon(getClass().getResource("/images/sliceHover.gif")));
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel12MouseClicked(MouseEvent evt) {
/*  885 */     AddStock ad = new AddStock();
/*  886 */     ad.setVisible(true);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel14MouseEntered(MouseEvent evt) {
/*  891 */     this.jLabel14.setCursor(new Cursor(12));
/*  892 */     this.jLabel11.setIcon(new ImageIcon(getClass().getResource("/images/sliceHover.gif")));
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel14MouseClicked(MouseEvent evt) {
/*  897 */     Produtos pr = new Produtos();
/*  898 */     pr.setVisible(true);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel20MouseEntered(MouseEvent evt) {
/*  903 */     this.jLabel20.setCursor(new Cursor(12));
/*  904 */     this.jLabel15.setIcon(new ImageIcon(getClass().getResource("/images/sliceHover.gif")));
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel21MouseEntered(MouseEvent evt) {
/*  909 */     this.jLabel21.setCursor(new Cursor(12));
/*  910 */     this.jLabel16.setIcon(new ImageIcon(getClass().getResource("/images/sliceHover.gif")));
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton1ActionPerformed(ActionEvent evt) {
/*  915 */     Venda venda = new Venda();
/*  916 */     venda.FuncionarioInformation(this.lbl_UserName.getText(), this.lbl_UserCod.getText());
/*  917 */     venda.setVisible(true);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void jButton2ActionPerformed(ActionEvent evt) {
/*  923 */     AddStock ad = new AddStock();
/*  924 */     ad.setVisible(true);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton3ActionPerformed(ActionEvent evt) {
/*  929 */     CadProduto cadp = new CadProduto();
/*  930 */     cadp.setVisible(true);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jMenuItem11ActionPerformed(ActionEvent evt) {
/*  935 */     About sobre = new About();
/*  936 */     sobre.setVisible(true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void windowClose(WindowEvent evt) {
/*      */     try {
/*  944 */       UsuarioServicos us = new UsuarioServicos();
/*  945 */       us.Logout();
/*  946 */       System.exit(0);
/*      */     } catch (Exception e) {
/*  948 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void jLabel15MouseClicked(MouseEvent evt) {
/*  955 */     Venda venda = new Venda();
/*  956 */     venda.FuncionarioInformation(this.lbl_UserName.getText(), this.lbl_UserCod.getText());
/*  957 */     venda.setVisible(true);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void jLabel20MouseClicked(MouseEvent evt) {
/*  963 */     Venda venda = new Venda();
/*  964 */     venda.FuncionarioInformation(this.lbl_UserName.getText(), this.lbl_UserCod.getText());
/*  965 */     venda.setVisible(true);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void jLabel8MouseClicked(MouseEvent evt) {
/*  971 */     CadProduto cadp = new CadProduto();
/*  972 */     cadp.setVisible(true);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel9MouseClicked(MouseEvent evt) {
/*  977 */     CadProduto cadp = new CadProduto();
/*  978 */     cadp.setVisible(true);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jMenuItem4ActionPerformed(ActionEvent evt) {
/*  983 */     Produtos pr = new Produtos();
/*  984 */     pr.setVisible(true);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jMenuItem8ActionPerformed(ActionEvent evt) {
/*  989 */     CadUnidades cu = new CadUnidades();
/*  990 */     cu.setVisible(true);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jMenuItem10ActionPerformed(ActionEvent evt) {
/*  995 */     CadCategoria cc = new CadCategoria();
/*  996 */     cc.setVisible(true);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel16MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1002 */       Relatorios trickRelatorios = new Relatorios();
/* 1003 */       trickRelatorios.abrirRelatorioVendasHoje();
/*      */     }
/* 1005 */     catch (Exception e) {}
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void jLabel21MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1014 */       Relatorios trickRelatorios = new Relatorios();
/* 1015 */       trickRelatorios.abrirRelatorioVendasHoje();
/*      */     }
/* 1017 */     catch (Exception e) {}
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void jMenuItem2ActionPerformed(ActionEvent evt) {
/* 1026 */     Relatorios trickRelatorios = new Relatorios();
/* 1027 */     trickRelatorios.abrirRelatorioVendasHoje();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void jMenuItem13ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 1035 */       Relatorios trickRelatorios = new Relatorios();
/* 1036 */       trickRelatorios.abrirRelatorioProdutosMaisVendidos();
/*      */     }
/* 1038 */     catch (Exception e) {
/* 1039 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void jMenuItem12ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 1046 */       DataVenda d = new DataVenda();
/* 1047 */       d.setVisible(true);
/*      */     }
/* 1049 */     catch (Exception e) {}
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void jMenuItem9ActionPerformed(ActionEvent evt) {
/* 1057 */     Relatorios trickRelatorios = new Relatorios();
/* 1058 */     trickRelatorios.abrirRelatorioVendasHoje();
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel17MouseEntered(MouseEvent evt) {
/* 1063 */     this.jLabel17.setCursor(new Cursor(12));
/* 1064 */     this.jLabel17.setIcon(new ImageIcon(getClass().getResource("/images/sliceHover.gif")));
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel22MouseEntered(MouseEvent evt) {
/* 1069 */     this.jLabel22.setCursor(new Cursor(12));
/* 1070 */     this.jLabel17.setIcon(new ImageIcon(getClass().getResource("/images/sliceHover.gif")));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void jLabel17MouseExited(MouseEvent evt) {
/* 1076 */     this.jLabel17.setIcon(new ImageIcon(getClass().getResource("/images/sliceLabel.gif")));
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel22MouseExited(MouseEvent evt) {
/* 1081 */     this.jLabel17.setIcon(new ImageIcon(getClass().getResource("/images/sliceLabel.gif")));
/*      */   }
/*      */ 
/*      */   
/*      */   private void jLabel17MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1087 */       Relatorios trickRelatorios = new Relatorios();
/* 1088 */       trickRelatorios.abrirRelatorioProdutosMaisVendidos();
/*      */     }
/* 1090 */     catch (Exception e) {}
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void jLabel22MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1097 */       Relatorios trickRelatorios = new Relatorios();
/* 1098 */       trickRelatorios.abrirRelatorioProdutosMaisVendidos();
/*      */     }
/* 1100 */     catch (Exception e) {}
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void jMenuItem14ActionPerformed(ActionEvent evt) {
/* 1109 */     CadUsuarios s = new CadUsuarios();
/* 1110 */     s.setVisible(true);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jMenuItem15ActionPerformed(ActionEvent evt) {
/* 1115 */     Previlegios previlegios = new Previlegios();
/* 1116 */     previlegios.setVisible(true);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton4ActionPerformed(ActionEvent evt) {
/* 1121 */     Previlegios previlegios = new Previlegios();
/* 1122 */     previlegios.setVisible(true);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void TrickLogout(WindowEvent evt) {
/*      */     try {
/* 1129 */       UsuarioServicos us = new UsuarioServicos();
/* 1130 */       us.Logout();
/* 1131 */       System.exit(0);
/*      */     } catch (Exception e) {
/* 1133 */       JOptionPane.showMessageDialog(this.rootPane, e.getMessage(), "", 3, null);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void jMenu3ActionPerformed(ActionEvent evt) {
/*      */     try {
/* 1140 */       Relatorios trickRelatorios = new Relatorios();
/* 1141 */       trickRelatorios.abrirRelatorioProdutosMaisVendidos();
/*      */     }
/* 1143 */     catch (Exception e) {}
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void main(String[] args) {
/* 1151 */     EventQueue.invokeLater(new Runnable()
/*      */         {
/*      */           public void run() {
/* 1154 */             (new Trick()).setVisible(true);
/*      */           }
/*      */         });
/*      */   }
/*      */ }


/* Location:              C:\Program Files (x86)\Sistema de vendas\SysVendas.jar!\Presentation\Trick.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */