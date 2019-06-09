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
public class Teacher_Manager extends Teacher{
    private static final int MAX = 2;
    protected Person[] list = null;
    protected int curr = 0;
    public Teacher_Manager(){
        this.list = new Teacher[MAX];
    } 
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chuyên ngành: ");
        this.specialized = sc.nextLine();
    }
    @Override
    public double salary(){
        double temp = cf_salary*simple_salary;
        double allowance = temp*0.3;
        double salary = temp + allowance;
        return salary;
    }
    @Override
    public void show(){
        //Teacher_Manager tcm = new Teacher_Manager();
        System.out.println("-------LIST TEACHER-------");
        for(int i=0;i<this.list.length;i++){
            System.out.println("Giáo viên "+(i+1));
            System.out.println("Họ tên: " +name);
            System.out.println("Ngày sinh: " +date);
            System.out.println("Giới tính: " +sex);
            System.out.println("Chuyên ngành: " +specialized);
            System.out.println("Hệ số lương: " +cf_salary);
            //System.out.println("Lương: " +tcm.salary());
        }
    }

}
