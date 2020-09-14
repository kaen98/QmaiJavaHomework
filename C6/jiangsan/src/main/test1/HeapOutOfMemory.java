package main.test1;

import java.util.ArrayList;

/**
 * @author san
 */
public class HeapOutOfMemory {

    public static void main(String[] args) {
        System.out.println("HeapOutOfMemory");

        ArrayList<Person> people = new ArrayList<>();

        int counter = 0;

        while (true) {
            people.add(new Person());
            System.out.println((++counter));
        }
    }
}
