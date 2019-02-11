/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.pkg2.pkg2;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai522 {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập vào cạnh n >>");
        int n = sr.nextInt();
        System.out.println("Nhập vào cạnh m >>");
        int m = sr.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("====================================================");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == m || j == 1 || j == n) {
                    System.out.print("*" + "\t");
                    if (j == n) {
                        System.out.print("\n");
                    }
                } else {
                    System.out.print(" " + "\t");
                }

            }
        }
    }
}