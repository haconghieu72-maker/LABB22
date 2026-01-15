/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;


public class BAISO11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] a = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int dem = 0;
        System.out.print("Cac so nguyen to: ");
        for (int x : a) {
            if (x < 2) continue;
            boolean laSNT = true;
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    laSNT = false;
                    break;
                }
            }
            if (laSNT) {
                System.out.print(x + " ");
                dem++;
            }
        }
        System.out.println("\nTong so nguyen to: " + dem);
    }
  }
    

