
package demo;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connStr = "jdbc:mysql://localhost:3306/QLYTHUVIEN";
            Connection conn = DriverManager.getConnection(connStr, "root", "Ftu.9907@");
            if(conn != null){
                System.out.println("Ket noi thanh cong!");
                //Sau khi kết nối thành công
                Statement stmt = conn.createStatement();
                //Insert dữ liệu
                Book b = new Book(1, "Dao duc", "Khong biet", "NXB Giao duc", 22);
                String insertQuery = "INSERT INTO SACH(masach, ten, tacgia, nxb, soluong)" 
                        + "VALUES(?,?,?,?,?)";
                PreparedStatement pstmt= conn.prepareStatement(connStr);
                pstmt.setString(1, b.getCode());
                ResultSet rs = stmt.executeQuery("SELECT * FROM SACH");
                while(rs.next()){
                    System.out.println(rs.getString("ten"));
                }
            }
            else
                System.out.println("Ket noi that bai!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
