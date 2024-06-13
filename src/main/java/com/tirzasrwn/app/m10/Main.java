package com.tirzasrwn.app.m10;

abstract class Animal {
    private String name;

    // Konstruktor
    public Animal(String name) {
        this.name = name;
    }

    // Metode abstrak untuk suara hewan
    public abstract String makeSound();

    // Getter untuk atribut name
    public String getName() {
        return name;
    }

    // Setter untuk atribut name
    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {

    // Konstruktor
    public Dog(String name) {
        super(name);
    }

    // Implementasi metode makeSound
    @Override
    public String makeSound() {
        return "Woof";
    }
}

class Cat extends Animal {

    // Konstruktor
    public Cat(String name) {
        super(name);
    }

    // Implementasi metode makeSound
    @Override
    public String makeSound() {
        return "Meow";
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Dog dan Cat menggunakan referensi tipe Animal
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        // Memanggil metode makeSound pada masing-masing objek
        System.out.println(dog.getName() + " says: " + dog.makeSound());
        System.out.println(cat.getName() + " says: " + cat.makeSound());

        // Contoh array dari tipe Animal
        Animal[] animals = { new Dog("Rex"), new Cat("Mittens"), new Dog("Fido") };

        // Menggunakan loop untuk memanggil metode makeSound pada setiap objek
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says: " + animal.makeSound());
        }
    }
}
