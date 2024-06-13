package com.tirzasrwn.app.m09;

abstract class Animal {
    // Properti umum untuk semua hewan
    private String name;
    private int age;

    // Konstruktor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter untuk properti
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Metode abstrak yang harus diimplementasikan oleh subclass
    public abstract void makeSound();

    // Metode umum yang dapat digunakan oleh semua subclass
    public void info() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        // Membuat objek Dog dan Cat
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);

        // Menggunakan metode info() dan makeSound()
        dog.info();
        dog.makeSound();

        cat.info();
        cat.makeSound();
    }
}
