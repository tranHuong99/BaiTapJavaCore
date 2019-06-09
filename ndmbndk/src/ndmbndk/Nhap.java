/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ndmbndk;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Nhap {
    public void nhap(int a[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("Nhập phần tử thứ a["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }
}
