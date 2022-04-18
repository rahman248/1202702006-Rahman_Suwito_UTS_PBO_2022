package com.bakrie.luasbangunan.model;

public class LimasPersegiPanjang extends BangunRuang{
    int panjang;
    int lebar;
    int tinggi;


    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public int keliling() {
        return (2*(panjang + lebar)) + (4 * tinggi);
    }

    @Override
    public int volume() {
        return panjang * lebar * tinggi / 3;
    }
}
