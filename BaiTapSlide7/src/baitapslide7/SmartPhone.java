/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapslide7;

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
    public int getSin(){
        return sim;
    }
    public void setSim(int sim){
        this.sim = sim;
    }
    public SmartPhone(){
        
    }
    public SmartPhone(int add, String ten, double cost, int amount, boolean hasCm, int s_i_m){
        super(add);
        super(ten);
        super(cost);
        super(amount);
        hasCamera = hasCm;
        sim = s_i_m;
    }
}
