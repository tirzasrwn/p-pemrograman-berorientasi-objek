package com.tirzasrwn.app.m08.geometri;

public class Lingkaran {
    private Titik pusat;
    private double jariJari;

    public Lingkaran(Titik pusat, double jariJari) {
        this.pusat = pusat;
        this.jariJari = jariJari;
    }

    public double luas() {
        return Math.PI * Math.pow(jariJari, 2);
    }

    public double keliling() {
        return 2 * Math.PI * jariJari;
    }

    @Override
    public String toString() {
        return "Lingkaran{" + "pusat=" + pusat + ", jariJari=" + jariJari + '}';
    }
}
