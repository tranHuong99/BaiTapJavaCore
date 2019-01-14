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
public class Product {
    public int id;
    public String name;
    public double price;
    public int quantify;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuantify(){
        return quantify;
    }
    public void setQuantify(int quantify){
        this.quantify = quantify;
    }
    public Product(){
    }
    public Product(int add, String ten, double cost, int amount){
        id = add;
        name = ten;
        price = cost;
        quantify = amount;
        
    }
    Scanner sc = new Scanner(System.in);
    public void addNew(){
        System.out.println("Nhập vào ID: ");
        id = sc.nextInt();
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhập giá: ");
        price = sc.nextDouble();
        System.out.println("Nhập số lượng: ");
        quantify = sc.nextInt();
    }
    public void printInfo(){
    	System.out.println("ID: " +id);
        System.out.println("Name: " +name);
        System.out.println("Price: " +price);
        System.out.println("Quantify: " +quantify);
    }
}
