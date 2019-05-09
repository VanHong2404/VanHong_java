/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import java.util.Date;
import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author Hong Beo
 */
public class Student implements Serializable{
    private String rollNumber;
    private String name;
    private Date dob;
    private String email;

    public Student() {
    }

    public Student(String rollNumber, String name, Date dob, String email) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNumber=" + rollNumber + ", name=" + name + ", dob=" + dob + ", email=" + email + '}';
    }
    
    
    
}