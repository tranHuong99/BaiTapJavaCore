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
public class SmartPhone extends Product{
    private boolean hasCamera;
    private int sim;
    public boolean getHasCamera(){
        return true;
    }
    public void setHasCamera(boolean hasCamera){
        this.hasCamera = hasCamera;
    }
    public int getSim(){
        return sim;
    }
    public void setSim(int sim){
        this.sim = sim;
    }
    public SmartPhone(){
        super();
    }
    public SmartPhone(int id, String name, double price, int quantify, boolean hasCm, int s_i_m){
        super(id, name, price, quantify);
        hasCamera = hasCm;
        sim = s_i_m;
    }
    @Override
    public void addNew(){
        super.addNew();
        Scanner sv = new Scanner(System.in);
        System.out.println("Kiểm tra hasCamera:(1/0)");
        int choice = sv.nextInt();
        this.hasCamera = choice == 1?true:false;
        System.out.println("Nhập số sim:");
        this.sim = sc.nextInt();
    }
}
