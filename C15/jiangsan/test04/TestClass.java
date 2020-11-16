package main.test04;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        strings.add("A1");
        strings.add("A2");
        strings.add("A3");
        strings.add("A4");

        List<Object> objects1 = (List<Object>) (List) strings;

        System.out.println(objects1);

    }
}
