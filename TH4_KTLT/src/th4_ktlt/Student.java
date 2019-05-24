/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th4_ktlt;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Student {
    protected String id;
    protected String name;
    protected double point;
    public Student() {
    }
    public Student(String id, String name, double point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPoint() {
        return point;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPoint(double point) {
        this.point = point;
    }
}
