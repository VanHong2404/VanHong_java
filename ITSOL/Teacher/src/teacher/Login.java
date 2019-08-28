/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Login {
    Connection conn;
    Scanner sc  = new Scanner(System.in);
    public Login() throws ClassNotFoundException, SQLException{
        DBConnector db = new DBConnector();
        this.conn = db.getConnect();
    }
    public Teacher1 login(String account, String firstname,String lastname, String email) throws SQLException {
        String query ="Select * from itsol2.teacher where account=? and firstname = ? and lastname =? and email =?";
        PreparedStatement pstmt=this.conn.prepareStatement(query);
        pstmt.setString(1, account);
        pstmt.setString(2, firstname);
        pstmt.setString(3, lastname);
        pstmt.setString(4, email);
       ResultSet rs = pstmt.executeQuery();
       Teacher1 t = null;
       if(rs.next()){
           t = new Teacher1(rs.getString("account"),rs.getString("firstname"),rs.getString("lastname"),rs.getString("email"));
       }
       return t;
   
    }
    public void Show_Student(Teacher1 t) throws SQLException {
        String query="Select * from(itsol2.teacher as T  join itsol2.student as S on T.account = S.account)  where T.account=?  ";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setString(1, t.getAccount());
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
                System.out.println("Account : "+rs.getString("S.account")+"\t\tID Student : "+rs.getString("S.id")+"\t\tName Student : "+rs.getString("S.name")+"\t\tEmail : "+rs.getString("S.email")+"\t\tClass : "+rs.getString("s.class"));
            }
    }
    public int Add_Account(Teacher1 t) throws SQLException{
        String query = "INSERT INTO itsol2.teacher VALUES (?,?,?,?)";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setString(1, t.getAccount());
        pstmt.setString(2, t.getFirstname());
        pstmt.setString(3, t.getLastname());
        pstmt.setString(4, t.getEmail());
        return pstmt.executeUpdate();
    }
    public int Add_student(Student s) throws SQLException {
        String query = "INSERT INTO itsol2.student VALUES (?,?,?,?,?,?,?)";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setString(1, s.getAccount());
        pstmt.setString(2, s.getId());
        pstmt.setString(3, s.getName());
        pstmt.setString(4, s.getEmail());
        pstmt.setInt(5, s.getPhone());
        pstmt.setString(6, s.getClass1());
        pstmt.setString(7, s.getNote());
        return pstmt.executeUpdate();
    }
    
    public int Delete_student() throws SQLException {            
        System.out.println("Input Account : "); String Account = sc.nextLine();
        System.out.println("Input ID : "); String ID = sc.nextLine();
        String query ="Delete from itsol2.student  where account=? and id=? ";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setString(1,Account);
        pstmt.setString(2, ID); 
        return pstmt.executeUpdate();
    }
    public int Repair_student () throws SQLException {
        System.out.println("Input Id of Student you want Repair : "); String ID = sc. nextLine();
        System.out.println("Input Name you want Repair : "); String Name = sc.nextLine();
        System.out.println("Input Email you want Repair : "); String Email = sc. nextLine();       
        String query = "Update itsol2.student set Name =? and Email = ? where id=? ";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setString(1, Name); 
        pstmt.setString(2, Email);
        pstmt.setString(3, ID);
        return pstmt.executeUpdate();        
    }
}
