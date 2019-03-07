/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7.pkg4;

import java.util.Scanner;


public class Bai74 {

   private int tuSo,mauSo;

    public Bai74() {
    }

    public Bai74(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    
    public void input()
    {
        System.out.println("Nhập vào tử số và mẫu số:");
        Scanner sr = new Scanner(System.in);
        tuSo = sr.nextInt();
        mauSo = sr.nextInt();
    }
    public void output()
    {
        System.out.println("Phân số đã nhập là: ");
        System.out.println(tuSo+"/"+mauSo);
    }
    public void nghichDao()
    {
        System.out.println("Phân số nghịch đảo:");
        int temp=0;
        temp=tuSo;
        tuSo=mauSo;
        mauSo=temp;
        System.out.println(tuSo+"/"+mauSo);
    }
    public void rutGon()
    {
        int gcd = this.gcd(tuSo, mauSo);
            this.tuSo=this.tuSo/gcd;
            this.mauSo=this.mauSo/gcd;
    }
    private int gcd(int a, int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
        
        return a;
    }
    public static Bai74 add(Bai74 ps1, Bai74 ps2)
    {
        Bai74 kq = new Bai74();
        kq.setTuSo((ps1.getTuSo()*ps2.getMauSo()+ps2.getTuSo()*ps1.getMauSo()));
        kq.setMauSo((ps1.getMauSo()*ps2.getMauSo()));
 
        return kq;
    }
    public static Bai74 sub(Bai74 ps1,Bai74 ps2)
    {
        Bai74 kq = new Bai74();
        kq.setTuSo((ps1.getTuSo()*ps2.getMauSo()-ps2.getTuSo()*ps1.getMauSo()));
        kq.setMauSo((ps1.getMauSo()*ps2.getMauSo()));
        return kq;
    }
    public static Bai74 mul(Bai74 ps1,Bai74 ps2)
    {
        Bai74 kq = new Bai74();
        kq.setTuSo(ps1.getTuSo()*ps2.getTuSo());
        kq.setMauSo(ps1.getMauSo()*ps2.getMauSo());
        return kq;
    }
    public static Bai74 div(Bai74 ps1,Bai74 ps2)
    {
        Bai74 kq = new Bai74();
        kq.setTuSo(ps1.getTuSo()*ps2.getMauSo());
        kq.setMauSo(ps1.getMauSo()*ps2.getTuSo());
        return kq;
    }
    @Override
    public String toString() {
        return tuSo + "/" + mauSo ;
    }
    public static void main(String[] args) {
        Bai74 ps1 = new Bai74();
        Bai74 ps2 = new Bai74();
        ps1.input();
        ps2.input();
        ps1.output();
        ps2.output();

        System.out.println("Tổng:"+add(ps1,ps2));
        System.out.println("Hiệu:"+sub(ps1, ps2));
        System.out.println("Tích:"+mul(ps1, ps2));
        System.out.println("Thương:"+div(ps1, ps2));
    }
}
