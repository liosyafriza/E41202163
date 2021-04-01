/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_minggu4;

import java.util.Arrays;
import java.util.Scanner;

public class tugas_A {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int panjang = 0;
        System.out.print("input panjang nilai : ");
        panjang = s.nextInt();
        int[] angka = new int[panjang];

        for (int i = 0; i < panjang; i++) {
            System.out.print("nilai ke " + i + " : ");
            angka[i] = s.nextInt();
        }
        
        System.out.print("Array semua\t\t\t: ");
        System.out.print("[ ");
        for (int i : angka) {
            System.out.print(i + " ");
        }
        System.out.println("]");
        
        System.out.print("Array Genap\t\t\t: ");
        System.out.print("[ ");
        for (int i : angka) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("]");
        
        Arrays.sort(angka);
        System.out.print("Array urut[kecil-besar]\t: ");
        System.out.print("[ ");
        for (int i : angka) {
            System.out.print(i + " ");
        }
        System.out.print("]");

    }
}
