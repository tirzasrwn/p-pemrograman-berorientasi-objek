package com.tirzasrwn.app.m05;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Jurusan
        Jurusan jurusan = new Jurusan("Informatika");

        // Membuat objek Dosen
        Dosen dosen = new Dosen("Wagito, S.T., M.T.", jurusan);

        // Membuat objek MataKuliah
        MataKuliah matkul1 = new MataKuliah("Pemrograman Berorientasi Objek", dosen);
        MataKuliah matkul2 = new MataKuliah("Pemrograman Web Server", dosen);

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("Sparkle Harmony", jurusan);

        // Mahasiswa mengambil MataKuliah
        mahasiswa.ambilMataKuliah(matkul1);
        mahasiswa.ambilMataKuliah(matkul2);

        // Menampilkan informasi Mahasiswa dan MataKuliah yang diambil
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("Jurusan: " + mahasiswa.getJurusan().getNama());
        System.out.println("Mata Kuliah yang diambil:");
        for (MataKuliah mataKuliah : mahasiswa.getMataKuliahList()) {
            System.out.println("- " + mataKuliah.getNama() + " (Dosen: " + mataKuliah.getDosen().getNama() + ")");
        }
    }
}
