package com.tirzasrwn.app.m05;

public class Dosen {
    private String nama;
    private Jurusan jurusan;

    public Dosen(String nama, Jurusan jurusan) {
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }
}
