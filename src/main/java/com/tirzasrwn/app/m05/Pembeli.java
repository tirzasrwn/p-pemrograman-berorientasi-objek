package com.tirzasrwn.app.m05;

public class Pembeli {
    private String nama;

    public Pembeli(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void beliProduct(Product product) {
        // Implementasi logika pembelian
        System.out.println(nama + " membeli " + product.getNama());
    }
}
