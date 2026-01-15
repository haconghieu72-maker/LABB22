/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;


public class BAISO19 {

    
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int hang = 2, cot = 3;

        System.out.println("Ma tran ban dau:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) System.out.print(a[i][j] + " ");
            System.out.println();
        }

        System.out.println("Ma tran chuyen vi:");
        for (int j = 0; j < cot; j++) {
            for (int i = 0; i < hang; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
