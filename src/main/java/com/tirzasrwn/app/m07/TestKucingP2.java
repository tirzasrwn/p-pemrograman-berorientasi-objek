package com.tirzasrwn.app.m07;

class HewanP2 {
    public void move() {
        System.out.println("Hewans dapat move");
    }
}

class KucingP2 extends HewanP2 {
    public void move() {
        System.out.println("Kucings dapat walk dan run");
    }

    public void Meong() {
        System.out.println("Kucings dapat Meong");
    }
}

public class TestKucingP2 {
    public static void main(String args[]) {
        HewanP2 a = new HewanP2();
        HewanP2 b = new KucingP2();
        a.move();
        b.move();
        // b.Meong();
        ((KucingP2) b).Meong();
    }
}
