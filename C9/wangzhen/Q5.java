package C9;

/**
 * 写一段代码，实现System.arraycopy方法的功能。
 */
public class Q5 {
    public static void main(String[] args){
        Object[] arrOrigin = {1, 2, 3};
        Object[] arrCopyIn = {4, 5, 6};

        System.arraycopy(arrOrigin, 1, arrCopyIn, 1, 2);

        for (Object copy : arrCopyIn) {
            System.out.println(copy);
        }
    }


    public static Object[] arraycopy(Object[] src, int srcPos, Object[] dest, int destPos, int length) {
        Object[] newArray = new Object[dest.length + length];
        for (int i = 0; i < dest.length; i++) {
            if (i < destPos) {
                newArray[i] = dest[i];
            } else {
                newArray[i + length] = dest[i];

            }
        }

        for (int i = 0; i < length; i++) {
            newArray[destPos + i] = src[srcPos + i - 1];
        }

        return newArray;
    }

}
