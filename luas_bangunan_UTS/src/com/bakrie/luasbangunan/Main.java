package com.bakrie.luasbangunan;

import com.bakrie.luasbangunan.model.Balok;
import com.bakrie.luasbangunan.model.Kubus;
import com.bakrie.luasbangunan.model.LimasPersegiPanjang;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Menu; 1. Balok; 2 .Kubus , 3. Limas Persegi panjang"));
        switch (pilihan) {
            case 1:
                Integer p, l, t, kelilingBalok, volumeBalok;
                p = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang: "));
                l = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar: "));
                t = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi: "));

                Balok balok = new Balok();
                balok.setPanjang(p);
                balok.setLebar( l);
                balok.setTinggi(t);

                kelilingBalok = balok.keliling();
                JOptionPane.showMessageDialog(null, "Luas Balok adalah: " + kelilingBalok);

                volumeBalok = balok.volume();
                JOptionPane.showMessageDialog(null, "Volume Balok adalah: " + volumeBalok);
                break;

            case 2:
                Integer s, kelilingKubus, volKubus;
                s = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Sisi: "));

                Kubus kubus = new Kubus();
                kubus.setSisi(s);


                kelilingKubus = kubus.keliling();
                JOptionPane.showMessageDialog(null, "Keliling adalah: " + kelilingKubus);

                volKubus = kubus.volume();
                JOptionPane.showMessageDialog(null, "Volume Kubus adalah: " + volKubus);


            case 3:
                Integer pLimas, lLimas, tLimas, kelilingLimas, volLimas;
                pLimas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang: "));
                lLimas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar: "));
                tLimas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi: "));

                LimasPersegiPanjang limas = new LimasPersegiPanjang();
                limas.setPanjang(pLimas);
                limas.setLebar(lLimas);
                limas.setTinggi(tLimas);

                kelilingLimas = limas.keliling();
                JOptionPane.showMessageDialog(null, "Keliling Limas adalah: " + kelilingLimas);

                volLimas = limas.volume();
                JOptionPane.showMessageDialog(null, "Volume Limas adalah: " + volLimas);
        }

    }
}
