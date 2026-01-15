/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;

import java.util.Scanner;
public class BAISO18 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cap ma tran vuong n: ");
        int n = sc.nextInt();
        int[][] mt = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A["+i+"]["+j+"] = ");
                mt[i][j] = sc.nextInt();
            }
        }

        int tongChinh = 0, tongPhu = 0;
        for (int i = 0; i < n; i++) {
            tongChinh += mt[i][i];
            tongPhu += mt[i][n - 1 - i];
        }

        System.out.println("Tong duong cheo chinh: " + tongChinh);
        System.out.println("Tong duong cheo phu: " + tongPhu);
    }
    }
    

