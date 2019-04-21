/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi18;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Menu {
    public void Menu(){
        File f = new File("D:\\input.txt");
        Customer cust = new CustomerManager();
        Scanner sc = new Scanner(System.in);
        System.out.println("=====MENU=====");
        System.out.println("1. Load data");
        System.out.println("2. Add New");
        System.out.println("3. Search");
        System.out.println("4. Save");
        System.out.println("5. Exit");
        System.out.print("Mời bạn chọn: ");
        int n = sc.nextInt();
        switch(n){
            case 1: cust.load(f);
                break;
            case 2: {
                System.out.println("Nhập vào số lượng khách hàng:");
                int m = sc.nextInt();
                for(int i=1;i<=m;i++){
                    System.out.println("Nhập vào thông tin khách khàng thứ " +i);
                    cust.add();
                }
                break;
            }
            case 3: cust.search();
        }
    }
}
