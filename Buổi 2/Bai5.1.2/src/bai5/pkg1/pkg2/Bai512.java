/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.pkg1.pkg2;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai512 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i,x;
        float S = 0;
        Scanner sc = new Scanner ( System.in);
        System.out.print("Nhập giá trị của n :  ");
        n = sc.nextInt() ;
        System.out.print("Nhập giá trị của x :  ");
        x = sc.nextInt() ;

        Giaiphuongtrinh1(n);
        Giaiphuongtrinh2(n);
        Giaiphuongtrinh3(n);
        Giaiphuongtrinh4(n);
        Giaiphuongtrinh5(n);
        Giaiphuongtrinh6(n);
        Giaiphuongtrinh7(n);
        Giaiphuongtrinh8(x,n);
        Giaiphuongtrinh9(x,n);
        Giaiphuongtrinh10(x,n);
        Giaiphuongtrinh11(n);
        
        
    }
    
    public static void Giaiphuongtrinh1(int x)
    {
        int i;
        float S = 0;
        for ( i =1; i <=x; i++ )
        {
            S += (float) 1/i ;
        }
        System.out.println("Tổng của dãy 1 + 1/n = " + S);
    }
    public static void Giaiphuongtrinh2(int x)
    {
        int i;
        float S = 0;
        for ( i =1; i <=x; i++ )
        {
            S += i ;
        }
        System.out.println("Tổng của dãy 1 + n = " + S);
    }
     public static void Giaiphuongtrinh3(int x)
    {
        int i;
        float S = 0;
        for ( i =1; i <=x; i++ )
        {
            S += (float) 1/(2*i);
        }
        System.out.println("Tổng của dãy  1/2n = " + S);
    }
      public static void Giaiphuongtrinh4(int x)
    {
        int i;
        float S =1;
        for ( i =1; i <=x; i++ )
        {
            S += (float) 1/(2*i +1);
        }
        System.out.println("Tổng của dãy 1+ 1/(2n+1) = " + S);
    }
       public static void Giaiphuongtrinh5(int x)
    {
        int i;
        float S =0;
        for ( i =1; i <=x; i++ )
        {
            S += (float) 1/(i*(i+1));
        }
        System.out.println("Tổng của dãy 1/n*(n+1) = " + S);
    }
        public static void Giaiphuongtrinh6(int x)
    {
        int i;
        float S =0;
        for ( i =0; i <=x; i++ )
        {
            S += (float) (2*i +1)/(2*i+2);
        }
        System.out.println("Tổng của dãy (2n+1)/(2n+2) = " + S);
    }
        public static void Giaiphuongtrinh7(int x)
    {
        int i;
        float S =0;
        float tich = 1;
        for ( i =1; i <=x; i++ )
        {
            tich= tich*i;
            S += (float) tich ;
        }
        System.out.println("Tổng của dãy 1.2.3....n = " + S);
    }
         public static void Giaiphuongtrinh8(int x,int n)
    {
        int i;
        float S =0;
        float tich = 1;
        for ( i =1; i <=n; i++ )
        {
            S += (float)Math.pow(x, i);
        }
        System.out.println("Tổng của dãy x + ... + x^n = " + S);
    }
           public static void Giaiphuongtrinh9(int x,int n)
    {
        int i;
        float S =0;
        float tich = 1;
        for ( i =1; i <=n; i++ )
        {
            S += (float)Math.pow(x,2*i);
        }
        System.out.println("Tổng của dãy x^2 + ... + x^2n = " + S);
    }
         public static void Giaiphuongtrinh10(int x,int n)
    {
        int i;
        float S =0;
        float tich = 1;
        for ( i =0; i <=n; i++ )
        {
            S += (float)Math.pow(x,2*i +1);
        }
        System.out.println("Tổng của dãy x^2 + ... + x^(2n+1) = " + S);
    }
         public static void Giaiphuongtrinh11(int x)
    {
        int i;
        float S =0;
        float tong = 1 ;
        for ( i =1; i <=x; i++ )
        {
            tong= tong*i;
            S += (float) 1/tong;
        }
        System.out.println("Tổng của dãy 1/ (1+2+3+..+n) = " + S);
    }
}
