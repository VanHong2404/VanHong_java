/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4.pkg1;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a,b,c;
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap a >");
        a = sc.nextFloat();
        System.out.print("Nhap b >");
        b = sc.nextFloat();
        System.out.println("Ket qua");
        float temp = a;
        a = b;
        b = temp;
//        c =  a + b ;
//        a =  c - a ;
//        b =  c - a ;
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        
    }
    
}
