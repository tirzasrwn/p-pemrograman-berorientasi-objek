package com.tirzasrwn.app.m03;

public class Calculation0 {
    private int a, b;

    // method mutator
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    // method acessor
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static void main(String args[]) {
        Calculation0 obj = new Calculation0();
        obj.setA(10);
        obj.setB(20);
        System.out.println("==Data==");
        System.out.println("Nilai pertama" + obj.getA());
        System.out.println("Nilai kedua" + obj.getB());
    }
}
