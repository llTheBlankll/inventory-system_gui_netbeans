package com.inventory.inventory_system;

import java.sql.*;

/**
 *
 * @author nytri
 */
public class Connect {
    
    public static java.sql.Connection getMySQLConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con;

            String username = "inventory_system";
            String password = "AJrwC5f7Ji!9.Vqd";

            con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/inventory_system", username, password);
            return con;
        } catch (SQLException | ClassNotFoundException e) {
            Functions.showMessageDialog(e.getMessage(), "error");
            System.exit(e.hashCode());
            return null;
        }
    }
    
    public static Boolean isConnectionValid(java.sql.Connection connection) throws Exception {
        return connection.isValid(30);
    }
}
