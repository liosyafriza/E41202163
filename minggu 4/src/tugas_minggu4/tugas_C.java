/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_minggu4;

import java.util.Scanner;

public class tugas_C {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("masukan nilai : ");
        int panjang = s.nextInt();
        int[] angka = new int[panjang];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("masukkan angka ke " + (i + 1) + ":");
            angka[i] = s.nextInt();
        }
        int max = angka[0];
        int min = angka[0];

        for (int i = 0; i < angka.length; i++) {
            if (max < angka[i]) {
                max = angka[i];
            }
            if (min > angka[i]) {
                min = angka[i];
            }
        }
        
        int rata = 0;
        int total = 0;
        
        for (int i : angka) {
            total = total + i;
        }
        
        rata = total / angka.length;
        
        System.out.println("nilai minimum = " + min);
        System.out.println("nilai maximum = " + max);
        System.out.println("nilai rata rata = " + rata);
    }
}
