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
public class CalculateImpl extends Calculate{

    @Override
    public double average(int[] arr){
        return (double)this.sum(arr)/(double)arr.length;
    }
    @Override
    public int sum(int[] arr){
        int s=0;
        for(int item: arr){
            s += item;
        }
        return s;
    }
}
