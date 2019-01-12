/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyento;

import java.util.Scanner;


public class Nguyento {

 
    public static void main(String[] args) {
       int a;
      Scanner sc = new Scanner (System.in);
        System.out.println("Nhập a = ");
      a = sc.nextInt();
      if (a >0 )
      {
          if (KTnguyento(a)==true)
              System.out.println("Đây là số nguyên tố");
          else 
              System.out.println("Đây không la số nguyên tố");
      }
      int k ;
        System.out.println( "In ra dãy nguyên tố ");
        System.out.println("Nhap k = ");
        k = sc.nextInt();
        System.out.println(In(k));
        
    }
     
    public static boolean KTnguyento(int n) {
          if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static String In(int n)
    {
        int i = 2, dem = 0;
              String str = "";
        
              if ((n == 0) || (n == 1)) {
                     return "";
              } else {
                     while (dem < n) {
                           if (KTnguyento(i)) {
                                  str = str + Integer.toString(i) + " ";
                                  dem += 1;
                            }
                           i++;
                     }
                     str = str.substring(0, str.length() - 1);
                     return str;
        
    }

    
}
}

  
 




        
