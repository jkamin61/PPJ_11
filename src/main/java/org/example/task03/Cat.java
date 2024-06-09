package org.example.task03;

public class Cat extends Animal {
    public Cat(String species) {
        super(species);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
