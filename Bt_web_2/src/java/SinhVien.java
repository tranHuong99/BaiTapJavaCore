/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HUONG XINH GAI
 */
public class SinhVien {
    private int id;
    private String hoTen;
    private String khoa;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(int id, String hoTen, String khoa, String lop) {
        this.id = id;
        this.hoTen = hoTen;
        this.khoa = khoa;
        this.lop = lop;
    }

    public int getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getKhoa() {
        return khoa;
    }

    public String getLop() {
        return lop;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
}
