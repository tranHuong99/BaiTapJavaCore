/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi13;

/**
 *
 * @author HUONG XINH GAI
 */
public class calculator {
    public double div(double a, double b) throws Exception{
        if(b==0) throw new ArithmeticException("Phép chia cho 0 không tồn tại");
        return a/b;
    }
    
}
