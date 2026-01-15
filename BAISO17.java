/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;


public class BAISO17 {

    
    public static void main(String[] args) {
      int[] a = {12, 5, 8, 3, 10, 7, 2};
        int[] chan = new int[a.length];
        int[] le = new int[a.length];
        int soChan = 0, soLe = 0;

        for (int x : a) {
            if (x % 2 == 0) {
                chan[soChan++] = x;
            } else {
                le[soLe++] = x;
            }
        }

        System.out.print("Mang chan: ");
        for (int i = 0; i < soChan; i++) System.out.print(chan[i] + " ");
        
        System.out.print("\nMang le: ");
        for (int i = 0; i < soLe; i++) System.out.print(le[i] + " ");
    }
 }
    

