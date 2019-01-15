/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapslide7;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Run {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng sản phẩm: ");
        int n = sc.nextInt();
        Main main = new Main();
        for(int i=0; i<n;i++){
            main.Menu();
        }
    }
}
