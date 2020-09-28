package main;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 统计数组【1，5，6，12，1，32，5，6】中每个元素出现的次数
 *
 * @author san
 */
public class Test4 {

    public static void main(String[] args) {
        int[] items = {1, 5, 6, 12, 1, 32, 5, 6};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int item : items) {
            Integer num = map.get(item);
            map.put(item, num == null ? 1 : num + 1);
        }

        Iterator<Integer> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("变量" + key + " 出现次数 : " + map.get(key));
        }
    }
}
