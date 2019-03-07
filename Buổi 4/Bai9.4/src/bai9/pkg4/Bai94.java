/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9.pkg4;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai94 {

    private int xD,xC;
    private int yD,yC;

    public Bai94() {
    }

    public Bai94(int xD, int xC, int yD, int yC) {
        this.xD = xD;
        this.xC = xC;
        this.yD = yD;
        this.yC = yC;
    }

    public int getxD() {
        return xD;
    }

    public void setxD(int xD) {
        this.xD = xD;
    }

    public int getxC() {
        return xC;
    }

    public void setxC(int xC) {
        this.xC = xC;
    }

    public int getyD() {
        return yD;
    }

    public void setyD(int yD) {
        this.yD = yD;
    }

    public int getyC() {
        return yC;
    }

    public void setyC(int yC) {
        this.yC = yC;
    }
    
    public void input(){
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập vào hoành độ đầu:");
        this.xD = sr.nextInt();
        System.out.println("Nhập vào tung độ đầu:");
        this.yD = sr.nextInt();
        System.out.println("Nhập vào hoành độ cuối:");
        this.xC=sr.nextInt();
        System.out.println("Nhập vào tung độ cuối");
        this.yC=sr.nextInt();
    }
    
    public boolean equals(){
        
        if(this.xD==this.xC && this.yD==this.yC)
            return true;
        else
        return false;
    }
    public boolean sameDirec(){
        
        float xd= (float) this.xD;
        float xc= (float) this.xC;
        float yd=(float) this.yD;
        float yc= (float) this.yC;
        
        if(xd/xc == yd/yc)
            return true;
        else
        return false;
    }
    public float corner(){
        float cosVT=0;
        cosVT= (float) ((this.xD*this.xC)+(this.yD*this.yC))/((Math.abs((this.xD*this.xC)+(this.yD*this.yC))));
        return cosVT;
    }
    public int add()
    {
        int sumX=0,sumY=0;       
        sumX=this.xD+this.xC;
        sumY=this.yD+this.yC;
         System.out.println("Tổng:"+"("+sumX+","+sumY+")");
        return 1;
    }
    public int sub()
    {
        int diffX=0,diffY=0;       
        diffX=this.xD-this.xC;
        diffY=this.yD-this.yC;
        System.out.println("Hiệu:"+"("+diffX+","+diffY+")");
        return 1;
    }
    public int mul()
    {
        int mX,mY;
        mX=this.xD*this.xC;
        mY=this.yD*this.yC;
        System.out.println("Tích:"+"("+mX+","+mY+")");
        return 1;
    }
    public static void main(String[] args) {
        Bai94 vt = new Bai94();
        vt.input();
        System.out.println("=========");
        if(vt.equals()){
            System.out.println("2 vector bằng nhau");
        }else{
            System.out.println("2 vector không bằng nhau");
        }
        if (vt.sameDirec()) {
            System.out.println("2 vector cùng phương");
        }else
        {
            System.out.println("2 vector không cùng phương");
        }
        System.out.println("==============");
        vt.add();
       vt.sub();
        vt.mul();
        System.out.println("Góc(rad):"+vt.corner());
        
    }
}