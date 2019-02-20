/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.pkg3;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        int[] arrA = new int[5];
        int i;
        System.out.println("Nhập các phần tử của mảng");
        for ( i = 0; i < arrA.length; i++)
        {
            arrA[i] = sc.nextInt();
            
        }
        System.out.println("Mảng trên là ");
        for ( i = 0; i < arrA.length; i++)
        {
              System.out.print("\t" + arrA[i]);
        }
        int min=arrA[0], max=arrA[0];
        for ( i = 0; i < arrA.length; i++)
        {
            if ( max < arrA[i])
            {
                max = arrA[i];
            }
            else if ( min > arrA[i])
            {
                min = arrA[i];
            }
        }
        System.out.println("");
        System.out.println("Max là "+ max);
        System.out.println("Min là "+ min);
        System.out.println("Các phần tử chia hết cho 3 là : ");
        for ( i = 0; i < arrA.length; i ++)
        {
            if ( arrA[i] % 3 ==0 )
            {
                System.out.println("\t" +arrA[i]);
            }
        }
        
    }
    
}
