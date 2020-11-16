package main.test02;

import java.util.ArrayList;

public class TestClass {

    public static <T extends Fruit> void handleFruit(ArrayList<Fruit> fruits) {
        System.out.println(fruits);
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        ArrayList<Fruit> fruits = new ArrayList<>();

        fruits.add(apple);
        fruits.add(orange);

        handleFruit(fruits);
    }
}
