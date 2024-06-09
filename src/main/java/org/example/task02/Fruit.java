package org.example.task02;

import java.util.Random;

public class Fruit {
    String name;
    double weight;

    public Fruit(String name) {
        Random random = new Random();
        this.name = name;
        double value = random.nextDouble(100,250);
        double scale = Math.pow(10,2);
        this.weight = Math.round(value * scale) / scale;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
