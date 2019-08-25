/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.MODEL;

import com.java.demo.BEAN.Author;
import com.java.demo.BEAN.New;
import com.java.demo.db.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class NewModel {
    
    public List<New> getNews(int limit, int offset) throws ClassNotFoundException, SQLException {
        DBConnector connector = new DBConnector();
        Connection conn = connector.getConnection();
        String sql = "Select * from new limit ?  offset ?";
        PreparedStatement preStatement = conn.prepareStatement(sql);
        preStatement.setInt(1, limit);
        preStatement.setInt(2, offset);
        ResultSet rs = preStatement.executeQuery();
        List<New> list = new ArrayList<>();
        while (rs.next()) {
            AuthorModel authorModel = new AuthorModel();
            Author author = authorModel.getAuthorById(rs.getInt("author_id"));
            list.add(new New(rs.getInt("id"), rs.getString("title"), rs.getString("summary"), rs.getString("content"), new Author(author.getId(), author.getName(), author.getEmail()), rs.getDate("create_at")));
        }
        return list;
    }

    public int countNews() throws ClassNotFoundException, SQLException {
        DBConnector connector = new DBConnector();
        Connection conn = connector.getConnection();
        String sql = "select count(*) as size from new";
        PreparedStatement preStatement = conn.prepareStatement(sql);
        ResultSet rs = preStatement.executeQuery();
        if (rs.next()) {
            return rs.getInt("size");
        }
        return 0;
    }

}
