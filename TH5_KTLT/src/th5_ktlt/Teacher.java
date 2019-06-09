/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th5_ktlt;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public abstract class Teacher extends Person{
    protected String specialized; //chuyên ngành
    public Teacher() {
    }
    public Teacher(String name, String date, String sex, String specialized, double cf_salary, int simple_salary) {
        this.name = name;
        this.date = date;
        this.sex = sex;
        this.specialized = specialized;
        this.cf_salary = cf_salary;
        this.simple_salary = simple_salary;
    }
    public String getSpecialized() {
        return specialized;
    }
    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }
    @Override
    public abstract void input();
    public abstract void show();
    @Override
    public abstract double salary();
}
