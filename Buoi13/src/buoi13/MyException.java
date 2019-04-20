/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi13;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class MyException extends Exception{
    public int inputNumber(){
        Scanner sc  = new Scanner(System.in);
        int a=0;
        /*boolean flag = true;
        do{
            flag = true;
            try{
                System.out.print("Nhap so: ");
                a = Integer.parseInt(sc.nextLine());
            }
            catch(Exception e){
                System.out.println("Nhap khong dung dinh dang");
                flag = false;
            }
        }
        while(!flag);
        return a;*/
        try{
            System.out.print("Nhap so: ");
            a = Integer.parseInt(sc.nextLine());
        }
        catch(Exception e){
            System.out.println("Nhap khong dung dinh dang");
            return this.inputNumber();
        }
        return a;
    }

}
