/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.MODEL;

import com.java.demo.BEAN.Author;
import com.java.demo.db.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class AuthorModel {
    public Author getAuthorById (int id) throws ClassNotFoundException, SQLException {
        DBConnector connector = new DBConnector();
        Connection conn = connector.getConnection();
        String sql = "Select * from author where id = ?";
        PreparedStatement preStatement = conn.prepareStatement(sql);
        preStatement.setInt(1, id);
        ResultSet rs = preStatement.executeQuery();
        if(rs.next()) {
            return new Author(rs.getInt("id"), rs.getString("name"), rs.getString("email"));
        }
        return null;
    }
}
