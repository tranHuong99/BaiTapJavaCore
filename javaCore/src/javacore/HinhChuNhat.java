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
public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    public double getChieuDai(){
        return chieuDai;
    }
    public void setChieuDai(double chieuDai){
        this.chieuDai = chieuDai;
    }
    public double getChieuRong(){
        return chieuRong;
    }
    public void setChieuRong(double chieuRong){
        this.chieuRong = chieuRong;
    }

    public HinhChuNhat(){
        
    }
    public HinhChuNhat(double x, double y){
        chieuDai = x;
        chieuRong = y;
    }
    Scanner sc = new Scanner(System.in);
    public void readRectangle(){
        System.out.println("Nhập vào chiều dài và chiều rộng: ");
        System.out.println("Chiều dài = ");
        chieuDai = sc.nextDouble();
        System.out.println("Chiều rộng = ");
        chieuRong = sc.nextDouble();
    }

    public double perimeter_of_Rectangle(){
        double chuVi = (chieuDai+chieuRong)*2;
        return chuVi;
    }
    public double acreage_of_Rectangle(){
        double dienTich = chieuDai*chieuRong;
        return dienTich;
    }
    public static void main(String[] args){
        HinhChuNhat rectangle = new HinhChuNhat();
        rectangle.readRectangle();
        System.out.println("Chu vi HCN là: ");
        System.out.printf("%.3f\n", rectangle.perimeter_of_Rectangle());
        System.out.println("Diện tích HCN là: ");
        System.out.printf("%.3f", rectangle.acreage_of_Rectangle());
    }
}
