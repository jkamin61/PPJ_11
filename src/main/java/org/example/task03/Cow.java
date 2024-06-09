package org.example.task03;

public class Cow extends Animal {
    public Cow(String species) {
        super(species);
    }

    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}
