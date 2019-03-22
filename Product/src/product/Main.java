/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Main {
    public static void main(String[] args) {
        Store s = new Store();
        Scanner sc = new Scanner (System.in);              
        int chon;
        
        boolean cont = true;
        
        do {
            System.out.println("Mời bạn chọn chức năng");
            System.out.println("1. List product");
            System.out.println("2. Search product");
            System.out.println("3. Add product");
            System.out.println("4. Exit");
            System.out.println("Chọn chức năng");
            chon=sc.nextInt();
            switch(chon){
            case 1:
                s.listProducts();
                break;
            case 2:
                sc.nextLine();
                System.out.println("Nhập vào tên muốn tìm");
                String name=sc.nextLine();
                s.search(name);
                
                break;
            case 3:
                s.addNew();
                 break;
              
            default:
                cont = false;
                break;
  
        }
    }while ( cont);
    }
}


