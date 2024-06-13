package com.tirzasrwn.app.m08;

public class Mahasiswa {
    public int Nim;
    protected String Nama;
    private String Jurusan;

    // membuat method dengan acces modifier yang berbeda-beda
    private int getNim() {
        return Nim;
    }

    public void setNim(int nim) {
        Nim = nim;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    protected String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String jurusan) {
        Jurusan = jurusan;
    }

    /*
     * Membuat method Tampil dengan Access Modifier Default.
     * pada method ini, kita akan membuktikan hak akses dari setiap tipe access
     * modifier
     */
    void Tampil() {
        System.out.println(getNim());
        System.out.println(getNama());
        System.out.println(getJurusan());
    }

    public static void main(String[] args) {
        // membuat object dari class Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();
        // mengakses method yang memiliki tipe public
        mhs1.setNama("Yudhi");
        mhs1.setNim(115410025);
        mhs1.setJurusan("Teknik Informatika");
        // mengakses method Tampil() yang memiliki
        // tipe Default
        mhs1.Tampil();
    }
}
