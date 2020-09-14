package main.test3;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author san
 */
public class TestClass03 {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person(1, "1234556"));
        people.add(new Person(1, "1234567"));
        people.add(new Person(2, "1234568"));
        people.add(new Person(3, "1234569"));

        HashSet<Person> set = new HashSet<>(people);

        //id相同 对象不同
        System.out.println(set.size());
    }
}
