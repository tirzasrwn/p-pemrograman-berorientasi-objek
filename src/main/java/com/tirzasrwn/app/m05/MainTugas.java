package com.tirzasrwn.app.m05;

public class MainTugas {
    public static void main(String[] args) {
        // Membuat objek pembeli
        Pembeli pembeli = new Pembeli("Tirza Sarwono");

        // Membuat array produk
        Product[] products = new Product[3];
        products[0] = new Product("Buku", 50000);
        products[1] = new Product("Pensil", 10000);
        products[2] = new Product("Penggaris", 15000);

        // Membuat objek transaksi
        TransaksiJual transaksi = new TransaksiJual(pembeli);

        // Menambahkan produk ke dalam transaksi
        for (Product product : products) {
            transaksi.tambahProduct(product);
        }

        // Memproses transaksi
        transaksi.prosesTransaksi();
    }
}
