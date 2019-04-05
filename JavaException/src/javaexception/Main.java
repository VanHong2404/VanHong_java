/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexception;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Main {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        do {
            System.out.println("---MENU---");
            System.out.println("1. Nhap");
            System.out.println("2. Danh sach");
            System.out.println("3. Top 3");
            System.out.println("4. Thoat");
            System.out.print("Chon > ");
            int c = Integer.parseInt(input.nextLine());
            switch (c) {
                case 1:
                    manager.addStudents();
                    break;
                case 2:
                    manager.listStudent();
                    break;
                case 3:
                    manager.showTop(3);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai");
            }
        } while (true);

    }
        
 }

