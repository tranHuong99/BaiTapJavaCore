/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class DBConnector {
    public Connection getConnection () throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String connectStr = "jdbc:mysql://localhost:3306/DB_NEWS";
        String username = "root";
        String password = "";
        return DriverManager.getConnection(connectStr, username, password);
    }
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        int totalPage = 8;
        int perpage = 3;
        System.out.println((int)Math.floor(totalPage/perpage) + (totalPage%perpage==0 ? 0 : 1));
    }
}
