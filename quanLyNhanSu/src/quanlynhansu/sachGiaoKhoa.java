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
public class sachGiaoKhoa extends sach{
    protected String loaiSach;

    public sachGiaoKhoa() {
    }

    public sachGiaoKhoa(String loaiSach, String tenSach, int soLuong, int giaTien) {
        super(tenSach, soLuong, giaTien);
        this.loaiSach = loaiSach;
    }

    public String getLoaiSach() {
        return loaiSach;
    }

    public void setLoaiSach(String loaiSach) {
        this.loaiSach = loaiSach;
    }
    @Override
    public void nhapSach(){
        Scanner sc = new Scanner(System.in);
        super.nhapSach();
        System.out.print("Nhap loai sach:");
        this.loaiSach = sc.nextLine();
    }
    public double soTien(){
        double tien = 0;
        if(getLoaiSach().equals("moi"))
            tien = soLuong*giaTien;
        if(getLoaiSach().equals("cu"))
            tien = soLuong*giaTien*0.5;
        return tien;
    }
    
}
