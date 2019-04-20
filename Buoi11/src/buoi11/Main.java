/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi11;

/**
 *
 * @author HUONG XINH GAI
 */
public class Main {
    public static void main(String[] args){
        CalculateImpl cal = new CalculateImpl();
        //Calculate cal = new CalculateImpl();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum = cal.sum(arr);
        System.out.println("Sum = " + sum);
    }
}
