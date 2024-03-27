package com.tirzasrwn.app.m04;

public class TesGaris {

    public static void main(String[] args) {
        Titik titikAwal = new Titik(1, 2);
        Titik titikAkhir = new Titik(5, 6);

        Garis garis1 = new Garis();
        garis1.tampilkanGaris();

        Garis garis2 = new Garis(titikAwal, titikAkhir);
        garis2.tampilkanGaris();

        Garis garis3 = new Garis(3, 4, 7, 8);
        garis3.tampilkanGaris();

        Garis garis4 = new Garis(1.5f, 2.5f, 5.5f, 6.5f);
        garis4.tampilkanGaris();

        Garis garis5 = new Garis(0.5, 1.5, 4.5, 5.5);
        garis5.tampilkanGaris();
    }
}
