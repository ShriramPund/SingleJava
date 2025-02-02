package org.inheritanceExamples;

// Superclass

class SuperClass1 {
    // Properties of the superclass
    String name;
    int age;

    // Constructor of the superclass
    public SuperClass1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method of the superclass
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass that inherits from the Animal superclass
class ChildClass extends SuperClass1 {

    // Additional property specific to the subclass
    String breed;

    // Constructor for the subclass
    public ChildClass(String name, int age, String breed) {
        super(name, age);     // Call the constructor of the superclass
        this.breed = breed;
    }

    // Additional method specific to the subclass
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main class to demonstrate the functionality
public class DogSuperClassExample {
    public static void main(String[] args) {
        // Create an object of the subclass
    	ChildClass myDog = new ChildClass("Buddy", 3, "Golden Retriever");

        // Access methods from the superclass
        myDog.eat();
        myDog.sleep();

        // Access method from the subclass
        myDog.bark();
    }
}
