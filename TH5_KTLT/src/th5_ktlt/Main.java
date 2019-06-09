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
public class Main {
    public static void main(String[] args){
        /*Teacher_Manager tcm = new Teacher_Manager();
        Employees_Manager epm = new Employees_Manager();
        System.out.println("Nhập thông tin giáo viên: ");
        tcm.input();
        tcm.salary();
        tcm.show();
        System.out.println("Lương: " +tcm.salary());
        System.out.println("------------------");
        System.out.println("Nhập thông tin nhân viên:");
        epm.input();
        epm.salary();
        epm.show();
        System.out.println("Lương: " +epm.salary());*/
        System.out.print("Teacher ? Employee ? (T|E): ");
        String c = new Scanner(System.in).nextLine();
        if(c.toUpperCase().equals("T")){
            Teacher_Manager tcm = new Teacher_Manager();
            tcm.input();
            tcm.salary();
            tcm.show();           
        }
        else if(c.toUpperCase().equals("E")){
            Employees_Manager epm = new Employees_Manager();
            epm.input();
            epm.salary();
            epm.show();
        }
        else
            System.out.println("Không hợp lệ!");
    }
}
