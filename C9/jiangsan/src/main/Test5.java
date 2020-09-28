package main;

import java.util.Arrays;

/**
 * 写一段代码，实现System.arraycopy方法的功能
 *
 * @author san
 */
public class Test5 {


    public static void main(String[] args) {

        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {7, 8, 9, 12, 3, 4, 5, 6567, 5};

        //System.arraycopy();
        localArrayCopy(a1, 0, a2, 2, 4);
        System.out.println(Arrays.toString(a2));
    }

    /**
     * @param src     原数组
     * @param srcPos  原数据下标起始位置
     * @param dest    目标数组
     * @param destPos 目标下标起始位置
     * @param length  长度
     */
    public static void localArrayCopy(int[] src, int srcPos, int[] dest, int destPos, int length) {
        for (int i = 0; i < length; i++) {
            dest[destPos + i] = src[srcPos + i];
        }
    }
}
