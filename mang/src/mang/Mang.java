/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Mang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] soNguyen = new int[5];
        int tong = 0;
        System.out.print("Nhập các phần tử mảng: ");
        for(int i=0;i<5;i++){
            soNguyen[i] = sc.nextInt();
            tong += soNguyen[i];
        }
        System.out.print("In ra mảng vừa nhập: ");
        for(int i=0;i<5;i++){
            System.out.printf("%5d", soNguyen[i]);
        }
        System.out.printf("\n");
        System.out.printf("Tổng = %d", tong);
    }
    
}
