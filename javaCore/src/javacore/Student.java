/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Student {
    private String maSV;
    private double diemTB;
    private int tuoi;
    private String lop;
    public String getMaSV(){
        return maSV;
    }
    public double getDiemTB(){
        return diemTB;
    }
    public int getTuoi(){
        return tuoi;
    }
    public String getLop(){
        return lop;
    }
    public void setMaSV(String maSV){
        this.maSV = maSV;
    }
    public void setDiemTB(double diemTB){
        this.diemTB = diemTB;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    public void setLop(String lop){
        this.lop = lop;
    }
    public Student(){
        
    }
    public Student(String roolNumber, double avg, int age, String clasS){
        maSV = roolNumber;
        diemTB = avg;
        tuoi = age;
        lop = clasS;
    }
    Scanner sc = new Scanner(System.in);
    public void inputInfo(){
        System.out.println("Nhập vào mã sinh viên: ");
        maSV = sc.nextLine();
        int len1 = maSV.length();
        if(len1!=8)
            System.out.println("Mời bạn nhập lại!");
        maSV = sc.nextLine();
        System.out.println("Nhập vào điểm trung bình: ");
        diemTB = sc.nextDouble();
        if(diemTB<0.0 || diemTB>10.0)
            System.out.println("Mời bạn nhập lại!");
        diemTB = sc.nextDouble();
        System.out.println("Nhập tuổi sinh viên: ");
        tuoi = sc.nextInt();
        if(tuoi<18)
            System.out.println("Mời bạn nhập lại!");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập lớp: ");
        lop = sc.nextLine();
        
    }
    public void showInfo(){
        System.out.println("Mã SV: " +maSV);
        System.out.println("Điểm trung bình: " +diemTB);
        System.out.println("Tuổi: " +tuoi);
        System.out.println("Lớp: " +lop);
    }
    public void xetHocBong(){
        if(diemTB>8.0)
            System.out.println("Sinh viên này được học bổng!");
        else
            System.out.println("Sinh viên này không được học bổng!");
    }
    public static void main(String[] args){
        Student st = new Student();
        Scanner sv = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên: ");
        int n = sv.nextInt();
        for(int i=1;i<=n;i++){
            st.inputInfo();
            st.showInfo();
            st.xetHocBong();
        }
    }
}
