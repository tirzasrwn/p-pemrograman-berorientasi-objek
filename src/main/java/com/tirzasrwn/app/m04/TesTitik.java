package com.tirzasrwn.app.m04;

public class TesTitik {

    public static void main(String[] args) {
        Titik a = new Titik();
        a.tampilkanTitik();
        Titik b = new Titik(10, 10);
        b.tampilkanTitik();
        Titik c = new Titik(10);
        c.tampilkanTitik();

        Titik d = new Titik(5.5f);
        d.tampilkanTitik();
        Titik e = new Titik(5.5f, 9.5f);
        e.tampilkanTitik();

        Titik f = new Titik(20.5);
        f.tampilkanTitik();
        Titik g = new Titik(20.5, 45.5);
        g.tampilkanTitik();
    }
}
