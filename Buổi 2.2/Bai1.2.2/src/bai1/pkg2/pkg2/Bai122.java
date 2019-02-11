/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.pkg2.pkg2;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai122 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập vào số cần đọc >");
        int n = sr.nextInt();
        
        int chuc = n / 10 % 10;
        int dv = n % 10;
        
        switch (chuc) {
            case 0:
                System.out.println("");
                break;
            case 1:
                System.out.println("mười");
                break;
            case 2:
                System.out.println("hai mươi");
                break;
            case 3:
                System.out.println("ba mươi");
                break;
            case 4:
                System.out.println("bốn mươi");
                break;
            case 5:
                System.out.println("năm mươi");
                break;
            case 6:
                System.out.println("sáu mươi");
                break;
            case 7:
                System.out.println("bảy mươi");
                break;
            case 8:
                System.out.println("tám mươi");
                break;
            case 9:
                System.out.println("chín mươi");
                break;
        }
        switch (dv) {
            case 1:
                System.out.println("một");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bốn");
                break;
            case 5:
                System.out.println("năm");
                break;
            case 6:
                System.out.println("sáu");
                break;
            case 7:
                System.out.println("bảy");
                break;
            case 8:
                System.out.println("tám");
                break;
            case 9:
                System.out.println("chín");
                break;

        }

    }
}
