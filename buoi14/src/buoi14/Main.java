/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi14;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Nhap");
        System.out.println("2. Danh sach");
        System.out.println("3. Top 3");
        System.out.println("4. Thoat");
        System.out.print("Chon: ");
        int c = Integer.parseInt(sc.nextLine());
        switch(c){
            case 1: manager.add();
        }
    }
    
}
