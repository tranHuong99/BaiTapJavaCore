/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi12;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Menu {
    private Manager manager = null;
    public Menu(Manager manager){
        this.manager = manager;
    }
    public void display(){
        System.out.println("---MENU---");       
        System.out.println("1. Add");
        System.out.println("2. Show");
        System.out.println("3. Search");
        System.out.println("4. Exit");
        System.out.print("Choose: ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        switch(c){
            case 1:
                this.manager.add();
                break;
            case 2:
                this.manager.show();
                break;
            case 4: 
                System.exit(0);
                break;
            case 3: 
                System.out.println("Name: ");
                String name = sc.nextLine();
                this.manager.search(name);
        }
    }
}
