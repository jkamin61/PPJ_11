package org.example.task03;

public class Dog extends Animal {
    public Dog(String species) {
        super(species);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
