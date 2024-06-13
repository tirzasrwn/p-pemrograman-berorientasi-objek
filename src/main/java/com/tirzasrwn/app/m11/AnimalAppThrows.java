package com.tirzasrwn.app.m11;

class AnimalThrows {
    private String name;

    public AnimalThrows(String name) {
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

public class AnimalAppThrows {
    public static void main(String[] args) {
        AnimalThrows dog = new AnimalThrows("Dog");
        AnimalThrows cat = new AnimalThrows(null); // This will trigger an exception

        try {
            processAnimal(dog);
            processAnimal(cat);
        } catch (Exception e) {
            System.err.println("Error in main: " + e.getMessage());
        }
    }

    public static void processAnimal(AnimalThrows animal) throws Exception {
        try {
            animal.eat();
            animal.sleep();
        } finally {
            System.out.println(animal.getName() + " has finished its routine.");
        }
    }
}
