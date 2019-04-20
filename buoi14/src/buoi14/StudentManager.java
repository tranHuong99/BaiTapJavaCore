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
public class StudentManager {
    private Student[] students;
    private int count;
    private static final int MAX_ST =10;
    public StudentManager() {
        this.students = new Student[count];
        this.count = 0;
    }
    public void add(){
        Input input = new Input();
        System.out.println("ID > ");
        String id = input.inputId();
        System.out.println("Name > ");
        String name = input.inputId();
        System.out.println("Mark > ");
        String mark = input.inputId();
        System.out.println("Phone > ");
        String phone = input.inputId();
        
        Student s = new Student(id, name, mark, phone);
        this.students[this.count] = s;
        this.count++;
    }
    public void list(){
        System.out.println("=======DANH SACH========");
        for(int i=0;i<this.count;i++){
            System.out.println(this.students[i]);
        }
    }
    public void showTop(int num){
        Student[] arr = this.getOrderList();
        System.out.printf("---TOP %d----\n", num);
        for(int i=0;i<num;i++)
            System.out.println(arr[i]);
    }
    private Student[] getOrderList(){
        Student[] arr = this.students;
        for(int i=0;i<this.count-1;i++){
            for(int j=i+1;j<this.count;j++){
                if(arr[i].getMark() < arr[j].getMark()){
                    Student t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
}
