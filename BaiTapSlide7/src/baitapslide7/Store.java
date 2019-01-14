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
    public void printInfo(){
    	for(int i=0;i<products.length;i++){
        	products[i].printInfo();
        }
    }
    public Product addProduct(){
        System.out.println("Bạn muốn tìm sản phẩm nào? (Smartphone/Camera): (1/0)");
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
}

