/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dagiac;

/**
 *
 * @author HUONG XINH GAI
 */
public abstract class daGiac {
    public int chieuDai;
    public int chieuRong;
    public int chieuCao;
    public daGiac(){
        
    }
    public daGiac(int chieuDai, int chieuRong, int chieuCao) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }
    public int getChieuDai() {
        return chieuDai;
    }
    public int getChieuRong() {
        return chieuRong;
    }
    public int getChieuCao() {
        return chieuCao;
    }
    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }
    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }
    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }    
    public abstract int chuVi();
    public abstract double dienTich();
}
