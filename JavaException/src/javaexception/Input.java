/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexception;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Input {
     private Scanner input;

    public Input() {
        this.input = new Scanner(System.in);
    }
    public String inputId(){
        System.out.println("Nhập id :");
        String id=input.nextLine();
        try {
            if (!id.startsWith("HV")) throw new Exception("Phai bat dau bang HV");
            if(id.length()>5||id.length()<5) throw new Exception("chuỗi phải có đủ 5 phần tử");
            String sub = id.substring(2);//trả về chuỗi từ vị trí thứ 2 đến hết...
            
            int parseInt = Integer.parseInt(sub);
            
        } catch (Exception e) {
            System.out.println("Sai định dạng");
            System.out.println(e.getMessage());//trả về chuỗi thông báo lỗi...  khai báo ở trên
             return this.inputId();
        }
        return id;
    }
    public String inputName(){
        System.out.println("Nhập name : ");
        String name=input.nextLine();
        try {
            if(name.length()<8) throw new Exception("name phải lớn hơn 8 ký tự0");
        } catch (Exception e) {
            System.out.println("sai định dạng");
            System.out.println(e.getMessage());
            return inputName();
        }
        return name;
    }
    public double inputMark(){
        System.out.println("Nhập điểm :");
        double mark;
        try {
             mark=Double.parseDouble(input.nextLine());
            if(10<mark||mark<0) throw new Exception("Điểm phải <=10 và >=0");
        } catch (Exception e) {
            System.out.println("Sai định dạng");
            System.out.println(e.getMessage());
            return inputMark();
        }
        return mark;
    }
    public String inputPhone(){
        System.out.println("Nhập phone");
        String phone=input.nextLine();
        try {
            if(phone.length()>10) throw new Exception("Số điện thoại gồm 10 số s");
            int a=Integer.parseInt(phone);
            if(!phone.matches("[0-9]{10}")) throw new Exception("Số điện thoại gồm 10 số");
        } catch (Exception e) {
             System.out.println("Sai định dạng");
            System.out.println(e.getMessage());
            return inputPhone();
        }
        return phone;
    }
    
}

