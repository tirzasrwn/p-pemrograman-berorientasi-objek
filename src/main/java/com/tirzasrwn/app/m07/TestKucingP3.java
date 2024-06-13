package com.tirzasrwn.app.m07;

class HewanP3 {
    public void move() {
        System.out.println("Hewans dapat move");
    }
}

class KucingP3 extends HewanP3 {
    public void move() {
        super.move();
        System.out.println("Kucings dapat walk dan run");
    }
}

public class TestKucingP3 {
    public static void main(String args[]) {
        HewanP3 b = new KucingP3();
        b.move();
    }
}
