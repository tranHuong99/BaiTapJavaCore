/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi14;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Student extends Exception{
    private String id;
    private String name;
    private double mark;
    private int group;
    private String phone;
    public Student() {
    }
    public Student(String id, String name, double mark, int group, String phone) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.group = group;
        this.phone = phone;
    }

    public Student(String id, String name, double mark, String phone) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.phone = phone;
    }
    private void calGroup(){
        if(this.mark>=8)
            this.setGroup(1);
        else if(this.mark>=6)
            this.setGroup(2);
        else if(this.mark>=4)
            this.setGroup(3);
        else
            this.setGroup(4);
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getMark() {
        return mark;
    }
    public int getGroup() {
        return group;
    }
    public String getPhone() {
        return phone;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMark(double mark) {
        this.mark = mark;
    }
    public void setGroup(int group) {
        this.group = group;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
