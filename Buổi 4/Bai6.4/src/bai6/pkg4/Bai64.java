/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6.pkg4;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai64 {
    protected double cr;
    protected double  cd;
    protected double  S;
    protected double  P;
    Scanner sc = new Scanner (System.in);

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getS() {
        return S;
    }

    public void setS(double S) {
        this.S = S;
    }

    public double getP() {
        return P;
    }

    public void setP(double P) {
        this.P = P;
    }

    
    
     public void Nhap(){
         do {
            System.out.println("Nhập chiều dài hình chữ nhật: ");
            cd = sc.nextDouble();
            System.out.println("Nhập chiều rộng hình chữ nhật: ");
            cr = sc.nextDouble();
        } while (cd < cr);
     }
     public void In(double cd,double cr){
         System.out.println("Hinh chu nhat tren co chieu dai la: " + cd + " va chieu rong la : " +cr);
     }
     public double Dientich(double cd,double cr){
         System.out.println("Hinh chu nhat tren co dien tich la: ");       
         S = cd*cr;        
         System.out.println(S);
        return 0;
        
     }
     public double Chuvi(double cd,double cr) {
         System.out.println("Hinh chu nhat tren co chu vi la");        
         P=(cd+cr)*2;
         System.out.println(P);
        return 0;
     }

   
    public static void main(String[] args) {
       Bai64 p = new Bai64();
       p.Nhap();
       p.In(p.cd,p.cr); // chu y
       p.Dientich(p.cd,p.cr);
       p.Chuvi(p.cd,p.cr);
    }
    
}
