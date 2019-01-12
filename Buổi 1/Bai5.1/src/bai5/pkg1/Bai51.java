/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.pkg1;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap a > ");
        a = sc.nextInt();
        System.out.println("Ket qua");
          if ( a == 0 )
        {
            System.out.println("Đây không phải số chẵn và cũng không phải số lẻ");
        }
        else if ( a % 2 == 0)
        {
            System.out.println("Đây là số chẵn");
        }
        else 
        {
            System.out.println("Đây là số lẻ");
        }
       
    }
    
}
