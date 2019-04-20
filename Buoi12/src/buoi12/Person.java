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
public class Person {
    private String id;
    private String name;
    public Person(){
    }
    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Id: ");
        this.id = sc.nextLine();
        System.out.println("Name: ");
        this.id = sc.nextLine();
    }
}
