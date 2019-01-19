/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8.pkg2;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai82 {

    /**
     * @param args the command line arguments
     */
    public static int giai_thua(int n)
    {
        if(n==0)
            return 1;
        else
            return n*giai_thua(n-1);
    }
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập vào n=");
        int n = nhap.nextInt();
        System.out.println("Nhập vào x=");
        int x= nhap.nextInt();
         float sinx=0;
         float temp=0;
         //float gt=1;
         //temp=( x -(float)Math.pow((-1), n)*(float) ((Math.pow(x, 2*n+1))/(giai_thua(2*n+1))));
        // System.out.println("kq:"+temp);
        for(int i=1;i<=n;i++)
        {
            sinx=sinx+ (float)Math.pow((-1), i)*(float) ((Math.pow(x, 2*i+1))/(giai_thua(2*i+1)));
            
        }
        temp=x+sinx;
        System.out.println((double) Math.ceil(temp * 10000) / 10000);
    }
    
}
