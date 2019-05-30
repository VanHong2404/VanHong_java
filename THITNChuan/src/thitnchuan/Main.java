/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thitnchuan;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Hong Beo
 */
public class Main {
      public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            // TODO code application logic here
            Scanner input = new Scanner(System.in);
            System.out.println("   QUIZ ONLINE   ");
            System.out.println("------------------");
            System.out.print("Enter Email: ");
            String email = input.nextLine();
            
            System.out.print("Enter Pass: ");
            String pass = input.nextLine();
            
            StudentManager sm = new StudentManager();
            Student s = sm.login(email, pass);
            
            if (s != null) {
                System.out.println("LOGIN SUCCESS! PRESS ANY KEY TO START QUIZ");
                input.nextLine();
                System.out.println("---------------");
                if(sm.check_student_questions(s)==true){ // kiem tra xem da lam bai chua // roi
                    System.out.println("You did the test. Do you want to do it again? Y / N");
                    System.out.println("Your choice > ");
                    String check =input.nextLine();
                    if(check.toLowerCase().equals("y")){ // neu da lam roi chon Y thi xoa toan bo dap an va bat dau lam lai
                       sm.delete_student_questions(s);
                QuestionManager qm = new QuestionManager();
                List<Question> questions = qm.getQuestions(); //lấy ra danh sách
                int countCorr = 0;
                int index = 1;
                for (Question q : questions) {
                    System.out.printf("Question %d/%d \n", index++, questions.size());
                    System.out.println(q);
                    System.out.print("Your answer > ");
                    String answer = input.nextLine();
                    sm.addAnswer(s, q, answer);
                    if (answer.toLowerCase().equals(q.getCorrect().toLowerCase())) {
                        countCorr++;
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Wrong!");
                    }
                }
                System.out.println("Congratulation!");
                System.out.printf("Your result: %d/%d \n", countCorr, questions.size());
                System.out.println("See Detail (Y/N)");
                 String a=input.nextLine();
                if(a.toLowerCase().equals("y")){
                    sm.Detail_student_questions(s);
                }
                }
                }
                else{
                    QuestionManager qm = new QuestionManager();
                List<Question> questions = qm.getQuestions(); //lấy ra danh sách
                int countCorr = 0;
                int index = 1;
                for (Question q : questions) {
                    System.out.printf("Question %d/%d \n", index++, questions.size());
                    System.out.println(q);
                    System.out.print("Your answer > ");
                    String answer = input.nextLine();
                    sm.addAnswer(s, q, answer);
                    if (answer.toLowerCase().equals(q.getCorrect().toLowerCase())) {
                        countCorr++;
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Wrong!");
                    }
                }
                System.out.println("Congratulation!");
                System.out.printf("Your result: %d/%d \n", countCorr, questions.size());
                System.out.println("See Detail (Y/N)");
                 String a=input.nextLine();
                if(a.toLowerCase().equals("y")){
                    sm.Detail_student_questions(s);
                    
                }
                }
            } else {
                System.out.println("LOGIN FAIL!");
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
    }
}
