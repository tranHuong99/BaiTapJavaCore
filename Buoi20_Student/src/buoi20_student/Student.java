/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi20_student;

import java.util.Date;

/**
 *
 * @author HUONG XINH GAI
 */
public class Student {
    protected String rollNumber;
    protected String name;
    protected Date dod;
    protected String email;
    public Student() {
    }
    public Student(String rollNumber, String name, Date dod, String email) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.dod = dod;
        this.email = email;
    }

    Student(String rollNumber, String name, String sDate1, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getRollNumber() {
        return rollNumber;
    }
    public String getName() {
        return name;
    }
    public Date getDod() {
        return dod;
    }
    public String getEmail() {
        return email;
    }
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDod(Date dod) {
        this.dod = dod;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
