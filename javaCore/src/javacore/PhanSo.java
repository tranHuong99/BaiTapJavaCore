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
public class PhanSo {
    private int tuSo;
    private int mauSo;
    public int getTuSo(){
        return tuSo;
    }
    public void setTuSo(int tuSo){
        this.tuSo = tuSo;
    }
    public int getMauSo(){
        return mauSo;
    }
    public void setMauSo(int mauSo){
        this.mauSo = mauSo;
    }
    public PhanSo(){
        
    }
    public PhanSo(int numerator, int denominator){
        tuSo = numerator;
        mauSo = denominator;
    }
    Scanner sc = new Scanner(System.in);
    public void readFraction(){
        System.out.println("Nhập tử số: ");
        tuSo = sc.nextInt();
        System.out.println("Nhập mẫu số: ");
        mauSo = sc.nextInt();
    }
}
