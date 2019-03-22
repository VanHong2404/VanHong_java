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
public class Product {
    int id;
    String name;
    double price;
    int quantity;
    Scanner sc = new Scanner (System.in);

    public Product() {
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void addNew(){
        System.out.println("Input name : ");
        name=sc.nextLine();
        System.out.println("Input id : ");
        id= sc.nextInt();
        System.out.println("Input quantity"); // số lượng
        quantity=sc.nextInt();
        System.out.println("Input price : "); // giá
        price=sc.nextDouble();
    }

    @Override
    public String toString() {
        System.out.println("ID : "+id+ "\nName : "+name+"\nPrice : "+price+"\nQuantity : "+quantity); //To change body of generated methods, choose Tools | Templates.
        return null;
    }
    public void InSP(){
        System.out.println("ID : "+this.getId() + "\nName : "+this.getName()+"\nPrice : "+this.getPrice()+"\nQuantity : "+this.getQuantity());
    }
    
    public static void main(String[] args) {
        Product pd = new Product();
        pd.addNew();
        pd.InSP();
        pd.toString();
        
    }

    
    
}
