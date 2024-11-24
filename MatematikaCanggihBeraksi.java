/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        MatematikaCanggih mtk = new MatematikaCanggih();

        System.out.println("Masukkan Pilihan anda : ");
        mtk.pilihan = input.nextInt();

        System.out.println("Masukkan angka pertama : ");
        mtk.angka1 = input.nextInt();

        System.out.println("Masukkan angka kedua : ");
        mtk.angka2 = input.nextInt();

        mtk.getpilihan();
    }
}
  

