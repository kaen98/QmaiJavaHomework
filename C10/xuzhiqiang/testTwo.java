package classEight;

import java.util.ArrayList;
import java.util.List;

public class testTwo {
    /**
     * 定义一个集合， 要求：
     * 1）元素及对应元素出现次数分别为 "a":2,“b”:3“c”:1,
     * 2） 删除重复的元素
     * @param strings
     */
    public static void main(String[] strings) {
        List<String> Lists= new ArrayList<>();
        Lists.add("a");
        Lists.add("a");
        Lists.add("b");
        Lists.add("b");
        Lists.add("b");
        Lists.add("c");
        System.out.println(Lists.toString());

        List<String> NoRepeatList= new ArrayList<>();
        for (String list : Lists) {
            if (NoRepeatList.contains(list)) {
                continue;
            }
            NoRepeatList.add(list);
        }
        System.out.println(NoRepeatList.toString());
    }
}
