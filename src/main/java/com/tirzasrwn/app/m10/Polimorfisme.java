package com.tirzasrwn.app.m10;

abstract class Bentuk {
    // Metode abstrak untuk luas dan keliling
    public abstract double luas();

    public abstract double keliling();
}

// BujurSangkar.java
class BujurSangkar extends Bentuk {
    private double sisi;

    // Konstruktor dengan satu parameter
    public BujurSangkar(double sisi) {
        this.sisi = sisi;
    }

    // Konstruktor tanpa parameter (default)
    public BujurSangkar() {
        this.sisi = 0;
    }

    // Konstruktor dengan dua parameter (misal untuk menambah dua sisi)
    public BujurSangkar(double sisi1, double sisi2) {
        this.sisi = sisi1 + sisi2;
    }

    // Implementasi metode luas
    @Override
    public double luas() {
        return sisi * sisi;
    }

    // Implementasi metode keliling
    @Override
    public double keliling() {
        return 4 * sisi;
    }

    // Getter untuk atribut sisi
    public double getSisi() {
        return sisi;
    }

    // Setter untuk atribut sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}

// Polimorfisme.java
public class Polimorfisme {
    public static void main(String[] args) {
        // Polimorfisme dengan konstruktor superclass
        Bentuk bentuk1 = new BujurSangkar(5.0);
        Bentuk bentuk2 = new BujurSangkar();
        Bentuk bentuk3 = new BujurSangkar(2.0, 3.0);

        // Memanggil metode luas dan keliling
        System.out.println("Luas Bujur Sangkar 1: " + bentuk1.luas());
        System.out.println("Keliling Bujur Sangkar 1: " + bentuk1.keliling());

        System.out.println("Luas Bujur Sangkar 2: " + bentuk2.luas());
        System.out.println("Keliling Bujur Sangkar 2: " + bentuk2.keliling());

        System.out.println("Luas Bujur Sangkar 3: " + bentuk3.luas());
        System.out.println("Keliling Bujur Sangkar 3: " + bentuk3.keliling());
    }
}
