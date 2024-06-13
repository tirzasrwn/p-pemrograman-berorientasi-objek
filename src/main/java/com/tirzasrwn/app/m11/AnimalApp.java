package com.tirzasrwn.app.m11;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() throws Exception {
        if (name == null) {
            throw new Exception("Animal name is null, cannot eat.");
        }
        System.out.println(name + " is eating.");
    }

    public void sleep() throws Exception {
        if (name == null) {
            throw new Exception("Animal name is null, cannot sleep.");
        }
        System.out.println(name + " is sleeping.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class AnimalApp {
    public static void main(String[] args) {
        Animal dog = new Animal("Dog");
        Animal cat = new Animal(null); // This will trigger an exception

        processAnimal(dog);
        processAnimal(cat);
    }

    public static void processAnimal(Animal animal) {
        try {
            animal.eat();
            animal.sleep();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println(animal.getName() + " has finished its routine.");
        }
    }
}
