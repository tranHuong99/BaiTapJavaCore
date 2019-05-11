/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi20;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Menu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=======MENU=======");
        System.out.println("1. Add new");
        System.out.println("2. Search by name");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Save");
        System.out.println("6. Language");
        System.out.println("7. Exit");
        System.out.println("Choose: ");
        int n = sc.nextInt();
        do{
            switch(n){
                case 1: 
                case 2:
                case 3:
                case 4:
                case 5:    
                case 6: 
            }
        }while(n!=7);
    }
}
