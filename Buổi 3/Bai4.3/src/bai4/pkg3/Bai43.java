
package bai4.pkg3;

import java.util.Random;
import java.util.Scanner;


public class Bai43 {

    
    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
        Random rd = new Random();
        int i;
        int [] arrA = new int[15];
        System.out.println("Ramdom 15 phan tu vao mang ");
        for (i=0; i<15;i++)
        {
            arrA[i]=rd.nextInt();
            
            System.out.println("arrA["+i+"] :"  + arrA[i]);
        }
        System.out.println("Sap xep theo chieu tang dan");
        for (i=0; i<15;i++)
        {
            for (int j = i+1; i < 15; j++)               
            {
                if (arrA[i] > arrA[j])
                {
                    int temp = arrA[i];
                    arrA[i] = arrA[j];
                    arrA[j] = temp;
                    
                }       
             System.out.println(arrA[i]);     
        }   
       
    }
        
}
}


