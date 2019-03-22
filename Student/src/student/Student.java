/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Student {
    private String name;
    private String email;
    private int age;
    Scanner sc = new Scanner (System.in);

    public Student() {
    }

    public Student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void Nhapsv(){
        System.out.println("Nhập thông tin sinh viên");
        System.out.println("Ten : ");
        name=sc.nextLine();
        System.out.println("Email : ");
        email=sc.nextLine();
        System.out.println("Age : ");
        age=sc.nextInt();
        
    }
    public void Insv(){
        System.out.println("Ten :" +name);
        System.out.println("Email :" +email);
        System.out.println("Age :" +age);

    }
    public static void main(String[] args) {
        Student st= new Student();
        st.Nhapsv();
        st.Insv();
    }
   
    
}
