package com.tirzasrwn.app.m08;

import com.tirzasrwn.app.m08.geometri.*;

public class Main {
    public static void main(String[] args) {
        // Membuat objek titik
        Titik titikA = new Titik(0, 0);
        Titik titikB = new Titik(3, 0);
        Titik titikC = new Titik(3, 4);

        // Membuat objek segitiga
        Segitiga segitiga = new Segitiga(titikA, titikB, titikC);
        System.out.println("Segitiga: " + segitiga);
        System.out.println("Keliling Segitiga: " + segitiga.keliling());

        // Membuat objek lingkaran
        Lingkaran lingkaran = new Lingkaran(titikA, 5);
        System.out.println("Lingkaran: " + lingkaran);
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
    }
}
