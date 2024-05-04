package com.tirzasrwn.app.m06;

class Bujursangkar {
    protected double sisi;

    public Bujursangkar(double sisi) {
        this.sisi = sisi;
    }

    public double luas() {
        return sisi * sisi;
    }

    public double keliling() {
        return 4 * sisi;
    }
}

class Segiempat extends Bujursangkar {
    public Segiempat(double sisi) {
        super(sisi);
    }
}

public class MainTugas {
    public static void main(String[] args) {
        Bujursangkar bujursangkar = new Bujursangkar(5);
        System.out.println("Luas Bujursangkar: " + bujursangkar.luas());
        System.out.println("Keliling Bujursangkar: " + bujursangkar.keliling());

        Segiempat segiempat = new Segiempat(7);
        System.out.println("Luas Segiempat: " + segiempat.luas());
        System.out.println("Keliling Segiempat: " + segiempat.keliling());
    }
}
