/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

//import backend.CRUD;
//import backend.DB;
import backend.Db;
import backend.Producto_Crud;
import com.mongodb.client.MongoDatabase;
import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author dell
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    private JButton botonSeleccionado;
    private Db db;
    private Producto_Crud crud;
    private MongoDatabase database;
    //CONFIG COLOR //[0,144,231] //[25,28,36] //[50,54,62]
    private Color defaultColorTextBoton = new Color(233, 236, 239);
    private Color defaultColorBoton = new Color(25, 28, 36);
    private Color colorSeleccion = new Color(47,67,79);
    private Color colorTextSeleccion = new Color(255, 255, 255);
    
    public Index() {
        db = new Db();            
        if (db.establecerConexion()) {
             database = db.getDatabase();
             crud  = new Producto_Crud(database);
             TiendaPanel tienda = new  TiendaPanel(crud);
             initComponents();
             resetBackgroundColors();
             botonSeleccionado = jButtonListar;
             botonSeleccionado.setBackground(colorSeleccion);
             botonSeleccionado.setForeground(colorTextSeleccion);
             tienda.setSize(content.getWidth(),content.getHeight()); 
             System.out.println(content.getHeight()+"||"+content.getWidth());
             tienda.setLocation(0, 0);
             content.removeAll();
             content.add(tienda);
             content.revalidate();
             content.repaint();
            System.out.println("Conexión a la base de datos establecida");
        } else {
            System.err.println("Error al establecer la conexión a la base de datos");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        navbar_Header = new javax.swing.JPanel();
        navbar_Title = new javax.swing.JLabel();
        navbar_Icon = new javax.swing.JPanel();
        navLink = new javax.swing.JPanel();
        color = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonCrear = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jButtonGrafica = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonVaciar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(244, 246, 249));

        navbar.setBackground(new java.awt.Color(25, 28, 36));
        navbar.setMaximumSize(new java.awt.Dimension(233, 565));
        navbar.setPreferredSize(new java.awt.Dimension(230, 100));

        navbar_Header.setBackground(new java.awt.Color(0, 144, 231));
        navbar_Header.setPreferredSize(new java.awt.Dimension(230, 70));

        navbar_Title.setBackground(new java.awt.Color(255, 255, 255));
        navbar_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        navbar_Title.setForeground(new java.awt.Color(255, 255, 255));
        navbar_Title.setText("POO");

        javax.swing.GroupLayout navbar_IconLayout = new javax.swing.GroupLayout(navbar_Icon);
        navbar_Icon.setLayout(navbar_IconLayout);
        navbar_IconLayout.setHorizontalGroup(
            navbar_IconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        navbar_IconLayout.setVerticalGroup(
            navbar_IconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout navbar_HeaderLayout = new javax.swing.GroupLayout(navbar_Header);
        navbar_Header.setLayout(navbar_HeaderLayout);
        navbar_HeaderLayout.setHorizontalGroup(
            navbar_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbar_HeaderLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(navbar_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(navbar_Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navbar_HeaderLayout.setVerticalGroup(
            navbar_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbar_HeaderLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(navbar_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(navbar_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navbar_Title))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        navLink.setBackground(new java.awt.Color(15, 16, 21));
        navLink.setPreferredSize(new java.awt.Dimension(224, 46));
        navLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navLinkMouseClicked(evt);
            }
        });

        color.setBackground(new java.awt.Color(0, 144, 231));
        color.setPreferredSize(new java.awt.Dimension(3, 46));

        javax.swing.GroupLayout colorLayout = new javax.swing.GroupLayout(color);
        color.setLayout(colorLayout);
        colorLayout.setHorizontalGroup(
            colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        colorLayout.setVerticalGroup(
            colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dashboard");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navLinkLayout = new javax.swing.GroupLayout(navLink);
        navLink.setLayout(navLinkLayout);
        navLinkLayout.setHorizontalGroup(
            navLinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLinkLayout.createSequentialGroup()
                .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        navLinkLayout.setVerticalGroup(
            navLinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navLinkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(color, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 114, 147));
        jLabel2.setText("Navegación");

        jButtonCrear.setBackground(new java.awt.Color(25, 28, 36));
        jButtonCrear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonCrear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCrear.setText("Crear ");
        jButtonCrear.setBorder(null);
        jButtonCrear.setBorderPainted(false);
        jButtonCrear.setFocusable(false);
        jButtonCrear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonCrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCrear.setPreferredSize(new java.awt.Dimension(33, 20));
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });

        jButtonListar.setBackground(new java.awt.Color(25, 28, 36));
        jButtonListar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonListar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListar.setText("Listar");
        jButtonListar.setBorder(null);
        jButtonListar.setBorderPainted(false);
        jButtonListar.setFocusable(false);
        jButtonListar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonListar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jButtonGrafica.setBackground(new java.awt.Color(25, 28, 36));
        jButtonGrafica.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonGrafica.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGrafica.setText("Grafica");
        jButtonGrafica.setBorder(null);
        jButtonGrafica.setBorderPainted(false);
        jButtonGrafica.setFocusable(false);
        jButtonGrafica.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonGrafica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGrafica.setPreferredSize(new java.awt.Dimension(33, 20));
        jButtonGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGraficaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 144, 231));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jButtonVaciar.setBackground(new java.awt.Color(25, 28, 36));
        jButtonVaciar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonVaciar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVaciar.setText("Vaciar");
        jButtonVaciar.setBorder(null);
        jButtonVaciar.setBorderPainted(false);
        jButtonVaciar.setFocusable(false);
        jButtonVaciar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonVaciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVaciar.setPreferredSize(new java.awt.Dimension(33, 20));
        jButtonVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVaciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navbar_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navLink, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addGroup(navbarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jButtonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addComponent(navbar_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navLink, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(navbarLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButtonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jButtonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButtonGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButtonVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 144, 231));
        jPanel1.setPreferredSize(new java.awt.Dimension(614, 70));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        resetBackgroundColors();
        botonSeleccionado = jButtonCrear;
        botonSeleccionado.setBackground(colorSeleccion);
        botonSeleccionado.setForeground(colorTextSeleccion);
        CrearProductoJPanel page  = new CrearProductoJPanel(crud);
        page.setSize(content.getWidth(),content.getHeight());
        content.setLocation(0, 0);
        content.removeAll();
        content.add(page);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        resetBackgroundColors();
        botonSeleccionado = jButtonListar;
        botonSeleccionado.setBackground(colorSeleccion);
        botonSeleccionado.setForeground(colorTextSeleccion);
        //ListaJPanel lista  = new ListaJPanel(crud);
        //lista.setSize(content.getWidth(),content.getHeight());
        content.setLocation(0, 0);
        content.removeAll();
        //content.add(lista);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGraficaActionPerformed
        resetBackgroundColors();
        botonSeleccionado = jButtonGrafica;
        botonSeleccionado.setBackground(colorSeleccion);
        botonSeleccionado.setForeground(colorTextSeleccion);
        //GraficaJPanel view  = new GraficaJPanel(crud);
        //view.setSize(content.getWidth(),content.getHeight());
        content.setLocation(0, 0);
        content.removeAll();
        //content.add(view);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jButtonGraficaActionPerformed

    private void jButtonVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVaciarActionPerformed
        resetBackgroundColors();
        botonSeleccionado = jButtonVaciar;
        botonSeleccionado.setBackground(colorSeleccion);
        botonSeleccionado.setForeground(colorTextSeleccion);
        //VaciarJPanel vaciar  = new VaciarJPanel(crud);
        //vaciar.setSize(content.getWidth(),content.getHeight());
        content.setLocation(0, 0);
        content.removeAll();
        //content.add(vaciar);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jButtonVaciarActionPerformed

    private void navLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navLinkMouseClicked

    }//GEN-LAST:event_navLinkMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        //IndexJPanel menu = new  IndexJPanel(crud);
        //menu.setSize(content.getWidth(),content.getHeight()); 
        //menu.setLocation(0, 0);
        content.removeAll();
        //content.add(menu);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jLabel1MouseClicked
    private void resetBackgroundColors() {
        //BG BOTON
        jButtonCrear.setBackground(defaultColorBoton);
        jButtonListar.setBackground(defaultColorBoton);
        jButtonGrafica.setBackground(defaultColorBoton);
        jButtonVaciar.setBackground(defaultColorBoton);
        // BG TEXT
        jButtonCrear.setForeground(defaultColorTextBoton);
        jButtonListar.setForeground(defaultColorTextBoton);
        jButtonGrafica.setForeground(defaultColorTextBoton);
        jButtonVaciar.setForeground(defaultColorTextBoton);
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel color;
    private javax.swing.JPanel content;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonGrafica;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonVaciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel navLink;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel navbar_Header;
    private javax.swing.JPanel navbar_Icon;
    private javax.swing.JLabel navbar_Title;
    // End of variables declaration//GEN-END:variables
}
