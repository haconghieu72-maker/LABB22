/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;


public class BAISO4 {

    
    public static void main(String[] args) {
       int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxTong = a[0], hienTai = a[0];

        for (int i = 1; i < a.length; i++) {
            if (hienTai + a[i] > a[i]) hienTai += a[i];
            else hienTai = a[i];
            
            if (hienTai > maxTong) maxTong = hienTai;
        }
        System.out.println("Tong lon nhat mang con: " + maxTong);
    }
 }
    

