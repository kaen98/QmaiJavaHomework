package test05;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author san
 */

public class TestClass {
    public static void main(String[] args) {

        Goods goods1 = new Goods(1, "Java", 10.22f, "2010-12-01 12:12:12");
        Goods goods2 = new Goods(2, "PHP", 20.22f, "2021-12-01 12:12:12");
        Goods goods3 = new Goods(3, "C++", 13.22f, "2019-12-01 12:12:12");
        Goods goods4 = new Goods(4, "JavaScript", 50.22f, "2018-12-01 12:12:12");


        TreeSet<Goods> treeSet = new TreeSet<>();

        treeSet.add(goods1);
        treeSet.add(goods2);
        treeSet.add(goods3);
        treeSet.add(goods4);

        System.out.println(treeSet);
    }
}
