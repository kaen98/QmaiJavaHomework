import java.util.Arrays;

/**
 * 4.写一段代码，实现System.arraycopy方法的功能。
 */
public class Q5 <T extends Integer>{
    public static void main(String[] args) {
        int[] listA = {1, 2, 3};
        int[] listB = {11, 22, 33, 44, 55};
        arraycopy(listA, 0, listB, 0, 3);
        System.out.println(Arrays.toString(listA));
        System.out.println(Arrays.toString(listB));
    }

    public static void arraycopy(int[] src,  int srcPos,
                                 int[] dest, int destPos,
                                 int length) {
        for (int i = 0; i < length; i++) {
            dest[destPos + i] = src[srcPos + i];
        }
    }
}
