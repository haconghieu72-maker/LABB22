/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;

import java.util.Scanner;
import java.util.Random;
public class BAISO20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Random rd = new Random();
        int soMay = rd.nextInt(100) + 1; // Sinh so tu 1 den 100
        Scanner sc = new Scanner(System.in);
        int soLanToiDa = 7;
        boolean thang = false;

        System.out.println("May da chon mot so tu 1-100. Ban co 7 lan de doan!");

        for (int i = 1; i <= soLanToiDa; i++) {
            System.out.print("Lan doan thu " + i + ": ");
            int doan = sc.nextInt();

            if (doan == soMay) {
                System.out.println("Chuc mung! Ban da doan dung so " + soMay);
                thang = true;
                break;
            } else if (doan < soMay) {
                System.out.println("So ban doan dang NHO hon so cua may.");
            } else {
                System.out.println("So ban doan dang LON hon so cua may.");
            }
        }

        if (!thang) {
            System.out.println("Ban da het luot. So dung la: " + soMay);
        }
    }
    
}
