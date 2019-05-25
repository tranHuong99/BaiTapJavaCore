/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connStr = "jdbc:mysql://localhost:3306/QLYTHUVIEN";
            Connection conn = DriverManager.getConnection(connStr, "root", "Ftu.9907@");
            if(conn!=null){
                System.out.println("Kết nối thành công!");
                Statement stmt = conn.createStatement();
                System.out.println("-----MENU-----");
                System.out.println("1. Hiển thị TÊN, KHOA của các độc giả và sắp xếp theo khoa");
                System.out.println("2. Tìm những độc giả mượn sách TOÁN vào ngày 1/1/2018");
                System.out.println("3. Hiển thị TÊN, SỐ THẺ, TÊN SÁCH của tất cả các đọc giả mượn sách trong tháng 1/2018");
                System.out.println("4. Danh sách các sách KHÔNG AI MƯỢN");
                System.out.println("5. Cho biết đọc giả tên ANH mượn sách bao nhiêu lần");
                System.out.println("6. Danh sách TÊN, SỐ THẺ các độc giả chưa trả sách");
                System.out.print("Mời bạn chọn: ");
                int choose = sc.nextInt();
                do{
                        switch(choose){
                        case 1:{
                            //select sothe, ten, khoa from DOCGIA order by khoa asc;2
                            ResultSet rs = stmt.executeQuery("SELECT sothe,ten,khoa FROM DOCGIA ORDER BY KHOA ASC");
                            while(rs.next()){
                                System.out.println(rs.getString("sothe") +"      "+ rs.getString("ten") +"--"+rs.getString("khoa"));
                            }     
                        }break;
                        case 2:{
                            try{
                                Process p = new Process();
                                System.out.print("Nhập tên sách: ");
                                String name = sc.nextLine();
                                sc.nextLine();
                                System.out.print("Nhập ngày mượn (dd/mm/yyyy): ");
                                String date = sc.nextLine();
                                ResultSet rs = p.ex2(name, date);
                                while(rs.next()){
                                    System.out.println(rs.getString(1));
                                }
                            }
                            catch(Exception e){
                                e.printStackTrace();
                            }    
                        }break;
                        case 3:{
                            try{
                                Process p = new Process();
                                System.out.print("Nhập ngày bắt đầu (dd/mm/yyyy): ");
                                String date1 = sc.nextLine();
                                sc.nextLine();
                                System.out.print("Nhập ngày kết thúc (dd/mm/yyyy): ");
                                String date2 = sc.nextLine();
                                ResultSet rs = p.ex3(date1, date2);
                                while(rs.next()){
                                    System.out.println(rs.getString(1));
                                }
                            }
                            catch(Exception e){
                                e.printStackTrace();
                            }
                        }break;
                        case 4:{
                            try{
                                Process p = new Process();
                                System.out.println("Danh sách các sách KHÔNG AI MƯỢN: ");
                                ResultSet rs = p.ex4();
                                while(rs.next()){
                                    System.out.println(rs.getString(1));
                                }
                            }catch(Exception e){
                                e.printStackTrace();
                            }
                        }break;
                        case 5:{
                            try{
                                Process p = new Process();
                                System.out.print("Nhập tên đọc giả cần tìm: ");
                                String name = sc.nextLine();
                                ResultSet rs = p.ex5(name);
                                while(rs.next()){
                                    System.out.println(rs.getString(1));
                                }
                            }catch(Exception e){
                                e.printStackTrace();
                            }
                        }break;
                        case 6:{
                            try{
                                Process p = new Process();
                                System.out.println("Danh sách TÊN, SỐ THẺ các độc giả chưa trả sách: ");
                                ResultSet rs = p.ex6();
                                while(rs.next()){
                                    System.out.println(rs.getString(1));
                                }
                            }catch(Exception e){
                                e.printStackTrace();
                            }
                        }break;
                    }
                }
                while(choose!=7);
            }
            else
                System.out.println("Kết nối thất bại!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
