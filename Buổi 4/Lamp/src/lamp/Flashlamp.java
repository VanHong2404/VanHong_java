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
public class Flashlamp extends Battery{
    private boolean status;
     private Battery battery;

    public Flashlamp() {
        this.status=false;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public int getBatteryInfo(){
        
        return super.getEnergy();
    }
    public void turnOn(){
        if(this.status==true&&super.getEnergy()>0){
            System.out.println("đèn sáng");
        }
    }
    public void turnOff(){
        if(this.status==false&&super.getEnergy()<=0){
            System.out.println("đèn Không sáng");
        }
    }
}


