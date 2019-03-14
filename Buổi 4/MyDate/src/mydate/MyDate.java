/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydate;

import java.util.Scanner;

public class MyDate {

    private int day;
    private int month;
    private int year;
    Scanner sc = new Scanner(System.in);

    public MyDate() {

    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void imput() {
        System.out.println("Nhập thông tin");
        System.out.println("Nhập ngày");
        day = sc.nextInt();
        if (day > 31 || day <= 0) {
            System.out.println("Ngày không hợp lệ yêu càu nhập lại");
        }
        System.out.println("Nhập tháng");
        month = sc.nextInt();
        if (month > 12 && month <= 0) {
            System.out.println("Nhập tháng không hợp lệ yêu càu nhập lại");
        }
        System.out.println("Nhập năm");
        year = sc.nextInt();
        if (year <= 0) {
            System.out.println("Nhập năm không hợp lệ yêu càu nhập lại");
        }
    }

    public void output() {
        System.out.println("Ngày bạn nhập là");
        System.out.println("Ngày ngắn : " + day + "/" + month + "/" + year);
        System.out.println("Ngày dài : Ngày " + day + " Tháng " + month + " Năm " + year);

    }

    public void Cong() {
        System.out.println("Nhập số muốn cộng :");
        int a;
        a = sc.nextInt();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            switch (month) {
                case 2:
                    day = day + a;
                    if (day > 29) {
                        month++;
                        day = day - 29;
                    }   break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 10:
                    day = day + a;
                    if (day > 31) {
                        month++;
                        day = day - 31;
                    }   break;
                case 12:
                    day = day + a;
                    if (day > 31) {
                        year++;
                        month ++;
                        month = month -12;
                        day = day - 31;
                    }   break;
                   
                default:
                    day = day + a;
                    if (day > 30) {
                        month++;
                        day = day - 30;
                        
                    }       break;
            }
    }
    else {
            switch (month) {
                case 2:
                    day = day + a;
                    if (day > 28) {
                        month++;
                        day = day - 28;
                    }   break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 10:
                    day = day + a;
                    if (day > 31) {
                        month++;
                        day = day - 31;
                    }   break;
                case 12:                   
                    day = day + a;
                    if (day > 31) {
                        year++;
                        month ++;
                        month = month -12;
                        day = day - 31;
                    }   break;
                default:
                    day = day + a;
                    if (day > 30) {
                        month++;
                        day = day - 30;
                        
                    }       break;
            }
    }
           
    System.out.println ("Ngày mới là");
    System.out.println ("Ngày "+day+" Tháng "+month+" Năm "+year);
    }
    
    public static void main(String[] args) {
        MyDate md = new MyDate();
        md.imput();
        md.output();
        md.Cong();
    }
    
}
// so snahs ngày tháng năm
// in ra xem năm đó là năm gì ( âm lịch)
// xem thứ
