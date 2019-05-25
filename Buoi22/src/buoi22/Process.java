/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi22;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author HUONG XINH GAI
 */
public class Process {
    public ResultSet ex2(String bookName, String date) throws Exception{
        //1. Ket noi db
        DBConnector dBConnector = new DBConnector();
        Connection conn = dBConnector.getConnect();
        String sql = "select d.ten from PHIEUMUON p "+
                "join SACH s on s.masach = p.masach "+
                "join DOCGIA d on d.sothe = p.sothe "+
                "where s.ten = ? and p.ngaymuon = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, bookName);
        pstmt.setString(2, date);
        return pstmt.executeQuery();
    }
    public ResultSet ex3(String date1, String date2) throws Exception{
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "select d.sothe, d.ten, s.ten from phieumuon p"+
                "join sach s on s.masach = p.masach"+
                "join docgia d on d.sothe = p.sothe"+
                "where p.ngaymuon between ? and ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, date1);
        ps.setString(2, date2);
        return ps.executeQuery();
    }
    public ResultSet ex4() throws Exception{
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "select s.* from sach s"+
                "where s.masach not in (select masach from phieumuon)";
        PreparedStatement ps = conn.prepareStatement(sql);
        return ps.executeQuery();
    }
    public ResultSet ex5(String name) throws Exception{
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "select count(*) as 'Soluong' from phieumuon p"+
                "join docgia d on d.sothe = p.sothe"+
                "where d.ten = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        return ps.executeQuery();
    }
    public ResultSet ex6() throws Exception{
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "select d.* from phieumuon p"+
                "join docgia d on d.sothe = p.sothe"+
                "where p.ngaytra is null";
        PreparedStatement ps = conn.prepareStatement(sql);
        return ps.executeQuery();
    }
}
