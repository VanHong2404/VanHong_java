/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import com.mysql.cj.xdevapi.Result;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Hong Beo
 */
public class Bai12 {

    /**
     * @param args the command line arguments
     */
    
     public static void main(String[] args) {
     
         try {          
    Class.forName("com.mysql.cj.jdbc.Driver");
    String connStr ="jdbc:mysql://localhost:3306/QLYTHUVIEN";
    Connection conn=
        DriverManager.getConnection(connStr, "root","2404");
    if (conn != null){
    System.out.println("Ket noi");
        System.out.println("_________________");
        // Sau khi ket noi thanh cong
       Statement star = conn.createStatement();
       //select va in du lieu
//        ResultSet rs = star.executeQuery("SELECT * FORM SACH");
        
//        //iNSERT du lieu
//        String insertQuery ="Insert into SACH(Masach,Ten,Tacgia,NXB,Soluong)\n" +
//        "Values ('S06','Toan','NV Hong','NXB TRe',3)"
//            //insert kieu moi
//        String insertQuery ="Insert into SACH(Masach,Ten,Tacgia,NXB,Soluong)" +"Values (?,?,?,?,?)";
//        PreparedStatement pstmt = conn.prepareStatement(insertQuery);
        
        //Ten va khoa cua nhung doc gia sap xep theo khoa
        System.out.println("_______Ten va Khoa cua nhung doc gia________");
       ResultSet rs = star.executeQuery("SELECT Ten, Khoa From DOCGIA");
        while (rs.next()){
            System.out.println(rs.getString("Ten")
                                + " , " + rs.getString("Khoa") );
        }
        //Sach khong ai muon
        System.out.println("_______Sach khong ai muon________");
         rs = star.executeQuery("SELECT TEN FROM SACH WHERE TEN NOT IN (SELECT S.TEN FROM SACH AS S, PHIEUMUON AS PM WHERE PM.MASACH=S.MASACH) ");                                                                     
        while (rs.next()){
            System.out.println(rs.getString("Ten"));
        }
        //Ten So the cua nhung doc gia chua tra sach
        System.out.println("_________Nhung thang chua tra sach________");
        rs = star.executeQuery("SELECT dg.Ten, dg.Sothe from Docgia as dg join Phieumuon as pm on dg.sothe = pm.sothe where pm.ngaytra is  null");
         while (rs.next()){
            System.out.println(rs.getInt("Sothe") + " , "+rs.getString("Ten"));
        }
         // ten cua doc gia muon sach vao ngay nao do   
         System.out.println("______ Danh sach nhung doc gia muong sach ... vao ngay ..._________");
         rs = star.executeQuery("Select dg.ten from (docgia as dg join phieumuon as pm on docgia.sothe=phieumuon.sothe) join sach as s on s.masach = pm.masach where s.ten is "Toi la Beto" and pm.ngaymuon= 1/1/2018" );
         
    }
    else {
    System.out.println("Khong thanh cong");
    }} catch (ClassNotFoundException ex) {
             Logger.getLogger(Bai12.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(Bai12.class.getName()).log(Level.SEVERE, null, ex);
         }
                
         
             
         
     }
}