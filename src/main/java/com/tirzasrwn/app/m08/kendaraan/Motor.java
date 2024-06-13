package com.tirzasrwn.app.m08.kendaraan;

public class Motor {
    private String merk;

    public Motor(String merk) {
        this.merk = merk;
    }

    public void info() {
        System.out.println("Ini adalah motor merk " + merk);
    }
}
