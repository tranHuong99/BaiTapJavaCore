/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class JavaApplication8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập x = ");
        int x = sc.nextInt();
        System.out.println("Nhập n = ");
        int n = sc.nextInt();
        int S = 0;
        for(int i=1;i<=n;i++){
            S += pow(x,i);
        }
        System.out.printf("Tổng S = %d", S);
    }        
}
