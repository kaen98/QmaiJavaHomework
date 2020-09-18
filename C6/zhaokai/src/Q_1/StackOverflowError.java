package Q_1;


/**
 * 虚拟机栈溢出: 单线程方法递归过深，或者线程过多分配内存不足;
 * StackOverflowError.java
 */
public class StackOverflowError {
    public static int toAdd(int i) {
        if (i == 1) {
            return 1;
        }
        return StackOverflowError.toAdd(i);
    }

    public static void main(String[] args) {
        int rst = StackOverflowError.toAdd(2);
    }
}
