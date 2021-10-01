/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventory.inventory_system;

import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author nytri
 */
public class Functions {
    /*
    * Show message dialog either error, information, or warning.
    */
    public static void showMessageDialog(String content, String type) {
        if (type != null) switch (type) {
            case "info":
                JOptionPane.showMessageDialog(null, content, "Information", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "error":
                JOptionPane.showMessageDialog(null, content, "Error", JOptionPane.ERROR_MESSAGE);
                break;
            case "warn":
                JOptionPane.showMessageDialog(null, content, "Warning", JOptionPane.WARNING_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, content, "Information", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
    
    
    
    /**
     * Insert a row to the table specified.
     *
     * @param table
     * @param content
     */
    public static void insertRowToTable(DefaultTableModel table, String[] content) {
        table.addRow(content);
    }
    
    public static void clearRowsInTable(DefaultTableModel table) {
        table.setRowCount(0);
    }
}