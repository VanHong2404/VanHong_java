/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.pkg1;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap so > ");
        x = sc.nextInt();
        System.out.println("Ket qua");
        int y;
        y = x*x;
        System.out.println(x +"^2 = "+y);
        
        
    }
    
}
