package com.tirzasrwn.app.m08;

import com.tirzasrwn.app.m08.kendaraan.*;

public class TestKendaraan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota");
        mobil.info();

        Motor motor = new Motor("Honda");
        motor.info();
    }

}
