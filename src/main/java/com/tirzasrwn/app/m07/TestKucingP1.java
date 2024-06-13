package com.tirzasrwn.app.m07;

class HewanP1 {
    public void move() {
        System.out.println("Hewans dapat move");
    }
}

class KucingP1 extends HewanP1 {
    public void move() {
        System.out.println("Kucings dapat walk dan run");
    }
}

public class TestKucingP1 {
    public static void main(String args[]) {
        HewanP1 a = new HewanP1();
        HewanP1 b = new KucingP1();
        a.move();
        b.move();
    }
}
