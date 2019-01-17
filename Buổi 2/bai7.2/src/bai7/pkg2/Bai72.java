/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7.pkg2;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập vào n=");
        int n = sr.nextInt();
        int kq = 0;
        for (int i = 0; i < n; i++) {
            kq = Fibonaci(i);
            System.out.print(kq + "\t");
    }
    }
        public static int Fibonaci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return Fibonaci(n - 1) + Fibonaci(n - 2);
        }
    }
    
}
