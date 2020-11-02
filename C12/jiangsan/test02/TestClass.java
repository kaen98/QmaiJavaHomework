package test02;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author san
 */
public class TestClass {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("一");
        set.add("站");
        set.add("式");
        set.add("门");
        set.add("店");
        set.add("运");
        set.add("营");
        set.add("服");
        set.add("务");
        set.add("平");

        set.remove("门");
        set.remove("店");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(set);

        System.out.println(treeSet);
    }
}
