/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Student {
    
    private String account;
    private String id;
    private String name;
    private String email;
    private int phone;
    private String class1;   
    private String note;

    Scanner sc = new Scanner(System.in);
    public Student() {
    }

    public Student(String account, String id, String name, String email, int phone, String class1, String note) {
        this.account = account;
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.class1 = class1;
        this.note = note;
    }
    

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

     public void Input(){
         System.out.println("Input Account : "); this.account = sc.nextLine();
         System.out.println("Input ID : "); this.id = sc. nextLine(); 
         System.out.println("Input Name : "); this.name = sc. nextLine();
         System.out.println("Input Email : "); this.email = sc.nextLine();
         System.out.println("Input Phone : "); this.phone = sc.nextInt();sc. nextLine();
         System.out.println("Input Class : "); this.class1 = sc. nextLine();
         System.out.println("Input Note : "); this.note = sc.nextLine();
         Student t = new Student(account, id, name, email, phone, class1, note);
    }
    @Override
    public String toString() {
        return "Student {" + "Account=" + account + ", Id=" + id + ", Name=" + name + ", Email=" + email + ", Phone=" + phone + ", Class=" + class1 + ", Note=" + note +'}';
    }
    
    
        
}
