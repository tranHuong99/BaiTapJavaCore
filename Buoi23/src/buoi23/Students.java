/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi23;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Students {
    private int id;
    private String name;
    private String email;
    private String pass;
    public Students() {
    }
    public Students(int id, String name, String email, String pass) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPass() {
        return pass;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----QUIZ ONLINE-----");
        System.out.print("Enter email: ");
        this.email = sc.nextLine();
        System.out.print("Enter pass: ");
        this.pass = sc.nextLine();
    }
    public boolean status(String email, String pass) throws Exception{
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "select * from students "+              
                "where students.email = ? and students.pass = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, email);
        ps.setString(2, pass);
        ResultSet executeQuery = ps.executeQuery(); //Query --->select, Update --->insert
        return executeQuery.next();
    }
}
