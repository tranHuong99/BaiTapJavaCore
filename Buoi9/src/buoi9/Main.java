/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi9;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Main extends Student{
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentManager stM = new StudentManager();
        System.out.println("---Student Manager---");
        System.out.println("1.  List");
        System.out.println("2.  Search");
        System.out.println("3.  Add");
        System.out.println("4.  Exit");
        System.out.println("Choice: ");
        int choice = sc.nextInt();
        System.out.println("Nhập trạng thái Order: ");
        String c = sc.nextLine();
        switch(choice){
            case 1:{
                System.out.printf("Order(Y/N): %c\n", c);
                if(c == "Y"){
                    String d = sc.nextLine();
                    System.out.printf("ASC/DESC(A/D): %c\n", d);
                    stM.list();
                }
                else{
                    stM.list();
                }
            }
            break;
            case 2:{
                System.out.printf("Name: %s\n", sc.nextLine());
               
            }
        }
    }
}
