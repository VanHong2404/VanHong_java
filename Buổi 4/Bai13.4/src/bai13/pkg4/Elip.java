/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13.pkg4;

/**
 *
 * @author Hong Beo
 */
public class Elip extends Point{
    private int smallShart;//trục nhỏ
    private int bigShart;//trục lớn

    public Elip(int smallShart, int bigShart) {
        this.smallShart = smallShart;
        this.bigShart = bigShart;
    }
   
    public double acreage(){
        return Math.PI*smallShart*bigShart;
    }

    public Elip() {
    }
}
    

