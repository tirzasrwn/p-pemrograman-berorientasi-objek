package com.tirzasrwn.app.m08.geometri;

public class Segitiga {
    private Titik p1;
    private Titik p2;
    private Titik p3;

    public Segitiga(Titik p1, Titik p2, Titik p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double keliling() {
        double d1 = distance(p1, p2);
        double d2 = distance(p2, p3);
        double d3 = distance(p3, p1);
        return d1 + d2 + d3;
    }

    private double distance(Titik a, Titik b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    @Override
    public String toString() {
        return "Segitiga{" + "p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + '}';
    }
}
