/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.BEAN;

/**
 *
 * @author Student
 */
public class Author {
    private int id;
    private String name;
    private String email;

    public Author() {
    }

    public Author(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{" + "id=" + id + ", name=" + name + ", email=" + email + '}';
    }
        
}
