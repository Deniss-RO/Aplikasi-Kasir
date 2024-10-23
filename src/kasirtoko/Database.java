/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirtoko;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author smart user
 */
public class Database {

    private String query;

    public void Query(String query) {
        this.query = query;
    }

    public ResultSet resultSet() {
        Koneksi conn = new Koneksi();
        ResultSet rs = null;
        conn.config();
        try {
            String sql = query;
            rs = conn.stm.executeQuery(sql);
//            if (rs.next()) {
//                
//            } else {
//                JOptionPane.showMessageDialog(null, "Wrong Input or Data");
//                rs = null;
//            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
    
    public int AddData() {
        int result = 0;
        Koneksi conn = new Koneksi();
        conn.config();
        try {
            String sql = query;
            result = conn.stm.executeUpdate(query);
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "sukses");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return result;
    }
}
