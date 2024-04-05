package com.tirzasrwn.app.m04;

public class Animal {
    private String species;
    private int age;

    // Constructors

    // Default Constructor
    public Animal() {
        this.species = "Unknown";
        this.age = 0;
    }

    // Copy Object Constructor
    public Animal(Animal other) {
        this.species = other.species;
        this.age = other.age;
    }

    // Copy Constructor
    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    // Getters and Setters
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Main method
    public static void main(String[] args) {
        // Default constructor
        Animal animal1 = new Animal();
        System.out.println("Default Animal: Species - " + animal1.getSpecies() + ", Age - " + animal1.getAge());

        // Copy object constructor
        Animal animal2 = new Animal(animal1);
        System.out.println("Copied Animal: Species - " + animal2.getSpecies() + ", Age - " + animal2.getAge());

        // Copy constructor
        Animal animal3 = new Animal("Dog", 5);
        System.out.println("New Animal: Species - " + animal3.getSpecies() + ", Age - " + animal3.getAge());
    }
}
