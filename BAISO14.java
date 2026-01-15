/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;

import java.util.Scanner;
public class BAISO14 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        // 1. Loai bo khoang trang o dau va cuoi chuoi
        String chuoiDaXuLy = s.trim();

        // 2. Kiem tra neu chuoi rong sau khi trim thi so tu la 0
        if (chuoiDaXuLy.isEmpty()) {
            System.out.println("So tu trong chuoi la: 0");
        } else {
            // 3. Cat chuoi dua tren mot hoac nhieu khoang trang lien tiep
            // "\\s+" la bieu thuc chinh quy dai dien cho khoang trang (dau cach, tab...)
            String[] dsTu = chuoiDaXuLy.split("\\s+");
            
            System.out.println("So tu trong chuoi la: " + dsTu.length);
        }
    }
    
}
