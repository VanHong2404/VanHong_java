/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;
/**
 *
 * @author Hong Beo
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileUtils fu = new FileUtils();
        Scanner sr = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("1   Get Folder");
            System.out.println("2   Get All File");
            System.out.println("3   Get Image File");
            System.out.println("4   Get File ext");
            System.out.println("5   Get Lastmodify");
            System.out.println("6   Convert File");
            System.out.println("7   Exit");
            select = sr.nextInt();
            switch (select) {
                case 1:
                    sr.nextLine();
                    System.out.println("Input path:");
                    String pathFolder = sr.nextLine();
                    fu.getFolder(pathFolder);
                    break;
                case 2:
                    sr.nextLine();
                    System.out.println("Input path:");
                    String pathFile = sr.nextLine();
                    fu.getFile(pathFile);
                    break;
                case 3:
                    sr.nextLine();
                    System.out.println("Input path:");
                    String pathImgFile = sr.nextLine();
                    fu.getFileImg(pathImgFile);
                    break;
                case 4:
                    sr.nextLine();
                    System.out.println("Input path:");
                    String pathExtFile = sr.nextLine();
                    System.out.println("Input fomat file:");
                    String extName = sr.nextLine();
                    fu.getFileExt(pathExtFile, extName);
                    break;
                case 5:
                    sr.nextLine();
                    System.out.println("Input path:");
                    String nameLastModifyFile = sr.nextLine();
                    fu.getLastUpdate(nameLastModifyFile);
                    break;
                case 6:
                    sr.nextLine();
                    System.out.println("Input path:");
                    String nameFileCv = sr.nextLine();
                    fu.size(nameFileCv);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }

        } while (true);
    }
}
    

