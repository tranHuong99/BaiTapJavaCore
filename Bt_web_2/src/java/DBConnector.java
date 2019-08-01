
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HUONG XINH GAI
 */
public class DBConnector {
    public Connection getConnect() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connStr = "jdbc:mysql://localhost:3306/sinhvien";
        Connection conn = DriverManager.getConnection(connStr, "root", "Ftu.9907@");
        return conn;
    }
    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
