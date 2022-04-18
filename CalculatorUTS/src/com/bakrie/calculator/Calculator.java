package com.bakrie.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator<Hasil> {
   String hasil;
    // method operasi tambah
    public int tambah(int a, int b){
        hasil = String.valueOf(a+b);
        return Integer.parseInt(hasil);
    }

    // method operasi kurang
    public int kurang(int a, int b){
        hasil = String.valueOf(a-b);
        return Integer.parseInt(hasil);
    }

    // method operasi kali
    public int kali(int a, int b){
        hasil= String.valueOf(a*b);
        return Integer.parseInt(hasil);
    }

    // method operasi bagi
    public float bagi(float a, float b){
        hasil= String.valueOf(a/b);
        return Float.parseFloat(hasil);
    }

    public int modulo(int a, int b){
        hasil= String.valueOf(a%b);
        return Integer.parseInt(hasil);
    }

    public String hasil() {
        return hasil;
    }


    // method untuk input angka
    public int inputAngka(){
        String a;
        int a2=0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            a=br.readLine();
            a2=Integer.parseInt(a);
        }
        catch (IOException e) {
            System.err.println("Error: " + e);
        }
        return a2;
    }

    // method pemilihan menu dan pemanggilan method2 sesuai pilihan
    public void pilihmenu(int pil) {
        int a = 0;
        int b = 0;
        float c = 0;

        switch (pil) {
            case 1:
                System.out.println("[Penjumlahan]");

                System.out.print("angka 1: ");
                a = this.inputAngka();
                System.out.print("angka 2: ");
                b = this.inputAngka();

                c = this.tambah(a, b);
                System.out.println("Hasil  Penjumlahan : " +  hasil());
                System.out.println();
                break;
            case 2:
                System.out.println("[Pengurangan]");
                System.out.print("angka 1: ");
                a = this.inputAngka();
                System.out.print("angka 2: ");
                b = this.inputAngka();

                c = this.kurang(a, b);
                System.out.println("Hasil Pengurangan  : " +  hasil());
                System.out.println();
                break;
            case 3:
                System.out.println("[Perkalian]");
                System.out.print("angka 1: ");
                a = this.inputAngka();
                System.out.print("angka 2: ");
                b = this.inputAngka();

                c = this.kali(a, b);
                System.out.println("Hasil Perkalian  : " +  hasil());
                System.out.println();
                break;
            case 4:
                System.out.println("[Pembagian]");
                System.out.print("angka 1: ");
                a = this.inputAngka();
                System.out.print("angka 2: ");
                b = this.inputAngka();

                c = this.bagi(a, b);
                System.out.println("Hasil Pembagian  : " +  hasil());
                System.out.println();
                break;

            case 5:
                System.out.println("[Modulus]");
                System.out.print("angka 1: ");
                a = this.inputAngka();
                System.out.print("angka 2: ");
                b = this.inputAngka();

                c = this.modulo(a, b);
                System.out.println("------------ /");
                System.out.println("Hasil Modulus  : " +  hasil());
                System.out.println();
                break;
            case 6:
                System.out.println("Anda Keluar");
                break;

            default:
                System.out.println("-----------");
                System.out.println("Salah Pilih");
                System.out.println("-----------");
        }
    }
}
