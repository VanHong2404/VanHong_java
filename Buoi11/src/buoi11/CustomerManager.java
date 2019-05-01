/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi11;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class CustomerManager {
 private ArrayList<Customer> list;
    private String dir = "F:\\VanHong_java\\Buoi11\\cus.dat";

    public CustomerManager() {
        this.list = new ArrayList<>();
    }

    public boolean load(String file) {
        
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            ArrayList<Customer> data = (ArrayList<Customer>) ois.readObject();
            this.list = data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return true;
    }

    public void add() {
        Scanner sr = new Scanner(System.in);
        Customer cus = new Customer();
        System.out.println("ID");
        cus.setId(sr.nextInt());
        sr.nextLine();
        System.out.println("Name");
        cus.setName(sr.nextLine());
        System.out.println("Address:");
        cus.setAddress(sr.nextLine());
        System.out.println("Age:");
        cus.setAge(sr.nextInt());
        this.list.add(cus);

    }

    public Customer search(int id) {
        for (Customer customer : list) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    public boolean save() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dir));
            oos.writeObject(this.list);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}
