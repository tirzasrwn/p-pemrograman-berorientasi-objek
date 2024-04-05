package com.tirzasrwn.app.m05;

public class Product {
    private String nama;
    private int harga;

    public Product(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
}
