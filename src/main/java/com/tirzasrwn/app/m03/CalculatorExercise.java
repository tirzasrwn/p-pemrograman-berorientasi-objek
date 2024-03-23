package com.tirzasrwn.app.m03;

public class CalculatorExercise {
    public int tambah() {
        return 0;
    }

    public double tambah(double a) {
        return a * 2;
    }

    public double tambah(double a, double b) {
        return a + b;
    }

    public String tambah(String a, String b) {
        return a + b;
    }

    public int tambah(int a) {
        return a * 2;
    }

    public int tambah(int a, int b) {
        return a + b;
    }

    public String tambah(String a) {
        return a + a;
    }

    public int kali() {
        return 0;
    }

    public double kali(double a) {
        return a * 2;
    }

    public double kali(double a, double b) {
        return a * b;
    }

    public int kali(int a) {
        return a * 2;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public int kurang() {
        return 0;
    }

    public double kurang(double a) {
        return a;
    }

    public double kurang(double a, double b) {
        return a - b;
    }

    public int kurang(int a) {
        return a;
    }

    public int kurang(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        CalculatorExercise cal = new CalculatorExercise();
        System.out.println(cal.tambah());
        System.out.println(cal.tambah(7.00));
        System.out.println(cal.tambah(5.00, 7.00));
        System.out.println(cal.tambah("Hello", ", world!"));
        System.out.println(cal.tambah(7));
        System.out.println(cal.tambah(5, 7));
        System.out.println(cal.tambah("Hello, world!"));

        System.out.println(cal.kali());
        System.out.println(cal.kali(7.00));
        System.out.println(cal.kali(5.00, 7.00));
        System.out.println(cal.kali(7));
        System.out.println(cal.kali(5, 7));

        System.out.println(cal.kurang());
        System.out.println(cal.kurang(7.00));
        System.out.println(cal.kurang(5.00, 7.00));
        System.out.println(cal.kurang(7));
        System.out.println(cal.kurang(5, 7));
    }
}
