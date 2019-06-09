/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th5_ktlt;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public abstract class Employees extends Person{
    protected String position;
    protected String room;
    public Employees() {
    }
    public Employees(String position, String room, String name, String date, String sex, double cf_salary, int simple_salary) {
        super(name, date, sex, cf_salary, simple_salary);
        this.position = position;
        this.room = room;
    }
    public String getPosition() {
        return position;
    }
    public String getRoom() {
        return room;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    public abstract void input();
    public abstract void show();
    @Override
    public abstract double salary();
}
