package src;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 统计数组【1，5，6，12，1，32，5，6】中每个元素出现的次数。
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/23 6:17 下午
 */
public class Demo4 {
    public static void main(String[] args) {

        int[] num = {1, 5, 6, 12, 5, 5, 5, 1, 32, 5, 6};
        int count;
        Map map = new HashMap();
        Iterator iterable = map.entrySet().iterator();

        for (int i = 0; i < num.length; i++) {
            Object value = map.get(num[i]);
            if (value == null) {
                count = 0;
            } else {
                count = (int) value;
            }

            map.put(num[i], ++count);
        }

        map.forEach((key, value) -> System.out.println("元素:" + key + " 出现的次数:" + value));
    }

}
