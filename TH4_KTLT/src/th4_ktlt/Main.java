/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th4_ktlt;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PhanSo p = new PhanSo();
        PhanSo p1 = new PhanSo();
        PhanSo p2 = new PhanSo();
        p1.input();
        p1.show();
        p2.input();
        p2.show();
        System.out.print("Tổng 2 phân số là: ");
        p = p1.Tong(p2);
        p.show();
        System.out.print("Tổng 2 phân số là: ");
        p = p1.Hieu(p2);
        p.show();
        System.out.print("Tổng 2 phân số là: ");
        p = p1.Tich(p2);
        p.show();
        System.out.print("Tổng 2 phân số là: ");
        p = p1.Thuong(p2);
        p.show();
    }
}
