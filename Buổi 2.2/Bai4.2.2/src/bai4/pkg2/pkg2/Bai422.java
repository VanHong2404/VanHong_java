/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4.pkg2.pkg2;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai422 {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao h>>");
        int h = sr.nextInt();
        System.out.println("Tam giác cân đặc: ");
         for (int i = 0; i < h; i++)
            {
                for (int j = 1; j <= h - i; j++)
                    System.out.print(" ");
                for (int j = 1; j <= 2 * i - 1; j++)
                    System.out.print("*");
                System.out.print("\n");
            } 
         System.out.println("");
         System.out.println("Tam giác cân rỗng:");
         int m = h, n = h;
   for (int i = 1; i <= h; i++)
   {
      for (int j = 1; j <= 2 * h - 1; j++)
      {
         if (j == m || j == n || i== h)
              System.out.print("*");
         else
              System.out.print(" ");
      }
      m--;
      n++;
       System.out.println("\n");
    }
    }

