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
public class Employee extends Person{
    private double salary;

    public Employee(){
    }
    public Employee(double salary, String id, String name) {
        super(id, name);
        this.salary = salary;
    }
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Salary: ");
        this.salary = sc.nextDouble();
    }
    
}
