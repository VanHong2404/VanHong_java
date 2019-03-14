/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4.pkg4;

/**
 *
 * @author Hong Beo
 */
public class Bai44 {

     private int a;

    public Bai44() {
    }

    public Bai44(int x) {
        int check=1;
        if(x==0||x==1){
            check=0;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0) check=0;
        }
        if(check==1) this.a=x;
        else System.out.println(x+" KHÔNG phải là số nguyên tố");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if(isSoNguyenTo(a)==true){
            this.a=a;
        }
        System.out.println("Không set");
    }
    public boolean isSoNguyenTo(int x) {
        if(x==0||x==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0) return false;
        }
        return true;
    }
    public int timSoNguyenToTiepTheo(){
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập a: ");
        a=input.nextInt();
        if(isSoNguyenTo(a)==true){
            for (int i = a+1; ; i++) {
                if(isSoNguyenTo(i)==true) {
                    return i;
                }
                
            }
        }
        else System.out.println("số a không phải số nguyên tố");
        
        return 0;
    }
}
    public static void main(String[] args) {
        Bai44 snt = new Bai44(3);
        snt.timSoNguyenToTiepTheo();
            }
        }
