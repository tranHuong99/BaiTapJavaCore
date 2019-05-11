
package th3_ktlt;

import java.util.Scanner;

public class Bai2 {
    public static boolean isNT(int n){
        if(n<=1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static int sumNT(int n){
        int sum=0;
        for(int i=2; i<n; i++){
            if(isNT(i))
                sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int num = sc.nextInt();
        if(num <=1)
            System.out.println("Không có SNT nào nhỏ hơn num");
        else{
            System.out.println("Các số NT nhỏ hơn num là: ");
            for(int i=2;i<num;i++){
                if(isNT(i))
                    System.out.printf("%d\n", i);
            }
            System.out.println("Sum = " +sumNT(num));
        }
    }
}
