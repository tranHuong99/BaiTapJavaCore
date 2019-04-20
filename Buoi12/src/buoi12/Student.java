/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi12;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Student extends Person{
    private String email;
    public Student() {
    }
    public Student(String email, String id, String name) {
        super(id, name);
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Email: ");
        this.email = sc.nextLine();
    }
    @Override
    public String toString(){
        return "Student{Id = " +this.getId() +"name: " + this.getName() +"email: " +this.getEmail();
    }
    
}
