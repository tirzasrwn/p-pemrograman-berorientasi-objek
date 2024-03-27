package com.tirzasrwn.app.m04;

public class Titik {
    int x;
    int y;

    float a;
    float b;

    double r;
    double s;

    public Titik() {
        System.out.println("Konstruktor titik 1 dijalankan!");
    }

    public Titik(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Konstruktor titik 2 dijalankan!");
    }

    public Titik(int x) {
        this.x = x;
        this.y = x;
        System.out.println("Konstruktor titik 3 dijalankan!");
    }

    public Titik(float a) {
        this.a = a;
        this.b = a;
        System.out.println("Konstruktor titik 4 dijalankan!");
    }

    public Titik(float a, float b) {
        this.a = a;
        this.b = b;
        System.out.println("Konstruktor titik 5 dijalankan!");
    }

    public Titik(double r) {
        this.r = r;
        this.s = r;
        System.out.println("Konstruktor titik 6 dijalankan!");
    }

    public Titik(double r, double s) {
        this.r = r;
        this.s = s;
        System.out.println("Konstruktor titik 7 dijalankan!");
    }

    public void tampilkanTitik() {
        if (x > 0) {
            System.out.println("Koordinat titik: (" + x + ", " + y + ")");
        } else if (a > 0) {
            System.out.println("Koordinat titik: (" + a + ", " + b + ")");
        } else if (r > 0) {
            System.out.println("Koordinat titik: (" + r + ", " + s + ")");
        } else {
            System.out.println("Koordinat titik: (0, 0)");
        }
    }
}
