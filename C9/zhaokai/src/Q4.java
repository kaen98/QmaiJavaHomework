import java.util.HashMap;

/**
 * 3.统计数组【1，5，6，12，1，32，5，6】中每个元素出现的次数。
 */
public class Q4 {
    public static void main(String[] args) {
        int[] list = {1, 5, 6, 12, 1, 32, 5, 6};

        HashMap<Integer, Integer> mapList = new HashMap<>();
        for (int mapListKey : list) {
            if (mapList.containsKey(mapListKey)) {
                int count = mapList.get(mapListKey);
                mapList.replace(mapListKey, count + 1);
            } else {
                mapList.put(mapListKey, 1);
            }
        }

        System.out.println(mapList.toString());
    }
}
