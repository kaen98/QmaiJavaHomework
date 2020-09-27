package src;

/**
 * 写一段代码，实现System.arraycopy方法的功能。
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/23 6:17 下午
 */
public class Demo5 {
    public static void main(String[] args) {
        Object[] formArray = {1, 2, 3};
        Object[] toArray = {11, 12, 13};

        System.arraycopy(formArray, 1, toArray, 2, 1);

        for (Object nums : toArray) {
            System.out.println(nums);
        }
    }

    /**
     * 复制数组
     *
     * @param src     源数组
     * @param srcPos  源数组中拷贝元素的起始位置
     * @param dest    目标数组
     * @param destPos 拷贝到目标数组的起始位置
     * @param length  拷贝源数组元素的个数
     * @return
     */
    public static Object[] arraycopy(Object[] src, int srcPos, Object[] dest, int destPos, int length) {
        Object[] newArray = new Object[dest.length + length];
        System.out.println("newArray数组长度" + (dest.length + length));
        for (int i = 0; i < dest.length; i++) {
            if (i < destPos) {
                newArray[i] = dest[i];
            } else {
                newArray[i + length] = dest[i];

            }
        }

        for (int n = 0; n < length; n++) {
            newArray[destPos + n] = src[srcPos + n - 1];
        }

        return newArray;
    }
}
