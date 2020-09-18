package Q_1;

/**
 * java堆溢出: 非常多的对象或者数组；
 * HeapError.java
 */
public class HeapError {
    public static void main(String[] args) {
        String a = "abc";

        while (true) {
            a = a.concat(a);
        }
    }
}
