package src;

import java.util.ArrayList;
import java.util.List;

/**
 * 去掉数组【1、2、3、4、2、2、1、5、6】中的重复元素。
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/23 6:17 下午
 */
public class Demo3 {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 2, 2, 1, 5, 6};
        int length = num.length;

        List list = new ArrayList();

        for (int i = 0; i < length; i++) {
            if (!list.contains(num[i])) {
                list.add(num[i]);
            }
        }

        System.out.println(list);
    }

}
