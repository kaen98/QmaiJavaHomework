package src;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个集合，集合中元素及元素出现的次数为 "a":2,“b”:2,“c”:1,“xxx”:0
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/10/3 9:45 下午
 */
public class Demo1 {
    public static void main(String[] args) {

        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("a");
        stringArrayList.add("a");
        stringArrayList.add("b");
        stringArrayList.add("b");
        stringArrayList.add("c");

        System.out.println(stringArrayList);
    }
}
