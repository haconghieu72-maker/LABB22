/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;


 import java.util.Scanner;
public class BAISO2 {

  
   
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        int[] dem = new int[256];

        for (int i = 0; i < s.length(); i++) {
            dem[s.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (dem[i] > 0) {
                System.out.println("Ky tu '" + (char)i + "' xuat hien: " + dem[i] + " lan");
            }
        }
    }
    
}
