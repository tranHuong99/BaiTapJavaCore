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
public class student_questions {
    private int student_id;
    private int question_id;
    private String answer;
    public student_questions() {
    }
    public student_questions(int student_id, int question_id, String answer) {
        this.student_id = student_id;
        this.question_id = question_id;
        this.answer = answer;
    }
    public int getStudent_id() {
        return student_id;
    }
    public int getQuestion_id() {
        return question_id;
    }
    public String getAnswer() {
        return answer;
    }
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public ResultSet st_questions() throws Exception{
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "SELECT * FROM csdl.student_questions";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        return pstmt.executeQuery();
    }
    public boolean st_questions_status() throws Exception{
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "SELECT * FROM csdl.student_questions";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet executeQuery = pstmt.executeQuery(); //Query --->select, Update --->insert
        return executeQuery.next();
    }
}
