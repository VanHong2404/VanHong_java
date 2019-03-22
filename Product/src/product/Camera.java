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
public class Camera extends Product{
    private boolean hasWifi;

   
    public Camera() {
    }

    public Camera(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public Camera(boolean hasWifi, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasWifi = hasWifi;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
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

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    @Override
    public void addNew(){
        System.out.println("Input infromation Camera");
        super.addNew();      
        System.out.println("HasCamera : ");
        int x = sc.nextInt();
        if (x==1) {
            this.setHasWifi(true);
        } else if (x==0) {
            this.setHasWifi(false);
        }
        
    }
    @Override
    public String toString() {
        return  "ID : "+super.getId() + "\nName : "+super.getName()+"\nPrice : "+super.getPrice()+"\nQuantity : "+super.getQuantity() + "\nHasWifi : "+this.hasWifi; //To change body of generated methods, choose Tools | Templates.
                
    }
    @Override
    public void InSP(){
        super.InSP();
        System.out.println("\nHasWifi : "+this.isHasWifi());
    }
    public static void main(String[] args) {
        Camera cmr = new Camera();
        cmr.addNew();
        cmr.InSP();
        System.out.println(cmr);
    }
    
   
}
