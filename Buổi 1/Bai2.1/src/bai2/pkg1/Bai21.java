package bai2.pkg1;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai21 {
public static void main(String[] args) {
       float a,b,c;
        Scanner sc = new Scanner ( System.in);
        System.out.print("Nhap so a >");
        a = sc.nextFloat();
        System.out.print("Nhap so b >");
        b = sc.nextFloat();
        System.out.print("Nhap so c >");
        c = sc.nextFloat();
     if ( c==0)
     {
         if (a==0)
         {
             if (b==0)
             {
                 System.out.println("Phuong trinh vo so nghiem");
             }
             else 
             {
                 System.out.println("Phuong trinh vo nghiem");
             }
         }
         else
         {
           float x = (float) -b/a;
             System.out.println("Phuong trinh co nghiem duy nhat : " +x);
         }
     }
     else 
         if (a==0)
         {
             if (b!=c)
             {
                 System.out.println("Phuong trinh vo  nghiem");
                
             }
             else
             {
                 System.out.println("Phuong trinh vo so nghiem");
                 
             }
         }
         else 
         {
             float x = (float) (c-b)/a;
             System.out.println("Phuong trinh co nghiem duy nhat : " +x);
         }
        
        
    }
    
}
