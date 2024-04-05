package com.tirzasrwn.app.m05;

public class MataKuliah {
    private String nama;
    private Dosen dosen;

    public MataKuliah(String nama, Dosen dosen) {
        this.nama = nama;
        this.dosen = dosen;
    }

    public String getNama() {
        return nama;
    }

    public Dosen getDosen() {
        return dosen;
    }
}
