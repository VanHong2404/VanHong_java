/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3.pkg2.pkg2;

/**
 *
 * @author Hong Beo
 */
public class Bai322 {

    public static void main(String[] args) {
        System.out.println("Các cách chia 3.000.000 VNĐ là:");
        for (int i = 0; i <= 30; ++i) {
            for (int j = 0; j <= 15; ++j) {
                for (int k = 0; k <= 6; ++k) {
                    if (i * 100000 + j * 200000 + k * 500000 == 3000000) {
                        System.out.println("\n" + i + " tờ 100.000(VND) - " + j + " tờ 200.000(VND) - " + k + " tờ 500.000(VND) ");
                    }
                }
            }
        }

    }
}
