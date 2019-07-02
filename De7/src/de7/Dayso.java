/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de7;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Dayso {   
    protected int a[];
    protected float b[];
    protected double c[];
    protected int n;

    public Dayso() {
    }

    public Dayso(int[] a, int n) {
        this.a = a;
        this.n = n;
    }

    public Dayso(float[] b, int n) {
        this.b = b;
        this.n = n;
    }

    public Dayso(double[] c, int n) {
        this.c = c;
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public float[] getB() {
        return b;
    }

    public double[] getC() {
        return c;
    }

    public int getN() {
        return n;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public void setB(float[] b) {
        this.b = b;
    }

    public void setC(double[] c) {
        this.c = c;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    
    Scanner sc = new Scanner(System.in);
    public void inputList(int a[], int n){
        for(int i=1;i<=n;i++){
            System.out.println("a[" +i + "] = ");
            this.a[i] = sc.nextInt();
        }
    }
    public int min_arr(int a[], int n){
        if(n==1) return a[0];
        return a[n-1] < min_arr(a, n-1) ? a[n-1] : min_arr(a, n-1);
    }
    public int tich_arr(int a[], int n){
        if(n==1) return a[0];
        return a[n-1]*tich_arr(a, n-1);
    }
    public void menu(int n){
        int choose = 0;
        do{
            System.out.println("1. Nhập dãy số");
            System.out.println("2. Phần tử nhỏ nhất của dãy");
            System.out.println("3. Tích của dãy số");
            System.out.println("4. Kết thúc");
            System.out.print("Mời bạn chọn: ");
            choose = sc.nextInt();
            switch(choose){
                case 1: 
                    System.out.print("Nhập số phần tử của dãy số: ");
                    n = sc.nextInt();
                    inputList(a, n);
                    break;
                case 2: 
                    System.out.print("Phần tử nhỏ nhất của dãy là:" +min_arr(a, n)); break;
                case 3: 
                    System.out.println("Tích của dãy số là: " +tich_arr(a, n));
            }
        }while(choose!=3);
    }
    public void inputList(float b[], int n){
        for(int i=0;i<n;i++){
            System.out.println("a[" +i + "] = ");
            this.b[i] = sc.nextFloat();
        }
    }
    public float min_arr(float b[], int n){
        if(n==1) return b[0];
        return b[n-1] < min_arr(b, n-1) ? b[n-1] : min_arr(b, n-1);
        
    }
    public float tich_arr(float b[], int n){
        if(n==1) return b[0];
        return b[n-1]*tich_arr(b, n-1);
    }
    public void menu(float b[], int n){
        int choose = 0;
        do{
            System.out.println("1. Nhập dãy số");
            System.out.println("2. Phần tử nhỏ nhất của dãy");
            System.out.println("3. Tích của dãy số");
            System.out.println("4. Kết thúc");
            System.out.print("Mời bạn chọn: ");
            choose = sc.nextInt();
            switch(choose){
                case 1: 
                    System.out.print("Nhập số phần tử của dãy số: ");
                    this.n = sc.nextInt();
                    inputList(b, n);
                    break;
                case 2: 
                    System.out.print("Phần tử nhỏ nhất của dãy là:" +min_arr(b, n)); break;
                case 3: 
                    System.out.println("Tích của dãy số là: " +tich_arr(b, n));
            }
        }while(choose!=3);
    }
    public void inputList(double c[], int n){
        for(int i=0;i<n;i++){
            System.out.println("a[" +i + "] = ");
            this.c[i] = sc.nextDouble();
        }
    }
    public double min_arr(double c[], int n){
        if(n==1) return c[0];
        return c[n-1] < min_arr(c, n-1) ? c[n-1] : min_arr(c, n-1);
        
    }
    public double tich_arr(double c[], int n){
        if(n==1) return c[0];
        return c[n-1]*tich_arr(c, n-1);
    }
    public void menu(double c[], int n){
        int choose = 0;
        do{
            System.out.println("1. Nhập dãy số");
            System.out.println("2. Phần tử nhỏ nhất của dãy");
            System.out.println("3. Tích của dãy số");
            System.out.println("4. Kết thúc");
            System.out.print("Mời bạn chọn: ");
            choose = sc.nextInt();
            switch(choose){
                case 1: 
                    System.out.print("Nhập số phần tử của dãy số: ");
                    this.n = sc.nextInt();
                    inputList(c, n);
                    break;
                case 2: 
                    System.out.print("Phần tử nhỏ nhất của dãy là:" +min_arr(c, n)); break;
                case 3: 
                    System.out.println("Tích của dãy số là: " +tich_arr(c, n));
            }
        }while(choose!=3);
    }
}
