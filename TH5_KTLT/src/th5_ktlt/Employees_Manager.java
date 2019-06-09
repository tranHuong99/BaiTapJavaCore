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
public class Employees_Manager extends Employees{
    private static final int MAX = 5;
    protected Person[] list = null;
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<this.list.length;i++){
            System.out.println("Nhập thông tin nhân viên thứ "+i);
            System.out.print("Họ tên: ");
            this.name = sc.nextLine();
            System.out.print("Ngày sinh: ");
            this.date = sc.nextLine();
            System.out.print("Giới tính: ");
            this.sex = sc.nextLine();
            System.out.print("Chức vụ: ");
            this.position = sc.nextLine();
            System.out.println("Phòng: ");
            this.room = sc.nextLine();
            System.out.print("Hệ số lương: ");
            this.cf_salary = sc.nextDouble();
            System.out.print("Lương cơ bản: ");
            this.simple_salary = sc.nextInt();
        }
    }
    @Override
    public void show(){
        System.out.println("-------LIST EMPLOYEES-------");
        System.out.println("Họ tên: " +name);
        System.out.println("Ngày sinh: " +date);
        System.out.println("Giới tính: " +sex);
        System.out.println("Chức vụ: " +position);
        System.out.println("Phòng: " +room);
        System.out.println("Hệ số lương: " +cf_salary);
        System.out.println("Lương cơ bản: " +simple_salary);
    }
    @Override
    public double salary(){
        double temp = cf_salary*simple_salary;
        double allowance;
        if(position.equals("GD"))
            allowance = temp*0.4;
        else if(position.equals("PGD"))
            allowance = temp*0.3;
        else if(position.equals("TP"))
            allowance = temp*0.25;
        else if(position.equals("PP"))
            allowance = temp*0.2;
        else
            allowance = temp*0.15;
        double salary = temp+allowance;
        return salary;
    }
}
