package demo1;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 编写代码，使之导致java堆溢出、虚拟机栈溢出、方法区溢出、和本地内存溢出；
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/17 10:23 下午
 */
public class Demo1 {

    private static int stackLength = 1;

    static class TestObj {
    }

    public static void main(String[] args) {
//        test();
//        test1();
//        test2();
        test3();
    }

    /*
     * java堆溢出：不停的创建对象
     * -Xms60m:堆最小60M
     * -Xmx60m:堆最大60M
     * -XX:+HeapDumpOnOutOfMemoryError
     */
    public static void test() {
        List<TestObj> list = new ArrayList<TestObj>();
        while (true) {
            list.add(new TestObj());
        }
    }

    /**
     * 虚拟机栈溢出：递归调用造成栈调用深度大于虚拟机调用最大的深度
     */
    public static void test1() {
        recursive();
    }

    /**
     * 递归调用
     */
    public static void recursive() {
        try {
            stackLength++;
            recursive();
        } catch (StackOverflowError e) {
            System.out.println("stack Length:" + stackLength);
            e.printStackTrace();
        }
    }

    /**
     * 方法区溢出:常量池溢出
     */
    public static void test2() {
        int i = 1;
        List<String> list = new ArrayList<String>();
        while (true) {
            list.add(String.valueOf(i++));
        }
    }

    /**
     * 本地内存溢出
     */
    public static void test3() {
        try {
            Field unsafeField = Unsafe.class.getDeclaredFields()[0];
            unsafeField.setAccessible(true);
            Unsafe unsafe = (Unsafe) unsafeField.get(null);
            while (true) {
                //申请分配内存
                unsafe.allocateMemory(1024 * 1024);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
