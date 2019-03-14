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
public class Rectangle extends Parallelogram {

    public Rectangle() {      
    }
  
    public Rectangle(int height, int length, int width) {
        super(height, length, width);
    }

    @Override
    public double acreage(){
        return super.getLength()*super.getWidth();
    }
     
    
    
}
