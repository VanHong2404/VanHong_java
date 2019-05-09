/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
 /*
 * @author Hong Beo
 */

public class Menu {
      private Map<String, String> map;
  
    
   private File f1=new File("menu-vi.locale");
   private File f2=new File("menu-en.locale");
    public Menu() {
        try {
            this.map = new HashMap<>();
            f1.createNewFile();
            f2.createNewFile();
            this.loadData("en");
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void loadData(String lang) {
        try {
            String fileName = "F:\\VanHong_java\\Buoi12\\"+"menu-" + lang + ".locale";
            BufferedReader reader
                    = new BufferedReader(
                            new InputStreamReader(
                                    new FileInputStream(fileName)));
            this.map.clear();
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                String[] split = line.split("=");
                this.map.put(split[0], split[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void print() {
        Scanner input = new Scanner(System.in);
        StudentManager sm = new StudentManager();
        while (true) {
            System.out.printf("\n------%s------", this.map.get("menu"));
            System.out.printf("\n1. %s", this.map.get("add"));
            System.out.printf("\n2. %s", this.map.get("search"));
            System.out.printf("\n3. %s", this.map.get("update"));
            System.out.printf("\n4. %s", this.map.get("delete"));
            System.out.printf("\n5. %s", this.map.get("save"));
            System.out.printf("\n6. %s", this.map.get("lang"));
            System.out.printf("\n7. %s", this.map.get("exit"));
            System.out.printf("\n%s", this.map.get("choose"));
            int c = Integer.parseInt(input.nextLine());
            
            switch (c) {
                case 1:
                    sm.add();
                    break;
                case 2:
                    System.out.println("name");
                    String name = input.nextLine();
                    Student st = sm.Search(name);
                    if (st != null) {
                        System.out.println(st);
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case 3:
                    sm.Update();
                    break;
                case 4:
                    sm.save();
                    break;
                case 5:
                    System.out.println("File name:");
                    String nameFile = input.nextLine();
                    sm.load(nameFile);
                    break;
                case 6:
                    System.out.print(this.map.get("mess"));
                    int la = Integer.parseInt(input.nextLine());
                    if (la == 1)
                        this.loadData("en");
                    else if (la == 2)
                        this.loadData("vi");
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not valid");
            }
        }

    }
}
