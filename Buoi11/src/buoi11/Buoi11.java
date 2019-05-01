/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi11;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Buoi11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CustomerManager cm = new CustomerManager();
        int chon=0;
        String file = "E:\\BT\\Buoi11\\cus.dat";
        Scanner sr = new Scanner(System.in);
        do {            
            System.out.println("1.Load data");
            System.out.println("2.Add new");
            System.out.println("3.Search");
            System.out.println("4.Save ");
            System.out.println("5.Exit");
            chon = sr.nextInt();
            
            switch(chon)
            {
                case 1:
                   cm.load(file);
                    break;
                case 2:
                    cm.add();
                    break;
                case 3:
                    System.out.println("Nhap id ban muon tim kiem:");
                    int s = sr.nextInt();
                     cm.search(s);
                    break;
                case 4:
                   cm.save();
                    break;
                default:
                    System.out.println("Moi ban chon!");
                    break;
            }
        } while (chon!=5);
    }
    
}
