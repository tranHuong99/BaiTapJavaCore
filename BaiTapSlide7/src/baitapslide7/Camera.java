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
public class Camera extends Product {
    private boolean hasWifi;
    public boolean getHasWifi(){
        return true;
    }
    public void setHasWifi(boolean hasWifi){
        this.hasWifi = hasWifi;
    }
    public Camera(){
        super();
    }
    public Camera(int id, String name, double price, int quantify, boolean hasWf){
        super(id, name, price, quantify);
        hasWifi = hasWf;
    }
    @Override
    public void addNew(){
        super.addNew();
        Scanner sv = new Scanner(System.in);
        System.out.println("Kiểm tra hasWifi:(1/0)");
        int choice = sv.nextInt();
        this.hasWifi = choice == 1?true:false;
    }
}
