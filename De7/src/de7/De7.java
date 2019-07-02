/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de7;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class De7 extends Dayso{
    public void Menu(){
        Scanner sc = new Scanner(System.in);
        Dayso list = new Dayso();
        int choose = 0;       
        do{
            System.out.println("1. Dãy số nguyên (Kiểu Int)");
            System.out.println("2. Dãy số thực (Kiểu Float)");
            System.out.println("3. Dãy số thực kiểu Double");
            System.out.println("4. Kết thúc");
            System.out.print("Mời bạn chọn: ");
            choose = sc.nextInt();
            switch(choose){
                case 1: list.menu(n); break;
                case 2: list.menu(list.b, list.n); break;
                case 3: list.menu(list.c, list.n); break;
            }
        }while(choose!=3);
    }
    public static void main(String[] args) {
        De7 de7 = new De7();
        de7.Menu();
    }
    
}
