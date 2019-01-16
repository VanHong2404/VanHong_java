/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4.pkg2;

import static java.lang.Double.min;
import static java.lang.Math.min;
import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, min = 1  , max= 0 , temp ;
        Scanner sc = new Scanner (System.in);
  
      do
        {
            a = sc.nextInt();
               temp = a;
            if ( max < temp)
            {
                max = a;
            }
            else if (min > temp) 
            {
                min = a;
            }
     
        }   while ( a !=0);
       
        System.out.println("Số lớn nhất" + max);
        System.out.println("Số bé nhất" + min);
   
}
}
