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
public class Parallelogram extends Polygon{
        private int height;

    public Parallelogram() {
        
    }
    
    public Parallelogram(int height, int length, int width) {
        super(length, width);
        this.height = height;
    }

   @Override
    public double perimeter(){
        return (super.getLength()+super.getWidth())*2;
    }
    @Override
    public double acreage(){
        return super.getLength()*height;
    }
   
}
