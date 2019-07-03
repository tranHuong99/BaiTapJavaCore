/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhansu;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class sachThamKhao extends sach{
    protected int thue;
    
    public sachThamKhao() {
    }

    public sachThamKhao(int thue, String tenSach, int soLuong, int giaTien) {
        super(tenSach, soLuong, giaTien);
        this.thue = thue;
    }

    public int getThue() {
        return thue;
    }

    public void setThue(int thue) {
        this.thue = thue;
    }
    @Override
    public void nhapSach(){
        Scanner sc = new Scanner(System.in);
        super.nhapSach();
        System.out.print("Nhap loai sach:");
        this.thue = sc.nextInt();
    }
    public double soTien(){
        double tien;
        tien = soLuong*giaTien +thue;
        return tien;
    }
}
