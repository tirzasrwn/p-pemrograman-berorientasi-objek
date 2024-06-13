package com.tirzasrwn.app.m07;

class BujurSangkar {
    private double sisi;

    public BujurSangkar(double sisi) {
        this.sisi = sisi;
    }

    public double luas() {
        return sisi * sisi;
    }

    public double keliling() {
        return 4 * sisi;
    }
}

class PersegiPanjang extends BujurSangkar {
    private double panjang;

    public PersegiPanjang(double panjang, double lebar) {
        super(lebar);
        this.panjang = panjang;
    }

    @Override
    public double luas() {
        return panjang * super.luas();
    }

    @Override
    public double keliling() {
        return 2 * (panjang + super.keliling());
    }
}

public class MainL1 {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar(5);
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 6);

        System.out.println("Luas Bujur Sangkar: " + bujurSangkar.luas());
        System.out.println("Keliling Bujur Sangkar: " + bujurSangkar.keliling());

        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());
    }
}
