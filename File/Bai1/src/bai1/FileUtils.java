/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;
import java.io.File;
import java.util.Date;
/**
 *
 * @author Hong Beo
 */
public class FileUtils {
      public void getFolder(String path) {
        File f = new File(path);
        File[] folder = f.listFiles();
        for (File file : folder) {
            if (file.isDirectory()) {
                System.out.println(file.getAbsolutePath());
            }
        }

    }

    public void getFile(String path) {
        File f = new File(path);
        if (f.exists()) {
            File[] listFiles = f.listFiles();
            for (File listFile : listFiles) {
                if (listFile.isFile()) {
                    System.out.println(listFile.getName());
                }

            }
        } else {
            System.out.println("File không tồn tại!");
        }
    }

    public void getFileImg(String path) {
        File f = new File(path);
        if (f.exists()) {
            File[] listFiles = f.listFiles();
            for (File listFile : listFiles) {
                if (listFile.getAbsolutePath().endsWith(".jpg")) {
                    System.out.println(listFile.getName());
                } else if (listFile.getAbsolutePath().endsWith(".png")) {
                    System.out.println(listFile.getName());
                } else if (listFile.getAbsolutePath().endsWith(".jpeg")) {
                    System.out.println(listFile.getName());
                }
            }
        } else {
            System.out.println("Không tồn tại!");
        }
    }

    public void getFileExt(String path, String extName) {
        File f = new File(path);
        if (f.exists()) {
            File[] listFiles = f.listFiles();
            for (File listFile : listFiles) {
                if (listFile.getAbsolutePath().endsWith(extName)) {
                    System.out.println(listFile.getName());
                }
            }
        } else {
            System.out.println("File không tồn tại!");
        }
    }

    public void getLastUpdate(String path) {
        File f = new File(path);
        if (f.exists()) {
            long lastModify = f.lastModified();
            Date date = new Date(lastModify);
            System.out.println(date);
        }
    }

    public void size(String path) {
        File f = new File(path);
        if (f.exists()) {
            double bytes = f.length();
            double kilobytes = (bytes / 1024);
            double megabytes = (kilobytes / 1024);
            System.out.println("Size of file:");
            System.out.println(megabytes + "MB");
            System.out.println(kilobytes + "Kb");

        }
    }

}
