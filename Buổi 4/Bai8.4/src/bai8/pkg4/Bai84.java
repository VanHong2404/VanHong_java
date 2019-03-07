/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8.pkg4;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai84 {

  private int phanThuc, phanAo;

    public Bai84() {
    }

    public Bai84(int phanThuc, int phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public int getPhanThuc() {
        return phanThuc;
    }

    public int getPhanAo() {
        return phanAo;
    }

    public void setPhanThuc(int phanThuc) {
        this.phanThuc = phanThuc;
    }

    public void setPhanAo(int phanAo) {
        this.phanAo = phanAo;
    }

    public void input() {
        System.out.println("Nhập vào số phức:");
        Scanner sr = new Scanner(System.in);
        phanThuc = sr.nextInt();
        phanAo = sr.nextInt();

    }

    public static Bai84 add(Bai84 sp1, Bai84 sp2) {
        Bai84 kq = new Bai84();
        kq.setPhanThuc(sp1.getPhanThuc() + sp2.getPhanThuc());
        kq.setPhanAo(sp1.getPhanAo() + sp2.getPhanAo());
        return kq;
    }

    public static Bai84 sub(Bai84 sp1, Bai84 sp2) {
        Bai84 kq = new Bai84();
        kq.setPhanThuc(sp1.getPhanThuc() - sp2.getPhanThuc());
        kq.setPhanAo(sp1.getPhanAo() - sp2.getPhanAo());
        return kq;
    }

    public static Bai84 mul(Bai84 sp1, Bai84 sp2) {
        Bai84 kq = new Bai84();
        kq.setPhanThuc((sp1.getPhanThuc() * sp2.getPhanThuc() - sp1.getPhanAo() * sp2.getPhanAo())
                + (sp1.getPhanThuc() * sp2.getPhanAo() + sp1.getPhanAo() * sp2.getPhanThuc()));
        return kq;
    }

    public static Bai84 div(Bai84 sp1, Bai84 sp2) {
        Bai84 kq = new Bai84();
        kq.setPhanThuc(((sp1.getPhanThuc() * sp2.getPhanThuc()
                + sp1.getPhanAo() * sp2.getPhanAo()) / (sp1.getPhanAo() * sp1.getPhanAo() + sp1.getPhanThuc() * sp1.getPhanThuc())
                + (sp1.getPhanThuc() * sp2.getPhanAo() - sp1.getPhanAo() * sp2.getPhanThuc()) / (sp1.getPhanAo() * sp1.getPhanAo() + sp1.getPhanThuc() * sp1.getPhanThuc()))
        );
        return kq;
    }

    @Override
    public String toString() {
        return phanThuc + "+" + phanAo + 'i';
    }

    public static void main(String[] args) {
        Bai84 sp1 = new Bai84();
        Bai84 sp2 = new Bai84();
        sp1.input();
        sp2.input();
        System.out.println("Tổng:" + add(sp1, sp2));
        System.out.println("Hiệu:" + sub(sp1, sp2));
        System.out.println("Tích:" + mul(sp1, sp2));
        System.out.println("Thương:" + div(sp1, sp2));
    }

}