/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chanle;

import java.util.Scanner;

public class Chanle {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap so a = ");
        int a;
        a=sc.nextInt();
//        if ( a == 0 )
//        {
//            System.out.println("Đây không phải số chẵn và cũng không phải số lẻ");
//        }
//        else if ( a % 2 == 0)
//        {
//            System.out.println("Đây là số chẵn");
//        }
//        else 
//        {
//            System.out.println("Đây là số lẻ");
//        }
        
        System.out.println(a %2==0?"a chan":"a le");
    }
    
}
