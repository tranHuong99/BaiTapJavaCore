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
public class sach {
    protected String tenSach;
    protected int soLuong;
    protected int giaTien;

    public sach() {
    }

    public sach(String tenSach, int soLuong, int giaTien) {
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
    }

    public String getTenSach() {
        return tenSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }
    public void nhapSach(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sach:");
        this.tenSach = sc.nextLine();
        System.out.print("Nhap so luong:");
        this.soLuong = sc.nextInt();
        System.out.print("Nhap gia tien:");
        this.giaTien = sc.nextInt();
    }
}
