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
public class SmartPhone extends Product{
    private boolean hasCamera;
    private int sim;
    private Product InputSP;

    public SmartPhone() {
    }

    public SmartPhone(boolean hasCamera, int sim) {
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    public SmartPhone(boolean hasCamera, int sim, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasCamera = hasCamera;
        this.sim = sim;
    }


    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    @Override
    public void addNew(){
        System.out.println("Input infromation SmartPhone");
        super.addNew();
        System.out.println("HasCamera : ");
        int x = sc.nextInt();
        if (x==1) {
            this.setHasCamera(true);
        } else if (x==0) {
            this.setHasCamera(false);
        }
        System.out.println("Sim : ");
        sim=sc.nextInt();  
        sc.nextLine();
    }
    
    @Override
    public String toString() {
        return  "ID : "+super.getId() + "\nName : "+super.getName()+"\nPrice : "+super.getPrice()+"\nQuantity : "+super.getQuantity() + "\nHasCamera : "+this.hasCamera+"\nSim : "+this.sim; //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void InSP(){
        super.InSP();
        System.out.println("\nHasCamera : "+this.isHasCamera()+"\nSim : "+this.getSim());
    }
    
    public static void main(String[] args) {
        SmartPhone Sp = new SmartPhone();
        Sp.addNew();
        Sp.InSP();
        System.out.println(Sp);
    }
}
