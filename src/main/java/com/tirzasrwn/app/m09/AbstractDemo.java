package com.tirzasrwn.app.m09;

public class AbstractDemo {

    public static void main(String[] args) {
        // Karyawan e = new Karyawan("George W.", "Huston, TX", 43);
        // System.out.println("\n Panggil mail pakai Karyawan");
        // e.mailCheck();

        Gaji s = new Gaji("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Karyawan e = new Gaji("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("\nPanggil mailCheck pakai Gaji");
        s.mailCheck();
        System.out.println("\nPanggil mailCheck pakai Karyawan");
        e.mailCheck();
    }
}
