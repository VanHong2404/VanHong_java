/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thitnchuan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Hong Beo
 */
public class StudentManager {
 Connection conn;
    
    public StudentManager() throws ClassNotFoundException, SQLException {
        DBConnector db = new DBConnector();
        this.conn = db.getConnect();
    }

    public Student login(String email, String pass) throws SQLException {
        // 1. Taoj ket noi
        // 2. Thuc hien cau lenh
        String query = "SELECT * FROM THITN.STUDENT WHERE email = ? AND pass = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setString(1, email);
        pstmt.setString(2, pass);
        
        ResultSet rs = pstmt.executeQuery();
        Student s = null;
        if (rs.next()) {
            s = new Student(rs.getInt("id"), rs.getString("name"), 
                    rs.getString("email"), rs.getString("pass"));
        }
        
        return s;
    }
    
    public int addAnswer(Student s, Question q, String answer) throws SQLException { // add câu trả lời vào table student_quétion
        String query = "INSERT INTO studentquestion VALUES (?,?,?)";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, s.getId());
        pstmt.setInt(2, q.getId());
        pstmt.setString(3, answer);
        return pstmt.executeUpdate();
    }
    
    public boolean check_student_questions(Student s) throws SQLException{
        String query="select * from studentquestion where student_id=?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, s.getId());
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
            return true;
        }
        return false;
    }
    public void delete_student_questions(Student s) throws SQLException{
        String query="delete from studentquestion where student_id=?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, s.getId());
        pstmt.executeUpdate();
    }
    public void Detail_student_questions(Student s) throws SQLException, ClassNotFoundException{
        String query="SELECT * from ((studentquestion as sq join THITN.STUDENT as s on s.id=sq.student_id) join dapan as q on q.id=sq.question_id) where s.id=?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, s.getId());
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            QuestionManager qm=new QuestionManager();
                List<Question> list= qm.getQuestions();

                    System.out.printf("Question %d/%d ", rs.getInt("sq.question_id"), list.size());
                                    if (rs.getString("sq.correct").toLowerCase().equals(rs.getString("q.correct").toLowerCase())) {
                        System.out.print(" - True \n");
                    }
                else{
                    System.out.print(" - False - Correct Answer : "+rs.getString("q.correct") +"\n");
                }
                    System.out.println(rs.getString("q.content"));
                    System.out.println(rs.getString("q.answer_a"));
                    System.out.println(rs.getString("q.answer_b"));
                    System.out.println(rs.getString("q.answer_c"));
                    System.out.println(rs.getString("q.answer_d"));
                     System.out.println(" your choose > "+rs.getString("sq.correct"));
            
        }
    }
}