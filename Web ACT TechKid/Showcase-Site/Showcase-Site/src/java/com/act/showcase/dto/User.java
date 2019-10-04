/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.showcase.dto;

import java.util.Date;

/**
 *
 * @author HUONG XINH GAI
 */
public class User {
    private String name;
    private Date date;
    private String phone;
    private String email;
    private String course;

    public User() {
    }

    public User(String name, Date date, String phone, String email, String course) {
        this.name = name;
        this.date = date;
        this.phone = phone;
        this.email = email;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
}
