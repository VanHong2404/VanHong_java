/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bi2.pkg4;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Hong Beo
 */
public class Bi24 {

    private Pattern pattern; 
    private static final String MaSV = "^[a-z0-9._-]{1,8}$";  
    private String maSv,lop;
    private double diemTB;
    private int tuoi;

    public Bi24() {
        pattern = Pattern.compile(MaSV);
    }
    
    public Bi24(String maSv, String lop, double diemTB, int tuoi) {
        this.maSv = maSv;
        this.lop = lop;
        this.diemTB = diemTB;
        this.tuoi = tuoi;
    }

    public String getMaSv() {
        return maSv;
    }

    public String getLop() {
        return lop;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void inputInfo()
    {
        Scanner sr = new Scanner(System.in);
      //  do {            
        System.out.println("Nhập lớp");
        setLop(sr.nextLine());  
        System.out.println("Nhập mã sv:");
        setMaSv(sr.nextLine());
        System.out.println("Nhập điểm TB");
        setDiemTB(sr.nextDouble());
        System.out.println("Nhập tuổi");
        setTuoi(sr.nextInt());
        
//        } while (this.maSv.length()!=8||(this.diemTB>=0||this.diemTB<=10)||this.tuoi>18
//        );
        
    }
    public  void showInfo()
    {
        System.out.println("Mã sv:"+getMaSv());
        System.out.println("Điểm TB:"+getDiemTB());
        System.out.println("Tuổi:"+getTuoi());
        System.out.println("Lớp:"+getLop());
        System.out.println("Đạt học bổng:"+this.datHB());
    }
    public boolean datHB()
    {
        if(this.diemTB>=8)
        {
            return true;
           
        }
        else
        {
            return false;
            
        }
     

    }
    public static void main(String[] args) {
        Bi24 st= new Bi24();
        st.inputInfo();
        System.out.println("Thông tin SV:");
        st.showInfo();
    }
        }