/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;


public class BAISO6 {

  
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 3, 4, 3, 2, 1};
        int soMax = a[0], maxLan = 0;

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) count++;
            }
            if (count > maxLan) {
                maxLan = count;
                soMax = a[i];
            }
        }
        System.out.println("So: " + soMax + " xuat hien " + maxLan + " lan");
    }
  }
    

