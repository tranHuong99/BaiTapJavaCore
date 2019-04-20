/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi8;

/**
 *
 * @author HUONG XINH GAI
 */
public class Main {
    public static void main(String[] args){
        Person p = new Person("HUONG", 20);
        System.out.println(p);
        Student s = new Student();
        s.setName("LUC ");
        s.setAge(21);
        s.getStudentId();
    }
}
