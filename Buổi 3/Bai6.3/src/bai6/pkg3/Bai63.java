/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6.pkg3;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [][] arrA = new int[3][3];
        int i,j;
        int Tong1=0,Tong2=0,Tong3=0,Tong4=0,Tong5=0,Tong6=0; 
        System.out.println("Nhập các ký tự của ma trận");
        for ( i =0 ; i<3;i++)
        {
            for ( j =0 ;j <3 ;j++)
            {     
                System.out.print("arrA["+i+"]["+j+"] :");
                arrA[i][j]= s.nextInt();
            }

        }
        System.out.println("MẢng trên là");
        for (i =0 ; i<3;i++)
        {
            for ( j =0 ;j <3 ;j++)
            { 
                System.out.print(arrA[i][j]+ " ");
            }
            System.out.println("");

        }
        System.out.println("Tổng các Cột:");
         
                       
                for( j=0;j<3;j++)
                    {
                    Tong1=Tong1+arrA[j][0];
                    Tong2=Tong2+arrA[j][1];
                    Tong3=Tong3+arrA[j][2];
                    }
            
                System.out.println("\n Cot thu 1 co tong la:" + Tong1); 
                System.out.println("\n Cot thu 2 co tong la:" + Tong2);
                System.out.println("\n Cot thu 3 co tong la:" + Tong3);
        System.out.println("Tổng các dòng");       
                for( i=0;i<3;i++)
                    {
                    Tong4=Tong4+arrA[0][i];
                    Tong5=Tong5+arrA[1][i];
                    Tong6=Tong6+arrA[2][i];
                    }
            
                System.out.println("\n Dòng thu 1 co tong la:" + Tong4); 
                System.out.println("\n Dòng thu 2 co tong la:" + Tong5);
                System.out.println("\n Dòng thu 3 co tong la:" + Tong6);
   }
} 


    

