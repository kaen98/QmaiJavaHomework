import java.util.ArrayList;
import java.util.List;

/**
 * 2.  定义一个集合， 要求：
 * 1）元素及对应元素出现次数分别为 "a":2,“b”:3“c”:1,
 * 2）删除重复的元素
 */
public class Q2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("c");

        List<String> newList = new ArrayList<>();
        for (String s : list) {
            if (!newList.contains(s)) {
                newList.add(s);
            }
        }

        System.out.println(newList.toString());
    }
}
