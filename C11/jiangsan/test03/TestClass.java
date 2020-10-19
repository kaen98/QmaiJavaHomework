package test03;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 如何在字符串中找到第一个不重复的字符(使用Java集合框架)
 */
public class TestClass {
    public static void findStr(String s) {

        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>(s.length());

        for (char c : s.toCharArray()) {
            //System.out.println(c);
            int value = linkedHashMap.containsKey(c) ? linkedHashMap.get(c) + 1 : 1;
            linkedHashMap.put(c, value);
        }

        for (Map.Entry<Character, Integer> entry : linkedHashMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        String s = "yellow";
        findStr(s);
    }
}
