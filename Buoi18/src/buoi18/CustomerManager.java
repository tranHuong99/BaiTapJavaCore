/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class CustomerManager extends Customer{
    private Customer[] listCustomer;
    public boolean load() throws IOException{
        String path = "D:\\input.txt";
        File f = new File(path);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(f))
        );
        /*Cách khác: BufferedReader reader1 = new BufferedReader(
                new InputStreamReader(System.in)
        );*/
        String line = reader.readLine();
        do{
            System.out.println(line);
            line = reader.readLine();
        }
        while(line!=null);
        return true;
    }
    @Override
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id: ");
        this.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập name: ");
        this.setName(sc.nextLine());
        System.out.print("Nhập address: ");
        this.setAddress(sc.nextLine());
        System.out.print("Nhập age: ");
        this.setAge(sc.nextInt());
    }
    @Override
    public Customer search(int id){
        boolean found = false;
        for(int i=0;i<this.listCustomer.length;i++){
            Customer temp = this.listCustomer[i];
            if(temp==null)
                continue;
            if(temp.getName().equals(id)){
                System.out.println(temp);
                found = true;
            }
        }
        if(!found)
            System.out.println("Không tìm thấy!");
        return null;
    }
   
}
