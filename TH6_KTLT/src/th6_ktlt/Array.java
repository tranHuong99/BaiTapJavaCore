/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th6_ktlt;

import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Array {
    public static void input_arr(int a[], int n, int i){
        Scanner sc = new Scanner(System.in);
        if(i==n) return;
        System.out.printf("Nhap phan tu a[%d]: ", i);
        a[i] = sc.nextInt();
        input_arr(a,n,i+1);
    }
    public static void print_arr(int a[], int n, int i){
        if(i==n) return;
        System.out.printf("%-5d", a[i]);
        print_arr(a,n,i+1);
    }
    public static int max_arr(int a[], int n){
        if(n==1) return a[0];
        return a[n-1] > max_arr(a, n-1) ? a[n-1] : max_arr(a, n-1);
    }
    public static int min_arr(int a[], int n){
        if(n==1) return a[0];
        return a[n-1] < min_arr(a, n-1) ? a[n-1] : min_arr(a, n-1);
    }
    public static int sum_arr(int a[], int n){
        if(n==1) return a[0];
        return a[n-1]+sum_arr(a,n-1);
    }
    public static int cal_arr(int a[], int n){
        if(n==1) return a[0];
        return a[n-1]*cal_arr(a,n-1);
    }
    public static boolean check_NT(int n, int i){
        if(n<2) return false;
        if(n==i) return true;
        if(n%i==0) return false;
        return check_NT(n, i + 1);
    }
    public static int count_NT(int a[], int n){
        if(n<1) return 0;
        if(check_NT(a[n-1],2)) return 1+count_NT(a, n - 1);
        return count_NT(a, n - 1);
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của dãy: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i=0;
        System.out.println("1. Nhập dãy số");
        System.out.println("2. In dãy số");
        System.out.println("3. Phần tử lớn nhất của dãy");
        System.out.println("4. Phần tử nhỏ nhất của dãy");
        System.out.println("5. Tổng cá phần tử của dãy");
        System.out.println("6. Tích các phần tử của dãy");
        System.out.println("7. Số lượng SNT trong dãy");
        System.out.print("Mời bạn chọn: ");
        int choose = sc.nextInt();
        while(choose!=7){
            switch(choose){
                case 1:
                    System.err.println("===>Nhập dãy số: ");
                    input_arr(a, n, i);
                    break;
                case 2:
                    System.out.println("===>Dãy số đã nhập là: ");
                    print_arr(a, n, i);
                    break;
                case 3: 
                    System.out.println("===>Max(a) = " +max_arr(a, n));
                    break;
                case 4:
                    System.out.println("===>Min(a) = " +min_arr(a, n));
                    break;
                case 5:
                    System.out.println("===>Sum(a) = " +sum_arr(a, n));
                    break;
                case 6:
                    System.out.println("===>Cal(a) = " +cal_arr(a, n));
                    break;
                case 7:
                    System.out.println("===> Số các SNT của dãy là: " +count_NT(a, n));
                    break;
                default: System.out.println("Lựa chọn không hợp lệ! Mời bạn chọn lại!");
            }
        }
    }
    public static void main(String[] args){
        menu();
    }
}
