import java.util.ArrayList;
import java.util.List;

/**
 * 1. 定义一个集合，集合中元素及元素出现的次数为 "a":2,“b”:2,“c”:1,“xxx”:0
 */
public class Q1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("xxx");
        list.remove("xxx");

        System.out.println(list.toString());
    }
}
