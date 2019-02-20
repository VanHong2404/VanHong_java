/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3.pkg3;

import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author Hong Beo
 */
public class Bai33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arrA = new int[5];
        int i;        
        System.out.println("Nhập các phần tử của mảng");
        for (i = 0; i < arrA.length; i ++)       
        {
            arrA[i] = sc.nextInt();         
        }
        System.out.println("Mảng đã nhập là:");
        
        for ( int item : arrA) // fore tab để in thay cho lệnh for để in
        {
             System.out.println(item);
        }
        System.out.println("");
        System.out.println("Nhập vào giá trị của a: ");
        int a = sc.nextInt();
        boolean kiemTra = false;
        for (i=0; i < arrA.length ;i++)
        {
            if ( arrA[i] == a )
            {              
                kiemTra = true;
                break;
            }
        }
        if(kiemTra){
            System.out.println("Có trong mảng");
            System.out.println("Đứng ở vị trí thứ  "+ i);
        }else{
            System.out.println("Không có trong mảng");
        }
}
}
