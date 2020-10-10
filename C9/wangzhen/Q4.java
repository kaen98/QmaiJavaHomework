package C9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 统计数组【1，5，6，12，1，32，5，6】中每个元素出现的次数。
 */
public class Q4 {
    public static void main(String[] args){
        int[] arrs = {1,5,6,12,1,32,5,6};

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer number : arrs) {
            Integer count = map.get(number);
            map.put(number, count == null ? 1 : count + 1);
        }
        Set set = map.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) it.next();
            System.out.println("单词 " + entry.getKey() + " 出现次数 : " + entry.getValue());
        }

    }
}
