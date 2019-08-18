
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HUONG XINH GAI
 */
public class thongTinSinhVien {
    public List<SinhVien> getStudents() throws ClassNotFoundException, Exception{
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "SELECT * FROM qlythuvien.docgia";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<SinhVien> list = new ArrayList<>();
        while (rs.next()) {
            SinhVien s = new SinhVien();
            s.setId(rs.getInt("id"));
            s.setHoTen(rs.getString("hoten"));
            s.setKhoa(rs.getString("khoa"));
            s.setLop(rs.getString("lop"));
            list.add(s);
        }
        return list;
    }
    public List<SinhVien> getSinhVienbyId(int id) throws ClassNotFoundException, SQLException{
        DBConnector db = new DBConnector();
        Connection conn = db.getConnection();
        String sql = "SELECT * FROM sinhvien WHERE major = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        List<SinhVien> list = new ArrayList<>();
        while (rs.next()) {
            SinhVien s = new SinhVien();
            s.setId(rs.getInt("id"));
            s.setHoTen(rs.getString("hoten"));
            s.setKhoa(rs.getString("khoa"));
            s.setLop(rs.getString("lop"));
            list.add(s);
        }
        return list;
    }
    public int addSinhVien(SinhVien sv) throws Exception{
        //ket noi
        //thuc hien cau lenh insert
        DBConnector db = new DBConnector();
        Connection conn = db.getConnection();
        String sql = "INSERT INTO users(name, email, address) VALUES(?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, sv.getHoTen());
        pstmt.setString(2, sv.getKhoa());
        pstmt.setString(3, sv.getLop());
        return pstmt.executeUpdate();
    }
    public int updateSinhVien(SinhVien sv) throws Exception{
        DBConnector db = new DBConnector();
        Connection conn = db.getConnection();
        String sql = "UPDATE users SET name = ?, email = ?, address = ? WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, sv.getHoTen());
        pstmt.setString(2, sv.getKhoa());
        pstmt.setString(3, sv.getLop());
        pstmt.setInt(4, sv.getId());
        return pstmt.executeUpdate();
    }
    public int deleteSinhVien(int id) throws Exception{
        DBConnector db = new DBConnector();
        Connection conn = db.getConnection();
        String sql = "DELETE FROM users WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt.executeUpdate();
    }
    //tra ve id nguoi dung
    public SinhVien getById(int id) throws Exception {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnection();
        String sql = "SELECT * FROM users WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        SinhVien c = new SinhVien();
        while (rs.next()) {
            c.setId(rs.getInt(1));
            c.setHoTen(rs.getString(2));
            c.setKhoa(rs.getString(3));
            c.setLop(rs.getString(4));
        }
        return c;
    }
}
