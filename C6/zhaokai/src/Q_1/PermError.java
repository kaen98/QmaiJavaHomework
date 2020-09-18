package Q_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 方法区溢出: 非常多的类
 * PermError.java
 */
public class PermError {
    /**
     * 1.6有效（1.8 or 之后 无效）
     * 首先设置 持久代最大和最小内存占用(限定为10M)
     * VM args: -XX:PermSize=10M -XX:MaxPremSize=10M
     */
    public static void main(String[] args) {
        List<String> list  = new ArrayList<String>();

        // 无限循环 使用 list 对其引用保证 不被GC  intern 方法保证其加入到常量池中
        int i = 0;
        while (true) {
            // 此处永久执行，最多就是将整个 int 范围转化成字符串并放入常量池
            // JDK6 常量池存在方法区，设置了持久代大小后，不断while循环必将撑满 Perm 导致内存溢出；
            list.add(String.valueOf(i++).intern());
        }
    }
}
