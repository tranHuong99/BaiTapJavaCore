/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi20_student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HUONG XINH GAI
 */
public class Student_Manager extends Manager{
    private Student[] students;
    private int count;
    private static final int MAX_ST =10;
    public Student_Manager() {
        this.students = new Student[count];
        this.count = 0;
    }
    
    @Override
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Roll Number > ");
        String rollNumber = sc.nextLine();
        System.out.println("Name > ");
        String name = sc.nextLine();
        System.out.println("Dob > ");
        String sDate1="05/05/2019";  
        try {
            Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        } catch (ParseException ex) {
            Logger.getLogger(Student_Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(sDate1+"\t"+sDate1);  
        System.out.println("Email > ");
        String email = sc.nextLine();        
        Student s = new Student(rollNumber, name, sDate1, email);
        this.students[this.count] = s;
        this.count++;
    }
    
    public void search(String name) {
        System.out.println("------RESULT------");
        boolean check = false;
        for(int i=0;i<this.list.length;i++){
            if(this.list[i]==null)
                continue;
            if(this.list[i].getName().equals(name)){
                System.out.println("this.list[i]");
                check = true;
                break;
            }
        }
        if(!check)
            System.out.println("Không tìm thấy!");
    }
    public void update(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên cần kiểm tra: ");
        String name1 = sc.nextLine();
        search(name1);
    }
}
