package com.tirzasrwn.app.m04;

public class Person {
    private String name;
    private int age;

    // Constructors

    // Default Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Copy Object Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Copy Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        Person person1 = new Person();
        System.out.println("Default Person: Name - " + person1.getName() + ", Age - " + person1.getAge());

        // Copy object constructor
        Person person2 = new Person(person1);
        System.out.println("Copied Person: Name - " + person2.getName() + ", Age - " + person2.getAge());

        // Copy constructor
        Person person3 = new Person("John", 30);
        System.out.println("New Person: Name - " + person3.getName() + ", Age - " + person3.getAge());
    }
}
