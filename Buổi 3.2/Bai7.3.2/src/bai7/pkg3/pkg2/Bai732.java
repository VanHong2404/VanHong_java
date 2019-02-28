/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7.pkg3.pkg2;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai732 {

    private int[][] matrix1;
    private int[][] matrix2;
    private int[][] matrix3;

    Scanner sc = new Scanner(System.in);

    public void nhap() {
        matrix1 = new int[3][3];
        matrix2 = new int[3][3];
        System.out.println("Nhập matrix1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\tmatrix1[%d][%d] = ", i, j);
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Nhập matrix2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\tmatrix2[%d][%d] = ", i, j);
                matrix2[i][j] = sc.nextInt();
            }
        }
    }
    public void In() {
        System.out.println("matrix1 : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\t%d", matrix1[i][j]);
            }
            System.out.println("");
        }
        System.out.println("==============");
        System.out.println("matrix2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\t%d", matrix2[i][j]);
            }
            System.out.println("");
        }
    }

    public void Tong() {
        matrix3 = new int[3][3];
        System.out.println("==============");
        System.out.println("tổng của 2 ma trận là : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.printf("\t%d", matrix3[i][j]);
            }
            System.out.println("");
        }
    }

    public void Tich() {
        matrix3 = new int[3][3];
       
        System.out.println("tích của 2 ma trận là : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix3[i][j] = matrix1[i][j] * matrix2[i][j];
                System.out.printf("\t%d", matrix3[i][j]);
            }
            System.out.println("");
        }
    }

    public double determinant(int[] a) {
        return a[0] * a[3] - a[1] * a[2];
    }

    public void DinhThuc() {
        
        System.out.println("Định thức của matrix1 là :");
        double total = 0;
        int n = 1;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                int[] a = new int[4];
                int location = -1;
                for (int k = 0; k < matrix1.length; k++) {
                    for (int l = 0; l < matrix1.length; l++) {
                        if (k != i && l != j) {
                            a[++location] = matrix1[k][l];
                        }
                    }
                }
                total = total + Math.pow(-1, 1 + n) * (double) matrix1[i][j] * determinant(a);
                n++;
            }
        }
        System.out.println("============");
        System.out.println(total);
    }
    public static void main(String[] args) {
        Bai732 b = new Bai732();
        b.nhap();
        b.In();
        b.Tong();
        b.Tich();
       b.DinhThuc();
    }
    
}
