/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.pkg4;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai54 {
    private int a;
    private int b;
    private int c;
    Scanner sc = new Scanner(System.in);
    public Bai54(){
        
    }

    public Bai54(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public void Nhap(){
        System.out.println("Nhập vào độ dài 3 cạnh");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
    }
    public void In(){
        System.out.println("Độ dài 3 cạnh của tam giac trên");
        System.out.println("a : " +a+ " b : " +b+" c: "+c);
    }
    public void Kiemtra(){
        if ( a+b > c || b+c>a || c+a>b)
    {
        if ( a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b)
        {
            System.out.println("\n 3 so ban vua nhap la do dai 3 canh cua 1 tam giac vuong");
        }
        else
        {
            if( a==b  && b==c)
            {
                System.out.println("\n 3 so ban vua nhap la do dai 3 canh cua 1 tam giac deu");
            }
            else
            {
            if(a*a > b*b + c*c || b*b > a*a + c*c || c*c > a*a + b*b)
            {
                System.out.println("\n 3 so ban vua nhap la do dai 3 canh cua 1 tam giac tu");
            }
            else
            {
                System.out.println("\n 3 so ban vua nhap la do dai 3 canh cua 1 tam giac nhon");
            }
            }
        }
    }
    else
    {
    System.out.println("\n Ba so ban vua nhap ko phai la do dai 3 canh cua 1 tam giac");
    }       
    }
    public float chuvi(int a, int b, int c){
        int p;
        System.out.println("Chu vi cua tam giac do la");
        p = a+ b+ c;
        System.out.println(p);
        return 0;
    }
    public float dientich(int a, int b, int c){
        float s;
        float p;
        p=(float)((a+b+c)/2);
        s=(float)sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Dien tich cua tam giac do la : "+s);
        return 0;       
    }
    public static void main(String[] args) {
        Bai54 b= new Bai54();
        b.Nhap();
        b.In();
        b.Kiemtra();
        b.chuvi(b.a,b.b ,b.c);
        b.dientich(b.a,b.b ,b.c);
    }
         
}
