package com.tirzasrwn.app.m05;

import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private Jurusan jurusan;
    private ArrayList<MataKuliah> mataKuliahList;

    public Mahasiswa(String nama, Jurusan jurusan) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.mataKuliahList = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void ambilMataKuliah(MataKuliah mataKuliah) {
        mataKuliahList.add(mataKuliah);
    }

    public ArrayList<MataKuliah> getMataKuliahList() {
        return mataKuliahList;
    }
}
