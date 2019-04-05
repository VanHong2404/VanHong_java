/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexception;

/**
 *
 * @author Hong Beo
 */
public class StudentManager {
     private static final int max=10;
    private Student[] students;
    private int count;

    public StudentManager() {
        this.students = new Student[max];
        count=0;
    }
    public void addStudents(){
        Input i=new Input();
            String id=i.inputId();
        String name=i.inputName();
        Double mark=i.inputMark();
        String phone=i.inputPhone();
        Student s=new Student(id, name, mark, phone);
        students[count]=s;
        count++;
    }
    public void listStudent(){
        
        System.out.println("========Danh Sách=========");
        
        for(int i=0;i<count;i++){
            System.out.println(students[i]);
        }
    }
    public void showTop(int number){
        getOrderList();
        for(int i=0;i<number;i++){
            System.out.println(students[i]);
        }
    }
    private Student[] getOrderList(){
        for(int i=0;i<count-1;i++){
            for(int j=i+1;j<count;j++){
                if(students[i].getMark()<students[j].getMark()){
                    Student temp=students[i];
                    students[i]=students[j];
                    students[j]=temp;
                }
            }
        }
        return students;
    }
}
   
