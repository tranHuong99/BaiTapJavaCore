/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th3_ktlt;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Bai3 {
    private int[] A;
    private int n;
    public void inputArr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần thử mảng n = ");
        n = sc.nextInt();
        A = new int[n];
        System.out.println("Nhập các phần tử mảng: ");
        for(int i=0;i<n;i++){
            System.out.printf("A[%d] = ", i);
            A[i] = sc.nextInt();
        }
    }
    public void printArr(){
        System.out.println("Mảng được in ra là: ");
        for(int i=0;i<n;i++){
            System.out.printf("%d ", A[i]);
        }
    }
    public int maxArr(){
        int max = A[0];
        for(int i=0;i<n;i++){
            if(max<A[i])
                max = A[i];
        }
        return max;
    }
    public int minArr(){
        int min = A[0];       
        for(int i=0;i<n;i++){
            if(min>A[i])
                min = A[i];
        }
        return min;
    }
    public void sortArr(){
        System.out.println("Mảng được sắp xếp tăng dần là:");
        int temp1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(A[i]>A[j]){
                    temp1 = A[i];
                    A[i] = A[j];
                    A[j] = temp1;
                }
            }
            System.out.printf("%d ", A[i]);
        }
        System.out.println();
        System.out.println("Mảng được sắp xếp giảm dần là:");
        int temp2;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(A[i]<A[j]){
                    temp2 = A[i];
                    A[i] = A[j];
                    A[j] = temp2;
                }
            }
            System.out.printf("%d ", A[i]);
        }
    }
    public int sumArr(){
        int sum=0;
        for(int i=0;i<n;i++){
            sum += A[i];
        }
        return sum;
    }
    public boolean testNT_Arr(int t){
        if(t<2)
            return false;
        for(int i=2;i<=Math.sqrt(t);i++){
            if(t%i==0)
                return false;
        }
        return true;
    }
    public int sumNT_Arr(){
        int sum=0;
        for(int i=0;i<n;i++){
            if(testNT_Arr(A[i]))
                sum += A[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bai3 B = new Bai3();
        B.inputArr();
        B.printArr();
        System.out.println("\nMax(A) = " +B.maxArr());
        System.out.println("Min(A) = " +B.minArr());
        B.sortArr();
        System.out.println();
        System.out.println("Sum(A) = " +B.sumArr());
        System.out.println("SumNT(A) = " +B.sumNT_Arr());
    }
}
