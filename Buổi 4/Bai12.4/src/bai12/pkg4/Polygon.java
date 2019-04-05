/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12.pkg4;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public abstract class Polygon {
     private int length;
    private int width;
    Scanner sc = new Scanner(System.in);

    public Polygon() {
    }

    public Polygon(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    
    public abstract double perimeter();
    public abstract double acreage();
}
    

