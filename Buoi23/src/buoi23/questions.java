/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi23;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author HUONG XINH GAI
 */
public class questions {
    private int id;
    private String content;
    private String answer_a;
    private String answer_b;
    private String answer_c;
    private String answer_d;
    private String correct;
    public questions() {
    }
    public questions(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getContent() {
        return content;
    }
    public String getAnswer_a() {
        return answer_a;
    }
    public String getAnswer_b() {
        return answer_b;
    }
    public String getAnswer_c() {
        return answer_c;
    }
    public String getAnswer_d() {
        return answer_d;
    }
    public String getCorrect() {
        return correct;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setAnswer_a(String answer_a) {
        this.answer_a = answer_a;
    }
    public void setAnswer_b(String answer_b) {
        this.answer_b = answer_b;
    }
    public void setAnswer_c(String answer_c) {
        this.answer_c = answer_c;
    }
    public void setAnswer_d(String answer_d) {
        this.answer_d = answer_d;
    }
    public void setCorrect(String correct) {
        this.correct = correct;
    }
    public ResultSet ContentQuestions() throws Exception{
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "select * from questions";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        return pstmt.executeQuery();
    }
    public boolean status(String answer) throws Exception{
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "select * from questions "+              
                "where questions.correct = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, answer);
        ResultSet executeQuery = ps.executeQuery(); //Query --->select, Update --->insert
        return executeQuery.next();
    }
}
