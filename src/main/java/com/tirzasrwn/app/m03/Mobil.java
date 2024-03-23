package com.tirzasrwn.app.m03;

public class Mobil {
    private String merek;
    private String model;

    // Constructor
    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }

    // Overload method untuk menampilkan informasi singkat
    public void info() {
        System.out.println("Mobil " + merek + " " + model);
    }

    // Overload method untuk menampilkan informasi lengkap
    public void info(boolean detail) {
        if (detail) {
            System.out.println("Mobil " + merek + " " + model);
            // Tambahan informasi detail bisa ditambahkan di sini
        } else {
            info(); // Panggil metode info() tanpa argumen
        }
    }

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza");
        Mobil mobil2 = new Mobil("Honda", "City");

        mobil1.info(); // Memanggil metode info() tanpa argumen
        mobil2.info(true); // Memanggil metode info() dengan argumen boolean
    }
}
