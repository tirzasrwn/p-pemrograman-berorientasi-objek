package com.tirzasrwn.app.m01;

import java.time.LocalDate;
import java.time.Period;

public class Pekerja {
    String nama;
    String jabatan;
    double gaji;
    LocalDate tanggalMasuk;

    public Pekerja(String nama, String jabatan, double gaji, LocalDate tanggalMasuk) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
        this.tanggalMasuk = tanggalMasuk;
    }

    public double hitungGajiTahunan() {
        return gaji * 12;
    }

    public int lamaBekerja() {
        LocalDate tanggalHariIni = LocalDate.now();
        Period periode = Period.between(tanggalMasuk, tanggalHariIni);
        return periode.getYears();
    }

    public void tampilkanInfoPekerja() {
        System.out.println("Informasi Pekerja:");
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: $" + gaji);
        System.out.println("Tanggal Masuk: " + tanggalMasuk);
        System.out.println("Lama Bekerja: " + lamaBekerja() + " tahun");
        System.out.println("Gaji Tahunan: $" + hitungGajiTahunan());
    }

    public static void main(String[] args) {
        LocalDate tanggalMasuk = LocalDate.of(2020, 12, 01);
        Pekerja pekerja1 = new Pekerja("Tirza Sarwono", "Backend", 8000, tanggalMasuk);
        pekerja1.tampilkanInfoPekerja();
    }
}
