/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9.pkg2;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai92 {
    public static int giai_thua(int n)
    {
        if(n==0)
            return 1;
        else
            return n*giai_thua(n-1);
    }
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap n=");
        int n = nhap.nextInt();
        System.out.println("Nhập x=");
        int x= nhap.nextInt();
        float cosx=0;
        float temp=0;
        for (int i = 1; i <= n; i++) {
            cosx=cosx+ (float) Math.pow((-1), i)*(float) (Math.pow(x, 2*i)/(giai_thua(2*i)));
        }
        temp=1+cosx;
        System.out.println("kết quả:"+(float) Math.round(temp*10000)/10000);
    }
}
