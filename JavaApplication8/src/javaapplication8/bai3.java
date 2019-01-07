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
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res=0;
        int i;
        for(i=1;i<x;i++){
            if(x%i==0){
                res += i;
            }
        }
        System.out.printf("%d", res);
    }
}
