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
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 1;
        int tong_am, tong_duong;
        while((t--)>0)
        {
            tong_am = 0;
            tong_duong = 0;
            x = sc.nextInt();
            for(;x!=0;)
            {
                if(x>0)
                    tong_duong += x;
                else
                    tong_am += x;
                x = sc.nextInt();
            }
            System.out.printf("NegativeSum =  %6d;     PositiveSum =    %6d\n", tong_am,tong_duong);
        }
    }
}
