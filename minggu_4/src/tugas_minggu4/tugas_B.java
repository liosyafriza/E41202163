/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_minggu4;

/**
 *
 * @author ASUS
 */
public class tugas_B {

    public static void main(String[] args) {
        System.out.println("do__while");
        System.out.println(" kelipatan 2(0-100)");
        System.out.println("===========================");
        int i = 0;
        do {
            i = i + 2;
            System.out.print(i + " ");
        } while(i <= 100);   
        System.out.println("");
        System.out.println("Bilangan [perkalian 2 {0-100)");
        System.out.println("===============================");
        int j = 0;
        do {
            if (j == 0) {
                j = 1;
            } else {
                System.out.print(j * 2 + " ");
            }
            j++;
        } while(j <= 100);
    }
}
