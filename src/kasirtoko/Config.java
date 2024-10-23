/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirtoko;

import java.sql.*;
/**
 *
 * @author Pisang Angker
 */
public class Config {
    private static Connection connection;
    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/dbkasir";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
}