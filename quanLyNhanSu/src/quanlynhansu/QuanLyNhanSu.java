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
public class QuanLyNhanSu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sachGiaoKhoa sgk = new sachGiaoKhoa();
        sachThamKhao stk = new sachThamKhao();
        int chon=0;
        do{
            System.out.println("Chon 1. Nhap va hien thi so tien don Sach giao khoa");
            System.out.println("Chon 2. Nhap va hien thi so tien don Sach tham khao");
            System.out.println("Chon 3. Ket thuc");
            System.out.print("Moi ban chon: ");
            chon = sc.nextInt();
            switch(chon){
                case 1: sgk.nhapSach(); System.out.println("So tien = " +sgk.soTien()); break;
                case 2: stk.nhapSach(); System.out.println("So tien = " +stk.soTien()); break;
                case 3: System.exit(0);
            }
        }while(chon!=3);
    }
    
}
