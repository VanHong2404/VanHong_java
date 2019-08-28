/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Login {
     public List<Student> getStudents() throws ClassNotFoundException, SQLException {
        DBconnector db = new DBconnector();
        Connection conn = db.getConnect();
        String sql = "SELECT * FROM itsol2.student";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Student> list = new ArrayList<>();
        while (rs.next()) {
            Student s = new Student();
            s.setAccount(rs.getString("account"));
            s.setId(rs.getString("id"));
            s.setName(rs.getString("name"));
            s.setEmail(rs.getString("email"));
            s.setPhone(rs.getInt("phone"));
            s.setClass1(rs.getString("class"));
            s.setNote(rs.getString("note"));
            
            list.add(s);
    
        }
        return list;
    }
     public List<Student> getStudentsClass1(String class1 ) throws ClassNotFoundException, SQLException {
        DBconnector db = new DBconnector();
        Connection conn = db.getConnect();
        String sql = "SELECT * FROM itsol2.student as s WHERE s.class = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, class1);
        ResultSet rs = pstmt.executeQuery();
        List<Student> list = new ArrayList<>();
        while (rs.next()) {
            Student s = new Student();
            s.setAccount(rs.getString("account"));
            s.setId(rs.getString("id"));
            s.setName(rs.getString("name"));
            s.setEmail(rs.getString("email"));
            s.setPhone(rs.getInt("phone"));
            s.setClass1(rs.getString("class"));
            s.setNote(rs.getString("note"));
            list.add(s);
        }
        return list;
    }
    
}
