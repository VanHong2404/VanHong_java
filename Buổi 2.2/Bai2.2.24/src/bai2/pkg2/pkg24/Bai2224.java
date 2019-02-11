/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.pkg2.pkg24;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai2224 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập vào số cần đọc >");
        int n = sr.nextInt();
        int tram = n / 100;
        int chuc = n / 10 % 10;
        int dv = n % 10;
        switch (tram) {
            case 1:
                System.out.println("Một trăm");
                break;
            case 2:
                System.out.println("Hai trăm");
                break;
            case 3:
                System.out.println("Ba trăm");
                break;
            case 4:
                System.out.println("Bốn trăm");
                break;
            case 5:
                System.out.println("Năm trăm");
                break;
            case 6:
                System.out.println("Sáu trăm");
                break;
            case 7:
                System.out.println("Bảy trăm");
                break;
            case 8:
                System.out.println("Tám trăm");
                break;
            case 9:
                System.out.println("Chín trăm");
                break;
        }
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