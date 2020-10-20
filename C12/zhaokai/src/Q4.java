import java.util.LinkedHashMap;

/**
 * 编写一段程序，统计这段文字"This class offers constant time performance for the basic operations add remove contains and size"中不重复词语的数量，并按序列打印输出。
 */
public class Q4 {
    public static void main(String[] args) {
        String sDemo = "This class offers constant time performance for the basic operations add remove contains and size";

        LinkedHashMap<String, Integer> sMap = new LinkedHashMap<>();
        for (String s : sDemo.split(" ")) {
            sMap.put(s, sMap.getOrDefault(s, 0) + 1);
        }
        System.out.println(sMap);
    }
}
