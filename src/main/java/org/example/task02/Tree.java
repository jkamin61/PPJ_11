package org.example.task02;

import java.util.Random;

public class Tree {
    public Fruit snapFruit() {
        Random random = new Random();
        int fruitLottery = random.nextInt(3);
        switch (fruitLottery) {
            case 0 -> {
                return new Apple("Apple");
            }
            case 1 -> {
                return new Pear("Pear");
            }
            case 2 -> {
                return new Orange("Orange");
            }
            default -> throw new IllegalStateException("Unexpected value: " + fruitLottery);
        }
    }

    public Fruit[] snapFruits() {
        Fruit[] fruits = new Fruit[100];
        double value = 0;
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = snapFruit();
            value += fruits[i].weight;
            if (value >= 5000) {
                break;
            }
        }
        return fruits;
    }

}
