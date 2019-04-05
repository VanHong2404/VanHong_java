/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexception;

/**
 *
 * @author Hong Beo
 */
public class Student {
    private String id;
    private String name;
    private double mark;
    private int group;
    private String phone;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Student() {
    }

    public Student(String id, String name, double mark, int group, String phone) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.group = group;
        this.phone = phone;
    }

    public Student(String id, String name, double mark, String phone) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.phone = phone;
        checkGroup();
    }
    private void checkGroup(){
        if(getMark()>=8) setGroup(1);
        else if(getMark()>=6) setGroup(2);
        else if(getMark()>=4) setGroup(3);
        else setGroup(4);
    }

    @Override
    public String toString() {
        return "id : "+id+"\tname : "+name+"\tmark : "+mark+"\tgroup : "+group+"\tphone : "+phone;
    }

    
}

