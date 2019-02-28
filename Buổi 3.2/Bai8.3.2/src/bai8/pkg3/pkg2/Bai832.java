/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8.pkg3.pkg2;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai832 {

    private int [][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        matrix = new int[3][3];      
        System.out.println("Nhập matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\tmatrix1[%d][%d] = ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    public void In(){
        System.out.println("MA tran tren la");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\t%d", matrix[i][j]);              
            }
            System.out.println("");
        }
    }
     public void matrixDonVi() {
        System.out.println("====================");
        int checkOne = 0;
        int checkZero = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    if (matrix[i][j] != 1) {
                        checkOne++;
                        break;
                    }
                } else {
                    if (matrix[i][j] != 0) {
                        checkZero++;
                        break;
                    }
                }
            }
        }
        if (checkOne == 0 && checkZero == 0) {
            System.out.println("Ma trận vừa nhập LÀ ma trận đơn vị");
        } else {
            System.out.println("Ma trận vừa nhập KHÔNG phải ma trận đơn vị");
        }
    }
    public void matrixKhong(){
        int check=0;
        System.out.println("=====================");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 3; j++) {
                if(matrix[i][j]!=0){
                    check=1;
                    break;
                }
            }
        }
        if(check==0) System.out.println("matrix1 la ma trận không");
        else System.out.println("matrix1 không phải là ma trận không");
    }
    public void matrixDX(){
        System.out.println("==================");
        int check=0;
        int count=0;
        for (int i = 0; i < 2; i++) {
            for (int j = i+1; j < 3; j++) {
                if(matrix[i][j]!=matrix[j][i]){
                    check=1;
                    count++;
                }
            }
        }
        if(check==0){
            System.out.println("matrix1 là ma trận đối xứng");
        }
        else
            System.out.println("matrix1 không phải là ma trận đối xứng");
    }
    
    public static void main(String[] args) {
       Bai832 b = new Bai832();
       b.nhap();
       b.In();
       b.matrixDonVi();
       b.matrixDX();
       b.matrixKhong();
    }
    
}
