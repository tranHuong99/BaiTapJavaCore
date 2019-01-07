
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HUONG XINH GAI
 */
public class Bai5g {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float Tong = 0;
        for(int i=0;i<n;i++){
            Tong += (float)(2*i+1)/(2*i+2);
        }
        System.out.printf("Tổng = %.3f", (float)Tong);
    }
}
