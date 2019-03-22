/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import com.sun.javafx.font.FontConstants;
import java.util.Scanner;
import sun.font.TrueTypeFont;


public class Store {
    Scanner sc = new Scanner(System.in);   
    private Product[] listProducts;
    private int i;
    int numbers =0;

    public Store(Product[] listProducts) {
        this.listProducts = listProducts;
    }

    public Store() {
      
    }

    public Product[] getListProducts() {
        return listProducts;
    }

    public void setListProducts(Product[] listProducts) {
        this.listProducts = listProducts;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    public void addNew(){
        System.out.println("Nhập vào số lượng hàng hóa");
        int n = sc.nextInt();
        listProducts = new Product[n]; // khởi tạp cho product thành mảng với số phần tử đã nhập
        
        for (int j = 0; j < n; j++) {
                        
                int chon1;
                do {     
                    System.out.println("Bạn muốn nhập thông tin của sản phẩm nào");
                    System.out.println("1. SmartPhone");
                    System.out.println("2. Camera");                  
                    chon1=sc.nextInt();
                    switch(chon1){
                        case 1:
                            listProducts[j] = new SmartPhone();
                            System.out.println("Nhập sản phẩm thứ "+(j+1));
                            listProducts[j].addNew();
                            
                            break;
                        case 2: 
                            listProducts[j] = new Camera();
                            System.out.println("Nhập sản phẩm thứ "+(j+1));
                            listProducts[j].addNew();
                            break;
                        
                    }
                } while ( chon1!=1 && chon1!=2);             
                
        }
            
        }
      
    public void search(String name){
        for (int j = 0; j < listProducts.length; j++) {
            if(name.equalsIgnoreCase(listProducts[j].getName())) {
                listProducts[j].InSP();
            }
            else {
                System.out.println("Không tìm thấy tên sản phẩm");
            }
            
        }
    }
        
    public void listProducts () {      
         for (int j = 0; j < listProducts.length; j++) {
            listProducts[j].InSP();
        }
    
         
        }
    }
    