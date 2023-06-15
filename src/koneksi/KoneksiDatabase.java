/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class KoneksiDatabase {
    Connection koneksi;
    
    public static Connection BukaKoneksi() {
    try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_javacrud", "root", "");
        return cn;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
        
    }
}
