/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;

public class BAISO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {10, 5, 10, 9, 7};
        int max1 = -1, max2 = -1;

        for (int x : a) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2 && x != max1) {
                max2 = x;
            }
        }
        if (max2 == -1) System.out.println("Khong ton tai so lon thu hai");
        else System.out.println("So lon thu hai la: " + max2);
    }
 }
    

