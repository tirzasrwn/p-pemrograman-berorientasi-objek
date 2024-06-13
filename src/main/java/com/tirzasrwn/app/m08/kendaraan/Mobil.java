package com.tirzasrwn.app.m08.kendaraan;

public class Mobil {
    private String merek;

    public Mobil(String merek) {
        this.merek = merek;
    }

    public void info() {
        System.out.println("Ini adalah mobil merek " + merek);
    }
}
