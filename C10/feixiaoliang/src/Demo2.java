package src;

import java.util.*;

/**
 * 定义一个集合， 要求：
 * 1）元素及对应元素出现次数分别为 "a":2,“b”:3“c”:1,
 * 2） 删除重复的元素
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/10/7 10:29 下午
 */
public class Demo2 {
    public static void main(String[] args) {

        List<String> listArray = new ArrayList<>();
        listArray.add("a");
        listArray.add("a");
        listArray.add("b");
        listArray.add("b");
        listArray.add("b");
        listArray.add("c");

        System.out.println("原集合数据:" + listArray);

        List test1 = test1(listArray);
        System.out.println("去重集合数据:" + test1);

        List<String> test = test(listArray);
        System.out.println("去重集合数据:" + test);
    }

    /**
     * 方法一：集合去重
     * @param listArray 集合
     * @return  去重后集合
     */
    public static List<String> test(List<String> listArray) {
        Iterator<String> iterator = listArray.iterator();
        List<String> existArray = new ArrayList<>();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if (existArray.contains(string)) {
                iterator.remove();
            } else {
                existArray.add(string);
            }
        }

        return listArray;
    }

    /**
     * 方法二：集合去重
     * @param listArray 集合
     * @return 去重后集合
     */
    public static List test1(List<String> listArray) {
        HashSet<String> hashSet = new HashSet<String>(listArray);

        return new ArrayList<>(hashSet);
    }
}
