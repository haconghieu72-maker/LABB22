/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;


public class BAISO16 {

    
    public static void main(String[] args) {
       int[] a = {1, 5, 7, -1, 5};
        int k = 6;
        
        System.out.println("Cac cap co tong bang " + k + " la:");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == k) {
                    System.out.println("(" + a[i] + ", " + a[j] + ")");
                }
            }}
        
    }
    
}
