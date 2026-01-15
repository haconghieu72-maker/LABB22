/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;

import java.util.Scanner;
public class BAISO5 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi can kiem tra: ");
        String input = sc.nextLine();

        // Buoc 1: Loai bo khoang trang va ky tu dac biet
        // Chuyen tat ca ve chu thuong de khong phan biet hoa-thuong
        String cleanStr = "";
        input = input.toLowerCase();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Chi lay ky tu tu 'a'-'z' hoac '0'-'9'
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                cleanStr += c;
            }
        }

        // Buoc 2: Kiem tra doi xung
        boolean laPalindrome = true;
        int doDai = cleanStr.length();
        
        for (int i = 0; i < doDai / 2; i++) {
            // So sanh ky tu o dau va ky tu tuong ung o cuoi
            if (cleanStr.charAt(i) != cleanStr.charAt(doDai - 1 - i)) {
                laPalindrome = false;
                break;
            }
        }

        // Buoc 3: Ket luan
        if (laPalindrome && cleanStr.length() > 0) {
            System.out.println("Day la chuoi Palindrome.");
        } else {
            System.out.println("Day KHONG phai chuoi Palindrome.");
        }
    }
    
}
