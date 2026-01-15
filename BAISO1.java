/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;


 import java.util.Scanner;

public class BAISO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so sinh vien n: ");
        int n = sc.nextInt();
        
        String[] ma = new String[n];
        String[] ten = new String[n];
        double[] diem = new double[n];
        double tongDiem = 0;

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // Xoa bo nho dem
            System.out.println("Nhap thong tin SV thu " + (i + 1));
            System.out.print("Ma SV: "); ma[i] = sc.nextLine();
            System.out.print("Ten SV: "); ten[i] = sc.nextLine();
            System.out.print("Diem: "); diem[i] = sc.nextDouble();
            tongDiem += diem[i];
        }

        System.out.println("\nDiem trung binh ca lop: " + (tongDiem / n));
        System.out.println("\n--- Sinh vien DAT (>=5) ---");
        for (int i = 0; i < n; i++) {
            if (diem[i] >= 5) System.out.println(ma[i] + " - " + ten[i] + " - " + diem[i]);
        }
        System.out.println("\n--- Sinh vien KHONG DAT (<5) ---");
        for (int i = 0; i < n; i++) {
            if (diem[i] < 5) System.out.println(ma[i] + " - " + ten[i] + " - " + diem[i]);
        }
    }
    
}
