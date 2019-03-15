/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoint;

/**
 *
 * @author Hong Beo
 */
public class Circle {
    private MyPoint center;
    private int r;

    public Circle() {
    }

    public Circle(MyPoint center, int r) {
        this.center = center;
        this.r = r;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle@" +center.toString()+"+ r=" + r; //To change body of generated methods, choose Tools | Templates.
    }
    public double getArea(){
        return Math.PI*Math.PI*r;
    }
}
