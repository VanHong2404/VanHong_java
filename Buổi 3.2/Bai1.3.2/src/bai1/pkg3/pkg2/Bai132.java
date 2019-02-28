/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.pkg3.pkg2;

import java.util.Random;
import java.util.Scanner;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author Hong Beo
 */
public class Bai132 {
    Scanner sc = new Scanner (System.in);

   
    private int [] arrA;
    private int [] arrB;
    private int x ;
    private int i;
    public Bai132() {
        
    }
     public int[] getArrA() {
        return arrA;
    }

    public void setArrA(int[] arrA) {
        this.arrA = arrA;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void Nhap(){        
        arrA = new int[5];
        for ( x = 0; x < arrA.length; x++)
        {
            System.out.print("Phần tử thứ " + x + ": ");
            arrA[x] = sc.nextInt();
         
        }
    }
    public void In (){
        System.out.println("Mảng trên là: ");
       for ( x = 0; x < 5; x++)
       {  
        System.out.print("\t"+ arrA[x] );
       }
        
    }
     public void Tong (){
         System.out.print("\nTổng của mảng trên là : "); 
         int tong =0;
         for ( x = 0; x < 5; x++)
       {             
           tong += arrA[x];
       }    
         System.out.print(+tong );
    }
    public void Tongchan() {
        System.out.print("\nTổng các phần tử chẵn trên là : ");
        int tong=0;
        for( x=0; x <5;x++)
        {
            if (arrA[x] % 2 == 0)
            {
                tong +=arrA[x];
            }
        }
        System.out.print(+tong);
    }
    public void Tongle(){
        System.out.print("\nTổng các phần tử lẻ trên là : ");
        int tong=0;
        for( x=0; x <5;x++)
        {
            if (arrA[x] % 2 != 0)
            {
                tong +=arrA[x];
            }
        }
        System.out.print(+tong);
        
    }
    public void Max() {
        int max = arrA[0];        
        for (x = 0; x < 5; x++) {
            max = max > arrA[x] ? max : arrA[x];
        }
        System.out.print("\nPhần tử max trong mảng là : " + max);
    }
    public void Min() {
        int min = arrA[0];      
        for (x = 0; x < 5; x++) {
            min = min < arrA[x] ? min : arrA[x];
        }
        System.out.print("\nPhần tử max trong mảng là : " + min);
    }
    public void Chiahet3(){
        System.out.print("\nCác phần tử chia hết cho 3 : ");
        for (x =0 ; x<5; x++)
        {
            if ( arrA[x]%3==0)
            {
                System.out.print("\t"+arrA[x]);
            }
        }
    }
    public void Kiemtra() {
        System.out.print("\nNhập vào 1 số:");
        int a = sc.nextInt();
        boolean kiemTra = false;
        for (x=0; x<5 ;x++)
        {
            if ( arrA[x] == a )
            {              
                kiemTra = true;
                break;
            }
        }
        if(kiemTra){
            System.out.println("Số này Có trong mảng");
            System.out.println("số này Đứng ở vị trí thứ  "+ x);
        }else{
            System.out.println("Không có trong mảng");
        }
    }
    public void Random(){
        Random rd = new Random();
        arrB = new int[15];
        System.out.print("15 phần tử in ngẫu nhiên là");
        for (x=0;x<15;x++)
        {
            arrB[x]=rd.nextInt();
        }
        for (x=0;x <15 ;x ++)
        {
            System.out.print("\t"+arrB[x]);
        }
    }
    public void Tangdan() {
        System.out.print("\nSắp xếp theo chiều tăng dần: ");
        for ( x = 0; x <  14; x++) {
            for ( i = x + 1; i < 15; i++) {
                if (arrB[x] > arrB[i]) {
                    int a = arrB[i];
                    arrB[i] = arrB[x];
                    arrB[x] = a;
                }
            }
        }
         for ( x = 0; x <  15; x++) {
        System.out.print("\t"+arrB[x]);
         }
    }
    public void Giamdan(){ 
        System.out.print("\nSắp xếp theo chiều giảm dần: ");
        for ( x = 0; x <  14; x++) {
            for ( i = x + 1; i < 15; i++) {
                if (arrB[x] <  arrB[i]) {
                    int a = arrB[i];
                    arrB[i] = arrB[x];
                    arrB[x] = a;
                }
            }
        }
         for ( x = 0; x <  15; x++) {
        System.out.print("\t"+arrB[x]);
         }
    }
    public void Demchan(){
        int dem=0;
        System.out.print("\nSố phần tử chẵn trên dãy tự động là : ");
        for ( x = 0; x <  15; x++) {
            if (arrB[x]%2==0)
            {
                dem++;
            }
        }
        System.out.print(dem);
    }
    public void Demle(){
        int dem=0;
        System.out.print("\nSố phần tử le trên dãy tự động là : ");
        for ( x = 0; x <  15; x++) {
            if (arrB[x]%2!=0)
            {
                dem++;
            }
        }
        System.out.print(dem);
    }
    
    public static void main(String[] args) {
        Bai132 b = new Bai132();
        b.Nhap();
        b. In();
        b . Tong();
        b.Tongchan();
        b.Tongle();
        b.Max();
        b.Min();
        b.Chiahet3();
        b.Kiemtra();
        b.Random();
        b.Tangdan();
        b.Giamdan();
        b.Demchan();
        b.Demle();
    }
    
}
