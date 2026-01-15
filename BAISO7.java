/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;


public class BAISO7 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};
        int[] result = new int[a.length + b.length];
        int k = 0;
        
        // Gộp mảng
        for(int x : a) result[k++] = x;
        for(int x : b) result[k++] = x;
        
        System.out.print("Ket qua loai trung: ");
        for(int i = 0; i < k; i++) {
            boolean isRepeat = false;
            for(int j = 0; j < i; j++) {
                if(result[i] == result[j]) {
                    isRepeat = true;
                    break;
                }
            }
            if(!isRepeat) System.out.print(result[i] + " ");
        }
    }
    
}
