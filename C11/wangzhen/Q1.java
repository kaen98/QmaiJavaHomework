package C11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 1. 统计每个单词出现的次数
 * 有如下字符串"If you want to change your life I think you must come to learn English"(用空格间隔)
 * 打印格式：
 * to=3
 * think=1
 * you=2
 */
public class Q1 {
    public static void main(String[] args) {
        String word = "If you want to change your life I think you must come to learn English";
        String[] words = word.split(" ");


        HashMap<String, Integer> map = new HashMap<>();


        for (String tx:words) {
            Integer num = 1;
            if (map.containsKey(tx)) {
                num = map.get(tx) + 1;
            }
            map.put(tx, num);
        }

        System.out.println(map.toString());
    }
}
