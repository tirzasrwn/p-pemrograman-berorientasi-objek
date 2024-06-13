package com.tirzasrwn.app.m09;

// Abstract class Geometri
abstract class Geometri {
    // Abstract method to calculate area
    public abstract double hitungLuas();

    // Abstract method to calculate perimeter
    public abstract double hitungKeliling();

    // Concrete method to display details
    public void tampilkanDetail() {
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}

// Concrete class Lingkaran
class Lingkaran extends Geometri {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

// Concrete class Persegi
class Persegi extends Geometri {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}

// Main class to demonstrate the usage of Geometri abstract class
public class Main {
    public static void main(String[] args) {
        Geometri lingkaran = new Lingkaran(5.0);
        Geometri persegi = new Persegi(4.0);

        System.out.println("Detail Lingkaran:");
        lingkaran.tampilkanDetail();

        System.out.println("\nDetail Persegi:");
        persegi.tampilkanDetail();
    }
}
