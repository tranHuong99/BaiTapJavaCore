/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi20_student;

/**
 *
 * @author HUONG XINH GAI
 */
public abstract class Manager {
    protected Student[] list = null;
    protected int curr = 0;
    
    public abstract void add();
    public abstract void search(String name);
}
