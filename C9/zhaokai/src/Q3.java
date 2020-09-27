import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 2.去掉数组【1、2、3、4、2、2、1、5、6】中的重复元素。
 */
public class Q3 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 2, 2, 1, 5, 6};
        System.out.println(Arrays.toString(list));

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < list.length; i++) {
            set.add(list[i]);
        }

        Integer[] uniqueList = new Integer[set.size()];
        uniqueList = set.toArray(uniqueList);
        System.out.println(Arrays.toString(uniqueList));
    }
}
