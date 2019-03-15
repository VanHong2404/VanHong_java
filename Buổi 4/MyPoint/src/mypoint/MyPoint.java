/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoint;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class MyPoint {

    private int x;
    private int y;
    Scanner sc = new Scanner (System.in);

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void input(){
        System.out.println("Nhập vào giá trị");
        System.out.println("Nhập vào giá trị của biến x là: ");
        x=sc.nextInt();
        System.out.println("Nhập vào giá trị của biến y là: ");
        y=sc.nextInt();
    }

    @Override
    public String toString() {
        return  "(" + this.x + "," + this.y + ')'; //To change body of generated methods, choose Tools | Templates.
    }
    
    public double distance(int x, int y) {

        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return  Math.sqrt(xDiff * xDiff + yDiff * yDiff); 
    }
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p1.distance(5, 6));   
        System.out.println(p2.distance(5, 6));
        MyPoint point = new MyPoint(3, 4);
        
        Circle mc = new Circle(point, 6);
        System.out.println(mc.toString());
        System.out.println("Area of my circle is: "+mc.getArea());
    }
    
}
