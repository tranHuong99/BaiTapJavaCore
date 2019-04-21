/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi17;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class Buoi17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ArrayList<String> list  = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("Huong");
        //List list = new ArrayList<>(); ==>làm chương trình chậm hơn, truyền cái gì vào cũng dc
        System.out.println(list.size());
        System.out.println(list.get(0));
        list.add("Hello");
        list.add("Book");
        list.add("Student");
        
        list.remove(0);
        list.remove("Hello");
        
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //list.clear(); //xóa bỏ toàn bộ cac phần tử trong list
        List<Student> std = new ArrayList<>();
        
    }