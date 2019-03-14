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
public class Square extends Rectangle{

    public Square() {
        
    }

    public Square(int height, int length, int width) {
        super(height, length, width);
    }

   @Override
    public double perimeter() {
        //chu vi
        return super.getLength()*4;
    }
    @Override
    public double acreage(){//diện tích
        return Math.pow(super.getLength(), 2);
    }
}
