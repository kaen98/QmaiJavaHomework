package C9;

import java.util.ArrayList;
import java.util.List;

/**
 * 去掉数组【1、2、3、4、2、2、1、5、6】中的重复元素。
 */
public class Q3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,2,1,5,6};

        List<Integer> list = new ArrayList<>();

        for (int i = 0;i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
