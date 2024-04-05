package com.tirzasrwn.app.m04;

public class Lingkaran {
    double phi = 3.14;
    double jari;

    // Konstruktor default
    public Lingkaran() {
        jari = 0.0;
    }

    // Konstruktor copy object 1
    public Lingkaran(Lingkaran lingkaran) {
        this.jari = lingkaran.jari;
    }

    // Konstruktor copy object 2
    public Lingkaran(Lingkaran lingkaran, double phi) {
        this.jari = lingkaran.jari;
        this.phi = phi;
    }

    // Konstruktor copy object 3
    public Lingkaran(Lingkaran lingkaran, int pengali) {
        this.jari = lingkaran.jari * pengali;
    }

    // Konstruktor copy 1
    public Lingkaran(double jari) {
        this.jari = jari;
    }

    // Konstruktor copy 2
    public Lingkaran(double jari, double phi) {
        this.jari = jari;
        this.phi = phi;
    }

    // Konstruktor copy 3
    public Lingkaran(int jari) {
        this.jari = jari;
    }

    public void setJari(double jari0) {
        this.jari = jari0;
    }

    public double jari() {
        return (jari);
    }

    public double luas() {
        double luas0;
        luas0 = phi * jari * jari;
        return (luas0);
    }

    public double diameter() {
        return (2 * jari);
    }

    public double keliling() {
        return (2 * phi * jari);
    }

    public void tampil() {
        System.out.println("jari jari: " + jari);
        System.out.println("luas: " + luas());
        System.out.println("diameter: " + diameter());
    }
}
