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
public class Store extends Product{
    public static void main(String[] args){
  	Store s = new Store();
    s.start();
   }
    public Product[] products;
    Scanner sc = new Scanner(System.in);
    public void start(){
    	System.out.println("Nhap vao so luong san pham: ");
       	int n = sc.nextInt();
      	products = new Product[n];
      	for(int i=0;i<n;i++){
        	products[i] = addProduct();
        }
        System.out.println("Thong tin san pham: ");
    }
    @Override
    public void printInfo(){
    	for(int i=0;i<products.length;i++){
        	products[i].printInfo();
        }
    }
    public Product addProduct(){
        System.out.println("Bạn muốn nhập sản phẩm nào? (Smartphone/Camera): (1/0)");
        int choice = sc.nextInt();
        sc.nextLine();
        Product x = null;
        switch(choice){
            case 0: 
                x = new Camera();
                break;
            case 1:
                x = new SmartPhone();
                break;
        }
        x.addNew();
        return x;
    }
    void listProduct(){
        System.out.println("Nhập số lượng sản phẩm: ");
        int n = sc.nextInt();
        System.out.printf("%-5s%-20s%", "STT","Ten SP");
        for(int i=0;i<=n;i++){
            System.out.printf("%5d%20s", i++, products[i].getName()); 
        }
    }
    void search(String name){
	for(int i=0 ; i < products.length ;i++){
            if(products[i].getName().equals(name)){
                products[i].printInfo();
            }
        }
    }
}
