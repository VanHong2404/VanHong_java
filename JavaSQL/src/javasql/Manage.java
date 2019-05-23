/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasql;
import java.sql.Connection;
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
public class Manage {
    Connect cx = new Connect();

     public void C1() throws  SQLException {
            Connection conn = cx.getConnection();
            PreparedStatement ps = conn.prepareStatement("select sothe, ten, khoa from DOCGIA order by khoa asc");
            ResultSet rs = ps.executeQuery();
     
        while (rs.next()) {
            System.out.println("");
            System.out.println(rs.getString("ten") + "\t\t" + rs.getString("khoa"));
        }
    }
     
      public void C2(String ten, String ngay) throws  SQLException {
        
            Connection conn = cx.getConnection();
            PreparedStatement ps = conn.prepareStatement("select d.ten from PHIEUMUON p join SACH s on s.masach = p.masach  join DOCGIA d on d.sothe = p.sothe where s.ten = '" + ten + "' and p.ngaymuon = '" + ngay + "'");
            
            ps.setString(1, ten);
             ps.setString(2, ngay);
             ResultSet rs = ps.executeQuery();
               while (rs.next()) {
                System.out.println("");
                System.out.println(rs.getString("1"));
            }
        

    }
      
      public void C3(String month) throws  SQLException {
        
            Connection conn = cx.getConnection();
            PreparedStatement ps = conn.prepareStatement("select d.sothe, d.ten, s.ten from PHIEUMUON p join SACH s on s.masach = p.masach join DOCGIA d on d.sothe = p.sothe where p.ngaymuon ='" + month + "'");           
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                System.out.println("");
                System.out.println(rs.getString("d.ten")+"\t\t"+rs.getString("d.sothe")+"\t\t"+rs.getString("s.ten"));
            }

        
    }
      public void C4()throws  SQLException{
        
            Connection conn = cx.getConnection();
            PreparedStatement ps = conn.prepareStatement("select s.* from SACH s where s.masach not in (select masach from PHIEUMUON)");           
            ResultSet rs = ps.executeQuery();
                   
            while (rs.next()) {
                System.out.println("");
                System.out.println(rs.getString("s.ten"));
            }
        
        
    }
      public void C5(String ten)throws  SQLException{
        
            Connection conn = cx.getConnection();
            PreparedStatement ps = conn.prepareStatement("select count(*) as 'soluong' from PHIEUMUON p join DOCGIA d on d.sothe = p.sothe  where d.ten ='"+ten+"'");           
            ResultSet rs = ps.executeQuery();
            ps.setString(1, ten);
               while (rs.next()) {
                System.out.println("");
                System.out.println(rs.getString("So lan"));
            }
        
      
    }
      
     public void C6()throws  SQLException{
         
             Connection conn = cx.getConnection();
            PreparedStatement ps = conn.prepareStatement("(\"select d.* from PHIEUMUON p join DOCGIA d on d.sothe = p.sothe where p.ngaytra is null");           
            ResultSet rs = ps.executeQuery();                    
            while (rs.next()) {
                System.out.println("");
                System.out.println(rs.getString("ten")+"\t\t"+rs.getNString("sothe"));
            }
        
    }
}
    
  

