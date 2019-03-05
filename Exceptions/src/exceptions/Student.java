/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Student {
    private String name;
    private String stCode;
    private double point;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getStCode(){
        return stCode;
    }
    public void setStCode(String stCode){
        this.stCode = stCode;
    }
    public double getPoint(){
        return point;
    }
    public void setPoint(double point){
        this.point = point;
    }
    public Student(){
        
    }
    public Student(String name, String stCode, double point){
        this.name = name;
        this.stCode = stCode;
        this.point = point;
    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Code: ");
        stCode = sc.nextLine();
        System.out.print("Point: ");
        point = sc.nextDouble();
        if(point<=0 || point >10)
            System.out.println("Invalid information! Please re-enter!");
        System.out.print("Point: ");
        point = sc.nextDouble();
    }
    public void showInfo(){
        if(point>0 && point<5){
            System.out.println("==>underperforming student!:");
            System.out.println();
        }
        else if(point>=5 && point <7){
            System.out.println("==>average student!");
            System.out.println();
        }
        else if(point >=7 && point <8){
            System.out.println("==>good student!");
            System.out.println();
        }
        else{
            System.out.println("==>excellent student!");
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Student " +i + ": ");
            st.inputInfo();
            st.showInfo();
        }
    }
}
