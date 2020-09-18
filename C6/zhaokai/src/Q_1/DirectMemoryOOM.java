package Q_1;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * 本地内存: jvm之外的内存
 * DirectMemoryOOM.java
 */
public class DirectMemoryOOM {

    private static final int _1MB = 1024 * 1024 * 1024;

    public static void main(String[] args) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while ( true ) {
            // unsafe 直接想操作系统申请内存
            unsafe.allocateMemory( _1MB );
        }
    }
}
