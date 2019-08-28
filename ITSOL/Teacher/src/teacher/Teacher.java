/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Teacher {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("  System Manager ");
        System.out.println("____________________");
        System.out.println("Do you have account? (Y/N) : ");
        String x1 =sc.nextLine();
        Login lg = new Login();
        if(x1.toLowerCase().equals("y")){
            System.out.println(" Account : "); 
            String account = sc.nextLine();
            System.out.println(" First - Name : "); 
            String first = sc.nextLine();
            System.out.println(" Last - Name : ");
            String last = sc.nextLine();
            System.out.println(" Email : ");
            String email = sc.nextLine();
            Teacher1 t = lg.login(account, first, last, email);
            if( t !=null) {
                System.out.println("LOGIN SUCCESS! PRESS ANY KEY TO START QUIZ");
                sc.nextLine();
                System.out.println("---------------");
                System.out.println("List student of you!");
                lg.Show_Student(t);
                System.out.println("---------------");
                int choose =0;
                do {
                System.out.println("Invite you to choose a function!");
                System.out.println("1 . Filter by class");
                System.out.println("2 . Search by First-Name,Last-Name,Email or Phone! ");
                System.out.println("3 . Add, Repair or Delete Student");
                System.out.print("You choose : ");
                choose=sc.nextInt();sc.nextLine();
                switch(choose){
                    case 1 :
                        break;
                    case 2 :
                        break;
                    case 3 :
                        int choose1 =0;
                        do{
                            System.out.println("Invite you to choose a funcition of option 3");
                            System.out.println("1 . Add Student");
                            System.out.println("2 . Repair Student");
                            System.out.println("3 . Delete Student");
                            System.out.print("You choose : ");
                            choose1 = sc.nextInt();
                            sc.nextLine();
                            switch(choose1) {
                                case 1 :
                                    Student  st = new Student();
                                    st.Input();
                                    lg.Add_student(st);                                   
                                    break;
                                case 2 :
                                    System.out.println("Student of you");
                                    lg.Show_Student(t);
                                    System.out.println("Do you want repair studen?");
                                    lg.Repair_student();
                                    break;
                                case 3 :
                                    lg.Show_Student(t);
                                    lg.Delete_student();                                   
                                    break;
                                case 4 :
                                    break;
                            }
                         } while (choose < 4 && choose > 0);
                        break;
                    
                }
                } while (choose < 4 && choose > 0);
              
            } else {
                System.out.println("Login Fail! PLEASE CHECK INFORMATION!");
            }
        } else {
            System.out.println("Do you want to create an account? (Y/N)");
            String x2 = sc.nextLine();
            if (x2.toLowerCase().equals("y")) {
                System.out.println(" Account : "); 
                String account = sc.nextLine();
                System.out.println(" First - Name : "); 
                String first = sc.nextLine();
                System.out.println(" Last - Name : ");
                String last = sc.nextLine();
                System.out.println(" Email : ");
                String email = sc.nextLine();
                Teacher1 t = new Teacher1(account, first, last, email);
                lg.Add_Account(t);
                System.out.println("Please Return System!");               
            }
            else {
                System.out.println("Thank you for use system! Good bye! See you again!");
            }
        }
        
    }
    
}
