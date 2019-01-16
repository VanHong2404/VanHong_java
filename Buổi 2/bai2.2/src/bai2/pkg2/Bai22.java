
package bai2.pkg2;

import java.util.Scanner;

public class Bai22 {

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner ( System.in);
        System.out.print("Nhap a > ");
        a = sc.nextInt();
        System.out.println("Ket qua");
        
        if ( a <= 1 )
        {  System.out.println("Giai thua cua so do = 1" );
        }
        else 
        {
            long giaithua = 1 ;
            for ( int i =2; i<=a;i++)
            {
                
                giaithua *=i;
            }
            System.out.println(a+"! = "+ giaithua);
            
        }
        
    }
    
}
