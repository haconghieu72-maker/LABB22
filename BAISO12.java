/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;


public class BAISO12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] a = {12, 45, 123};
        for (int x : a) {
            int temp = x, tong = 0;
            while (temp > 0) {
                tong += temp % 10;
                temp /= 10;
            }
            System.out.println("So " + x + " co tong chu so la: " + tong);
        }
    }
    
}
