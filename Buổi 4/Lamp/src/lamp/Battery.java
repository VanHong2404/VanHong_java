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
public class Battery {
    private int energy;

    public Battery() {
        this.energy=10;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public void decreaseEnergy(){
        this.energy-=2;
        System.out.println(this.energy);
    }
    
}
    

