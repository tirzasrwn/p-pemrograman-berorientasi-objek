package com.tirzasrwn.app.m03;

public class PenghitungLuas {
    // Metode untuk menghitung luas persegi
    public int hitungLuas(int sisi) {
        return sisi * sisi;
    }

    // Metode untuk menghitung luas persegi panjang
    public int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    // Metode untuk menghitung luas lingkaran
    public double hitungLuas(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        PenghitungLuas penghitung = new PenghitungLuas();

        // Contoh pemanggilan metode untuk menghitung luas
        System.out.println("Luas Persegi dengan sisi 5: " + penghitung.hitungLuas(5));
        System.out.println("Luas Persegi Panjang dengan panjang 4 dan lebar 6: " + penghitung.hitungLuas(4, 6));
        System.out.println("Luas Lingkaran dengan radius 3.5: " + penghitung.hitungLuas(3.5));
    }
}
