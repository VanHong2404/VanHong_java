/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6.pkg3.pkg2;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai632 {

    private int col;
    private int row;
    private int[][] matrix1;
    private int[][] matrix2;
    Scanner sc = new Scanner(System.in);

    public Bai632() {
    }

    public void nhap() {
        matrix1 = new int[3][3];
        System.out.println("Nhập matrix1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\tmatrix1[%d][%d] = ", i, j);
                matrix1[i][j] = sc.nextInt();
            }
        }
    }

    public void in() {
        System.out.println("matrix1 : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\t" + matrix1[i][j]);
            }
            System.out.println("");
        }
    }

    public void TongHang() {
        System.out.println("=================");
        System.out.println("Tổng mỗi hàng của ma trận");

        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += matrix1[i][j];
            }
            System.out.println(total);
        }
    }

    public void TongCot() {
        System.out.println("=================");
        System.out.println("Tổng mỗi cột của ma trận");

        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += matrix1[j][i];
            }
            System.out.printf("\t%d", total);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Bai632 b = new Bai632();
        b.nhap();
        b.in();
        b.TongHang();
        b.TongCot();
    }
}

