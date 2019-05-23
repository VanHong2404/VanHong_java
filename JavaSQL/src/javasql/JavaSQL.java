/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Hong Beo
 */
public class JavaSQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        Manage m=new Manage();
        Scanner sc = new Scanner(System.in);
        int number=0;
        do {
            System.out.println("________________Chào mừng các bạn nhỏ đến với thư viện NVH____________________");
            System.out.println("1.Hiển thị tên,khoa của các độc giả và sắp xếp theo khoa");
            System.out.println("2.Tìm những độc giả mượn sách bất kì vào ngày bất kì");
            System.out.println("3.Thông tin tên, thẻ, và sách mượn của toàn bộ độc giả mượn trong tháng");
            System.out.println("4.Danh sách những quyển sách đen đủi không ai mượn");
            System.out.println("5.Số lần mượn sách của độc giả bất kì");
            System.out.println("6.Danh sách tên ,số thẻ các độc giả chưa trả sách");
            System.out.println("7. Exit");
            System.out.println("Mời bạn chọn yêu cầu:");
            number = sc.nextInt();
            switch (number) {
                case 1:
                    m.C1();
                        break;
                case 2: System.out.println("bookname >");
                    String ten = sc.nextLine(); sc.nextLine();
                    System.out.println("date>");
                    String ngay = sc.nextLine();
                    m.C2(ten, ngay);
                    break;
                case 3:m.C3("2014-8-2");
                    break;
                case 4:m.C4();
                    break;
                case 5:
                    System.out.println("Name:");
                    String tenStr = sc.nextLine();
                    sc.nextLine();
                    m.C5(tenStr);
                    break;
                case 6:m.C6();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Not valid");
            }
        } while (true);

    }

}

