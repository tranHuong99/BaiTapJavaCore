/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class bai7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n = ");
        int n = sc.nextInt();
        int f0=0;
        int f1=1;
        int fn;
        for(int i=0; i<=n; i++)
        {
            if(i==0 || i==1)
                fn = 1;
            else
            {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
            }
        }
        System.out.printf("Phần tử đó là %d\n", fn);
    }
    
}
