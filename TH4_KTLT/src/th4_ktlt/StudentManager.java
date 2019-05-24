/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th4_ktlt;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class StudentManager extends Student{
    private Student[] list = null;
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã SV:");
        this.id = sc.nextLine();
        System.out.print("Nhập tên SV: ");
        this.name = sc.nextLine();
        System.out.print("Nhập điểm TB: ");
        this.point = sc.nextDouble();
    }
    public void show(){
        System.out.println("Mã SV: "+id);
        System.out.println("Tên SV: "+name);
        System.out.println("Điểm TB: "+point);
    }
    public void search(String name){
        System.out.println("======KẾT QUẢ======");
        boolean check = false;
        for(int i=0;i<this.list.length;i++){
            if(this.list[i]==null)
                continue;
            if(this.list[i].getName().equals(name)){
                System.out.println("this.list[i]");
                check = true;
                break;
            }
        }
        if(!check)
            System.out.println("Không tìm thấy!");
    }
    public void Menu(){
        StudentManager stm = new StudentManager();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng sinh viên:");
        int n = sc.nextInt();
        System.out.println("=====MENU=====");
        System.out.println("1. Nhập DSSV");
        System.out.println("2. Hiển thị DSSV");
        System.out.println("3. TÌm kiếm SV theo tên");
        System.out.println("4. Sắp xếp DSSV theo chiều tăng dần");
        System.out.println("5. Thêm 1 SV vào DS");
        System.out.println("6. Loại bỏ SV có mã nhập vào từ bàn phím");
        System.out.print("Mời bạn chọn: ");
        int choose = sc.nextInt();
        do{
            switch(choose){
                case 1: {
                    for(int i=1;i<=n;i++){
                        System.out.println("Nhập vào sv thứ " +i);
                        stm.add();;
                    }
                    break;
                }
                case 2: {
                    for(int i=1;i<=n;i++){
                        System.out.println("Thông tin sv thứ " +i);
                        stm.show();
                    }
                    break;
                }
                case 3: {
                    System.out.println("Nhập tên sv cần tìm: ");
                    String nm = sc.nextLine();
                    sc.nextLine();
                }
                break;
            }
        }while(choose!=7);
    }
    public static void main(String[] args){
        StudentManager stm = new StudentManager();
        stm.Menu();
    }
}
