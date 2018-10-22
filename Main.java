package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
public class Main {
    public static void main(String[] args) {
	Kubus objKubus = new Kubus();
	objKubus.setSisi(5);
	objKubus.setMassa(250);

        System.out.println("====== Massa Jenis Kubus ======");
        System.out.println("Sisi : " +objKubus.getSisi());
        System.out.println("Massa : " +objKubus.getMassa());
        System.out.println("\n===== Hasil Perhitungan =====");
        System.out.println("Volume : " +objKubus.hitungVolume(objKubus.getSisi()));
        System.out.println("Massa Jenis : " +objKubus.hitungMassaJenis(objKubus.getMassa(), objKubus.hitungVolume(objKubus.getSisi())));

    }
}
