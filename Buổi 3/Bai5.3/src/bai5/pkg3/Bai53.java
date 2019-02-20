/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.pkg3;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arrA = new int[3];
        int[] arrB = new int[3];
        int[] arrTong = new int[3];
        int[] arrTich = new int[3];
        int TVH =0;
        int i;
        System.out.println("Nhập vào giá trị của vecto A");
        for (i=0 ; i < arrA.length; i ++)
        {
            arrA[i] = sc.nextInt();
            
        }
       
        System.out.println("Nhập vào giá trị của vecto B");
        for (i =0 ; i < arrB.length; i ++)
        {
            arrB[i] = sc.nextInt();
        }
        System.out.println("Tổng của 2 vecto trên là");
        for (i =0 ; i < arrTong.length; i ++)
        {
            arrTong[i] = arrA[i] + arrB[i];
            System.out.println("" + arrTong[i]);
        }
        System.out.println("Tích của 2 vecto trên là");
         for (i =0 ; i < arrTong.length; i ++)
        {
            TVH += arrA[i] + arrB[i];
            
        }
         System.out.println("" + TVH);
      
        
    }
    
}
