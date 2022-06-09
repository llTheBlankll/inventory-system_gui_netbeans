package com.inventory.inventory_system;

import com.formdev.flatlaf.FlatLightLaf;
import com.mysql.cj.protocol.a.NativeConstants;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nytri
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPasswordField1 = new javax.swing.JPasswordField();
        MainPanel_Home = new javax.swing.JPanel();
        Home_productsListed = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Home_productsListed1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Home_Search = new javax.swing.JPanel();
        Search_lbl = new javax.swing.JLabel();
        Search_TextField = new javax.swing.JTextField();
        SortSearchBy_Combobox = new javax.swing.JComboBox<>();
        TableScrollPane = new javax.swing.JScrollPane();
        ProductList_Table = new javax.swing.JTable();
        Home_productsListed2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Settings_menu = new javax.swing.JMenu();
        Exit_settings_menuItem = new javax.swing.JMenuItem();
        Inventory_menu = new javax.swing.JMenu();
        addProduct_Inventory_menuItem = new javax.swing.JMenuItem();
        UpdateProduct_Inventory_menuItem = new javax.swing.JMenuItem();
        Statistics_Inventory_menuItem = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Quicksand", 0, 12)); // NOI18N
        setName("HomeJFrame"); // NOI18N
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        MainPanel_Home.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel_Home.setPreferredSize(new java.awt.Dimension(500, 350));

        Home_productsListed.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("0");

        javax.swing.GroupLayout Home_productsListedLayout = new javax.swing.GroupLayout(Home_productsListed);
        Home_productsListed.setLayout(Home_productsListedLayout);
        Home_productsListedLayout.setHorizontalGroup(
            Home_productsListedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_productsListedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Home_productsListedLayout.setVerticalGroup(
            Home_productsListedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_productsListedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jLabel1.setText("Inventory Products Listed");

        Home_productsListed1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("0");

        javax.swing.GroupLayout Home_productsListed1Layout = new javax.swing.GroupLayout(Home_productsListed1);
        Home_productsListed1.setLayout(Home_productsListed1Layout);
        Home_productsListed1Layout.setHorizontalGroup(
            Home_productsListed1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_productsListed1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );
        Home_productsListed1Layout.setVerticalGroup(
            Home_productsListed1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_productsListed1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Inventory Products Listed");

        Search_lbl.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        Search_lbl.setText("Search:");

        Search_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search_TextFieldKeyReleased(evt);
            }
        });

        SortSearchBy_Combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Barcode" }));

        ProductList_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Code", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableScrollPane.setViewportView(ProductList_Table);

        javax.swing.GroupLayout Home_SearchLayout = new javax.swing.GroupLayout(Home_Search);
        Home_Search.setLayout(Home_SearchLayout);
        Home_SearchLayout.setHorizontalGroup(
            Home_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_SearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Home_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(Search_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Home_SearchLayout.createSequentialGroup()
                        .addComponent(Search_TextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SortSearchBy_Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Home_SearchLayout.setVerticalGroup(
            Home_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_SearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Search_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Home_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SortSearchBy_Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        Home_productsListed2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("0");

        javax.swing.GroupLayout Home_productsListed2Layout = new javax.swing.GroupLayout(Home_productsListed2);
        Home_productsListed2.setLayout(Home_productsListed2Layout);
        Home_productsListed2Layout.setHorizontalGroup(
            Home_productsListed2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_productsListed2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        Home_productsListed2Layout.setVerticalGroup(
            Home_productsListed2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_productsListed2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Roboto Slab", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Inventory Products Listed");

        javax.swing.GroupLayout MainPanel_HomeLayout = new javax.swing.GroupLayout(MainPanel_Home);
        MainPanel_Home.setLayout(MainPanel_HomeLayout);
        MainPanel_HomeLayout.setHorizontalGroup(
            MainPanel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel_HomeLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(MainPanel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(Home_productsListed2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(Home_productsListed1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Home_productsListed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addComponent(Home_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        MainPanel_HomeLayout.setVerticalGroup(
            MainPanel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel_HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanel_HomeLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(Home_productsListed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(Home_productsListed1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)
                        .addComponent(Home_productsListed2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Settings_menu.setText("Settings");

        Exit_settings_menuItem.setText("Exit");
        Exit_settings_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_settings_menuItemActionPerformed(evt);
            }
        });
        Settings_menu.add(Exit_settings_menuItem);

        jMenuBar1.add(Settings_menu);

        Inventory_menu.setText("Inventory");

        addProduct_Inventory_menuItem.setText("Add Product");
        addProduct_Inventory_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProduct_Inventory_menuItemActionPerformed(evt);
            }
        });
        Inventory_menu.add(addProduct_Inventory_menuItem);

        UpdateProduct_Inventory_menuItem.setText("Update Product");
        UpdateProduct_Inventory_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateProduct_Inventory_menuItemActionPerformed(evt);
            }
        });
        Inventory_menu.add(UpdateProduct_Inventory_menuItem);

        Statistics_Inventory_menuItem.setText("Statistics");
        Statistics_Inventory_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Statistics_Inventory_menuItemActionPerformed(evt);
            }
        });
        Inventory_menu.add(Statistics_Inventory_menuItem);

        jMenuBar1.add(Inventory_menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel_Home, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addProduct_Inventory_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProduct_Inventory_menuItemActionPerformed
        addProduct ap = new addProduct();
        ap.setVisible(true);
    }//GEN-LAST:event_addProduct_Inventory_menuItemActionPerformed

    private void Exit_settings_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_settings_menuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Exit_settings_menuItemActionPerformed

    private void UpdateProduct_Inventory_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateProduct_Inventory_menuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateProduct_Inventory_menuItemActionPerformed

    private void Statistics_Inventory_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Statistics_Inventory_menuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Statistics_Inventory_menuItemActionPerformed

    private void Search_TextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_TextFieldKeyReleased
        try {
            Functions.clearRowsInTable((DefaultTableModel) this.ProductList_Table.getModel());

            try (Connection con = Connect.getMySQLConnection()) {
                PreparedStatement stmt;
                if (SortSearchBy_Combobox.getItemAt(SortSearchBy_Combobox.getSelectedIndex()).equals("Name")) {
                    stmt = con.prepareStatement("SELECT * FROM products WHERE product_name LIKE ?");
                    stmt.setString(1, "%" + Search_TextField.getText() + "%");
                    ResultSet rs = stmt.executeQuery();

                    while (rs.next()) {
                        // Preassign variables
                        String product_name;
                        int product_code, product_quantity, product_price;

                        // Assign variables
                        product_name = rs.getString("product_name");
                        product_code = rs.getInt("product_code");
                        product_quantity = rs.getInt("product_quantity");
                        product_price = rs.getInt("product_price");

                        // Convert the results to readable row.
                        String[] toRow = {product_name, String.valueOf(product_code), String.valueOf(product_quantity), String.valueOf(product_price)};

                        // Get table model
                        DefaultTableModel table = (DefaultTableModel) this.ProductList_Table.getModel();
                        table.addRow(toRow);
                    }
                } else {
                    stmt = con.prepareStatement("SELECT * FROM products WHERE product_code LIKE ?");
                    stmt.setString(1, "%" + Search_TextField.getText() + "%");

                    ResultSet rs = stmt.executeQuery();

                    while (rs.next()) {
                        // Preassign variables
                        String product_name;
                        int product_code, product_quantity, product_price;

                        // Assign variables
                        product_name = rs.getString("product_name");
                        product_code = rs.getInt("product_code");
                        product_quantity = rs.getInt("product_quantity");
                        product_price = rs.getInt("product_price");

                        // Convert the results to readable row.
                        String[] toRow = {product_name, String.valueOf(product_code), String.valueOf(product_quantity), String.valueOf(product_price)};

                        // Get table model
                        DefaultTableModel table = (DefaultTableModel) this.ProductList_Table.getModel();
                        table.addRow(toRow);
                    }
                }
            } catch (Exception e) {
                // Do not print error.
            }

        } catch (SQLException sql) {
            Functions.showMessageDialog(sql.getMessage(), "error");
        }
    }//GEN-LAST:event_Search_TextFieldKeyReleased

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        Functions.clearRowsInTable((DefaultTableModel) ProductList_Table.getModel());
        // Set ProductList_Table Rows
        try (Connection con = Connect.getMySQLConnection()) {
            assert con != null;
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM products");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String product_name, product_code, product_quantity, product_price;
                product_name = rs.getString("product_name");
                product_code = rs.getString("product_code");
                product_quantity = rs.getString("product_quantity");
                product_price = rs.getString("product_quantity");

                String[] result = { product_name, product_code, product_quantity, product_price };

                Functions.insertRowToTable((DefaultTableModel) this.ProductList_Table.getModel(), result);
            }

            //Close result set because operation is not allowed until ResultSet is not closed.
            rs.close();
        } catch (SQLException | NullPointerException e) {
            Functions.showMessageDialog(e.getMessage(), "error");
        }
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatLightLaf());
            } catch (UnsupportedLookAndFeelException ex) {
                Functions.showMessageDialog(ex.getMessage(), "error");
            }
            Home hm = new Home();
            hm.setVisible(true);
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit_settings_menuItem;
    private javax.swing.JPanel Home_Search;
    private javax.swing.JPanel Home_productsListed;
    private javax.swing.JPanel Home_productsListed1;
    private javax.swing.JPanel Home_productsListed2;
    private javax.swing.JMenu Inventory_menu;
    private javax.swing.JPanel MainPanel_Home;
    private javax.swing.JTable ProductList_Table;
    private javax.swing.JTextField Search_TextField;
    private javax.swing.JLabel Search_lbl;
    private javax.swing.JMenu Settings_menu;
    private javax.swing.JComboBox<String> SortSearchBy_Combobox;
    private javax.swing.JMenuItem Statistics_Inventory_menuItem;
    private javax.swing.JScrollPane TableScrollPane;
    private javax.swing.JMenuItem UpdateProduct_Inventory_menuItem;
    private javax.swing.JMenuItem addProduct_Inventory_menuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
