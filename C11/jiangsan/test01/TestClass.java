package test01;

import java.util.HashMap;

/**
 * 统计每个单词出现的次数
 *
 * @author san
 */
public class TestClass {

    public static void wordsStatistics(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] ss = s.split(" ");

        //System.out.println(Arrays.toString(ss));

        for (String s1 : ss) {
            if (map.containsKey(s1)) {
                map.put(s1, map.get(s1) + 1);
            } else {
                map.put(s1, 1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }
    }

    public static void main(String[] args) {
        String s = "If you want to change your life I think you must come to learn English";
        wordsStatistics(s);
    }
}
