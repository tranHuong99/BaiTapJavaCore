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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Student ? Employee ? (S|E) ");
        String c = new Scanner(System.in).nextLine();
        if(c.toUpperCase().equals("S")){
            Menu menu = new Menu(new StudentManager());
            menu.display();
        }
        else if(c.toUpperCase().equals("E")){
            Menu menu = new Menu(new EmployeeManager());
            menu.display();
        }
        else
            System.out.println("Không hợp lệ!");
    }
    
}
