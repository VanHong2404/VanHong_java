/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.pkg2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        a=nhap("Nhập giá trị của a = ");
        b=nhap("Nhập giá trị của b = ");
        c=nhap("Nhập giá trị của c = ");
        Giaipt(a,b,c);
    }
    public static int nhap(String str)   {      //Nhap 1 só, bên trong là cho phép đoạn mở
        int x;
        Scanner sc = new Scanner ( System.in);
        System.out.println(str);       // nếu nhap k có bên trong thì k cần. 
        x = sc.nextInt();
        return x;   // trả về giá trị x
    
    }
    public static void Giaipt(int a, int b, int c)
    {
        if ( a == 0)
        {
            if ( b==0)
            {
                if (c == 0)
                {
                    System.out.println("Phương trình vô số nghiệm");
                }
                else 
                {
                    System.out.println("Phuong trinh vô nghiệm");
                }
            }
            else 
            {
                float  x;
                x = (float)-c/b;
                System.out.println("Phương trình có nghiệm là x = " + x);
            }
        }
        else
        {
            double x1,x2;
            double denta=sqrt ((b*b -4*a*c));
            if ( denta <0)
            {
                System.out.println("Phương trình vô nghiệm");
                
            }
            else if ( denta >0 )
            {
                System.out.println("Phương trình có hai nghiệm");
                x1 = ( -b + sqrt(denta))/(2*a);
                 x2 = ( -b - sqrt(denta))/(2*a);
                 System.out.println("Nghiệm thứ nhất là x1 = "+ x1);
                System.out.println("Nghiệm thứ nhất là x2 = "+ x2); 
            }
            else 
            {
                System.out.println("Phương trình có nghiệm kép x1=x2 = " + (-b/(2*a)));
            }
        }
    }
    
}
    
