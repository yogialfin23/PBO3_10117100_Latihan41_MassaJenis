package com.company;

import java.util.Objects;

public class Kubus extends Main {
    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int hitungVolume(int parSisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    public int hitungMassaJenis(int parMassa, int volume) {
        return massa / volume;
    }

}
