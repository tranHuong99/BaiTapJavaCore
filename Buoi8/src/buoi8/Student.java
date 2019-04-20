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
public class Student extends Person{
    //CHỈ KẾ THỪA ĐƯỢC CÁC THUỘC TÍNH
    // phương thức có mức độ truy cập là public hoặc protected
    //tất cả các lớp đều đc kế thừa từ lớp object
    private String studentId;
    public Student(){        
    }
    public Student(String stidentId){
        this.studentId = studentId;
    }
    public String getStudentId(){
        return studentId;
    }
    public void setStudentId(String name){
        this.studentId = studentId;
    }
    @Override
    public void print(){
        
    }
    @Override
    public String toString(){
        return this.studentId +"" +this.getName() +"" +this.getAge();
    }
}
