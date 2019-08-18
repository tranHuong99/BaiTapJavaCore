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
 * @author HUONG XINH GAI
 */
public class DBConnector {

    public Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connStr = "jdbc:mysql://localhost:3306/BOOKMANAGER?autoReconnect=true&useSSL=false";
        String username = "root";
        String pass = "Ftu.9907@";
        return (Connection) DriverManager.getConnection(connStr, username, pass);
    }
}
