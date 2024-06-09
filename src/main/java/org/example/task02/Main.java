package org.example.task02;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple("japko");
        System.out.println(apple);
        Orange orange = new Orange("pomarancza");
        System.out.println(orange);
        Pear pear = new Pear("gruszka");
        System.out.println(pear);

        Tree tree = new Tree();
        Fruit[] fruits = tree.snapFruits();
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
