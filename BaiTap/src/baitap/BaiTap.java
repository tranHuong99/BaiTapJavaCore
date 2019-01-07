
package baitap;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class BaiTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat(); //ax + b = 0
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        if(a==0)
        {
            if(b==0)
            {
                if(c==0)
                    System.out.printf("Moi x la nghiem");
                else
                    System.out.printf("Phuong trinh vo nghiem");
            }
            else
            {
                System.out.printf("Phuong trinh co 1 nghiem don\n");
                System.out.printf("x = %.5lf", -c/b);
            }
        }
        else
        {
            float delta;
            delta = b*b - 4*a*c;
            if(delta>0)
            {
                System.out.printf("Phuong trinh co 2 nghiem phan biet\n");
                System.out.printf("x1 = %.5lf\n", (-b-sqrt(delta))/(2*a));
                System.out.printf("x2 = %.5lf\n", (-b+sqrt(delta))/(2*a));
            }
            else if(delta==0)
            {
                System.out.printf("Phuong trinh co nghiem kep\n");
                System.out.printf("x1 = x2 = %.5lf", -b/(2*a));
            }
            else
                System.out.printf("Phuong trinh vo nghiem");
        }
    }
}
