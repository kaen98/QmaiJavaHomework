package test01;

import java.util.ArrayList;

/**
 * @author san
 */
public class TestClass {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("xxx");

        list.remove(5);

        System.out.println(list);

    }
}
