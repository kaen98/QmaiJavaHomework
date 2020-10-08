package C10;

import java.util.ArrayList;
import java.util.List;

class Q1 {
    public static void main(String[] args) {
       // 1. 定义一个集合，集合中元素及元素出现的次数为 "a":2,“b”:2,“c”:1,“xxx”:0
        List<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList);
    }
}
