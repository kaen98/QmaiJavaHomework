package classEight;

import java.util.ArrayList;
import java.util.Collection;

public class testOne {
    /**
     * 定义一个集合，集合中元素及元素出现的次数为 "a":2,“b”:2,“c”:1,“xxx”:0
     */
    public static void main(String[] strings) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:"+elementNum(list, "a"));
        System.out.println("b:"+elementNum(list, "b"));
        System.out.println("c:"+elementNum(list, "c"));
        System.out.println("xxx:"+elementNum(list, "xxx"));
    }

    public static int elementNum(Collection<String> list, String s) {
        int count = 0;
        for (String string : list) {
            if (s.equals(string)) {
                count++;
            }
        }
        return count;
    }
}
