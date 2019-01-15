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
public class Main {
    public void Menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choice 1: Add Product");
        System.out.println("Choice 2: List Product");
        System.out.println("Choice 3: Search");
        System.out.println("Choice 4: Exit");
        System.out.print("Moi ban chon: ");
        int choice = sc.nextInt();
        Store st = new Store();
        switch(choice){
            case 1: 
                st.addProduct();
                break;
            case 2: 
                st.listProduct();
                break;
            case 3:
                System.out.println("Nhập tên mặt hàng cần tìm: ");
                String name = sc.nextLine();
                st.search(name);
                break;
            case 4: break;
        }
        System.out.println("Bạn có muốn thực hiện tiếp không?");
    }
}
