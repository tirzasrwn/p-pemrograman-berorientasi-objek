package com.tirzasrwn.app.m02;

public class Main2 {
    public static void main(String[] args) {
        int i;
        Lingkaran[] a;
        int jumlahLingkaran = 20;
        a = new Lingkaran[jumlahLingkaran];
        for (i = 0; i < jumlahLingkaran; i++) {
            a[i] = new Lingkaran();
            a[i].setJari(05.00 * i);
        }
        System.out.println("--> Menampilkan lingkaran dengan jari-jari kurang dari 25:");
        for (i = 0; i < jumlahLingkaran; i++) {
            if (a[i].jari() < 25.00) {
                System.out.println("Lingkaran ke: " + i);
                a[i].tampil();
            }
        }

        System.out.println("--> Menampilkan lingkaran dengan diameter kurang dari 60:");
        for (i = 0; i < jumlahLingkaran; i++) {
            if (a[i].diameter() < 60.00) {
                System.out.println("Lingkaran ke: " + i);
                a[i].tampil();
            }
        }

        System.out.println("--> Menampilkan lingkaran dengan luas antara 100 sampai 1000:");
        for (i = 0; i < jumlahLingkaran; i++) {
            if (a[i].luas() > 100 && a[i].luas() < 1000.00) {
                System.out.println("Lingkaran ke: " + i);
                a[i].tampil();
            }
        }

        System.out.println("--> Menampilkan lingkaran dengan keliling antara 100 sampai 500:");
        for (i = 0; i < jumlahLingkaran; i++) {
            if (a[i].keliling() > 100 && a[i].keliling() < 500.00) {
                System.out.println("Lingkaran ke: " + i);
                a[i].tampil();
            }
        }

    }
}
