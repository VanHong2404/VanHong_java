/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamgiac;

public class Tamgiac {

    private double a1;
    private double a2;
    private double a3;

    public Tamgiac(double a1, double a2, double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public Tamgiac() {
    }

    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getA2() {
        return a2;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public double getA3() {
        return a3;
    }

    public void setA3(double a3) {
        this.a3 = a3;
    }

    @Override
    public String toString() {
        return this.a1 + " " + this.a2 + " " +this.a3; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
