/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi18;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author HUONG XINH GAI
 */
public abstract class Customer implements Serializable{
    private int id;
    private String name;
    private String address;
    private int age;
    public Customer() {
    }
    public Customer(int id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "Customer{Name = " +this.getName() + "address = " +this.getAddress() + "age = " +this.getAge() +"}";
    }
    public abstract void add();
    public abstract boolean load() throws IOException;
    public abstract Customer search(int id);
    void load(File f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
