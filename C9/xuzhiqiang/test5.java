package classEight;

import java.util.Arrays;

public class test5 {
    //写一段代码，实现System.arraycopy方法的功能
    public static void  main(String[] strings) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] dest = new int[10];
        dest = arraycopy(arr, 0, dest, 3, 5);
        System.out.println(Arrays.toString(dest));
    }

    public static int[] arraycopy(int[] src,  int srcPos, int[] dest, int destPos, int length) {
        for (int i = 0; i < length; i++) {
            dest[destPos + i] = src[srcPos + i];
        }
        return dest;
    }
}
