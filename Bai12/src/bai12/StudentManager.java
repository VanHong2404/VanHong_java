/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class StudentManager {

    ArrayList<Student> list;

    static Scanner sr = new Scanner(System.in);
    private String dir = "E:\\BT\\Buoi12\\student.txt";

    public StudentManager() {
        this.list = new ArrayList<>();
    }

    public void add() {
        Student st = new Student();
        System.out.println("RollNumber >");
        st.setRollNumber(sr.nextLine());
        System.out.println("Name >");
        st.setName(sr.nextLine());
        System.out.println("Date >");
        String date = sr.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        try {
            st.setDob(df.parse(date));
        } catch (ParseException e) {
            System.out.println("Invalid date");
        }
        System.out.println("Email >");
        st.setEmail(sr.nextLine());
        list.add(st);
        for (Student student : list) {
            System.out.println(student);
        }
    }

    public Student Search(String name) {
        for (Student student : list) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    public void Update() {
        Scanner sr = new Scanner(System.in);
        System.out.println("Input rollNumber");
        String rollnumber = sr.nextLine();
        boolean flag =false;
        for (Student student : list) {
            if (student.getRollNumber().equals(rollnumber)) {
                System.out.println("Input info update: ");
                System.out.println("Name >");
                student.setName(sr.nextLine());
                System.out.println("Date >");
                String date = sr.nextLine();
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                df.setLenient(false);
                try {
                    student.setDob(df.parse(date));
                } catch (ParseException e) {
                    System.out.println("Invalid date");
                }
                System.out.println("Email >");
                student.setEmail(sr.nextLine());
                
            }
        }
        if(!flag){
            System.out.println("Error!");
        }
    }

    public boolean save() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dir));
            oos.writeObject(this.list);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean load(String file) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            ArrayList<Student> data = (ArrayList<Student>) ois.readObject();
            this.list = data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    

    }
