package main;

import java.util.HashSet;

/**
 * 去掉数组【1、2、3、4、2、2、1、5、6】中的重复元素。
 *
 * @author san
 */
public class Test3 {

    public static void main(String[] args) {
        int[] items = {1, 2, 3, 4, 2, 2, 1, 5, 6};

        HashSet<Integer> hashSet = new HashSet<>();

        for (int iterm : items) {
            hashSet.add(iterm);
        }

        System.out.println(hashSet);
    }
}
