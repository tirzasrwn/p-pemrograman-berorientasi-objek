package com.tirzasrwn.app.m05;

import java.util.ArrayList;

public class TransaksiJual {
    private Pembeli pembeli;
    private ArrayList<Product> products;

    public TransaksiJual(Pembeli pembeli) {
        this.pembeli = pembeli;
        this.products = new ArrayList<>();
    }

    public void tambahProduct(Product product) {
        products.add(product);
    }

    public void prosesTransaksi() {
        System.out.println("Transaksi untuk " + pembeli.getNama() + ":");
        int totalHarga = 0;
        for (Product product : products) {
            totalHarga += product.getHarga();
            System.out.println("- " + product.getNama() + " (Harga: " + product.getHarga() + ")");
        }
        System.out.println("Total harga: " + totalHarga);
    }
}
