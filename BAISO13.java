/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;


public class BAISO13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "   lap trinh   java  ";
        s = s.trim().replaceAll("\\s+", " ");
        String[] tu = s.split(" ");
        String kq = "";
        for (String x : tu) {
            kq += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        System.out.println("Ket qua: [" + kq.trim() + "]");
    }
}
    

