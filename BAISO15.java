/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;

import java.util.Scanner;
public class BAISO15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        
        String[] dsTu = s.split(" "); // Cat chuoi thanh mang cac tu
        String ketQua = "";

        for (String tu : dsTu) {
            String tuDaoNguoc = "";
            // Chay nguoc tu ky tu cuoi den ky tu dau cua tu do
            for (int i = tu.length() - 1; i >= 0; i--) {
                tuDaoNguoc += tu.charAt(i);
            }
            ketQua += tuDaoNguoc + " "; // Noi vao chuoi ket qua
        }

        System.out.println("Ket qua: " + ketQua.trim());
    }
    }
    

