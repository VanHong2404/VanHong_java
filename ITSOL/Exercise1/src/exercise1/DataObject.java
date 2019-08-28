/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class DataObject {
     private String code;
    private int count;
    Scanner sc = new Scanner(System.in);

    public DataObject(String code, int count) {
        this.code = code;
        this.count = count;
    }

    public DataObject() {
    }
    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void setData(){
        System.out.print("Input code : "); code=sc.nextLine();
     
        System.out.print("Input count : "); count=sc.nextInt(); sc.nextLine();
    }
   
     @Override
    public String toString() {
        return "DataObject : [Code=" + code + ", Count=" + count + "]";
    }
    
}
