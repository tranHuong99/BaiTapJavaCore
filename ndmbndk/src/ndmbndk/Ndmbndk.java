/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ndmbndk;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Ndmbndk {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Nhap nhap = new Nhap();
        In in = new In();
        System.out.print("Nhập số phần tử mảng: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        nhap.nhap(a, n);
        System.out.println("Mảng đã nhập là: ");
        in.in(a, n);
    }
    
}
