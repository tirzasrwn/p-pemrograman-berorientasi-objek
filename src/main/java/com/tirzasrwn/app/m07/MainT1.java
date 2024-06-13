package com.tirzasrwn.app.m07;

class Mobil {
    String merek;
    String model;
    int tahun;

    public Mobil(String merek, String model, int tahun) {
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
    }

    public void info() {
        System.out.println("Mobil: " + merek + " " + model + ", Tahun: " + tahun);
    }
}

class MobilSport extends Mobil {
    boolean turbo;

    public MobilSport(String merek, String model, int tahun, boolean turbo) {
        super(merek, model, tahun);
        this.turbo = turbo;
    }

    @Override
    public void info() {
        String statusTurbo = turbo ? "dengan turbo" : "tanpa turbo";
        System.out.println("Mobil Sport: " + merek + " " + model + ", Tahun: " + tahun + ", " + statusTurbo);
    }
}

public class MainT1 {
    public static void main(String[] args) {
        Mobil mobilBiasa = new Mobil("Toyota", "Avanza", 2020);
        mobilBiasa.info();

        MobilSport mobilSport = new MobilSport("Ferrari", "458 Italia", 2022, true);
        mobilSport.info();
    }
}
