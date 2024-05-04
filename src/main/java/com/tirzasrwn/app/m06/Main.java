package com.tirzasrwn.app.m06;

import java.lang.Math;

// Kelas Lingkaran
class Lingkaran {
    // Atribut
    protected double jariJari;

    // Konstruktor
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Metode untuk menghitung luas lingkaran
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    // Metode untuk menghitung keliling lingkaran
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
}

// Kelas Setengah Lingkaran yang merupakan turunan dari kelas Lingkaran
class SetengahLingkaran extends Lingkaran {
    // Konstruktor
    public SetengahLingkaran(double jariJari) {
        super(jariJari);
    }

    // Override metode luas() untuk setengah lingkaran
    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari / 2;
    }

    // Override metode keliling() untuk setengah lingkaran
    @Override
    public double keliling() {
        return Math.PI * jariJari + (2 * jariJari);
    }
}

// Contoh penggunaan kelas Lingkaran dan SetengahLingkaran
public class Main {
    public static void main(String[] args) {
        // Membuat objek lingkaran
        Lingkaran lingkaran = new Lingkaran(5);
        // Menghitung dan mencetak luas lingkaran
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        // Menghitung dan mencetak keliling lingkaran
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        // Membuat objek setengah lingkaran
        SetengahLingkaran setengahLingkaran = new SetengahLingkaran(5);
        // Menghitung dan mencetak luas setengah lingkaran
        System.out.println("Luas Setengah Lingkaran: " + setengahLingkaran.luas());
        // Menghitung dan mencetak keliling setengah lingkaran
        System.out.println("Keliling Setengah Lingkaran: " + setengahLingkaran.keliling());
    }
}
