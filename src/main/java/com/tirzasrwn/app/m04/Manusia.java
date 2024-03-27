package com.tirzasrwn.app.m04;

public class Manusia {
    private int umur;
    private String nama;

    public Manusia() {
        umur = 0;
        nama = "";
    }

    public Manusia(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }

    public static void main(String[] args) {
        Manusia m1 = new Manusia();
        m1.info();
        Manusia m2 = new Manusia(20, "Altha");
        m2.info();
    }
}
