package th6_ktlt;

import java.util.Scanner;

public class TH6_KTLT {
    //Kiểm tra số nguyên tố
    //Cách 1
    public static boolean soNT(int x){
        if(x<=1) return false;
        if(x==2) return true;
        for(int i=2;i<=Math.sqrt(x);i++)
            if(soNT(i)&& (x%i==0))
                return false;
        return true;
    }
    //Cách 2
    public static boolean is_NT(int so,int i) {
        if(so<=1 || i<=1) return false;
        if (i == so) return true;
	if (so % i == 0) return false;
	return is_NT(so, i + 1);
    }
    //In ra số NT nhỏ hơn x
    public static void print_NT(int x){
        if(x<2) return;
        if(is_NT(x,2))
            System.out.printf("%d ", x);
        print_NT(x-1);
    }
    public static int sum_NT(int x){
        if(x<2) return 0;
        if(is_NT(x,2)) return (x+sum_NT(x-1));
        else return sum_NT(x-1);     
    }
    /*public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập x = ");
        int x = sc.nextInt();
        System.out.println("1. Kiểm tra x có là SNT hay không?");
        System.out.println("2. In ra các SNT nhỏ hơn x");
        System.out.println("3. Tính tổng các SNT nhỏ hơn x");
        System.out.print("Mời bạn chọn: ");
        int choose = sc.nextInt();
        int i=2;
        do{
            switch(choose){
                case 1: 
                    if(is_NT(x, i))
                        System.out.println(x +"là SNT");
                    else
                        System.out.println(x +"không là SNT");
                    break;
                case 2: print_NT(x); break;
                case 3: System.out.println(sum_NT(x)); break;
                default: System.out.println("Không có yêu cầu được chọn!");
            }
        }while(choose!=4);
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. Kiểm tra số nguyên tố
        System.out.print("Nhập x = ");
        int x = sc.nextInt();
        //Cách 1
        if(soNT(x))
            System.out.println(x +" là số NT");
        else
            System.out.println(x +" không là số NT");
        //Cách 2
        int i=2;
        if(is_NT(x, i))
            System.out.println(x +" là số NT");
        else
            System.out.println(x+ " không là số NT");
        //2. In ra các số NT nhỏ hơn x
        System.out.print("Các số nguyên tố nhỏ hơn " +x +" là: ");
        print_NT(x);
        System.out.println();
        //3. Tổng các số NT nhỏ hơn x
        System.out.println("Sum = "+sum_NT(x));
    }
    
}
