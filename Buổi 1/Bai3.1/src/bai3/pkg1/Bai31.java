/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3.pkg1;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a,b;
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap a >");
        a = sc.nextFloat();
        System.out.print("Nhap b >");
        b = sc.nextFloat();
        System.out.println("Ket qua");
        if ( a > b)
        {
            System.out.println("a  > b");
        
        }
        else if (a < b)
        {
            System.out.println("a  <  b");
        }
        else 
        {
            System.out.println("a = b");
        }
    }
    
}
