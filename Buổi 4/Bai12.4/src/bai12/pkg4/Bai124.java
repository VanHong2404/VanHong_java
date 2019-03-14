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
public class Bai124 {

    /**
     * @param args the command line arguments
     */
   
        public static void main(String[] args) {

        Polygon p=new Parallelogram(1,2,3);
        System.out.println(p.perimeter());
        System.out.println(p.acreage());
        Parallelogram a=new Rectangle(1,2,2);
        System.out.println(a.perimeter());
        System.out.println(a.acreage());
        Square s=new Square(1,4,4);
        System.out.println(s.perimeter());
        System.out.println(s.acreage());
    }
    
}
