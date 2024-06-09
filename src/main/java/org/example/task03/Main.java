package org.example.task03;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Dog"),
                new Cat("Cat"),
                new Cow("Cow")
        };

        for (Animal animal : animals) {
            System.out.print(animal.species + ": ");
            animal.makeSound();
        }
    }
}
