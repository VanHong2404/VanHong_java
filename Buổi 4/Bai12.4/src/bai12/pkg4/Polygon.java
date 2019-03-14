/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12.pkg4;

/**
 *
 * @author Hong Beo
 */
public class Polygon {
     private int length;
    private int width;

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
    
    public double perimeter(){//chu vi
        return 0;
    }
    public double acreage(){//diện tích
        return 0;
    }
}
    

