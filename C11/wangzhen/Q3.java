package C11;

import java.util.*;

/**
 3. 如何在字符串中找到第一个不重复的字符(使用Java集合框架)
 字符串： yellow
 */
public class Q3 {
    public static void main(String[] args) {
        String origin = "yellow";
        String[] words = origin.split("");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String word:words) {
            if (map.get(word) == null) {
                map.put(word, 1);
                continue;
            }
            map.put(word, map.get(word) + 1);
        }

        Set<Map.Entry<String, Integer>> mapSet = map.entrySet();
        for (Map.Entry<String, Integer> subset:mapSet) {
            if (subset.getValue() == 1) {
                System.out.println("字符：" + origin + "里第一个不重复的字符是：" + subset.getKey());
                break;
            }
        }

    }
}
