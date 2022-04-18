package com.bakrie.calculator;

import javax.swing.*;
import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        int pil;
        Calculator calc= new Calculator(); // instansiasi kelas kalkulator

        do {
            System.out.println();
            System.out.println("------------------");
            System.out.println("MENU:");
            System.out.println("1 -> Penjumlahan");
            System.out.println("2 -> Pengurangan");
            System.out.println("3 -> Perkalian");
            System.out.println("4 -> Pembagian");
            System.out.println("5 -> Modulus");
            System.out.println("6 -> Keluar");
            System.out.println("------------------");

            System.out.print("Masukkan Pilihan : ");
            pil=calc.inputAngka();
            calc.pilihmenu(pil);

        } while (pil!=5);



    }
}
