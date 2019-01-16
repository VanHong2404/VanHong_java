/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3.pkg2;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int a;
      Scanner sc = new Scanner (System.in);
        System.out.print("Nhập a = ");
      a = sc.nextInt();
      if (a >0 )
      {
          if (KTnguyento(a)==true)
              System.out.println("Đây là số nguyên tố");
          else 
              System.out.println("Đây không la số nguyên tố");
      }
      int k,dem = 0,i =2;
        System.out.println( "In ra dãy nguyên tố ");
        System.out.print("Nhap k = ");
        k = sc.nextInt();
        while (dem <k)
        {
            if (KTnguyento(i))
            {System.out.print(i+" ");
            dem ++;
            }
            i ++;
        } 
    }
     
    public static boolean KTnguyento(int n) {
          if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int x = (int) Math.sqrt(n); // hàm tính căn
        for (int i = 2; i <= x; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
    
    


  
 
