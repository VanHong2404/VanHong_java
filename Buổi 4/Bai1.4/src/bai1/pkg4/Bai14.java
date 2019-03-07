/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.pkg4;

import java.util.Scanner;

/**
 *
 * @author Hong Beo
 */
public class Bai14 {

     private String name;
            private int age;
            private String addr;
            protected double monney; // laays gia tri ve sau
            protected double hour;
           public Bai14() {
               
           }
           public static void main(String[] args) {
        Bai14 sv = new Bai14();
        sv.setName("Huy");
               System.out.println(sv.getName());
        sv.inputInfo();
        sv.printInfo();
        sv.tinhthuong(sv.hour,sv.monney);
           }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }

        public double getMonney() {
            return monney;
        }

        public void setMonney(double monney) {
            this.monney = monney;
        }

        public double getHour() {
            return hour;
        }

        public void setHour(int hour) {
            this.hour = hour;
        }
         public void inputInfo ()
         {
             System.out.println("Nhập thông tin của nhân viên");
             Scanner sc = new Scanner(System.in);
             System.out.println("Nhập tên:");
             name=sc.nextLine();
             System.out.println("Nhập địa chỉ:");
             addr=sc.nextLine();
             System.out.println("Nhập tuổi:");
             age=sc.nextInt();             
             System.out.println("Nhập lương:");
             monney=sc.nextDouble();
             System.out.println("Nhập giờ làm :");
             hour=sc.nextDouble();
         }
        public void printInfo()
        {
            System.out.println("Ten: "+name+" Tuoi:"+age+" Dia chi: "+addr+" Lương: "+monney+" Gio lam :"+hour);
        }
        public float tinhthuong( double hour, double monney)
        {
            float thuong;
            if (hour >=200)
            {
              thuong=(float)(monney*0.2);
                System.out.println("Tiền thưởng của nhân viên là : " +thuong);
            }
            else if (200> hour && hour >=100)
            {
                thuong=(float)(monney*0.1);
                System.out.println("Tiền thưởng của nhân viên là : " +thuong);
            }
            else 
            {
                System.out.println("Không có thưởng");
            }
                return 0;
               
              
        }
    
}
