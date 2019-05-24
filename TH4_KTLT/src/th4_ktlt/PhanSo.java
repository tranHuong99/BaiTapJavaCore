/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th4_ktlt;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class PhanSo {
    private int num;
    private int denom;
    public PhanSo() {
    }
    public PhanSo(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }
    public int getNum() {
        return num;
    }
    public int getDenom() {
        return denom;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public void setDenom(int denom) {
        this.denom = denom;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        this.num = sc.nextInt();
        System.out.print("Nhập mẫu số: ");
        this.denom = sc.nextInt();       
    }
    public void show(){
        System.out.println(+num +"/" +denom);        
    }
    public PhanSo Tong(PhanSo a){
        PhanSo c = new PhanSo();
        c.num = this.num*a.denom+this.denom*a.num;
        c.denom = this.denom*a.denom;
        return c;
    }
    public PhanSo Hieu(PhanSo a){
        PhanSo c = new PhanSo();
        c.num = this.num*a.denom-this.denom*a.num;
        c.denom = this.denom*a.denom;
        return c;
    }
    public PhanSo Tich(PhanSo a){
        PhanSo c = new PhanSo();
        c.num = this.num*a.num;
        c.denom = this.denom*a.denom;
        return c;
    }
    public PhanSo Thuong(PhanSo a){
        PhanSo c = new PhanSo();
        c.num = this.num*a.denom;
        c.denom = this.denom*a.num;
        return c;
    }
}
