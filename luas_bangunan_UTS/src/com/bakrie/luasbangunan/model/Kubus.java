package com.bakrie.luasbangunan.model;

public class Kubus extends BangunRuang{
    int sisi;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public int keliling() {
        return 12 * sisi;
    }

    @Override
    public int volume() {
        return sisi * sisi * sisi;
    }
}
