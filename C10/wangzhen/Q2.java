package C10;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.  定义一个集合， 要求：
 * 1）元素及对应元素出现次数分别为 "a":2,“b”:3“c”:1,
 * 2） 删除重复的元素
 */
public class Q2 {
    public static void main(String[] args) {
        List<String> ListDemo= new ArrayList<>();
        ListDemo.add("a");
        ListDemo.add("a");
        ListDemo.add("b");
        ListDemo.add("b");
        ListDemo.add("b");
        ListDemo.add("c");
        System.out.println("origin list:"+ListDemo);

        //new list
        List<String> ListDemo2= new ArrayList<>();
        for (String demo : ListDemo) {
            if (ListDemo2.contains(demo)) {
                continue;
            }
            ListDemo2.add(demo);
        }
        System.out.println("new list:" + ListDemo2);
        //把新List 覆盖 原先的List
        ListDemo= ListDemo2;
        System.out.println("new origin list:" + ListDemo);
    }
}
