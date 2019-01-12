/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosanhhaiso;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Sosanhhaiso {

 
    public static void main(String[] args) {
       float a,b;
       Scanner sc = new Scanner ( System.in);
        System.out.println("Nhap a > ");
        a = sc.nextFloat();
        System.out.println("Nhap b > ");
        b = sc.nextFloat();
        System.out.println("Ket qua");
        if ( a > b)
                {
                    System.out.println(" a > b");
                }
         else
                {
                    if ( a < b)
                    {
                        System.out.println(" a < b");
                    }
                    else 
                    {
                        System.out.println(" a= b");
                    }
                 
                 }
        float x ;
          
          x = (float) a + b;
          b = (float) x - b ;
          a = ( float) x - b;
          System.out.println(" b =  " +b );
          System.out.println(" a = " +a);
          
    }

    
    
}
