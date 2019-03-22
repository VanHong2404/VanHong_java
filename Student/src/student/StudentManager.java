/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class StudentManager {
    private static final int MAX_STUDENT =20;
    private Student[] listStudents;
    private int i;
    
    Scanner sc = new Scanner(System.in);
    int numbers = 0;

    public StudentManager() {
        this.listStudents = new Student[MAX_STUDENT];
        
    }

    public StudentManager(Student[] listStudents) {
        this.listStudents = listStudents;
    }

    

    public Student[] getLiStudents() {
        return listStudents;
    }

    public void setLiStudents(Student[] liStudents) {
        this.listStudents = liStudents;
    }

    
    public boolean add(Student stud) {
        if (listStudents.length <= numbers) {
            return false;
        }
        listStudents[numbers] = stud;
        numbers++;
        return  true;
        
    }

    public void search(String name) {       
        for ( i = 0; i < listStudents.length; i++) {
            if (name.equalsIgnoreCase(listStudents[i].getName())) { //kiểm tra hết các phần tử cả in hoa và thường
                listStudents[i].Insv();
            } else {
                System.out.println("Không tìm thấy tên : " + name);
            }

        }
    }

    public void list() {
        for ( i = 0; i < numbers; i++) {
            listStudents[i].Insv();
        }
    }

    public void list(boolean order) { // sắp xếp
        for (i = 0; i < listStudents.length - 1; i++) {
            for (int j = i + 1; j < listStudents.length; j++) {
                if (order) {
                    if (listStudents[i].getName().compareTo(listStudents[j].getName()) > 0) { // hương thức String compareTo() trong Java có hai form. Phương thức đầu tiên so sánh String này với đối tượng Object khác và phương thức thứ hai so sánh hai chuỗi theo từ điển.
                        Student temp = listStudents[i];
                        listStudents[i] = listStudents[j];
                        listStudents[j] = temp;
                    }
                } else {
                    if (listStudents[i].getName().compareTo(listStudents[j].getName()) < 0) {
                        Student temp = listStudents[i];
                        listStudents[i] = listStudents[j];
                        listStudents[j] = temp;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();
        
        
		boolean cont = true;
		do {
                        System.out.println("Chức năng");
                        System.out.println("1. List");
                        System.out.println("2. Search");
                        System.out.println("3. Add");
                        System.out.println("4. Exit");
			System.out.println("Chọn chức năng : [1- 4]");
			int chon = sc.nextInt();
			switch (chon) {
			case 1:                              
				sm.list();                               
				break;
			case 2:                               
				String name = sc.nextLine();
                                System.out.println("Nhập tên sinh viên muốn tìm kiếm");
                                name=sc.nextLine();
                                sm.search(name);
				break;
			case 3:                              
                                Student std = new Student();
                                std.Nhapsv(); // sinh viên được tạo ra sẽ đc lưu trữ vào std
				sm.add(std);
				break;
			default:				
				cont = false;
				break;
			}
		} while (cont);
        
    }
    }

    