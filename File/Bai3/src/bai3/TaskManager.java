/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Hong Beo
 */
public class TaskManager {
    private Task[] listTasks;
    private final int MAX=10;
    private int count;

    public TaskManager() {
        this.listTasks = new Task[MAX];
        this.count=0;
    }
    
    public void add(Task task) throws FileNotFoundException, IOException{
        
        listTasks[this.count]=task;
        count++; 
        String taskPath = "task.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(taskPath, true));
        oos.writeObject(task);
        oos.flush();
        oos.close();
        System.out.println("Save success!");
    }
    public void showAll(){
        for (int i = 0; i < this.count; i++) {
            System.out.println(this.listTasks[i]);
        }
    }
    public void show(){
       for (int i = 0; i < this.count; i++) {
            System.out.println(this.listTasks[i].getId()+"|"+this.listTasks[i].getTitle()+"|"+this.listTasks[i].isDone());
        } 
    }
    public void ShowDone(boolean isDone){
        System.out.println("Name of task: ");
        for (int i = 0; i < count; i++) {
           if(isDone==listTasks[i].isDone()){
               System.out.println(listTasks[i].getTitle());
           }
        }
  
    }

    public void load(String path){
        try {
       ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
       Task data = (Task) ois.readObject();
            System.out.println("Load data Successful");
       ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void updateStatus(int id, boolean done){
        for (int i = 0; i < count; i++) {
            if (done != listTasks[i].isDone()) {
                listTasks[i].setDone(done);
                System.out.println("Update success!");
            }else{
                System.out.println("Error!");
            }
        }
    }
   
}
