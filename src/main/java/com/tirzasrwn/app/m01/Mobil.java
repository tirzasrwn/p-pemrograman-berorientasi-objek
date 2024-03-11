package com.tirzasrwn.app.m01;

public class Mobil {
    String merk;
    int tahunProduksi;
    String warna;
    double kecepatan;

    public void setInfoMobil(String merk, int tahun, String warna, double kecepatan) {
        this.merk = merk;
        this.tahunProduksi = tahun;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    public void tampilkanInfo() {
        System.out.println("Informasi Mobil:");
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + kecepatan + " km/h");
    }

    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setInfoMobil("Honda", 2017, "Hitam", 272.0);
        m.tampilkanInfo();
    }
}
