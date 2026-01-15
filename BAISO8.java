/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;

import java.util.Scanner;
public class BAISO8 {

    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mat khau can kiem tra: ");
        String password = sc.nextLine();

        // 1. Kiem tra do dai
        if (password.length() < 8) {
            System.out.println("Mat khau YEU: Phai co it nhat 8 ky tu.");
            return;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        // Chuoi chua cac ky tu dac biet de so sanh
        String specialChars = "!@#$%^&*()-_=+[]{};:,.<>?/";

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (specialChars.contains(String.valueOf(c))) {
                hasSpecial = true;
            }
        }

        // Ket luan
        if (hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Mat khau MANH: Hop le!");
        } else {
            System.out.println("Mat khau CHUA DU MANH. Can co du:");
            if (!hasUpper) System.out.println("- Chu hoa");
            if (!hasLower) System.out.println("- Chu thuong");
            if (!hasDigit) System.out.println("- Chu so");
            if (!hasSpecial) System.out.println("- Ky tu dac biet");
        }
    }
    
}
