/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;
import java.util.Scanner;
public class BAISO3 {

    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int temp = n, tong = 0;
        int soChuSo = String.valueOf(n).length();

        while (temp > 0) {
            int chuSo = temp % 10;
            tong += Math.pow(chuSo, soChuSo);
            temp /= 10;
        }

        if (tong == n) System.out.println(n + " la so Armstrong");
        else System.out.println(n + " khong phai so Armstrong");
    }
}
    

