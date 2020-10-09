package test02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
        list.add("b");
        list.add("c");

        Set set = new HashSet();

        for (String item : list) {
            set.add(item);
        }

        System.out.println(set);
    }
}
