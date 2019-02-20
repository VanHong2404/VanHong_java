/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.pkg3;

import java.util.Scanner;



/**
 *
 * @author Hong Beo
 */
public class Bai13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         int x,tong=0,tong1=0,tong2=0;
        int[] Mang = new int[5];
        for ( x=0; x<5;x++)
        {
            System.out.print("Phần tử thứ " + x + ": ");
            Mang[x]= sc.nextInt();
         
        }
         System.out.println("Dãy phần tử của mảng ");
        for ( x=0; x<5;x++)
        {
           
            System.out.print("\t"+ Mang[x]);
            
        }
        System.out.println("");
         for ( x=0; x<5;x++)
         {
             tong = tong + Mang[x];
         }
           for(x=0;x<5;x++)
           {
                if(Mang[x]%2==0)
            {
                tong1 = tong1 + Mang[x]; 
            }
            else {
                tong2 = tong2 + Mang[x];
            }
           }
        
        System.out.println("Tong cua day tren la : " + tong);
        System.out.println("Tong cua day chan tren la : " + tong1);
        System.out.println("Tong cua day le tren la : " + tong2);
        
        }
}
    

