package xuzhiqiang;

import java.util.ArrayList;

public class questionTwo {
    /**
     *编写一个泛型方法，使之能处理所有Fruit子类的集合
     * @param args
     */
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banner banner = new Banner();

        ArrayList<Fruit> fruits = new ArrayList<>();

        fruits.add(apple);
        fruits.add(banner);

        handleFruit(fruits);
    }

    public static <T extends Fruit> void handleFruit(ArrayList<T> fruits) {
        System.out.println(fruits);
    }

}

interface Fruit {

}

class Apple implements Fruit {

}

class Banner implements Fruit {

}
