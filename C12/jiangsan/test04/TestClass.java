package test04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * 编写一段程序，统计这段文字 中不重复词语的数量，并按序列打印输出
 *
 * @author san
 */
public class TestClass {

    public static void main(String[] args) {
        String str = "This class offers constant time performance for the basic operations add remove contains and size";
        String[] strArr = str.split(" ");

        TreeSet<String> treeSet = new TreeSet<>();

        for (String s : strArr) {
            treeSet.add(s);
        }

        System.out.println("集合数量" + treeSet.size());
        System.out.println(treeSet);
    }
}
