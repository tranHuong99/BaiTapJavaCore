/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi22;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HUONG XINH GAI
 */
public class DBConnector {
    public Connection getConnect() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connStr = "jdbc:mysql://localhost:3306/QLYTHUVIEN";
        Connection conn = DriverManager.getConnection(connStr, "root", "Ftu.9907@");
        return conn;
    }
}
