/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamp;

/**
 *
 * @author Hong Beo
 */
public class Lamp {

    
    public static void main(String[] args) {      
        Battery b=new Battery();
        Flashlamp f=new Flashlamp();
        f.setBattery(b);
        for(int i =0;i<10;i++){
        f.setStatus(true);
        f.decreaseEnergy();
        f.setStatus(false);
 
    }
        System.out.println("năng lượng còn lại : "+f.getEnergy());
    }
}
    
    

