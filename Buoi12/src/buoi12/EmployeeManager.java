/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi12;

/**
 *
 * @author HUONG XINH GAI
 */
public class EmployeeManager extends Manager{
    Employee em = new Employee();
    private Employee[] listEmployees;
    @Override
    public void add() {
        em.input();
    }
    @Override
    public void show() {
        System.out.println("Id: " +em.id);
        System.out.println("Name: " +em.name);
        System.out.println("Salary: " +em.salary);
    }
    @Override
    public void search(String name) {
        boolean found = false;
        for(int i=0;i<this.listEmployees.length;i++){
            Employee temp = this.listEmployees[i];
            if(temp==null)
                continue;
            if(temp.getName().equals(name)){
                System.out.println(temp);
                found = true;
            }
        }
        if(!found)
            System.out.println("Không tìm thấy!");
    }
    
}
