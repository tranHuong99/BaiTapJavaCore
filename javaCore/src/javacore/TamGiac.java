/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class TamGiac {
    private double a;
    private double b;
    private double c;
    public double getA(){
        return a;
    }
    public void setA(double a){
        this.a = a;
    }
    public double getB(){
        return b;
    }
    public void setB(double b){
        this.b = b;
    }
    public double getC(){
        return c;
    }
    public void setC(double c){
        this.c = c;
    }
    public TamGiac(){
        
    }
    public TamGiac(double x, double y, double z){
        a = x;
        b = y;
        c = z;
    }
    Scanner sc = new Scanner(System.in);
    public void readTriangle(){
        System.out.println("Nhập vào 3 cạnh tam giác: ");
        System.out.println("a = ");
        a = sc.nextDouble();
        System.out.println("b = ");
        b = sc.nextDouble();
        System.out.println("c = ");
        c = sc.nextDouble();
    }
    public void typeTriangle(){
        if(a==b || b==c || a==c)
            System.out.println("Tam giác cân");
        else if(a==b && b==c)
            System.out.println("Tam giác đều");
        else if((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a))
            System.out.println("Tam giác vuông");
        else if((a==b && (a*a + b*b == c*c)) || (b==c && (b*b + c*c == a*a)) || (a==c && (a*a + c*c == b*b)))
            System.out.println("Tam giác vuông cân");
        else
            System.out.println("Tam giác thường");
    }
    public double perimeter_of_Triangle(){
        
        double chuVi = a+b+c;
        return chuVi;
    }
    public double acreage_of_Triangle(){
        
        double S = (a+b+c)/2;
        double dienTich = sqrt(S*(S-a)*(S-b)*(S-c));
        return dienTich;
    }
    public static void main(String[] args){
        TamGiac triangle = new TamGiac();
        triangle.readTriangle();
        triangle.typeTriangle();
        System.out.println("Chu vi tam giác là: ");
        System.out.printf("%.3f\n", triangle.perimeter_of_Triangle());
        System.out.println("Diện tích tam giác là: ");
        System.out.printf("%.3f", triangle.acreage_of_Triangle());
    }
}
