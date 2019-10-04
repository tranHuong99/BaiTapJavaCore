/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.showcase.model;

import com.act.showcase.db.DBConnector;
import com.act.showcase.dto.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HUONG XINH GAI
 */
public class UserModel {
    public User login(String email, String password) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM members WHERE email = ? AND password = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, email);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();
        User user = null;
        while (rs.next()) {
            user = new User();
            user.setName(rs.getString("name"));
            user.setDate(rs.getDate("date"));
            user.setPhone(rs.getString("phone"));
            user.setEmail(rs.getString("email"));
            user.setCourse(rs.getString("course"));
        }
        return user;
    }
}
