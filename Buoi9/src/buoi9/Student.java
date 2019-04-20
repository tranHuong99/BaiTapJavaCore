/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi9;

/**
 *
 * @author HUONG XINH GAI
 */
public class Student {
    protected String name;
    protected String email;
    protected int age;
    public Student() {
    }
    public Student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
