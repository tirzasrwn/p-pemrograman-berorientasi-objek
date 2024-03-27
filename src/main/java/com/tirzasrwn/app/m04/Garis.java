package com.tirzasrwn.app.m04;

public class Garis {
    Titik titikAwal;
    Titik titikAkhir;

    public Garis() {
        System.out.println("Konstruktor garis 1 dijalankan!");
        titikAwal = new Titik();
        titikAkhir = new Titik();
    }

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        System.out.println("Konstruktor garis 2 dijalankan!");
    }

    public Garis(int x1, int y1, int x2, int y2) {
        this.titikAwal = new Titik(x1, y1);
        this.titikAkhir = new Titik(x2, y2);
        System.out.println("Konstruktor garis 3 dijalankan!");
    }

    public Garis(float a1, float b1, float a2, float b2) {
        this.titikAwal = new Titik(a1, b1);
        this.titikAkhir = new Titik(a2, b2);
        System.out.println("Konstruktor garis 4 dijalankan!");
    }

    public Garis(double r1, double s1, double r2, double s2) {
        this.titikAwal = new Titik(r1, s1);
        this.titikAkhir = new Titik(r2, s2);
        System.out.println("Konstruktor garis 5 dijalankan!");
    }

    public void tampilkanGaris() {
        System.out.println("Koordinat titik awal garis:");
        titikAwal.tampilkanTitik();
        System.out.println("Koordinat titik akhir garis:");
        titikAkhir.tampilkanTitik();
    }
}
