/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi9;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class StudentManager extends Student{
    private static final int MAX_STUDENT = 2;
    private Student[] listStudents;
    private int currentQuantity;
    public StudentManager() {
        this.listStudents = new Student[MAX_STUDENT];
        this.currentQuantity = 0;
    }
    public StudentManager(String name, String email, int age) {
        super(name, email, age);
    }
    public Student[] getListStudents() {
        return listStudents;
    }
    public void setListStudents(Student[] listStudents) {
        this.listStudents = listStudents;
    }
    public boolean add(Student stud){
        if(currentQuantity < StudentManager.MAX_STUDENT){
            listStudents[this.currentQuantity] = s;
            this.currentQuantity++;
            return true;
        }
        else
            return false;
    }
    public void list(){
        System.out.println("+=====+==============+=======+");
        System.out.println("|NAME | EMAIL        |AGE    |");
        System.out.println("+=====+==============+=======+");
        System.out.printf("|%5s|%14s|%7d|\n", name, email,age);
        System.out.println("+-----+--------------+-------+");
    }
    public void list(boolean order){
        if(order){
            //sắp xếp tăng dần
            for(int i=0;i<this.listStudents.length-1;i++){
                for(int j=0;j<this.listStudents.length;j++){
                    if(this.listStudents[i]==null || this.listStudents[j]==null)
                        continue;
                    if(this.listStudents[i].getName().compareTo(this.listStudents[i].getName()) >0){
                        Student temp = this.listStudents[i];
                        this.listStudents[i] = this.listStudents[j];
                        this.listStudents[j] = temp;
                    }
                }
            }
        }
        else{
        
        }
    }
    public void search(String name){
        boolean found = false;
        for(int i=0;i<this.listStudents.length;i++){
            Student temp = this.listStudents[i];
            if(temp==null)
                continue;
            if(temp.getName().equals(name)){
                System.out.println(temp);
                found = true;
            }
        }
        if(!found)
            System.out.println("Không tìm thấy!");
    }
}
