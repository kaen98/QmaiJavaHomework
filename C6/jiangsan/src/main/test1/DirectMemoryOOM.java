package main.test1;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author san
 */
public class DirectMemoryOOM {

    private static final int MM_1MB = 1024 * 1024;

    public static void main(String[] args) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);

        while (true) {
            unsafe.allocateMemory(MM_1MB);
        }
    }

}
