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
public abstract class Person {
    protected String name;
    protected String date;
    protected String sex;
    protected double cf_salary; //coefficients salary - hệ số lương
    protected int simple_salary; //lương cơ bản
    public Person() {
    }
    public Person(String name, String date, String sex, double cf_salary, int simple_salary) {
        this.name = name;
        this.date = date;
        this.sex = sex;
        this.cf_salary = cf_salary;
        this.simple_salary = simple_salary;
    }
    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
    public String getSex() {
        return sex;
    }
    public double getCf_salary() {
        return cf_salary;
    }
    public double getSimple_Salary(){
        return simple_salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setCf_salary(double cf_salary) {
        this.cf_salary = cf_salary;
    }
    public void setSimple_Salary(int simple_salary){
        this.simple_salary = simple_salary;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ tên: ");
        this.name = sc.nextLine();
        System.out.print("Ngày sinh: ");
        this.date = sc.nextLine();
        System.out.print("Giới tính: ");
        this.sex = sc.nextLine();
        System.out.print("Hệ số lương: ");
        this.cf_salary = sc.nextDouble();
        System.out.print("Lương cơ bản: ");
        this.simple_salary = sc.nextInt();
    }
    public abstract double salary();
}
