package com.tirzasrwn.app.m01;

class Siswa {
    String nama;
    String alamat;
    int nilai;

    public void setSiswa(String nama, String alamat, int nilai) {
        this.nama = nama;
        this.alamat = alamat;
        this.nilai = nilai;
    }

    public void tampil() {
        System.out.println("Nama siswa : " + nama);
        System.out.println("Alamat siswa: " + alamat);
        System.out.println("Nilai siswa: " + nilai);
    }

    public static void main(String[] args) {
        Siswa s = new Siswa();
        s.setSiswa("Tiza Sarwono", "Klaten", 100);
        s.tampil();
    }
}
