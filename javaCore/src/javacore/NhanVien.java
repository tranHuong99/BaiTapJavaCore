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
public class NhanVien {
    private String ten;
    private int tuoi;
    private String diaChi;
    private double tienLuong;
    private int tongSoGioLam;
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public int getTuoi(){
        return tuoi;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    public String getDiaChi(){
        return diaChi;
    }
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public double getTienLuong(){
        return tienLuong;
    }
    public void setTienLuong(double tienLuong){
        this.tienLuong = tienLuong;
    }
    public int getTongSoGioLam(){
        return tongSoGioLam;
    }
    public void setTongSoGioLam(int tongSoGioLam){
        this.tongSoGioLam = tongSoGioLam;
    }
    public NhanVien(){
    }
    public NhanVien(String name, int age, String add, double money, int time){
        ten = name;
        tuoi = age;
        diaChi = add;
        tienLuong = money;
        tongSoGioLam = time;
    }
    Scanner sc = new Scanner(System.in);
    public void inputInfo(){
        System.out.println("Nhập vào tên nhân viên: ");
        ten = sc.nextLine();
        System.out.println("Nhập tuổi nhân viên: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.println("Nhập tiền lương nhân viên: ");
        tienLuong = sc.nextDouble();
        System.out.println("Nhập vào tổng số giờ làm: ");
        tongSoGioLam = sc.nextInt();
    }
    public void printInfo(){
        System.out.println("Tên nhân viên: " +ten);
        System.out.println("Tuổi: " +tuoi);
        System.out.println("Địa chỉ: " +diaChi);
        System.out.println("Tiền lương: " +tienLuong);
        System.out.println("Tổng số giờ làm: " +tongSoGioLam);
    }
    public double tinhThuong(){
        double tienThuong;
        if(tongSoGioLam >= 200)
            tienThuong = tienLuong*0.2;
        else if(tongSoGioLam<200 && tongSoGioLam>=100)
            tienThuong = tienLuong*0.1;
        else
            tienThuong = 0;
        return tienThuong;
    }
    public static void main(String[] args){
        NhanVien nVien = new NhanVien();
        Scanner nv = new Scanner(System.in);
        System.out.println("Nhập và số lượng nhân viên: ");
        int n = nv.nextInt();
        for(int i=1;i<=n;i++){
            nVien.inputInfo();
            nVien.printInfo();
            System.out.printf("Tiền thưởng: %.3f\n", nVien.tinhThuong());
        }
    }
}
