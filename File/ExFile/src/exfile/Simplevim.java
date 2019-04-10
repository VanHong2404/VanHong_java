/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hong Beo
 */
public class Simplevim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        try {
//            FileWriter fw = new FileWriter("trinhcute.txt", true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            String s = "Trinh";
//            bw.write(s);
//            bw.close();
//            fw.close();
//        } catch (Exception e) {
        
        try {
            File  file = new File ("C:\\Users\\Hong Beo\\Documents\\myfile.txt");
//            if (file.createNewFile())
//                System.out.println("Tạo file thành công");
//            else 
//                System.out.println("Tạp file không thành công");
            FileWriter fw = new FileWriter("C:\\Users\\Hong Beo\\Documents\\myfile.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            System.out.println("Nhập vào file!");
            String s = sc.nextLine() ;
            if (s.endsWith(":q"))
            {
                bw.close();
                fw.close();
            }
            if (s.endsWith(":wq")) {
             bw.write(s);
            bw.close();
            fw.close();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Simplevim.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    
        
    }

}
