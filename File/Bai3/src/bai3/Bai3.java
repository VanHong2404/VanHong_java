/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Hong Beo
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TaskManager tm = new TaskManager();
        int select = 0;
        Scanner sr = new Scanner(System.in);
        do {
            try {
                System.out.println("1. Load Task");
                System.out.println("2. Show Task");
                System.out.println("3. Creat new Task");
                System.out.println("4. Filter by Status");
                System.out.println("5. Update Status");
                System.out.println("6. View Detail");
                System.out.println("7. Exit");
                System.out.println("Choose ?");
                select = sr.nextInt();
                switch (select) {
                    case 1:
                        sr.nextLine();
                        System.out.println("Input path:");
                        String url = sr.nextLine();
                        tm.load(url);
                        break;
                    case 2:
                        tm.show();
                        break;
                    case 3:
                        System.out.println("ID:");
                        int id = sr.nextInt();
                        sr.nextLine();
                        System.out.println("Title:");
                        String title = sr.nextLine();
                        System.out.println("Contain:");
                        String contain = sr.nextLine();
                        System.out.println("Status");
                        int check = sr.nextInt();
                        boolean done = false;
                        if (check == 1) {
                            done = true;
                        } else if (check == 0) {
                            done = false;
                        }
                        tm.add(new Task(id, title, contain, done));
                        break;
                    case 4:
                        System.out.println("Select(1/0)");
                        int checkDone = sr.nextInt();
                        boolean flag = false;
                        if (checkDone == 1) {
                            flag = true;
                        } else if (checkDone == 0) {
                            flag = false;
                        }
                        tm.ShowDone(flag);
                        break;
                    case 5:
                        System.out.println("ID:");
                        int idT = sr.nextInt();
                        System.out.println("Status:");
                        int checkStatus = sr.nextInt();
                        boolean checkStt = false;
                        if (checkStatus == 1) {
                            checkStt = true;
                        } else if (checkStatus == 0) {
                            checkStt = false;
                        }
                        tm.updateStatus(idT, checkStt);
                        break;
                    case 6:
                        tm.showAll();
                        break;
                    case 7:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            } catch (IOException ex) {
                Logger.getLogger(Bai3.class.getName()).log(Level.SEVERE, null, ex);
            }

        } while (true);
    }
 }
    

