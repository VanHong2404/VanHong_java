/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6.pkg2;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào a= ");
        int a = nhap.nextInt();
        System.out.print("Nhập vào b= ");
        int b = nhap.nextInt();
        System.out.println("Ước chung lớn nhất của"+" " + a + " " + "và" + " " + b + "là :" + UCLN(a, b));
        System.out.println("Bội số chung nhỏ nhất của"+" " + a + " " + "và" + " " + b + "là :" + BSCNN(a, b));
    }
   public static int UCLN(int a, int b) {
        if (a % b != 0) {
            return UCLN(b, a % b);
        } else {
            return b;
        }
    }

    public static int BSCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
}
